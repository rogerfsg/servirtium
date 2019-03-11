## Interaction 0: OPTIONS /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Mon, 11 Mar 2019 09:51:43 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 1: GET /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 875
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:43 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "b51c7a47-f427-439e-b46d-7ee14205c612",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/b51c7a47-f427-439e-b46d-7ee14205c612",
      "order": -1
   },
   {
      "id": "4b9cf46c-41b2-4dfb-9a76-90ec5285562a",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/4b9cf46c-41b2-4dfb-9a76-90ec5285562a",
      "order": 523
   },
   {
      "id": "9dde5bc9-a862-4776-9ec1-50138703362d",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/9dde5bc9-a862-4776-9ec1-50138703362d",
      "order": 10
   },
   {
      "id": "8e944715-b6e0-44f4-afca-19693408dae5",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/8e944715-b6e0-44f4-afca-19693408dae5",
      "order": 10
   }
]
```

## Interaction 2: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 18
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "a todo"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 197
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:43 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "32080d19-041b-453a-a9fc-23ffda79e484",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/32080d19-041b-453a-a9fc-23ffda79e484",
   "order": -1
}
```

## Interaction 3: OPTIONS /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Mon, 11 Mar 2019 09:51:44 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 4: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:44 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 5: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:44 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 6: GET /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:44 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 7: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:44 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 8: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 24
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "walk the dog"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 203
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:44 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "262debfc-7d5a-437a-921e-4281a56131c9",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/262debfc-7d5a-437a-921e-4281a56131c9",
   "order": -1
}
```

## Interaction 9: GET /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 228
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "262debfc-7d5a-437a-921e-4281a56131c9",
      "title": "walk the dog",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/262debfc-7d5a-437a-921e-4281a56131c9",
      "order": -1
   }
]
```

## Interaction 10: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 11: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "63bb17dd-164a-40bb-aaeb-326f117a0c19",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/63bb17dd-164a-40bb-aaeb-326f117a0c19",
   "order": -1
}
```

## Interaction 12: GET /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 220
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "63bb17dd-164a-40bb-aaeb-326f117a0c19",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/63bb17dd-164a-40bb-aaeb-326f117a0c19",
      "order": -1
   }
]
```

## Interaction 13: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 14: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "854711cc-2900-436d-ba50-ee0e5ff25ec6",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/854711cc-2900-436d-ba50-ee0e5ff25ec6",
   "order": -1
}
```

## Interaction 15: GET /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 220
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "854711cc-2900-436d-ba50-ee0e5ff25ec6",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/854711cc-2900-436d-ba50-ee0e5ff25ec6",
      "order": -1
   }
]
```

## Interaction 16: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 17: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 19
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "my todo"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 198
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "2b7a75b9-074f-4faa-a2e5-60a93602894d",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/2b7a75b9-074f-4faa-a2e5-60a93602894d",
   "order": -1
}
```

## Interaction 18: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 19: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "todo the second"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 206
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "363d2513-0ec1-4b21-82e1-a4bfb55e4d4b",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/363d2513-0ec1-4b21-82e1-a4bfb55e4d4b",
   "order": -1
}
```

## Interaction 20: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 26
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "todo the first"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 205
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "75a4b0e8-b341-4dad-9c00-101928c16f0d",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/75a4b0e8-b341-4dad-9c00-101928c16f0d",
   "order": -1
}
```

## Interaction 21: GET /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 459
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "363d2513-0ec1-4b21-82e1-a4bfb55e4d4b",
      "title": "todo the second",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/363d2513-0ec1-4b21-82e1-a4bfb55e4d4b",
      "order": -1
   },
   {
      "id": "75a4b0e8-b341-4dad-9c00-101928c16f0d",
      "title": "todo the first",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/75a4b0e8-b341-4dad-9c00-101928c16f0d",
      "order": -1
   }
]
```

