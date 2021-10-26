# Setter injection
# inject collection type list
  set
  map
  properties
  object - reference


# Constructor injection

# Ambiguity problem and its solution with constructor injection

# Bean life cycle
the lifecycle of any object means
 - when and how it is born
 - how it behaves through its life
 - and when and how it dies

Similarly the bean life cycle refers to 
 - when and how the bean is instantiated
 - what action it performs untill it lives
 - and when and how it is destroyed


Bean life cycle is managed by the spring container
when we run the program then

1. spring container get started
2. container creates the instance of a bean as per the request
3. dependencies are injected
4. beans is destroyes when the spring container is closed



there are three ways we can implement life cycle methods
1. using xml
2. using interface
3. using annotation

1. using xml: in this approach in order to use custom init() and destroy() method for a bean we have to register
these two method inside the spring xml configuration file while defining a bean


2. using interface or programmatic approach: to provide the facility to the create beran to invoke custom init()
method on the startup of a spring container and invoke custom destroy() method on closing the container
we need to implement out bean with two interface
 - InitilizingBean - afterPropertiesSet()
 - DisposableBean - destroy()






















