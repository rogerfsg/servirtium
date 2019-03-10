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
Date: Sun, 10 Mar 2019 14:31:03 GMT
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
Date: Sun, 10 Mar 2019 14:31:19 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "ccf51b5a-f181-4cf1-97d9-067826992635",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/ccf51b5a-f181-4cf1-97d9-067826992635",
      "order": -1
   },
   {
      "id": "a75b1773-8a81-41aa-b082-4ba8ef464280",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/a75b1773-8a81-41aa-b082-4ba8ef464280",
      "order": 523
   },
   {
      "id": "eef20b1a-2c69-45d2-9c0a-6ce6fda8094d",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/eef20b1a-2c69-45d2-9c0a-6ce6fda8094d",
      "order": 10
   },
   {
      "id": "abec6797-7b0c-4026-9088-7aaca7b66ad4",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/abec6797-7b0c-4026-9088-7aaca7b66ad4",
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
Date: Sun, 10 Mar 2019 14:31:26 GMT
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
Date: Sun, 10 Mar 2019 14:31:28 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "531b0b2a-a5fa-4a47-9108-f4ca85708077",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/531b0b2a-a5fa-4a47-9108-f4ca85708077",
   "order": -1
}
```

## Interaction 5: OPTIONS /

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
Date: Sun, 10 Mar 2019 14:33:02 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 6: OPTIONS /

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
Date: Sun, 10 Mar 2019 14:33:02 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

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
Date: Sun, 10 Mar 2019 14:33:02 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
Date: Sun, 10 Mar 2019 14:33:05 GMT
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
Date: Sun, 10 Mar 2019 14:33:09 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "8f63c157-0725-4486-878d-4e804a2cf31a",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/8f63c157-0725-4486-878d-4e804a2cf31a",
   "order": -1
}
```

## Interaction 9: POST /

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
Date: Sun, 10 Mar 2019 14:33:09 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "28cf3744-de46-42b1-913a-b3177f879ec3",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/28cf3744-de46-42b1-913a-b3177f879ec3",
   "order": -1
}
```

## Interaction 11: OPTIONS /

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
Date: Sun, 10 Mar 2019 14:33:10 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 12: DELETE /

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
Date: Sun, 10 Mar 2019 14:33:10 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 13: POST /

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
Date: Sun, 10 Mar 2019 14:33:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "dae75a3f-3613-428c-a95e-b1329ddd8f16",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/dae75a3f-3613-428c-a95e-b1329ddd8f16",
   "order": -1
}
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
Date: Sun, 10 Mar 2019 14:33:14 GMT
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
Date: Sun, 10 Mar 2019 14:33:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "f16f5a63-a9a5-4df4-be42-06f42ab34a58",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/f16f5a63-a9a5-4df4-be42-06f42ab34a58",
   "order": -1
}
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
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 3
Content-Type: application/json
Date: Sun, 10 Mar 2019 14:33:14 GMT
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
Date: Sun, 10 Mar 2019 14:33:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "56eec50b-5f05-4cfe-bfa8-099e639f3d12",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/56eec50b-5f05-4cfe-bfa8-099e639f3d12",
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
Date: Sun, 10 Mar 2019 14:33:14 GMT
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
Date: Sun, 10 Mar 2019 14:33:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "c990dd50-654c-4219-a372-ec7be20ad257",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/c990dd50-654c-4219-a372-ec7be20ad257",
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
Date: Sun, 10 Mar 2019 14:33:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "6d73f162-3e3a-48d2-9198-b61cc6cb1a50",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/6d73f162-3e3a-48d2-9198-b61cc6cb1a50",
   "order": 523
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
Date: Sun, 10 Mar 2019 14:33:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "86a80066-e96a-488c-a859-0f3d6cb61314",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/86a80066-e96a-488c-a859-0f3d6cb61314",
   "order": 10
}
```

## Interaction 22: OPTIONS /

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
Date: Sun, 10 Mar 2019 14:33:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 23: POST /

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
Date: Sun, 10 Mar 2019 14:33:16 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "c3b088f5-6651-4c4f-9b54-73bb08a4f1ca",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/c3b088f5-6651-4c4f-9b54-73bb08a4f1ca",
   "order": 10
}
```