## Interaction 22: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 23: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 25
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "initial title"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 204
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "e5570e63-3ac8-4951-98dd-80f3ff5d02da",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/e5570e63-3ac8-4951-98dd-80f3ff5d02da",
   "order": -1
}
```

## Interaction 24: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 25: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "e472fd59-30e8-4fc8-87d3-5655151bf972",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/e472fd59-30e8-4fc8-87d3-5655151bf972",
   "order": -1
}
```

## Interaction 26: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 27: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "9d12c7b2-5bc3-4929-a348-6efe53c3608b",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/9d12c7b2-5bc3-4929-a348-6efe53c3608b",
   "order": -1
}
```

## Interaction 28: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 29: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "82524e40-dda4-480e-b080-6e07129be84a",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/82524e40-dda4-480e-b080-6e07129be84a",
   "order": -1
}
```

## Interaction 30: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 28
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "blah",
   "order": 523
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 196
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "19e06673-9ed1-426f-ab8e-d62a823162ed",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/19e06673-9ed1-426f-ab8e-d62a823162ed",
   "order": 523
}
```

## Interaction 31: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "order": 10,
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:49 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "84488b95-9f7a-4fdf-80aa-c656fbe8276a",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/84488b95-9f7a-4fdf-80aa-c656fbe8276a",
   "order": 10
}
```

## Interaction 32: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "order": 10,
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: *
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:51:49 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "7626ee86-46ee-4bc9-a697-4f2ae934daca",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/7626ee86-46ee-4bc9-a697-4f2ae934daca",
   "order": 10
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 0: OPTIONS /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: GET
Cache-Control: no-cache
Connection: keep-alive
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Mon, 11 Mar 2019 09:54:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 1: GET /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 875
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:34 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "82524e40-dda4-480e-b080-6e07129be84a",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/82524e40-dda4-480e-b080-6e07129be84a",
      "order": -1
   },
   {
      "id": "19e06673-9ed1-426f-ab8e-d62a823162ed",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/19e06673-9ed1-426f-ab8e-d62a823162ed",
      "order": 523
   },
   {
      "id": "84488b95-9f7a-4fdf-80aa-c656fbe8276a",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/84488b95-9f7a-4fdf-80aa-c656fbe8276a",
      "order": 10
   },
   {
      "id": "7626ee86-46ee-4bc9-a697-4f2ae934daca",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/7626ee86-46ee-4bc9-a697-4f2ae934daca",
      "order": 10
   }
]
```

## Interaction 2: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 18
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "a todo"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 197
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:34 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "176cf068-386e-4187-8cb5-05585ce81bc9",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/176cf068-386e-4187-8cb5-05585ce81bc9",
   "order": -1
}
```

## Interaction 3: OPTIONS /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: DELETE
Cache-Control: no-cache
Connection: keep-alive
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Mon, 11 Mar 2019 09:54:34 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 4: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:34 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 5: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 6: GET /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 7: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 8: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 24
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "walk the dog"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 203
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "f9a9d8be-7881-4c99-bc92-023ddfe4b981",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/f9a9d8be-7881-4c99-bc92-023ddfe4b981",
   "order": -1
}
```

## Interaction 9: GET /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 228
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "f9a9d8be-7881-4c99-bc92-023ddfe4b981",
      "title": "walk the dog",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/f9a9d8be-7881-4c99-bc92-023ddfe4b981",
      "order": -1
   }
]
```

## Interaction 10: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 11: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "0bf4a2dc-2a79-4f76-a67d-754839e4e00b",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/0bf4a2dc-2a79-4f76-a67d-754839e4e00b",
   "order": -1
}
```

## Interaction 12: GET /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 220
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "0bf4a2dc-2a79-4f76-a67d-754839e4e00b",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/0bf4a2dc-2a79-4f76-a67d-754839e4e00b",
      "order": -1
   }
]
```

