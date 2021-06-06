# springboot-resttemplate-with-ssl
Spring boot rest template call with ssl


Generate PKCS12 certificate for Sample Server application

$ keytool -genkey -alias sampleserver -keyalg RSA -keystore sampleserver.keystore -validity 3650 -storetype PKCS12 -dname "CN=localhost, OU=Spring, O=Pivotal, L=Holualoa, ST=HI, C=US"  -keypass changeit -storepass changeit



#Optional step to export and import sample server keystore from above step to sampleserver_cert file
#and import to sample client trust store.

#$ keytool -export -alias sampleserver -keystore sampleserver.keystore -file sampleserver_cert -storepass changeit
#$ keytool -importcert -keystore sampleclient.truststore -alias sampleserver -storepass changeit -file sampleserver_cert -noprompt



Import sampleserver.cer to sample client application truststore

$ keytool -importcert -keystore sampleclient.truststore -alias sampleserver -storepass changeit -file sampleserver.cer -noprompt