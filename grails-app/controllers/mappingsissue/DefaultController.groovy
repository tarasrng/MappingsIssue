package mappingsissue

class DefaultController {
    def grailsUrlMappingsHolder

    def index() {
        grailsUrlMappingsHolder.match('/explicit/') //Works
        grailsUrlMappingsHolder.match('/default/')  //Works
    }
}
