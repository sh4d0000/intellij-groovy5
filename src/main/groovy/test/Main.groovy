package test

import test.subpack.Delegator

def delegator = new Delegator(field: 1)
assert delegator.field == 1
assert delegator.foo() == 1
