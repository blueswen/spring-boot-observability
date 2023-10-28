curl --request GET \
  --url http://localhost:8080/ \
  --header 'traceparent: 00-df853039b602c93e641526aaa7d67b8c-339f2b7a83c7d606-01'

curl --request POST \
  --url http://localhost:8080/peanuts \
  --header 'content-type: application/json' \
  --data '{"name": "Snoopy", "description": "A cute beagle" }'

curl --request POST \
  --url http://localhost:8080/peanuts \
  --header 'content-type: application/json' \
  --data '{"name": "Woodstock", "description": "A cute bird" }'

curl --request POST \
  --url http://localhost:8080/peanuts \
  --header 'content-type: application/json' \
  --data '{"name": "Charlie Brown","description": "Snoopy'\''s owner"}'

curl --request GET \
  --url http://localhost:8080/peanuts/1

curl --request GET \
  --url http://localhost:8080/peanuts/1

curl --request GET \
  --url http://localhost:8080/peanuts/2

curl --request GET \
  --url http://localhost:8080/peanuts/2

curl --request GET \
  --url http://localhost:8080/peanuts/3

curl --request GET \
  --url http://localhost:8080/peanuts/3
