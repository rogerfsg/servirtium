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
Date: Sat, 09 Mar 2019 19:42:14 GMT
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
Date: Sat, 09 Mar 2019 19:42:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "e6918707-c521-4031-ad3c-0f099dd4660a",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/e6918707-c521-4031-ad3c-0f099dd4660a",
      "order": -1
   },
   {
      "id": "f83aa14e-4f7c-46dd-9c9f-756fcfa8d6e7",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/f83aa14e-4f7c-46dd-9c9f-756fcfa8d6e7",
      "order": 523
   },
   {
      "id": "da24474d-7d2c-4aa1-804a-5e6db954d9e7",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/da24474d-7d2c-4aa1-804a-5e6db954d9e7",
      "order": 10
   },
   {
      "id": "3183bb0b-531e-4116-bc8c-78b4f3fec2dd",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/3183bb0b-531e-4116-bc8c-78b4f3fec2dd",
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
Date: Sat, 09 Mar 2019 19:42:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "6bdc2647-4126-484d-a5c3-55867ca05a92",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/6bdc2647-4126-484d-a5c3-55867ca05a92",
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
Date: Sat, 09 Mar 2019 19:42:15 GMT
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
Date: Sat, 09 Mar 2019 19:42:15 GMT
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
Date: Sat, 09 Mar 2019 19:42:15 GMT
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
Date: Sat, 09 Mar 2019 19:42:15 GMT
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
Date: Sat, 09 Mar 2019 19:42:15 GMT
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
Date: Sat, 09 Mar 2019 19:42:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "4a2ad198-8504-4e91-8765-66fe28f7484a",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/4a2ad198-8504-4e91-8765-66fe28f7484a",
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
Date: Sat, 09 Mar 2019 19:42:16 GMT
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
Date: Sat, 09 Mar 2019 19:42:16 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "c6469d1f-72ed-4933-81dd-02f2254f13f9",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/c6469d1f-72ed-4933-81dd-02f2254f13f9",
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
Date: Sat, 09 Mar 2019 19:42:16 GMT
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
Date: Sat, 09 Mar 2019 19:42:16 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "9278934d-295d-406e-b73d-2bd831dd6897",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/9278934d-295d-406e-b73d-2bd831dd6897",
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
Date: Sat, 09 Mar 2019 19:42:16 GMT
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
Date: Sat, 09 Mar 2019 19:42:16 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "f7a62f1a-f393-49bc-9092-dad7c0fe81b0",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/f7a62f1a-f393-49bc-9092-dad7c0fe81b0",
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
Date: Sat, 09 Mar 2019 19:42:17 GMT
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
Date: Sat, 09 Mar 2019 19:42:17 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a0d8f5ea-b9b8-487d-a9d8-11f22d6ea2cc",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a0d8f5ea-b9b8-487d-a9d8-11f22d6ea2cc",
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
Date: Sat, 09 Mar 2019 19:42:17 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "fd41f86a-dbdf-4e36-b0fb-18ddf9dcd00b",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/fd41f86a-dbdf-4e36-b0fb-18ddf9dcd00b",
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
Date: Sat, 09 Mar 2019 19:42:17 GMT
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
Date: Sat, 09 Mar 2019 19:42:17 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "f622d0f5-1fca-49fe-8a42-2aa1682eb5cc",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/f622d0f5-1fca-49fe-8a42-2aa1682eb5cc",
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
Date: Sat, 09 Mar 2019 19:42:17 GMT
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
Date: Sat, 09 Mar 2019 19:42:18 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a4912608-8d4d-4137-81b6-adf133398934",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a4912608-8d4d-4137-81b6-adf133398934",
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
Date: Sat, 09 Mar 2019 19:42:18 GMT
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
Date: Sat, 09 Mar 2019 19:42:18 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "7c6d5671-d864-4d71-b22f-d39b52c202dc",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/7c6d5671-d864-4d71-b22f-d39b52c202dc",
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
Date: Sat, 09 Mar 2019 19:42:18 GMT
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
Date: Sat, 09 Mar 2019 19:42:18 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "3df8d08e-4d8f-4bc0-b3a1-7a05f7253b2f",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/3df8d08e-4d8f-4bc0-b3a1-7a05f7253b2f",
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
Date: Sat, 09 Mar 2019 19:42:18 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "3caa2050-9e50-4c29-bf0d-cf371abf5196",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/3caa2050-9e50-4c29-bf0d-cf371abf5196",
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
Date: Sat, 09 Mar 2019 19:42:19 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "7491e7e6-99f8-4c81-85fc-5050bc5efaca",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/7491e7e6-99f8-4c81-85fc-5050bc5efaca",
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
Date: Sat, 09 Mar 2019 19:42:19 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "3b803fd5-efd7-4792-a441-13b3249d7e0d",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/3b803fd5-efd7-4792-a441-13b3249d7e0d",
   "order": 10
}
```

## Interaction 29: OPTIONS /

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
Date: Sat, 09 Mar 2019 19:44:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 30: GET /

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
Date: Sat, 09 Mar 2019 19:44:34 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "3df8d08e-4d8f-4bc0-b3a1-7a05f7253b2f",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/3df8d08e-4d8f-4bc0-b3a1-7a05f7253b2f",
      "order": -1
   },
   {
      "id": "3caa2050-9e50-4c29-bf0d-cf371abf5196",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/3caa2050-9e50-4c29-bf0d-cf371abf5196",
      "order": 523
   },
   {
      "id": "7491e7e6-99f8-4c81-85fc-5050bc5efaca",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/7491e7e6-99f8-4c81-85fc-5050bc5efaca",
      "order": 10
   },
   {
      "id": "3b803fd5-efd7-4792-a441-13b3249d7e0d",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/3b803fd5-efd7-4792-a441-13b3249d7e0d",
      "order": 10
   }
]
```

## Interaction 31: POST /

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
Date: Sat, 09 Mar 2019 19:44:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "b2f61c70-7f68-4789-92a4-7cac2ef9c711",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/b2f61c70-7f68-4789-92a4-7cac2ef9c711",
   "order": -1
}
```

## Interaction 32: OPTIONS /

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
Date: Sat, 09 Mar 2019 19:44:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 33: DELETE /

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
Date: Sat, 09 Mar 2019 19:44:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 34: DELETE /

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
Date: Sat, 09 Mar 2019 19:44:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 35: GET /

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
Date: Sat, 09 Mar 2019 19:44:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 36: DELETE /

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
Date: Sat, 09 Mar 2019 19:44:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 37: POST /

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
Date: Sat, 09 Mar 2019 19:44:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "89151407-fc5d-420a-97ba-32e9d3f77c8c",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/89151407-fc5d-420a-97ba-32e9d3f77c8c",
   "order": -1
}
```

## Interaction 38: DELETE /

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
Date: Sat, 09 Mar 2019 19:44:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 39: POST /

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
Date: Sat, 09 Mar 2019 19:44:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ae507bf9-4177-4674-bf91-671861d161a8",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ae507bf9-4177-4674-bf91-671861d161a8",
   "order": -1
}
```

## Interaction 40: DELETE /

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
Date: Sat, 09 Mar 2019 19:44:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 41: POST /

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
Date: Sat, 09 Mar 2019 19:44:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "d6413bff-1a2d-4d74-ae4a-d7f91e31e7d6",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/d6413bff-1a2d-4d74-ae4a-d7f91e31e7d6",
   "order": -1
}
```

## Interaction 42: DELETE /

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
Date: Sat, 09 Mar 2019 19:44:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 43: POST /

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
Date: Sat, 09 Mar 2019 19:44:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "4f4e939d-68d6-458f-b3d6-f98f5e50aef2",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/4f4e939d-68d6-458f-b3d6-f98f5e50aef2",
   "order": -1
}
```

## Interaction 44: DELETE /

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
Date: Sat, 09 Mar 2019 19:44:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 45: POST /

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
Date: Sat, 09 Mar 2019 19:44:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "5cf6234f-f6aa-475e-ac7c-b83ce3afe2f1",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/5cf6234f-f6aa-475e-ac7c-b83ce3afe2f1",
   "order": -1
}
```

