# this is a demo program to show osgi event
## create event service
## create event provider
* use JNDIHelper class to get osgi service
## crate event consume

## deploy to karaf 
1. feature:install jndi

* feature:install eventadmin

* you will find following:

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

> 结论

你可以看到osgi-event-provider需要依赖osgi-event-service，因为它需要使用service，而
osgi-event-consume谁都不依赖，就可以获得osgi-event-provider post的消息，通过event
就实现了2个bundle的解耦。

> 知识点
1. osgi jndi
* osgi eventadmin
* osgi Activator
* osgi service
