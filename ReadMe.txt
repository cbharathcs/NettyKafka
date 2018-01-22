

create topic::
kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic auzmor	

run main::

NettyMain.java

consumer ::

kafka-console-consumer --zookeeper localhost:2181 -topic auzmor --from-beginning group.id=auzmorGroup

Use the below url::
http://localhost:9292/test?p4=test4&p6=test6&p5=test5

