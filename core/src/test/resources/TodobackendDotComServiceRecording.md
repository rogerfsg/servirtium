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
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sun, 10 Mar 2019 14:57:10 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 875
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:11 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "c990dd50-654c-4219-a372-ec7be20ad257",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/c990dd50-654c-4219-a372-ec7be20ad257",
      "order": -1
   },
   {
      "id": "6d73f162-3e3a-48d2-9198-b61cc6cb1a50",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/6d73f162-3e3a-48d2-9198-b61cc6cb1a50",
      "order": 523
   },
   {
      "id": "86a80066-e96a-488c-a859-0f3d6cb61314",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/86a80066-e96a-488c-a859-0f3d6cb61314",
      "order": 10
   },
   {
      "id": "c3b088f5-6651-4c4f-9b54-73bb08a4f1ca",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/c3b088f5-6651-4c4f-9b54-73bb08a4f1ca",
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 197
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:11 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "d6e627c9-08d7-4bdf-9e35-b23dddabab84",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/d6e627c9-08d7-4bdf-9e35-b23dddabab84",
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
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sun, 10 Mar 2019 14:57:12 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:12 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:12 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:12 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:12 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 203
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:13 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "7d369137-fd16-4488-b8d1-e6f962ea2217",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/7d369137-fd16-4488-b8d1-e6f962ea2217",
   "order": -1
}
```

## Interaction 9: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:13 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 10: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:13 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "6d8a0029-f00c-488f-a699-59416be28368",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/6d8a0029-f00c-488f-a699-59416be28368",
   "order": -1
}
```

## Interaction 11: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:13 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 12: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:13 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "cafc7718-3fa9-4709-8e26-6f7798eb27da",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/cafc7718-3fa9-4709-8e26-6f7798eb27da",
   "order": -1
}
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:14 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 198
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "502054d1-d432-4d2c-8170-90e58abb1db6",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/502054d1-d432-4d2c-8170-90e58abb1db6",
   "order": -1
}
```

## Interaction 15: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 16: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 206
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "03399b3d-cc0b-439b-9642-d060961290b6",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/03399b3d-cc0b-439b-9642-d060961290b6",
   "order": -1
}
```

## Interaction 17: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 205
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "403fbdea-7f9e-4e48-8837-65c2ca15416a",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/403fbdea-7f9e-4e48-8837-65c2ca15416a",
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:14 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 204
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "6de5a6a5-ea5b-4bb7-993a-1afe542104c4",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/6de5a6a5-ea5b-4bb7-993a-1afe542104c4",
   "order": -1
}
```

## Interaction 20: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 21: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "28a7e134-cb51-4489-aa2e-e2afbec21988",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/28a7e134-cb51-4489-aa2e-e2afbec21988",
   "order": -1
}
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:15 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "d2971892-f7b3-4125-8557-e0fa95831576",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/d2971892-f7b3-4125-8557-e0fa95831576",
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:15 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:16 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "cec2d90c-9ef9-4c33-9a56-661968d31547",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/cec2d90c-9ef9-4c33-9a56-661968d31547",
   "order": -1
}
```

## Interaction 26: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 196
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:16 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "3900f58c-7aae-40bf-92aa-083090548692",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/3900f58c-7aae-40bf-92aa-083090548692",
   "order": 523
}
```

## Interaction 27: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:16 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "bd4ccfc8-b6b5-4f2e-9fcf-3d5f784e7350",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/bd4ccfc8-b6b5-4f2e-9fcf-3d5f784e7350",
   "order": 10
}
```