## Interaction 46: POST /

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
Date: Sat, 09 Mar 2019 19:44:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "5d0c8811-f196-414f-94b6-1eebd207294d",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/5d0c8811-f196-414f-94b6-1eebd207294d",
   "order": -1
}
```

## Interaction 47: DELETE /

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
Date: Sat, 09 Mar 2019 19:44:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 48: POST /

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
Date: Sat, 09 Mar 2019 19:44:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "70d1e415-0b6c-407e-896a-02436326b16c",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/70d1e415-0b6c-407e-896a-02436326b16c",
   "order": -1
}
```

## Interaction 49: DELETE /

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
Date: Sat, 09 Mar 2019 19:44:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 50: POST /

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
Date: Sat, 09 Mar 2019 19:44:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "875455fb-9c49-40a8-90ae-b0199145b039",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/875455fb-9c49-40a8-90ae-b0199145b039",
   "order": -1
}
```

## Interaction 51: DELETE /

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
Date: Sat, 09 Mar 2019 19:44:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 52: POST /

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
Date: Sat, 09 Mar 2019 19:44:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "1bf1ee75-eef0-4335-9c93-619d1596c862",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/1bf1ee75-eef0-4335-9c93-619d1596c862",
   "order": -1
}
```

## Interaction 53: DELETE /

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
Date: Sat, 09 Mar 2019 19:44:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 54: POST /

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
Date: Sat, 09 Mar 2019 19:44:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "b81d2d23-df8f-4995-8d09-9fc38cc2ccc6",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/b81d2d23-df8f-4995-8d09-9fc38cc2ccc6",
   "order": -1
}
```

## Interaction 55: POST /

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
Date: Sat, 09 Mar 2019 19:44:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "b30ae895-3080-45b7-bf6c-11ac18911ad5",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/b30ae895-3080-45b7-bf6c-11ac18911ad5",
   "order": 523
}
```

## Interaction 56: POST /

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
Date: Sat, 09 Mar 2019 19:44:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "357b4c64-b4f0-468e-a0cc-7d9046d27300",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/357b4c64-b4f0-468e-a0cc-7d9046d27300",
   "order": 10
}
```

## Interaction 57: POST /

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
Date: Sat, 09 Mar 2019 19:44:40 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "3783d63f-1b51-458d-a954-4e06034b1740",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/3783d63f-1b51-458d-a954-4e06034b1740",
   "order": 10
}
```

## Interaction 58: OPTIONS /

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
Date: Sat, 09 Mar 2019 19:45:32 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 59: GET /

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
Date: Sat, 09 Mar 2019 19:45:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "b81d2d23-df8f-4995-8d09-9fc38cc2ccc6",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/b81d2d23-df8f-4995-8d09-9fc38cc2ccc6",
      "order": -1
   },
   {
      "id": "b30ae895-3080-45b7-bf6c-11ac18911ad5",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/b30ae895-3080-45b7-bf6c-11ac18911ad5",
      "order": 523
   },
   {
      "id": "357b4c64-b4f0-468e-a0cc-7d9046d27300",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/357b4c64-b4f0-468e-a0cc-7d9046d27300",
      "order": 10
   },
   {
      "id": "3783d63f-1b51-458d-a954-4e06034b1740",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/3783d63f-1b51-458d-a954-4e06034b1740",
      "order": 10
   }
]
```

## Interaction 60: POST /

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
Date: Sat, 09 Mar 2019 19:45:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "efce79d3-decc-4672-a646-c1a48703fb3d",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/efce79d3-decc-4672-a646-c1a48703fb3d",
   "order": -1
}
```

## Interaction 61: OPTIONS /

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
Date: Sat, 09 Mar 2019 19:45:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 62: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 63: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 64: GET /

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
Date: Sat, 09 Mar 2019 19:45:34 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 65: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:34 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 66: POST /

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
Date: Sat, 09 Mar 2019 19:45:34 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "df5d1fcb-9a99-464c-a883-5087756f2db4",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/df5d1fcb-9a99-464c-a883-5087756f2db4",
   "order": -1
}
```

## Interaction 67: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:34 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 68: POST /

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
Date: Sat, 09 Mar 2019 19:45:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "7dc35c89-fe90-46f6-bc9d-2cbc45c058d4",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/7dc35c89-fe90-46f6-bc9d-2cbc45c058d4",
   "order": -1
}
```

## Interaction 69: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 70: POST /

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
Date: Sat, 09 Mar 2019 19:45:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "1567572e-1b1a-4b0d-a4a7-8fe822ea40ea",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/1567572e-1b1a-4b0d-a4a7-8fe822ea40ea",
   "order": -1
}
```

## Interaction 71: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 72: POST /

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
Date: Sat, 09 Mar 2019 19:45:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ca67704d-9d65-4d7a-bd7d-5a310726778a",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ca67704d-9d65-4d7a-bd7d-5a310726778a",
   "order": -1
}
```

## Interaction 73: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 75: POST /

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
Date: Sat, 09 Mar 2019 19:45:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a290b039-2d8c-42a1-ada9-6d4e08324953",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a290b039-2d8c-42a1-ada9-6d4e08324953",
   "order": -1
}
```

## Interaction 74: POST /

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
Date: Sat, 09 Mar 2019 19:45:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a91ea731-24c8-403e-9360-26be67674cab",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a91ea731-24c8-403e-9360-26be67674cab",
   "order": -1
}
```

## Interaction 76: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 77: POST /

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
Date: Sat, 09 Mar 2019 19:45:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "15d9515e-cb0b-4d8d-9f7a-5d6ead97601b",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/15d9515e-cb0b-4d8d-9f7a-5d6ead97601b",
   "order": -1
}
```

## Interaction 78: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 79: POST /

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
Date: Sat, 09 Mar 2019 19:45:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "6dbdd23c-7b10-41c4-88bd-f8757a458aa7",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/6dbdd23c-7b10-41c4-88bd-f8757a458aa7",
   "order": -1
}
```

## Interaction 80: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 81: POST /

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
Date: Sat, 09 Mar 2019 19:45:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "bebfe3f6-c635-4d1e-8d5a-da6dfcff8ad1",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/bebfe3f6-c635-4d1e-8d5a-da6dfcff8ad1",
   "order": -1
}
```

## Interaction 82: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 83: POST /

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
Date: Sat, 09 Mar 2019 19:45:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "37c5968a-5db2-48ad-a817-3171b738247a",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/37c5968a-5db2-48ad-a817-3171b738247a",
   "order": -1
}
```

## Interaction 84: POST /

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
Date: Sat, 09 Mar 2019 19:45:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "26ee10a9-787e-4c5c-9583-78c8a5d96087",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/26ee10a9-787e-4c5c-9583-78c8a5d96087",
   "order": 523
}
```

## Interaction 85: OPTIONS /

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
Date: Sat, 09 Mar 2019 19:45:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 86: POST /

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
Date: Sat, 09 Mar 2019 19:45:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "511f9222-aab9-4ec7-8b41-61c07edc3bbd",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/511f9222-aab9-4ec7-8b41-61c07edc3bbd",
   "order": 10
}
```

## Interaction 87: POST /

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
Date: Sat, 09 Mar 2019 19:45:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "4b5981c5-eb8b-4a45-98bc-c3672344585d",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/4b5981c5-eb8b-4a45-98bc-c3672344585d",
   "order": 10
}
```

## Interaction 88: OPTIONS /

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
Date: Sat, 09 Mar 2019 19:45:53 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 89: GET /

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
Date: Sat, 09 Mar 2019 19:45:54 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "37c5968a-5db2-48ad-a817-3171b738247a",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/37c5968a-5db2-48ad-a817-3171b738247a",
      "order": -1
   },
   {
      "id": "26ee10a9-787e-4c5c-9583-78c8a5d96087",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/26ee10a9-787e-4c5c-9583-78c8a5d96087",
      "order": 523
   },
   {
      "id": "511f9222-aab9-4ec7-8b41-61c07edc3bbd",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/511f9222-aab9-4ec7-8b41-61c07edc3bbd",
      "order": 10
   },
   {
      "id": "4b5981c5-eb8b-4a45-98bc-c3672344585d",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/4b5981c5-eb8b-4a45-98bc-c3672344585d",
      "order": 10
   }
]
```

