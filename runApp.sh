#run without agent
#java -jar target/SimProject-0.0.1.jar
#run with agent
java -javaagent:elastic-apm-agent-1.3.0.jar \
     -Delastic.apm.service_name=SimProject \
     -Delastic.apm.server_url=http://localhost:8200 \
     -Delastic.apm.application_packages=org.example \
     -jar target/SimProject-0.0.1.jar
