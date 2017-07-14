# this is a demo program to show osgi event
## create event service
## create event provider
* use JNDIHelper class to get osgi service
## crate event consume

## deploy to karaf 
feature:install jndi
feature:install eventadmin
you will find following:

```batch
52 │ Active   │  80 │ 1.0.0.SNAPSHOT │ osgi-event-publish Bundle
53 │ Active   │  80 │ 1.0.0.SNAPSHOT │ osgi-event-provider Blueprint Bundle
54 │ Active   │  80 │ 1.0.0.SNAPSHOT │ osgi-event-consume Blueprint Bundle
55 │ Active   │  30 │ 1.1.0          │ Apache Aries JNDI API
56 │ Active   │  30 │ 1.0.2          │ Apache Aries JNDI Core
57 │ Active   │  30 │ 1.0.0          │ Apache Aries JNDI Support for Legacy Runtimes
58 │ Active   │  30 │ 1.0.0          │ Apache Aries JNDI RMI Handler
59 │ Active   │  30 │ 1.1.0          │ Apache Aries JNDI URL Handler
60 │ Active   │  30 │ 4.1.1          │ Apache Karaf :: JNDI :: Core
61 │ Active   │  30 │ 3.18.0         │ Apache XBean :: Naming
```

> restart 53

```batch
karaf@root()> restart 53
receive message of topic com/kalix/trying/service/msg/stop
Stopping the bundle
receive message of topic com/kalix/trying/service/msg/start
Starting the bundle
```
