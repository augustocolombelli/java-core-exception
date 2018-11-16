## Exceptions and Errors
The main class used in Java problems is Throwable. This class provide functions that we can use in our errors exceptions.

As subclasses of Throwable, Java provide the classes Error and Exception.

### Error Class
Error is a subclass of Throwable used in treatment of error, for example, in the Virtual Machine. One example of this is StackOverflowError. This error occurred when my Stack of method is greater that supported limit. In the code, we can view this example:
```
public void executeMethodThatThrowError() {
  executeMethodThatThrowError();
  System.out.println("The method was executed!");
}
```
The Stack of methods that caused this error:
```
Exception in thread "main" java.lang.StackOverflowError
	at com.examples.errors.StackOverFlowExample.execute(StackOverFlowExample.java:6)
	at com.examples.errors.StackOverFlowExample.execute(StackOverFlowExample.java:6)
	at com.examples.errors.StackOverFlowExample.execute(StackOverFlowExample.java:6)
	at com.examples.errors.StackOverFlowExample.execute(StackOverFlowExample.java:6)
```

### Exceptions
Exception is a subclass of Throwable used in treatment by Java Developers. It is most common work with exceptions. Some examples of this type of exceptions are NullPointerException and ArithmeticException. 
In our code, we have a bad example where developer try divide some number by zero. This code will stop the execution of the method and throw a ArithmeticException.`
```
public void execute() {
  double anyNumber = 5 / 0;
}

```
Stack of methods that caused this error:
```
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.examples.exceptions.unchecked.ArithmeticExample.execute(ArithmeticExample.java:6)
	at com.examples.RunApp.runUncheckedExceptionArithmeticExample(RunApp.java:20)
	at com.examples.RunApp.main(RunApp.java:10)

```

## Checked and Unchecked
There are two tips of exceptions, Unchecked and Checked.

