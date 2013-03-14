**Building with Maven**

mvn clean install

**Running with Maven Jetty Plugin**

mvn jetty:run

**Running with Maven Jetty Plugin in a specific mode**

mvn jetty:run -Dapp.mode={mode} (e.g. mvn jetty:run -Dapp.mode=development)

**Check if it's running**

http://localhost:8080/

http://localhost:8080/home.json
