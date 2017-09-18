# AndroidDaggerRxJavaMVP
This project serves as an architecture template for developing my apps. As I am an intermediate developer, don't consider this code to be professional now (I hope it ones will be).

## Requirements
- SplashActivity
- LoginActivity
- Drawer Activity with Fragments
- Decouple presenter from activity lifecycle to keep state during configuration changes (orientation change especially)
- Code is designed with S.O.L.I.D. priciples in mind (https://en.wikipedia.org/wiki/SOLID_(object-oriented_design)
  - **S**ingle responsibility principle: *Keep class focused on single concern.*
  - **O**pen/closed principle: *Classes/Modules/Functions should be open for extension, but closed for modification.*
  - **L**iskov substitution principle: *Instances of parents classes should be replaceable with instances of their childs.*
  - **I**nterface segregation principle: *Many client-specific interfaces are better than one general-purpose interface.*
  - **D**ependency inversion principle: *High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.*
 - Apply TDD (Test Driven Devlopment)

## Libraries used
- Dagger 2 for dependency injection
- RxJava
- Butterknife
- Mockito for making tests using less code

## Sources
- https://github.com/MindorksOpenSource/android-mvp-architecture
- https://android.jlelse.eu/dagger-2-part-i-basic-principles-graph-dependencies-scopes-3dfd032ccd82
- https://proandroiddev.com/dagger-2-part-ii-custom-scopes-component-dependencies-subcomponents-697c1fa1cfc
