# bookstore-reviews

This application is inspired by [istios bookinfo](https://istio.io/latest/docs/examples/bookinfo/) example app.
It is intended to demonstrate modern development practices such as microservices and containerization. The code accompanies a lecture held at TUM Heilbronn.

Main purpose of the application is to expose static information about dummy reviews via a restful API.

API Spec:

```
Request:
GET reviews/{producId}

Response:
[{
    "reviewer": "John Doe",
    "text": "First Rating"
}]
```

# spring boot app

Dependencies / build management is done with gradle. To build the self-contained `jar` artifact all you need to do is:
```
./gradlew bootJar
```
The build output can then be found at `build/libs`.

To run the app locally execute

```
./gradlew bootRun
```
if not specified otherwise the embedded tomcat server will listen on port `8082`. Changing the default behaviour can either be done by specifing a new port in `application.yml` or setting an environment variable called `PORT`.

The only endpoint the application exposes can then be consumend via curl like so:

```
curl http://localhost:8082/reviews/1
```

Regardless of what you send as an id (`reviews/{producId}`) you will always get the same result.
