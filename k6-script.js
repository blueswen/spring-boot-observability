import http from 'k6/http';
import { sleep } from 'k6';

export default function () {
  var server_list = ["localhost:8080", "localhost:8081", "localhost:8082"]
  var endpoint_list = ["/", "/io_task", "/cpu_task", "/random_sleep", "/random_status", "/chain", "/error_test"]
  server_list.forEach(function(server) {
    endpoint_list.forEach(function(endpoint) {
      http.get("http://" + server + endpoint);
    });
  });
  sleep(0.5);
}
