import mappingsissue.SomeVoter
import mappingsissue.UserPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    someVoter(SomeVoter) {
        grailsUrlMappingsHolder = ref('grailsUrlMappingsHolder')
    }
}
