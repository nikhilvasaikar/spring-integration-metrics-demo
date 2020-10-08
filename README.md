## Spring Integration Demo App for Metrics

### Spring Flow
- A message sourcing inbound adapter generates random number every 10 secs after the application starts.
- A service activator prints this number to the console

### Management Endpoints Enabled

- `prometheus`,`health`,`beans`,`loggers`,`env`,`scheduledtasks`,`integrationgraph` 