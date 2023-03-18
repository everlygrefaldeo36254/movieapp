
Movie App is an Android application that utilizes MVVM architecture, Coroutines, LiveData, Dagger, and Hilt to provide a scalable and maintainable codebase.

Architecture
The app uses MVVM architecture, which separates the presentation layer from the business logic and data access layer. This helps in writing maintainable and testable code.

Asynchronous Programming
The app uses Coroutines to handle asynchronous programming. Coroutines are lightweight threads that can be used to execute long-running tasks in a non-blocking way. It helps in writing asynchronous code in a sequential way, making the code easier to read and understand.

Reactive Programming
The app uses LiveData, which is an observable data holder class that is lifecycle-aware. It allows the presentation layer to observe changes in the data and update the UI accordingly. LiveData also helps in reducing memory leaks by automatically removing observers when the lifecycle owner (Activity or Fragment) is destroyed.

Dependency Injection
The app uses Dagger and Hilt for Dependency Injection. Dagger is a compile-time framework for Dependency Injection, and Hilt is a library built on top of Dagger that simplifies the setup process. Dependency Injection helps in writing modular and testable code, as it decouples the code and makes it easier to replace dependencies.

Libraries Used
Kotlin - Programming language used for development
MVVM Architecture - Design pattern used for separation of concerns
Coroutines - For asynchronous programming
LiveData - For reactive programming
Dagger/Hilt - For Dependency Injection
Retrofit - For networking