## Interaction 13: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 14: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "634588ea-3950-451b-a0ed-f4a2f7ca6eea",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/634588ea-3950-451b-a0ed-f4a2f7ca6eea",
   "order": -1
}
```

## Interaction 15: GET /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 220
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "634588ea-3950-451b-a0ed-f4a2f7ca6eea",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/634588ea-3950-451b-a0ed-f4a2f7ca6eea",
      "order": -1
   }
]
```

## Interaction 16: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 17: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 19
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "my todo"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 198
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "48580af2-2741-4cdd-adc0-67b36af9755f",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/48580af2-2741-4cdd-adc0-67b36af9755f",
   "order": -1
}
```

## Interaction 18: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 19: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "todo the second"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 206
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a11bb5e7-6d1a-4b10-ab87-4f62822074a8",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a11bb5e7-6d1a-4b10-ab87-4f62822074a8",
   "order": -1
}
```

## Interaction 20: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 26
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "todo the first"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 205
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ae5df6fc-d820-4c80-9a1a-552be9351964",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ae5df6fc-d820-4c80-9a1a-552be9351964",
   "order": -1
}
```

## Interaction 21: GET /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 459
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "a11bb5e7-6d1a-4b10-ab87-4f62822074a8",
      "title": "todo the second",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/a11bb5e7-6d1a-4b10-ab87-4f62822074a8",
      "order": -1
   },
   {
      "id": "ae5df6fc-d820-4c80-9a1a-552be9351964",
      "title": "todo the first",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/ae5df6fc-d820-4c80-9a1a-552be9351964",
      "order": -1
   }
]
```

## Interaction 22: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 23: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 25
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "initial title"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 204
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "73cf447c-d689-4456-84e9-75f443275ca8",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/73cf447c-d689-4456-84e9-75f443275ca8",
   "order": -1
}
```

## Interaction 24: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 25: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "d7d82c3d-f1cb-4e66-bf95-430b82584e69",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/d7d82c3d-f1cb-4e66-bf95-430b82584e69",
   "order": -1
}
```

## Interaction 26: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 27: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "f1c96cea-7dc6-43e7-b0ca-af9f79019c1f",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/f1c96cea-7dc6-43e7-b0ca-af9f79019c1f",
   "order": -1
}
```

## Interaction 28: DELETE /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 29: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 16
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "8dfb7b4c-6727-4d87-93e1-523ac6dab01d",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/8dfb7b4c-6727-4d87-93e1-523ac6dab01d",
   "order": -1
}
```

## Interaction 30: OPTIONS /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: */*
Access-Control-Request-Headers: content-type
Access-Control-Request-Method: POST
Cache-Control: no-cache
Connection: keep-alive
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server ():

```

```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: POST
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Mon, 11 Mar 2019 09:54:40 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 31: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 28
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "title": "blah",
   "order": 523
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 196
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:40 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "3041c5da-035b-44a5-8999-3e0f49d4328a",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/3041c5da-035b-44a5-8999-3e0f49d4328a",
   "order": 523
}
```

## Interaction 32: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "order": 10,
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:40 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "b2008109-1c85-44ca-b6d0-9f7b0eb747f0",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/b2008109-1c85-44ca-b6d0-9f7b0eb747f0",
   "order": 10
}
```

## Interaction 33: POST /

### Request headers sent to the real server:

```
Accept-Encoding: gzip, deflate, br
Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7
Accept: text/plain, */*; q=0.01
Cache-Control: no-cache
Connection: keep-alive
Content-Length: 27
Content-Type: application/json
Host: todo-javalin.herokuapp.com
Origin: http://www.todobackend.com
Pragma: no-cache
Referer: http://www.todobackend.com/specs/index.html?http://todo-javalin.herokuapp.com
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server (application/json):

```
{
   "order": 10,
   "title": "blah"
}
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: Content-Type
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Mon, 11 Mar 2019 09:54:40 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ef9152ea-5f22-469f-a0da-554096292c99",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ef9152ea-5f22-469f-a0da-554096292c99",
   "order": 10
}
```