## Interaction 28: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:57:16 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ae9048cf-7c65-4804-86aa-1370d80e07a0",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ae9048cf-7c65-4804-86aa-1370d80e07a0",
   "order": 10
}
```

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
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sun, 10 Mar 2019 15:07:58 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 875
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:07:58 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "cec2d90c-9ef9-4c33-9a56-661968d31547",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/cec2d90c-9ef9-4c33-9a56-661968d31547",
      "order": -1
   },
   {
      "id": "3900f58c-7aae-40bf-92aa-083090548692",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/3900f58c-7aae-40bf-92aa-083090548692",
      "order": 523
   },
   {
      "id": "bd4ccfc8-b6b5-4f2e-9fcf-3d5f784e7350",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/bd4ccfc8-b6b5-4f2e-9fcf-3d5f784e7350",
      "order": 10
   },
   {
      "id": "ae9048cf-7c65-4804-86aa-1370d80e07a0",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/ae9048cf-7c65-4804-86aa-1370d80e07a0",
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 197
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:07:59 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "5d06ecee-037f-4dd4-a8f7-965dc8abac28",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/5d06ecee-037f-4dd4-a8f7-965dc8abac28",
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
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sun, 10 Mar 2019 15:07:59 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:07:59 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:07:59 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:07:59 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:07:59 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 203
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:00 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "6d5ffc76-b699-4759-bce3-cfdba02d8830",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/6d5ffc76-b699-4759-bce3-cfdba02d8830",
   "order": -1
}
```

## Interaction 9: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:00 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 10: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:00 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "4ecf1a11-32cb-4a5c-84af-8d414eda4d22",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/4ecf1a11-32cb-4a5c-84af-8d414eda4d22",
   "order": -1
}
```

## Interaction 11: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:00 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 12: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:00 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "3a8a3d07-2546-4362-8e66-87c785677612",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/3a8a3d07-2546-4362-8e66-87c785677612",
   "order": -1
}
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:01 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 198
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:01 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "1922c160-804b-434f-a015-36aaf7abe8da",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/1922c160-804b-434f-a015-36aaf7abe8da",
   "order": -1
}
```

## Interaction 15: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:01 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 16: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 206
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:01 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ca309ba0-2d47-4579-a3b7-bf7f53c8142d",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ca309ba0-2d47-4579-a3b7-bf7f53c8142d",
   "order": -1
}
```

## Interaction 17: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 205
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:01 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "6c4957d4-f2f7-489b-a35b-ee802cab9c43",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/6c4957d4-f2f7-489b-a35b-ee802cab9c43",
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:01 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 204
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:02 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "c56c08fd-aef9-4a7d-bb56-d12171bd5598",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/c56c08fd-aef9-4a7d-bb56-d12171bd5598",
   "order": -1
}
```

## Interaction 20: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:02 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 21: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:02 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "aedfce57-77b5-4b87-9f1f-e9f3a7e8579a",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/aedfce57-77b5-4b87-9f1f-e9f3a7e8579a",
   "order": -1
}
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:02 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:02 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a5cd9a4a-2561-4247-b3e9-b0c01efa5c32",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a5cd9a4a-2561-4247-b3e9-b0c01efa5c32",
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:03 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:03 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "1f8724c7-3bbc-4caa-afb4-90f97d23d6b2",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/1f8724c7-3bbc-4caa-afb4-90f97d23d6b2",
   "order": -1
}
```

## Interaction 26: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 196
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:03 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "778c8819-64fc-4225-9ec4-a0be84e43028",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/778c8819-64fc-4225-9ec4-a0be84e43028",
   "order": 523
}
```

## Interaction 27: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:03 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "fa457bc9-0d57-4fa7-a349-cb3bddb1037c",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/fa457bc9-0d57-4fa7-a349-cb3bddb1037c",
   "order": 10
}
```

## Interaction 28: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:08:04 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "5dae0596-5338-4444-9662-aa45dbe2d618",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/5dae0596-5338-4444-9662-aa45dbe2d618",
   "order": 10
}
```

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
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sun, 10 Mar 2019 15:17:25 GMT
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 875
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "1f8724c7-3bbc-4caa-afb4-90f97d23d6b2",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/1f8724c7-3bbc-4caa-afb4-90f97d23d6b2",
      "order": -1
   },
   {
      "id": "778c8819-64fc-4225-9ec4-a0be84e43028",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/778c8819-64fc-4225-9ec4-a0be84e43028",
      "order": 523
   },
   {
      "id": "fa457bc9-0d57-4fa7-a349-cb3bddb1037c",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/fa457bc9-0d57-4fa7-a349-cb3bddb1037c",
      "order": 10
   },
   {
      "id": "5dae0596-5338-4444-9662-aa45dbe2d618",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/5dae0596-5338-4444-9662-aa45dbe2d618",
      "order": 10
   }
]
```

## Interaction 2: OPTIONS /

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
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: POST
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sun, 10 Mar 2019 15:17:44 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 3: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 197
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "5ebbeb60-ae17-422d-8aa0-a9458c31d5fe",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/5ebbeb60-ae17-422d-8aa0-a9458c31d5fe",
   "order": -1
}
```

