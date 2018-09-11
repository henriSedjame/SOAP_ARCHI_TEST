#!/bin/sh
/usr/local/glassfish5/bin/asadmin start-domain
/usr/local/glassfish5/bin/asadmin -u admin deploy /aot.war
/usr/local/glassfish5/bin/asadmin stop-domain
/usr/local/glassfish5/bin/asadmin start-domain --verbose