## Spring Integration Demo App for Metrics

### Spring Integration Flow
- A message sourcing inbound adapter generates random number every 10 secs after the application starts.
- A service activator prints this number to the console

### Management Endpoints Enabled

- `prometheus`,`health`,`beans`,`loggers`,`env`,`scheduledtasks`,`integrationgraph` 

### Spring Integration Metrics via micrometer and prometheus

The spring integration metrics are available at `/actuator/prometheus` endpoint.
Look for tags starting with `spring_integration`.
