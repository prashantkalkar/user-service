# user-service
Repo to contain producer code. Part of the CDC expert talk.

## Service endpoints. 
  
  ### /user GET request:
  ```
  curl -X GET \
    http://localhost:8080/user/myID 
  ```
  ### Response: HTTP 200 with body:
  ```
  {
      "name": "paresh",
      "email": "paresh@ee.com",
      "contact": "9888988786",
      "address": "pune"
  }
  ```
