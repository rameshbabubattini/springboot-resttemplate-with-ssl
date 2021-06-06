
Generate PKCS12 certificate

$ keytool -genkey -alias sampleserver -keyalg RSA -keystore sampleserver.keystore -validity 3650 -storetype PKCS12 -dname "CN=localhost, OU=Spring, O=Pivotal, L=Holualoa, ST=HI, C=US"  -keypass changeit -storepass changeit