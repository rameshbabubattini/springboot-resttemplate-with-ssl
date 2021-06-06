# springboot-resttemplate-with-ssl
Spring boot rest template call with ssl




$ keytool -export -alias sampleserver -keystore sampleserver.keystore -file sampleserver_cert -storepass changeit


$ keytool -importcert -keystore myapp.truststore -alias myapp -storepass changeit -file myapp_cert -noprompt