package com.github.dnvriend

class SpecMultiJvmNode1 extends TestSpec {
  "A node" should "be able to say hello" in {
    val message = "Hello from node 1"
    message shouldBe "Hello from node 1"
  }
}

class SpecMultiJvmNode2 extends TestSpec {
  "A node" should "be able to say hello" in {
    val message = "Hello from node 2"
    message shouldBe "Hello from node 2"
  }
}