## Interaction 90: POST /

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
Date: Sat, 09 Mar 2019 19:45:54 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a32911fc-a4df-4684-ad9f-ff1157323559",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a32911fc-a4df-4684-ad9f-ff1157323559",
   "order": -1
}
```

## Interaction 91: OPTIONS /

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
Date: Sat, 09 Mar 2019 19:45:54 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 92: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:55 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 93: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:55 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 94: GET /

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
Date: Sat, 09 Mar 2019 19:45:55 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 95: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:55 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 96: POST /

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
Date: Sat, 09 Mar 2019 19:45:55 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "657f28a9-6576-4730-b688-802ade15c84d",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/657f28a9-6576-4730-b688-802ade15c84d",
   "order": -1
}
```

## Interaction 97: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:56 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 98: POST /

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
Date: Sat, 09 Mar 2019 19:45:56 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "3af01b00-cd8f-45e7-bba5-b2b5bf99012b",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/3af01b00-cd8f-45e7-bba5-b2b5bf99012b",
   "order": -1
}
```

## Interaction 99: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:56 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 100: POST /

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
Date: Sat, 09 Mar 2019 19:45:56 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "b387c1d3-47aa-479d-b19c-c09e9980b832",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/b387c1d3-47aa-479d-b19c-c09e9980b832",
   "order": -1
}
```

## Interaction 101: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:56 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 102: GET /

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
Date: Sat, 09 Mar 2019 19:45:57 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 103: POST /

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
Date: Sat, 09 Mar 2019 19:45:58 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a71a2aad-d20d-4643-a78a-a3a9c3055607",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a71a2aad-d20d-4643-a78a-a3a9c3055607",
   "order": -1
}
```

## Interaction 104: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:58 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 105: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:58 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 106: GET /

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
Date: Sat, 09 Mar 2019 19:45:58 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 107: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:58 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 108: POST /

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
Date: Sat, 09 Mar 2019 19:45:59 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "2fa23b9d-143d-4520-a6c8-dbebd04d8dcd",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/2fa23b9d-143d-4520-a6c8-dbebd04d8dcd",
   "order": -1
}
```

## Interaction 109: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:59 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 110: POST /

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
Date: Sat, 09 Mar 2019 19:45:59 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "5907511b-abe4-4adf-8c4b-048a4e076009",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/5907511b-abe4-4adf-8c4b-048a4e076009",
   "order": -1
}
```

## Interaction 111: DELETE /

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
Date: Sat, 09 Mar 2019 19:45:59 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 112: OPTIONS /

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
Date: Sat, 09 Mar 2019 19:46:00 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 113: POST /

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
Date: Sat, 09 Mar 2019 19:46:00 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "8e352171-5822-4b11-86bc-3501ad7a7ea7",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/8e352171-5822-4b11-86bc-3501ad7a7ea7",
   "order": -1
}
```

## Interaction 114: OPTIONS /

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
Date: Sat, 09 Mar 2019 19:46:00 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 115: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:00 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 116: POST /

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
Date: Sat, 09 Mar 2019 19:46:00 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "43e0c11e-5c09-47fb-9943-e4b4673b531a",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/43e0c11e-5c09-47fb-9943-e4b4673b531a",
   "order": -1
}
```

## Interaction 117: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:01 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 119: POST /

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
Date: Sat, 09 Mar 2019 19:46:01 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "8645b5e0-315d-497b-8b26-095136acd6b8",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/8645b5e0-315d-497b-8b26-095136acd6b8",
   "order": -1
}
```

## Interaction 118: POST /

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
Date: Sat, 09 Mar 2019 19:46:01 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "becec9fc-6926-4c66-93c5-844df45cf15d",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/becec9fc-6926-4c66-93c5-844df45cf15d",
   "order": -1
}
```

## Interaction 120: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:01 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 121: POST /

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
Date: Sat, 09 Mar 2019 19:46:01 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "826d1db6-95e5-4c2a-ba21-a04eea676c51",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/826d1db6-95e5-4c2a-ba21-a04eea676c51",
   "order": -1
}
```

## Interaction 122: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:02 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 123: POST /

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
Date: Sat, 09 Mar 2019 19:46:02 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a0fdb9bb-1f58-4b5d-ab41-51a45463375a",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a0fdb9bb-1f58-4b5d-ab41-51a45463375a",
   "order": -1
}
```

## Interaction 124: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:02 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 125: POST /

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
Date: Sat, 09 Mar 2019 19:46:02 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "532cfb01-f61e-4597-902a-63d3b942c138",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/532cfb01-f61e-4597-902a-63d3b942c138",
   "order": -1
}
```

## Interaction 126: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:03 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 127: POST /

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
Date: Sat, 09 Mar 2019 19:46:03 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "f73e2dd6-b5e1-49e9-b158-cd45a2ee9890",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/f73e2dd6-b5e1-49e9-b158-cd45a2ee9890",
   "order": -1
}
```

## Interaction 128: POST /

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
Date: Sat, 09 Mar 2019 19:46:03 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "dd42f292-4d6a-4388-a768-610ab3cd9fd2",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/dd42f292-4d6a-4388-a768-610ab3cd9fd2",
   "order": 523
}
```

## Interaction 129: POST /

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
Date: Sat, 09 Mar 2019 19:46:04 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ff0533ef-0bff-429a-ac8e-27ec68c06d30",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ff0533ef-0bff-429a-ac8e-27ec68c06d30",
   "order": 10
}
```

## Interaction 130: POST /

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
Date: Sat, 09 Mar 2019 19:46:04 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "da6840ec-5e25-43c2-ad57-1edd9042e375",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/da6840ec-5e25-43c2-ad57-1edd9042e375",
   "order": 10
}
```

## Interaction 131: OPTIONS /

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
Connection: close
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 19:46:11 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 132: GET /

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
Date: Sat, 09 Mar 2019 19:46:12 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "f73e2dd6-b5e1-49e9-b158-cd45a2ee9890",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/f73e2dd6-b5e1-49e9-b158-cd45a2ee9890",
      "order": -1
   },
   {
      "id": "dd42f292-4d6a-4388-a768-610ab3cd9fd2",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/dd42f292-4d6a-4388-a768-610ab3cd9fd2",
      "order": 523
   },
   {
      "id": "ff0533ef-0bff-429a-ac8e-27ec68c06d30",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/ff0533ef-0bff-429a-ac8e-27ec68c06d30",
      "order": 10
   },
   {
      "id": "da6840ec-5e25-43c2-ad57-1edd9042e375",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/da6840ec-5e25-43c2-ad57-1edd9042e375",
      "order": 10
   }
]
```

## Interaction 133: POST /

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
Date: Sat, 09 Mar 2019 19:46:12 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ea7603ee-b79a-4399-a2db-fdbef3309ff6",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ea7603ee-b79a-4399-a2db-fdbef3309ff6",
   "order": -1
}
```

## Interaction 134: OPTIONS /

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
Date: Sat, 09 Mar 2019 19:46:12 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 135: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:12 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 136: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:12 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 137: GET /

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
Date: Sat, 09 Mar 2019 19:46:13 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 138: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:13 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 139: POST /

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
Date: Sat, 09 Mar 2019 19:46:13 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "88e8a9ab-1f2f-4961-ad46-8d197d3cbfbb",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/88e8a9ab-1f2f-4961-ad46-8d197d3cbfbb",
   "order": -1
}
```

## Interaction 140: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:13 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 141: POST /

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
Date: Sat, 09 Mar 2019 19:46:13 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "2aeda08a-d649-41bc-9c44-1a2dd1103ed6",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/2aeda08a-d649-41bc-9c44-1a2dd1103ed6",
   "order": -1
}
```

## Interaction 142: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 143: POST /

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
Date: Sat, 09 Mar 2019 19:46:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "6dad24c3-f2e5-45ed-88b8-07a7afe4329b",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/6dad24c3-f2e5-45ed-88b8-07a7afe4329b",
   "order": -1
}
```

## Interaction 144: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 145: POST /

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
Date: Sat, 09 Mar 2019 19:46:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ae6f1d35-2f1f-43e6-8f30-b0af2edf2b96",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ae6f1d35-2f1f-43e6-8f30-b0af2edf2b96",
   "order": -1
}
```

