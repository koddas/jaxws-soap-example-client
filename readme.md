# About this project

This project is a simple demo web client using Java annotations, mimicikng an
extremely basic online karaoke service. It runs on Java 8 (and possibly also 7)
and is run as a standalone program. All dependencies are met by the standard
Java installation.

The annotations used are defined in the
[JAX-WS API](https://en.wikipedia.org/wiki/Java_API_for_XML_Web_Services).

# How do I build this project?

You can easily build the code directly from within your IDE of choice (I'm
personally rather fond of [Eclipse](http://www.eclipse.org)), using its build
features (in Eclipse, right click the project and select *Run As* ->
*Java application*). If you prefer doing stuff more old school, you can use the
command line to build the project as well. To do so, simply navigate to the
source code directory and type

    javac se/idioti/example/jaxws/soap/client/* -d ../bin

in your terminal. Your generated class files can be found in the bin folder.

# How do I run this project?

Running Eclipse, just follow the steps described above. The application will
be run once the project has been built.

If you prefer the command line, just navigate to the bin folder and type

    java se.idioti.example.jaxws.soap.client.KaraokeClient

in your terminal.

# How do I configure my application?

As this is a very simple example, all configuration is done directly in code.
The hostname, path and network port are all set in KaraokeClient.java.

# Corresponding client

A corresponding web service has been developed in conjunction with the client.
It can be found at
[koddas/jaxws-soap-example-server](http://github.com/koddas/jaxws-soap-example-server).