package mappingsissue

class BootStrap {

    def init = { servletContext ->

        def userRole = new Role(authority:'ROLE_USER').save()

        def me = new User(username: 'admin', password: 'admin').save()

        UserRole.create me, userRole

        UserRole.withSession {
            it.flush()
            it.clear()
        }
    }

    def destroy = {
    }
}
