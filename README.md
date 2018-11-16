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
There are two tips of exceptions, Unchecked and Checked. Checked exceptions needs to explicit in signature method the exception that can throw. It is necessary in all methods until one of them treat the error. Unchecked exceptions is not necessary.
In our code we have a example of a method that throw a checked exception. Some method needs to treat this exception or to push for the next method.
```
	public void process() {
		try {
			execute();
		} catch (IOException ex) {
			System.out.println("Error treatment");
			ex.printStackTrace();
		}
	}

	private void execute() throws IOException {
		throw new IOException();
	}
```

### Creating exceptions
It is possible create our specific exceptions. Its very important know, Checked exceptions are subclasses of Exception. Unchecked exceptions are subclasses of RuntimeException. 

Example of a new Checked Exception:
```
public class MyCheckedException extends Exception {

	public MyCheckedException(String message) {
		super(message);
	}
}
```
Example of use this exception:
```
public void execute(){
  try {
    runMyCheckedException();
  } catch (MyCheckedException ex) {
    System.out.println(ex.getMessage());
  }
}

private void runMyCheckedException() throws MyCheckedException {
  throw new MyCheckedException("My checked exception!");
}
```

Example of a new Unchecked Exception:
```
public class MyUncheckedException extends RuntimeException {

  public MyUncheckedException(String message) {
    super(message);
  }
}
```
Example of use this exception:
```
private static void runMyUncheckedException() {
  throw new MyUncheckedException("My uncheked exception");
}
```


## New resources with Java 7

### Try With Resources

### Multi Catch

