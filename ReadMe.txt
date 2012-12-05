Project PrimeFacesEAR, PrimeFacesEJB, PrimeFacesWeb

start HSQLDB in server mode:
cd PrimeFacesDB
java -cp /Volumes/Terra/opt/hsqldb-2.2.9/hsqldb/lib/hsqldb.jar org.hsqldb.server.Server --database.0 file:mydb --dbname.0 xdb

Start server
jboss-as-7.1.1
Publish PrimeFacesEAR

Browser URL
http://localhost:8080/PrimeFacesWeb/index.xhtml

Measure time
time curl -L http://localhost:8080/PrimeFacesWeb/provider.xhtml

HSQLDB Browser
java -cp /Volumes/Terra/opt/hsqldb-2.2.9/hsqldb/lib/hsqldb.jar org.hsqldb.util.DatabaseManager


