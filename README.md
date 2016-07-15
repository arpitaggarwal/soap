# soap

## soap-server

### Run soap-server

Move to directory `soap-server` and run command `mvn spring-boot:run`. Once running point your browser for Hello World Service WSDL at : `http://localhost:9999/service/hello-world?wsdl`


## soap-client

### Run soap-client

Move to directory `soap-client` and run command `mvn spring-boot:run`.


### Sample Request

```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://service.server.soap.arpit.com/">
   <soapenv:Header>
      <ser:arg1>
         <userId>arpit</userId>
         <password>arpit</password>
      </ser:arg1>
   </soapenv:Header>
   <soapenv:Body>
      <ser:helloWorld>
         <!--Optional:-->
         <arg0>Arpit</arg0>
      </ser:helloWorld>
   </soapenv:Body>
</soapenv:Envelope>
```

### Sample Response

```
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns2:helloWorldResponse xmlns:ns3="https://aggarwalarpit.wordpress.com" xmlns:ns2="http://service.server.soap.arpit.com/">
         <return>Hello World from Arpit</return>
      </ns2:helloWorldResponse>
   </S:Body>
</S:Envelope>
```