## Interaction 4: OPTIONS /

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
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sun, 10 Mar 2019 15:17:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 6: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 7: GET /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 8: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 9: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 203
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "6620905d-10bf-4e56-81c5-746511f4279d",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/6620905d-10bf-4e56-81c5-746511f4279d",
   "order": -1
}
```

## Interaction 10: GET /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 228
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "6620905d-10bf-4e56-81c5-746511f4279d",
      "title": "walk the dog",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/6620905d-10bf-4e56-81c5-746511f4279d",
      "order": -1
   }
]
```

## Interaction 11: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 12: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "86225187-7ce0-4d35-9ed5-5f8547a07756",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/86225187-7ce0-4d35-9ed5-5f8547a07756",
   "order": -1
}
```

## Interaction 13: GET /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 220
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "86225187-7ce0-4d35-9ed5-5f8547a07756",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/86225187-7ce0-4d35-9ed5-5f8547a07756",
      "order": -1
   }
]
```

## Interaction 14: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 15: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "05fed963-e009-4fcd-ae3b-522d2308eb9f",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/05fed963-e009-4fcd-ae3b-522d2308eb9f",
   "order": -1
}
```

## Interaction 16: GET /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 220
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "05fed963-e009-4fcd-ae3b-522d2308eb9f",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/05fed963-e009-4fcd-ae3b-522d2308eb9f",
      "order": -1
   }
]
```

## Interaction 17: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 18: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 198
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "40ce662f-553b-4881-9faf-5cd6d248d856",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/40ce662f-553b-4881-9faf-5cd6d248d856",
   "order": -1
}
```

## Interaction 19: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 20: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 206
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "3ea65d69-36cb-440e-84a6-6703763881b6",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/3ea65d69-36cb-440e-84a6-6703763881b6",
   "order": -1
}
```

## Interaction 21: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 205
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "1e9a5578-cbee-47c1-a986-6f1968f310a7",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/1e9a5578-cbee-47c1-a986-6f1968f310a7",
   "order": -1
}
```

## Interaction 22: GET /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 459
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "3ea65d69-36cb-440e-84a6-6703763881b6",
      "title": "todo the second",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/3ea65d69-36cb-440e-84a6-6703763881b6",
      "order": -1
   },
   {
      "id": "1e9a5578-cbee-47c1-a986-6f1968f310a7",
      "title": "todo the first",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/1e9a5578-cbee-47c1-a986-6f1968f310a7",
      "order": -1
   }
]
```

## Interaction 23: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 24: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 204
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a45f7c3c-84be-44e2-9fc8-8f43a40f0e70",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a45f7c3c-84be-44e2-9fc8-8f43a40f0e70",
   "order": -1
}
```

## Interaction 25: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 26: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a1762ef2-9fe3-44bc-9405-7016499e91e7",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a1762ef2-9fe3-44bc-9405-7016499e91e7",
   "order": -1
}
```

## Interaction 27: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:49 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 28: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:49 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "dedf428d-b001-43d8-9a47-d20ce3dfe140",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/dedf428d-b001-43d8-9a47-d20ce3dfe140",
   "order": -1
}
```

## Interaction 29: DELETE /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:49 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 30: POST /

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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:49 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "946a3993-f3ca-4455-b5f0-1cf99592e31f",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/946a3993-f3ca-4455-b5f0-1cf99592e31f",
   "order": -1
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 196
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:49 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "3d1087a1-ef17-45e8-a715-3a7a5897a816",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/3d1087a1-ef17-45e8-a715-3a7a5897a816",
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:50 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "0f41ac74-e421-433a-9c88-1ae87813ca92",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/0f41ac74-e421-433a-9c88-1ae87813ca92",
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sun, 10 Mar 2019 15:17:50 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "833f187d-48ab-4f46-a15b-103342cd004c",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/833f187d-48ab-4f46-a15b-103342cd004c",
   "order": 10
}
```

