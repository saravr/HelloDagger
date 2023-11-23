## Use cases

### Simple: Inject classes with dependencies known to Dagger

Inject Calculator class in Application class.

### Inject a class with a dependency unknown to Dagger

Inject Context (without using a Module)

Use Component Builder BindsInstance in the component.

```agsl
    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(context: Context): Builder
    }
```

And in Application class:

```agsl
        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
        appComponent.inject(this)
```
