import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class implements a ScalaTest test suite for the methods in object
 * `Lists` that need to be implemented as part of this assignment. A test
 * suite is simply a collection of individual tests for some specific
 * component of a program.
 *
 * A test suite is created by defining a class which extends the type
 * `org.scalatest.FunSuite`. When running ScalaTest, it will automatically
 * find this class and execute all of its tests.
 *
 * Adding the `@RunWith` annotation enables the test suite to be executed
 * inside eclipse using the built-in JUnit test runner.
 *
 * You have two options for running this test suite:
 * 
 * - Start the sbt console and run the "test" command
 * - Right-click this file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class FiboSuite extends FunSuite {
    
    test("Fibonacci 0 is one")(assert(new Fibonacci().get(0) === 1))

    test("Fibonacci 1 is one")(assert(new Fibonacci().get(1) === 1))

    test("Fibonacci 2 is 2")(assert(new Fibonacci().get(2) === 2))
    
    test("Fibonacci 3 is 3")(assert(new Fibonacci().get(3) === 3))

    test("Fibonacci 5 is 8")(assert(new Fibonacci().get(5) === 8))
}