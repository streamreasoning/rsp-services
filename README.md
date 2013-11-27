rsp-service
============

Why?
------------

A number of RDF Stream Processors exists but they do not talk each other. 
RDF Stream Processors lacks of a protocol for transmitting RDF stream, registering a continuous query on one or more streams and observing the continuously evolving results of a query.
Our work proposes a restful interface for RDF Stream Processors that is:
	1. minimal -- no timestamps, just RDF graphs.
	2. backward compatible -- adopts SPARQL 1.1 results formats.
	3. combinable -- the results of a query can be consumed by another query.

Online resources
------------

Before reading the rest you can have a 5 minutes presentation of the key concepts having a look to this video:
https://www.youtube.com/watch?v=f2oQa8CEw_s

For more information visit http://streamreasoning.org/download/rsp-services

Usage
------------

The rsp services release contains all the components needed to implement a specific version of RDF Stream Processor REST Services.

The package org.streamreasoning.rsp_services.configuration contains the class Config to extract information from the properties file (the default properties file is located at src/main/resources folder)

The package org.streamreasoning.rsp_services.interfaces contains general interfaces that abstract the main components of an RDF Stream Processor:
- RDF_Stream_Processor_Interface: interface representation of RDF Stream Processor Engine containing the methods to interact with all its components
- Continuous_Query_Interface: interface representation of Continuous Query
- Continuous_Query_Observer_Interface: interface representation of Continuous Query Observer needed to get the continuous results
- RDF_Stream_Interface: interface representation of RDF stream

The rest of the package contains the shemata of the REST server (developed using restlet framework) to expose the functionalities of your own stream processor as the services. You have to implement the classes contained in the following packages to control and interact with :
- org.streamreasoning.rsp_services.server contains the Rest server class. In this class the URLs of the services are specified.
- org.streamreasoning.rsp_services.streams contains the class to manage the requests regarding streams.
- org.streamreasoning.rsp_services.queries contains the class to manage the requests regarding queries.
- org.streamreasoning.rsp_services.observers contains the class to manage the requests regarding observers.

To create a running implementations of the services:
- Create various classes that implement the interfaces to represent every component of your system
- Create the server following the proposed schemata

For a complete example of implementation, go to https://github.com/streamreasoning/rsp-services-csparql where you can find the complete implementation for C-SPARQL engine

Javadoc
------------

http://streamreasoning.org/documentation/javadoc/rsp-services/

Maven
------------

Add new maven repository to pom file

<repositories>
	....
	<repository>
		<id>streamreasoning_repository</id>
		<name>Csparql server repository</name>
		<url>http://streamreasoning.org/maven/</url>
		<layout>default</layout>
	</repository>
	...
</repositories>

Dependecy
<dependencies>
	...
	<dependency>
		<groupId>org.streamreasoning</groupId>
		<artifactId>rsp-services</artifactId>
		<version>0.4</version>
	</dependency>
	...
</dependencies>