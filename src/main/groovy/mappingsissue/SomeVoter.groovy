package mappingsissue

import org.springframework.security.access.AccessDecisionVoter
import org.springframework.security.access.ConfigAttribute
import org.springframework.security.core.Authentication
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping

class SomeVoter implements AccessDecisionVoter{

    def grailsUrlMappingsHolder

    @Override
    boolean supports(ConfigAttribute attribute) {
        return true
    }

    @Override
    int vote(Authentication authentication, Object object, Collection collection) {
        grailsUrlMappingsHolder.match('/explicit/')//Works
        grailsUrlMappingsHolder.match('/default/') //Doesn't work

        return 1
    }

    @Override
    boolean supports(Class clazz) {
        return true
    }
}
