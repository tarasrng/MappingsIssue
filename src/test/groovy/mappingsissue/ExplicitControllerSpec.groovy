package mappingsissue

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ExplicitControllerSpec extends Specification implements ControllerUnitTest<ExplicitController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