## Interaction 146: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 147: POST /

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
Date: Sat, 09 Mar 2019 19:46:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "cc73d1aa-7758-4bb4-9ac5-578381d31d96",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/cc73d1aa-7758-4bb4-9ac5-578381d31d96",
   "order": -1
}
```

## Interaction 148: POST /

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
Date: Sat, 09 Mar 2019 19:46:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "18aab87b-d00b-4f7a-b43a-0aa75f6fa0c8",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/18aab87b-d00b-4f7a-b43a-0aa75f6fa0c8",
   "order": -1
}
```

## Interaction 149: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 150: POST /

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
Date: Sat, 09 Mar 2019 19:46:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "fb9c3859-0929-44d5-971f-1a699a52d333",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/fb9c3859-0929-44d5-971f-1a699a52d333",
   "order": -1
}
```

## Interaction 151: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 152: POST /

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
Date: Sat, 09 Mar 2019 19:46:15 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "fec730f6-6cb1-4cd7-8f69-9e6e2ac56a34",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/fec730f6-6cb1-4cd7-8f69-9e6e2ac56a34",
   "order": -1
}
```

## Interaction 153: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:16 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 154: POST /

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
Date: Sat, 09 Mar 2019 19:46:16 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ebf0647c-7479-4b86-b92d-bdf831600de8",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ebf0647c-7479-4b86-b92d-bdf831600de8",
   "order": -1
}
```

## Interaction 155: DELETE /

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
Date: Sat, 09 Mar 2019 19:46:16 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 156: POST /

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
Date: Sat, 09 Mar 2019 19:46:16 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "bd994d13-54d9-46e3-9c47-cf3e4858a265",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/bd994d13-54d9-46e3-9c47-cf3e4858a265",
   "order": -1
}
```

## Interaction 157: POST /

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
Date: Sat, 09 Mar 2019 19:46:17 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "8b5ec7a3-58c8-499b-812e-6938762a2692",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/8b5ec7a3-58c8-499b-812e-6938762a2692",
   "order": 523
}
```

## Interaction 158: POST /

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
Date: Sat, 09 Mar 2019 19:46:17 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "e0bfe12f-950a-40fe-89da-3934f5128c2e",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/e0bfe12f-950a-40fe-89da-3934f5128c2e",
   "order": 10
}
```

## Interaction 159: POST /

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
Date: Sat, 09 Mar 2019 19:46:17 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "f14e4045-06e4-415c-bc13-c53c3d0c20c1",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/f14e4045-06e4-415c-bc13-c53c3d0c20c1",
   "order": 10
}
```

## Interaction 160: OPTIONS /

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
Date: Sat, 09 Mar 2019 19:56:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 161: GET /

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
Date: Sat, 09 Mar 2019 19:56:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "bd994d13-54d9-46e3-9c47-cf3e4858a265",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/bd994d13-54d9-46e3-9c47-cf3e4858a265",
      "order": -1
   },
   {
      "id": "8b5ec7a3-58c8-499b-812e-6938762a2692",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/8b5ec7a3-58c8-499b-812e-6938762a2692",
      "order": 523
   },
   {
      "id": "e0bfe12f-950a-40fe-89da-3934f5128c2e",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/e0bfe12f-950a-40fe-89da-3934f5128c2e",
      "order": 10
   },
   {
      "id": "f14e4045-06e4-415c-bc13-c53c3d0c20c1",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/f14e4045-06e4-415c-bc13-c53c3d0c20c1",
      "order": 10
   }
]
```

## Interaction 162: POST /

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
Date: Sat, 09 Mar 2019 19:56:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "8f9c1324-b241-488a-97b4-29b14e9fc305",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/8f9c1324-b241-488a-97b4-29b14e9fc305",
   "order": -1
}
```

## Interaction 163: OPTIONS /

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
Date: Sat, 09 Mar 2019 19:56:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 164: DELETE /

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
Date: Sat, 09 Mar 2019 19:56:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 165: DELETE /

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
Date: Sat, 09 Mar 2019 19:56:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 166: GET /

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
Date: Sat, 09 Mar 2019 19:56:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 167: DELETE /

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
Date: Sat, 09 Mar 2019 19:56:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 168: POST /

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
Date: Sat, 09 Mar 2019 19:56:40 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "0ca2c660-65f2-4cd2-a03d-4e81c2c562c0",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/0ca2c660-65f2-4cd2-a03d-4e81c2c562c0",
   "order": -1
}
```

## Interaction 169: DELETE /

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
Date: Sat, 09 Mar 2019 19:56:40 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 170: POST /

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
Date: Sat, 09 Mar 2019 19:56:40 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "fd3e73fe-3450-4a7e-8762-a05a6482d93e",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/fd3e73fe-3450-4a7e-8762-a05a6482d93e",
   "order": -1
}
```

## Interaction 171: DELETE /

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
Date: Sat, 09 Mar 2019 19:56:40 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 172: POST /

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
Date: Sat, 09 Mar 2019 19:56:40 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "d1df5d99-53c7-476d-927f-4710f6090d94",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/d1df5d99-53c7-476d-927f-4710f6090d94",
   "order": -1
}
```

## Interaction 173: DELETE /

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
Date: Sat, 09 Mar 2019 19:56:41 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 174: POST /

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
Date: Sat, 09 Mar 2019 19:56:41 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "752c9b3a-251c-4bd6-b6f3-ffe5747ffdc4",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/752c9b3a-251c-4bd6-b6f3-ffe5747ffdc4",
   "order": -1
}
```

## Interaction 175: DELETE /

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
Date: Sat, 09 Mar 2019 19:56:41 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 176: POST /

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
Date: Sat, 09 Mar 2019 19:56:41 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "597eec90-3efc-4def-8721-bc978a8d69ff",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/597eec90-3efc-4def-8721-bc978a8d69ff",
   "order": -1
}
```

## Interaction 177: POST /

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
Date: Sat, 09 Mar 2019 19:56:41 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "5175efd0-181d-4994-8e82-c5971b415abd",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/5175efd0-181d-4994-8e82-c5971b415abd",
   "order": -1
}
```

## Interaction 178: DELETE /

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
Date: Sat, 09 Mar 2019 19:56:41 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 179: POST /

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
Date: Sat, 09 Mar 2019 19:56:42 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "b5fc9da4-e6d8-46bb-a2c5-3c7d6d902475",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/b5fc9da4-e6d8-46bb-a2c5-3c7d6d902475",
   "order": -1
}
```

## Interaction 180: DELETE /

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
Date: Sat, 09 Mar 2019 19:56:42 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 181: POST /

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
Date: Sat, 09 Mar 2019 19:56:42 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "e6c09cd5-3325-4cb6-b413-de2b2ec0f968",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/e6c09cd5-3325-4cb6-b413-de2b2ec0f968",
   "order": -1
}
```

## Interaction 182: DELETE /

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
Date: Sat, 09 Mar 2019 19:56:42 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 183: POST /

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
Date: Sat, 09 Mar 2019 19:56:42 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a7995c7a-8602-4b0e-b9a9-8caa7cbe4eca",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a7995c7a-8602-4b0e-b9a9-8caa7cbe4eca",
   "order": -1
}
```

## Interaction 184: DELETE /

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
Date: Sat, 09 Mar 2019 19:56:43 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 185: POST /

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
Date: Sat, 09 Mar 2019 19:56:43 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "c7c074bb-897c-4a7f-afa0-31be181c0d53",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/c7c074bb-897c-4a7f-afa0-31be181c0d53",
   "order": -1
}
```

## Interaction 186: POST /

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
Date: Sat, 09 Mar 2019 19:56:43 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "2ae1d379-e177-448d-9e7e-4ff599d76154",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/2ae1d379-e177-448d-9e7e-4ff599d76154",
   "order": 523
}
```

