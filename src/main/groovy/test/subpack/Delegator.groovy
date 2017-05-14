package test.subpack

import test.Delegated

class Delegator {

    @Delegate Delegated delegated = new Delegated()

    def bar() {
        field
        foo()
    }

}