# Spring-Kafka
I have implemented kafka through springboot


Steps for Kafka Implementation:-




Start a ZooKeeper-

sh bin/zookeeper-server-start.sh config/zookeeper.properties

Start Apache Kafka Server
sh bin/kafka-server-start.sh config/server.properties


create a Kafka topic


sh kafka-topics.sh --create --topic test-topic --bootstrap-server localhost:9092 --replication-factor 1 --partitions 4

Start  consumer which listen to topic

sh kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test-topic --from-beginning