## Interaction 187: POST /

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
Date: Sat, 09 Mar 2019 19:56:43 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ea0a4203-9780-4446-8367-4b4fb7be2681",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ea0a4203-9780-4446-8367-4b4fb7be2681",
   "order": 10
}
```

## Interaction 188: POST /

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
Date: Sat, 09 Mar 2019 19:56:43 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "98ca31eb-58e2-47a8-aa3c-958508f389b0",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/98ca31eb-58e2-47a8-aa3c-958508f389b0",
   "order": 10
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 2: OPTIONS /

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
Date: Sat, 09 Mar 2019 20:42:59 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 1: OPTIONS /

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
Date: Sat, 09 Mar 2019 20:42:58 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
Date: Sat, 09 Mar 2019 20:45:01 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
Date: Sat, 09 Mar 2019 20:45:02 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
Date: Sat, 09 Mar 2019 20:45:12 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
Date: Sat, 09 Mar 2019 20:45:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 9: OPTIONS /

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
Date: Sat, 09 Mar 2019 20:45:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
Date: Sat, 09 Mar 2019 20:45:14 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 8: OPTIONS /

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
Date: Sat, 09 Mar 2019 20:46:28 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 20:47:22 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 20:48:11 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: POST
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 20:48:11 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 7: OPTIONS /

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 20:54:58 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 11: OPTIONS /

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: POST
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 20:54:58 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 12: OPTIONS /

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 20:54:58 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 8: OPTIONS /

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 20:54:58 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 20:55:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: POST
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 20:56:08 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:00:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:05:05 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 8: OPTIONS /

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: POST
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:05:05 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 9: OPTIONS /

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: POST
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:05:05 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 10: OPTIONS /

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: POST
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:05:05 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 11: OPTIONS /

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
Origin: https://www.todobackend.com
Pragma: no-cache
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server ():

```
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: https://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:05:05 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 7: OPTIONS /

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:05:05 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

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
## Interaction 15: POST /

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
Origin: https://www.todobackend.com
Pragma: no-cache
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
Access-Control-Allow-Origin: https://www.todobackend.com
Connection: keep-alive
Content-Length: 197
Content-Type: application/json
Date: Sat, 09 Mar 2019 21:05:06 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "2cde4cc4-e3b8-4ddd-bb98-a87de8a610ef",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/2cde4cc4-e3b8-4ddd-bb98-a87de8a610ef",
   "order": -1
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 16: OPTIONS /

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
Origin: https://www.todobackend.com
Pragma: no-cache
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36
```

### Body sent to the real server ():

```
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: https://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:05:06 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

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
## Interaction 25: POST /

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
Origin: https://www.todobackend.com
Pragma: no-cache
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
Access-Control-Allow-Origin: https://www.todobackend.com
Connection: keep-alive
Content-Length: 196
Content-Type: application/json
Date: Sat, 09 Mar 2019 21:05:07 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "3bdb85d8-bdab-4a2f-910e-330dc57208b6",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/3bdb85d8-bdab-4a2f-910e-330dc57208b6",
   "order": 523
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 26: POST /

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
Origin: https://www.todobackend.com
Pragma: no-cache
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
Access-Control-Allow-Origin: https://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sat, 09 Mar 2019 21:05:08 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "e9352baa-982c-4fe6-9d93-aa4e4174465b",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/e9352baa-982c-4fe6-9d93-aa4e4174465b",
   "order": 10
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
Origin: https://www.todobackend.com
Pragma: no-cache
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
Access-Control-Allow-Origin: https://www.todobackend.com
Connection: keep-alive
Content-Length: 195
Content-Type: application/json
Date: Sat, 09 Mar 2019 21:05:08 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "f3fd41de-8158-4426-89af-83d079a91b4e",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/f3fd41de-8158-4426-89af-83d079a91b4e",
   "order": 10
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 28: OPTIONS /

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:08:18 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 31: POST /

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
Date: Sat, 09 Mar 2019 21:08:19 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "e2ba31b1-06d0-445e-b580-e916e7bd421f",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/e2ba31b1-06d0-445e-b580-e916e7bd421f",
   "order": -1
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 32: OPTIONS /

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:08:19 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

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
## Interaction 41: POST /

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
Date: Sat, 09 Mar 2019 21:08:21 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "d53b4e0e-2a6c-476c-9ed5-a0c7265849ee",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/d53b4e0e-2a6c-476c-9ed5-a0c7265849ee",
   "order": 523
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 42: POST /

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
Date: Sat, 09 Mar 2019 21:08:21 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "e58b290e-4646-4997-8046-3408572ef4f5",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/e58b290e-4646-4997-8046-3408572ef4f5",
   "order": 10
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 43: POST /

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
Date: Sat, 09 Mar 2019 21:08:21 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "7df118ab-bd19-4dac-ad40-d08c3a91dd50",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/7df118ab-bd19-4dac-ad40-d08c3a91dd50",
   "order": 10
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 44: OPTIONS /

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:12:08 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 47: POST /

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
Date: Sat, 09 Mar 2019 21:12:08 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a6a9e384-f5c5-48a8-a89f-24b4f8475d3d",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a6a9e384-f5c5-48a8-a89f-24b4f8475d3d",
   "order": -1
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 48: OPTIONS /

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
//SERVIRTIUM+Base64: 
```

### Resulting headers back from the real server:

```
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: DELETE
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:12:08 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

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
## Interaction 57: POST /

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
Date: Sat, 09 Mar 2019 21:12:09 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "2ebebfd1-e028-4a01-8e93-efa0e98c8be4",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/2ebebfd1-e028-4a01-8e93-efa0e98c8be4",
   "order": 523
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 58: POST /

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
Date: Sat, 09 Mar 2019 21:12:10 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "91ab8504-e5dc-4a2f-9fa5-d3cfbcb9de21",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/91ab8504-e5dc-4a2f-9fa5-d3cfbcb9de21",
   "order": 10
}
```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 59: POST /

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
Date: Sat, 09 Mar 2019 21:12:10 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "76e6cda1-bf42-4fbd-a24f-e0d6818b565b",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/76e6cda1-bf42-4fbd-a24f-e0d6818b565b",
   "order": 10
}
```

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
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:12:42 GMT
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
Content-Length: 3065
Content-Type: application/json
Date: Sat, 09 Mar 2019 21:12:42 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "cbe95113-ddcf-4ca8-9ee0-e41fcd0600d0",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/cbe95113-ddcf-4ca8-9ee0-e41fcd0600d0",
      "order": 10
   },
   {
      "id": "40132fc8-c285-48df-824c-06b7c1a8920e",
      "title": "a todo",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/40132fc8-c285-48df-824c-06b7c1a8920e",
      "order": -1
   },
   {
      "id": "2cde4cc4-e3b8-4ddd-bb98-a87de8a610ef",
      "title": "a todo",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/2cde4cc4-e3b8-4ddd-bb98-a87de8a610ef",
      "order": -1
   },
   {
      "id": "3bdb85d8-bdab-4a2f-910e-330dc57208b6",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/3bdb85d8-bdab-4a2f-910e-330dc57208b6",
      "order": 523
   },
   {
      "id": "e9352baa-982c-4fe6-9d93-aa4e4174465b",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/e9352baa-982c-4fe6-9d93-aa4e4174465b",
      "order": 10
   },
   {
      "id": "f3fd41de-8158-4426-89af-83d079a91b4e",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/f3fd41de-8158-4426-89af-83d079a91b4e",
      "order": 10
   },
   {
      "id": "e2ba31b1-06d0-445e-b580-e916e7bd421f",
      "title": "a todo",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/e2ba31b1-06d0-445e-b580-e916e7bd421f",
      "order": -1
   },
   {
      "id": "d53b4e0e-2a6c-476c-9ed5-a0c7265849ee",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/d53b4e0e-2a6c-476c-9ed5-a0c7265849ee",
      "order": 523
   },
   {
      "id": "e58b290e-4646-4997-8046-3408572ef4f5",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/e58b290e-4646-4997-8046-3408572ef4f5",
      "order": 10
   },
   {
      "id": "7df118ab-bd19-4dac-ad40-d08c3a91dd50",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/7df118ab-bd19-4dac-ad40-d08c3a91dd50",
      "order": 10
   },
   {
      "id": "a6a9e384-f5c5-48a8-a89f-24b4f8475d3d",
      "title": "a todo",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/a6a9e384-f5c5-48a8-a89f-24b4f8475d3d",
      "order": -1
   },
   {
      "id": "2ebebfd1-e028-4a01-8e93-efa0e98c8be4",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/2ebebfd1-e028-4a01-8e93-efa0e98c8be4",
      "order": 523
   },
   {
      "id": "91ab8504-e5dc-4a2f-9fa5-d3cfbcb9de21",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/91ab8504-e5dc-4a2f-9fa5-d3cfbcb9de21",
      "order": 10
   },
   {
      "id": "76e6cda1-bf42-4fbd-a24f-e0d6818b565b",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/76e6cda1-bf42-4fbd-a24f-e0d6818b565b",
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
Date: Sat, 09 Mar 2019 21:12:43 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "310a4153-9910-4884-a1b9-914508d71c0a",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/310a4153-9910-4884-a1b9-914508d71c0a",
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
Date: Sat, 09 Mar 2019 21:12:43 GMT
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
Date: Sat, 09 Mar 2019 21:12:43 GMT
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
Date: Sat, 09 Mar 2019 21:12:43 GMT
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
Date: Sat, 09 Mar 2019 21:12:44 GMT
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
Date: Sat, 09 Mar 2019 21:12:44 GMT
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
Date: Sat, 09 Mar 2019 21:12:44 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "87296ad3-feab-46b4-b497-24855d1b31b2",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/87296ad3-feab-46b4-b497-24855d1b31b2",
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
Date: Sat, 09 Mar 2019 21:12:44 GMT
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
Date: Sat, 09 Mar 2019 21:12:44 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "120cd6ba-31eb-41f6-8bcd-3144757cb3fc",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/120cd6ba-31eb-41f6-8bcd-3144757cb3fc",
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
Date: Sat, 09 Mar 2019 21:12:45 GMT
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
Date: Sat, 09 Mar 2019 21:12:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "fd712dea-2a0a-45aa-b9ec-c49bb48cb324",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/fd712dea-2a0a-45aa-b9ec-c49bb48cb324",
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
Date: Sat, 09 Mar 2019 21:12:45 GMT
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
Date: Sat, 09 Mar 2019 21:12:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "e3b74e74-e6ee-4eb0-93a5-8c7ff1e45676",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/e3b74e74-e6ee-4eb0-93a5-8c7ff1e45676",
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
Date: Sat, 09 Mar 2019 21:12:45 GMT
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
Date: Sat, 09 Mar 2019 21:12:45 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "4088f0ab-dec4-414e-954c-0e7cf7a79f51",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/4088f0ab-dec4-414e-954c-0e7cf7a79f51",
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
Date: Sat, 09 Mar 2019 21:12:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "92fbcf39-db6e-4b14-bcfb-e2383d704a1e",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/92fbcf39-db6e-4b14-bcfb-e2383d704a1e",
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
Date: Sat, 09 Mar 2019 21:12:46 GMT
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
Date: Sat, 09 Mar 2019 21:12:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a4c5e91c-6c94-4352-8ca6-e8bfb77603ae",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a4c5e91c-6c94-4352-8ca6-e8bfb77603ae",
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
Date: Sat, 09 Mar 2019 21:12:46 GMT
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
Date: Sat, 09 Mar 2019 21:12:46 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "62a6f84f-b8bd-4c26-a5fe-b3c436ec1afa",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/62a6f84f-b8bd-4c26-a5fe-b3c436ec1afa",
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
Date: Sat, 09 Mar 2019 21:12:46 GMT
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
Date: Sat, 09 Mar 2019 21:12:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "5ab7f0aa-2fe0-4716-9b24-5bd6b96fcb09",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/5ab7f0aa-2fe0-4716-9b24-5bd6b96fcb09",
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
Date: Sat, 09 Mar 2019 21:12:47 GMT
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
Date: Sat, 09 Mar 2019 21:12:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "594da8c1-909f-4659-8e0f-540d542556af",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/594da8c1-909f-4659-8e0f-540d542556af",
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
Date: Sat, 09 Mar 2019 21:12:47 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "bb063c7d-93ef-4c5b-b72f-1c5f75fd9ec4",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/bb063c7d-93ef-4c5b-b72f-1c5f75fd9ec4",
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
Date: Sat, 09 Mar 2019 21:12:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "0e54cea9-e693-4370-afa8-4dbde686f13d",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/0e54cea9-e693-4370-afa8-4dbde686f13d",
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
Date: Sat, 09 Mar 2019 21:12:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "e1674bc0-3d54-4dbc-bdc3-b8f489cec141",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/e1674bc0-3d54-4dbc-bdc3-b8f489cec141",
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
Date: Sat, 09 Mar 2019 21:22:04 GMT
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
Date: Sat, 09 Mar 2019 21:22:05 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "594da8c1-909f-4659-8e0f-540d542556af",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/594da8c1-909f-4659-8e0f-540d542556af",
      "order": -1
   },
   {
      "id": "bb063c7d-93ef-4c5b-b72f-1c5f75fd9ec4",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/bb063c7d-93ef-4c5b-b72f-1c5f75fd9ec4",
      "order": 523
   },
   {
      "id": "0e54cea9-e693-4370-afa8-4dbde686f13d",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/0e54cea9-e693-4370-afa8-4dbde686f13d",
      "order": 10
   },
   {
      "id": "e1674bc0-3d54-4dbc-bdc3-b8f489cec141",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/e1674bc0-3d54-4dbc-bdc3-b8f489cec141",
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
Date: Sat, 09 Mar 2019 21:22:05 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "d60ebafe-de5b-480c-99fb-4b6867cd1d9c",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/d60ebafe-de5b-480c-99fb-4b6867cd1d9c",
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
Date: Sat, 09 Mar 2019 21:22:05 GMT
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
Date: Sat, 09 Mar 2019 21:22:05 GMT
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
Date: Sat, 09 Mar 2019 21:22:06 GMT
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
Date: Sat, 09 Mar 2019 21:22:06 GMT
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
Date: Sat, 09 Mar 2019 21:22:06 GMT
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
Date: Sat, 09 Mar 2019 21:22:06 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "34fcfdad-fb12-464f-af0c-43307a13dce4",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/34fcfdad-fb12-464f-af0c-43307a13dce4",
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
Date: Sat, 09 Mar 2019 21:22:07 GMT
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
Date: Sat, 09 Mar 2019 21:22:07 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ce001f42-39e8-457a-b550-7ca1b9fa1e5b",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ce001f42-39e8-457a-b550-7ca1b9fa1e5b",
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
Date: Sat, 09 Mar 2019 21:22:07 GMT
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
Date: Sat, 09 Mar 2019 21:22:07 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "1b5aec95-0de3-4bf7-9103-e99aa2967f39",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/1b5aec95-0de3-4bf7-9103-e99aa2967f39",
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
Date: Sat, 09 Mar 2019 21:22:07 GMT
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
Date: Sat, 09 Mar 2019 21:22:08 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "9697489a-e1dd-45fb-9d14-71574b5bda7c",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/9697489a-e1dd-45fb-9d14-71574b5bda7c",
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
Date: Sat, 09 Mar 2019 21:22:08 GMT
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
Date: Sat, 09 Mar 2019 21:22:08 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a7bf36f0-a149-4e03-942e-e663097d0c7e",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a7bf36f0-a149-4e03-942e-e663097d0c7e",
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
Date: Sat, 09 Mar 2019 21:22:09 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "c53c8040-6c8a-4f04-b4e2-d0c9bb977e33",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/c53c8040-6c8a-4f04-b4e2-d0c9bb977e33",
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
Date: Sat, 09 Mar 2019 21:22:09 GMT
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
Date: Sat, 09 Mar 2019 21:22:09 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "14abb51f-59f3-43a5-a16d-556f6565c661",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/14abb51f-59f3-43a5-a16d-556f6565c661",
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
Date: Sat, 09 Mar 2019 21:22:09 GMT
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
Date: Sat, 09 Mar 2019 21:22:09 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "e5e520ff-7048-4b0f-a9b5-707be3254e2c",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/e5e520ff-7048-4b0f-a9b5-707be3254e2c",
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
Date: Sat, 09 Mar 2019 21:22:09 GMT
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
Date: Sat, 09 Mar 2019 21:22:10 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "fbd040b5-2666-40b2-a967-0fb257267a69",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/fbd040b5-2666-40b2-a967-0fb257267a69",
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
Date: Sat, 09 Mar 2019 21:22:10 GMT
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
Date: Sat, 09 Mar 2019 21:22:10 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "c6595e4a-e239-40b8-9dc1-0a954cda760d",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/c6595e4a-e239-40b8-9dc1-0a954cda760d",
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
Date: Sat, 09 Mar 2019 21:22:10 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "d4289d9a-8e5c-4062-a73c-f08612add3f7",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/d4289d9a-8e5c-4062-a73c-f08612add3f7",
   "order": 523
}
```

## Interaction 27: OPTIONS /

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
Date: Sat, 09 Mar 2019 21:22:10 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

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
Date: Sat, 09 Mar 2019 21:22:11 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "f6b70a75-9ac5-4f90-a0de-6f5eef4d172f",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/f6b70a75-9ac5-4f90-a0de-6f5eef4d172f",
   "order": 10
}
```

