# Spring Boot Simple Microservice

Beispiel für einen simplen Microservice unter Verwendung von Spring Boot, Spring Data JPA und H2 als In-Memory-Datenbank. Gebaut wurde mit Maven 3.5 und Java 8.

## Service starten

* Auf der Konsole `mvn spring-boot:run` eingeben, um die Anwendung über das Maven Plugin zu starten.
* Projekt mit `mvn install` bauen und die verpackte Anwendung mit `java -jar target/contacts-0.0.1-SNAPSHOT.jar` starten.
* Anwendungen unter einer IDE starten. Im Falle von Eclipse mittels `mvn install eclipse:eclipse` sas Projekt bauen und die Eclipse-Einstellungen erzeugen. Projekt in Eclipse in den Workspace importieren und die Anwendung mit 'Run as Java Application' auf die Datei ContactsApplication.java starten.

## Aufruf der Anwendung

`http://localhost:8080/contacts`<br/>
`http://localhost:8080/contacts/{id}`
