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
	at com.examples.errors.ErrorExample.executeMethodThatThrowError(ErrorExample.java:6)
	at com.examples.errors.ErrorExample.executeMethodThatThrowError(ErrorExample.java:6)
	at com.examples.errors.ErrorExample.executeMethodThatThrowError(ErrorExample.java:6)
	at com.examples.errors.ErrorExample.executeMethodThatThrowError(ErrorExample.java:6)
```