## Interaction 29: POST /

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
Date: Sat, 09 Mar 2019 21:22:11 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a1e9c5e0-c22b-4443-b16f-cb5e9a4140ac",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a1e9c5e0-c22b-4443-b16f-cb5e9a4140ac",
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
Date: Sat, 09 Mar 2019 21:42:38 GMT
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
Date: Sat, 09 Mar 2019 21:42:48 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "c6595e4a-e239-40b8-9dc1-0a954cda760d",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/c6595e4a-e239-40b8-9dc1-0a954cda760d",
      "order": -1
   },
   {
      "id": "d4289d9a-8e5c-4062-a73c-f08612add3f7",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/d4289d9a-8e5c-4062-a73c-f08612add3f7",
      "order": 523
   },
   {
      "id": "f6b70a75-9ac5-4f90-a0de-6f5eef4d172f",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/f6b70a75-9ac5-4f90-a0de-6f5eef4d172f",
      "order": 10
   },
   {
      "id": "a1e9c5e0-c22b-4443-b16f-cb5e9a4140ac",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/a1e9c5e0-c22b-4443-b16f-cb5e9a4140ac",
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
Date: Sat, 09 Mar 2019 21:42:58 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
Date: Sat, 09 Mar 2019 21:46:21 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
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
Date: Sat, 09 Mar 2019 21:46:22 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 7: OPTIONS /

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
Date: Sat, 09 Mar 2019 21:46:22 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 9: OPTIONS /

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
Date: Sat, 09 Mar 2019 21:47:24 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

# Failure noted during recording.

Meaning this recording may be shorter than intended. That all depends on how the test was coded though.
## Interaction 4: POST /

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
Date: Sat, 09 Mar 2019 21:47:24 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "b414748b-90d8-407a-b604-ff6ee86388e6",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/b414748b-90d8-407a-b604-ff6ee86388e6",
   "order": -1
}
```

## Interaction 10: OPTIONS /

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
Date: Sat, 09 Mar 2019 21:47:24 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

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
Date: Sat, 09 Mar 2019 21:47:25 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 12: OPTIONS /

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
Date: Sat, 09 Mar 2019 21:47:25 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

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
Access-Control-Allow-Headers: content-type
Access-Control-Allow-Methods: GET
Access-Control-Allow-Origin: http://www.todobackend.com
Connection: keep-alive
Content-Length: 0
Content-Type: text/plain;charset=utf-8
Date: Sat, 09 Mar 2019 21:51:28 GMT
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
Content-Length: 1095
Content-Type: application/json
Date: Sat, 09 Mar 2019 21:51:29 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "c6595e4a-e239-40b8-9dc1-0a954cda760d",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/c6595e4a-e239-40b8-9dc1-0a954cda760d",
      "order": -1
   },
   {
      "id": "d4289d9a-8e5c-4062-a73c-f08612add3f7",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/d4289d9a-8e5c-4062-a73c-f08612add3f7",
      "order": 523
   },
   {
      "id": "f6b70a75-9ac5-4f90-a0de-6f5eef4d172f",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/f6b70a75-9ac5-4f90-a0de-6f5eef4d172f",
      "order": 10
   },
   {
      "id": "a1e9c5e0-c22b-4443-b16f-cb5e9a4140ac",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/a1e9c5e0-c22b-4443-b16f-cb5e9a4140ac",
      "order": 10
   },
   {
      "id": "b414748b-90d8-407a-b604-ff6ee86388e6",
      "title": "a todo",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/b414748b-90d8-407a-b604-ff6ee86388e6",
      "order": -1
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
Date: Sat, 09 Mar 2019 21:51:29 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "c441c974-bb87-40d2-83c6-a21a965f29ba",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/c441c974-bb87-40d2-83c6-a21a965f29ba",
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
Date: Sat, 09 Mar 2019 21:51:29 GMT
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
Date: Sat, 09 Mar 2019 21:51:29 GMT
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
Date: Sat, 09 Mar 2019 21:51:30 GMT
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
Date: Sat, 09 Mar 2019 21:51:30 GMT
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
Date: Sat, 09 Mar 2019 21:51:30 GMT
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
Date: Sat, 09 Mar 2019 21:51:30 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "ef186214-d6ee-4e7a-bc6c-0c7764c3a485",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/ef186214-d6ee-4e7a-bc6c-0c7764c3a485",
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
Date: Sat, 09 Mar 2019 21:51:30 GMT
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
Date: Sat, 09 Mar 2019 21:51:30 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "e467039f-2a46-4811-b361-d5c878f6e067",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/e467039f-2a46-4811-b361-d5c878f6e067",
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
Date: Sat, 09 Mar 2019 21:51:31 GMT
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
Date: Sat, 09 Mar 2019 21:51:31 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "c3b5df20-2c0e-4b7c-9447-09922c33fd33",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/c3b5df20-2c0e-4b7c-9447-09922c33fd33",
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
Date: Sat, 09 Mar 2019 21:51:31 GMT
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
Date: Sat, 09 Mar 2019 21:51:31 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "073407c7-4fc5-4993-b870-669f2d70b875",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/073407c7-4fc5-4993-b870-669f2d70b875",
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
Date: Sat, 09 Mar 2019 21:51:31 GMT
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
Date: Sat, 09 Mar 2019 21:51:31 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "aab2801d-0397-4d6d-9c7a-78c07616a1ec",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/aab2801d-0397-4d6d-9c7a-78c07616a1ec",
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
Date: Sat, 09 Mar 2019 21:51:32 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "43d41565-eb33-4262-82ab-ee7321acbe4c",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/43d41565-eb33-4262-82ab-ee7321acbe4c",
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
Date: Sat, 09 Mar 2019 21:51:32 GMT
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
Date: Sat, 09 Mar 2019 21:51:32 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "2d3e42b4-87a4-4751-93cf-4ee388786438",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/2d3e42b4-87a4-4751-93cf-4ee388786438",
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
Date: Sat, 09 Mar 2019 21:51:32 GMT
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
Date: Sat, 09 Mar 2019 21:51:32 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "eb2c160a-ef42-43eb-872e-0a45c644a0d6",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/eb2c160a-ef42-43eb-872e-0a45c644a0d6",
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
Date: Sat, 09 Mar 2019 21:51:32 GMT
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
Date: Sat, 09 Mar 2019 21:51:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "d0e4c320-8d42-4de7-ad70-2210cd9e02ae",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/d0e4c320-8d42-4de7-ad70-2210cd9e02ae",
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
Date: Sat, 09 Mar 2019 21:51:33 GMT
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
Date: Sat, 09 Mar 2019 21:51:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "19283456-68ab-4963-8e4c-91cb8737f31e",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/19283456-68ab-4963-8e4c-91cb8737f31e",
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
Date: Sat, 09 Mar 2019 21:51:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "0cff568b-51ef-484d-8853-69b26e01a1ac",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/0cff568b-51ef-484d-8853-69b26e01a1ac",
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
Date: Sat, 09 Mar 2019 21:51:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "8ea084f1-4b3a-4cf8-ae46-d8ac284f0a4d",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/8ea084f1-4b3a-4cf8-ae46-d8ac284f0a4d",
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
Date: Sat, 09 Mar 2019 21:51:33 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "f4c59454-2e48-4eaa-8628-16ca4615b0ac",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/f4c59454-2e48-4eaa-8628-16ca4615b0ac",
   "order": 10
}
```

## Interaction 29: OPTIONS /

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
Date: Sat, 09 Mar 2019 21:52:34 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 30: GET /

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
Date: Sat, 09 Mar 2019 21:52:34 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "19283456-68ab-4963-8e4c-91cb8737f31e",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/19283456-68ab-4963-8e4c-91cb8737f31e",
      "order": -1
   },
   {
      "id": "0cff568b-51ef-484d-8853-69b26e01a1ac",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/0cff568b-51ef-484d-8853-69b26e01a1ac",
      "order": 523
   },
   {
      "id": "8ea084f1-4b3a-4cf8-ae46-d8ac284f0a4d",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/8ea084f1-4b3a-4cf8-ae46-d8ac284f0a4d",
      "order": 10
   },
   {
      "id": "f4c59454-2e48-4eaa-8628-16ca4615b0ac",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/f4c59454-2e48-4eaa-8628-16ca4615b0ac",
      "order": 10
   }
]
```

## Interaction 31: POST /

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
Date: Sat, 09 Mar 2019 21:52:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "60766e34-13a4-41af-9045-74a6d3447e8c",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/60766e34-13a4-41af-9045-74a6d3447e8c",
   "order": -1
}
```

## Interaction 32: OPTIONS /

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
Date: Sat, 09 Mar 2019 21:52:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 33: DELETE /

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
Date: Sat, 09 Mar 2019 21:52:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 34: DELETE /

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
Date: Sat, 09 Mar 2019 21:52:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 35: GET /

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
Date: Sat, 09 Mar 2019 21:52:35 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 36: DELETE /

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
Date: Sat, 09 Mar 2019 21:52:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 37: POST /

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
Date: Sat, 09 Mar 2019 21:52:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "b2ee5257-1a8c-4d02-a319-58cdc15283c4",
   "title": "walk the dog",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/b2ee5257-1a8c-4d02-a319-58cdc15283c4",
   "order": -1
}
```

## Interaction 38: DELETE /

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
Date: Sat, 09 Mar 2019 21:52:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 39: POST /

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
Date: Sat, 09 Mar 2019 21:52:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "a40ca85a-dc06-4e94-8fcc-df3abe4f3128",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/a40ca85a-dc06-4e94-8fcc-df3abe4f3128",
   "order": -1
}
```

## Interaction 40: DELETE /

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
Date: Sat, 09 Mar 2019 21:52:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 41: POST /

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
Date: Sat, 09 Mar 2019 21:52:36 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "9e504ebb-f3cb-49db-b709-3a15a6114fca",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/9e504ebb-f3cb-49db-b709-3a15a6114fca",
   "order": -1
}
```

## Interaction 42: DELETE /

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
Date: Sat, 09 Mar 2019 21:52:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 43: POST /

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
Date: Sat, 09 Mar 2019 21:52:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "d3ba04cc-6bd7-4f3d-ae4d-c10207c9eb21",
   "title": "my todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/d3ba04cc-6bd7-4f3d-ae4d-c10207c9eb21",
   "order": -1
}
```

## Interaction 44: DELETE /

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
Date: Sat, 09 Mar 2019 21:52:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 45: POST /

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
Date: Sat, 09 Mar 2019 21:52:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "686e9c62-5fa1-45f5-9e46-806046138157",
   "title": "todo the second",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/686e9c62-5fa1-45f5-9e46-806046138157",
   "order": -1
}
```

## Interaction 46: POST /

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
Date: Sat, 09 Mar 2019 21:52:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "5898c999-bd9e-4db5-81a4-89e3c39b0ce5",
   "title": "todo the first",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/5898c999-bd9e-4db5-81a4-89e3c39b0ce5",
   "order": -1
}
```

## Interaction 47: DELETE /

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
Date: Sat, 09 Mar 2019 21:52:37 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 48: POST /

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
Date: Sat, 09 Mar 2019 21:52:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "07e709b4-0081-4afe-9885-366113ba0c89",
   "title": "initial title",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/07e709b4-0081-4afe-9885-366113ba0c89",
   "order": -1
}
```

## Interaction 49: DELETE /

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
Date: Sat, 09 Mar 2019 21:52:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 50: POST /

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
Date: Sat, 09 Mar 2019 21:52:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "6057c20d-bc30-4e87-ad35-d9226d6f4559",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/6057c20d-bc30-4e87-ad35-d9226d6f4559",
   "order": -1
}
```

## Interaction 51: DELETE /

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
Date: Sat, 09 Mar 2019 21:52:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 52: POST /

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
Date: Sat, 09 Mar 2019 21:52:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "935caf63-58c8-4035-ba25-fe6a088e50c8",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/935caf63-58c8-4035-ba25-fe6a088e50c8",
   "order": -1
}
```

## Interaction 53: DELETE /

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
Date: Sat, 09 Mar 2019 21:52:38 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
]
```

## Interaction 54: POST /

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
Date: Sat, 09 Mar 2019 21:52:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "839c8c29-ef91-41c9-a111-7d23f933a0d4",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/839c8c29-ef91-41c9-a111-7d23f933a0d4",
   "order": -1
}
```

## Interaction 55: POST /

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
Date: Sat, 09 Mar 2019 21:52:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "1862c0c4-7ca4-4226-82c4-050f3ae729b7",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/1862c0c4-7ca4-4226-82c4-050f3ae729b7",
   "order": 523
}
```

## Interaction 56: POST /

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
Date: Sat, 09 Mar 2019 21:52:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "b7d28551-cd69-4c57-aa1b-1e7870446f67",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/b7d28551-cd69-4c57-aa1b-1e7870446f67",
   "order": 10
}
```

## Interaction 57: POST /

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
Date: Sat, 09 Mar 2019 21:52:39 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "671ef78b-d2fb-4b44-887d-fc73add00270",
   "title": "blah",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/671ef78b-d2fb-4b44-887d-fc73add00270",
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
Date: Sat, 09 Mar 2019 21:54:44 GMT
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
Date: Sat, 09 Mar 2019 21:55:05 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
[
   {
      "id": "839c8c29-ef91-41c9-a111-7d23f933a0d4",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/839c8c29-ef91-41c9-a111-7d23f933a0d4",
      "order": -1
   },
   {
      "id": "1862c0c4-7ca4-4226-82c4-050f3ae729b7",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/1862c0c4-7ca4-4226-82c4-050f3ae729b7",
      "order": 523
   },
   {
      "id": "b7d28551-cd69-4c57-aa1b-1e7870446f67",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/b7d28551-cd69-4c57-aa1b-1e7870446f67",
      "order": 10
   },
   {
      "id": "671ef78b-d2fb-4b44-887d-fc73add00270",
      "title": "blah",
      "completed": false,
      "url": "https://todo-javalin.herokuapp.com/671ef78b-d2fb-4b44-887d-fc73add00270",
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
Date: Sat, 09 Mar 2019 21:55:14 GMT
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
Date: Sat, 09 Mar 2019 22:02:42 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: application/json):

```
{
   "id": "4be76df6-3c0f-41d1-86e2-8354f5e0c6e4",
   "title": "a todo",
   "completed": false,
   "url": "https://todo-javalin.herokuapp.com/4be76df6-3c0f-41d1-86e2-8354f5e0c6e4",
   "order": -1
}
```

## Interaction 8: OPTIONS /

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
Date: Sat, 09 Mar 2019 22:02:42 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 7: OPTIONS /

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
Date: Sat, 09 Mar 2019 22:02:42 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 9: OPTIONS /

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
Date: Sat, 09 Mar 2019 22:02:42 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

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
Date: Sat, 09 Mar 2019 22:02:42 GMT
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
Date: Sat, 09 Mar 2019 22:02:42 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 10: OPTIONS /

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
Date: Sat, 09 Mar 2019 22:02:42 GMT
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
Date: Sat, 09 Mar 2019 22:02:42 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

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
Date: Sat, 09 Mar 2019 22:05:26 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

## Interaction 1: OPTIONS /

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
Date: Sat, 09 Mar 2019 22:05:26 GMT
Server: Javalin
Via: 1.1 vegur
```

### Resulting body back from the real server (200: text/plain;charset=utf-8):

```

```

