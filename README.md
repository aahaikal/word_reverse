# Reverse Word

Reverse-Word is a web-service that 'droW-esreveR'
### Version
1.0-SNAPSHOT.

---
### Installation

We use Docker for this service, if you dont have Docker installed. Detailed information can be found here.
* [Docker/installation] [PlDb]

After installing Docker.

Clone repository. 
```sh
$ git clone https://github.com/aahaikal/word_reverse.git reverse_word
$ cd reverse_word
```
Build the Docker image

```sh
$ docker build -t word_reverse . 
```
Spin up a Docker container from the newly created image 'word_reverse',
and map it to port 8080.
```sh
$ docker run -d -p 8080:8080 word_reverse
```
Test...
```sh
curl "http://{Docker IP}:8080/word?term=Test"
```


### Usage

Response will be in JSON format.

>This service has only one GET method.

##### Query Parameter
|Name|Description|
|:---|:---|
|term|(optional) _*String*_ <br> the word to be reversed|

Using GET method, you can get your word reversed.

##### Request Example
```sh
$ curl "http://{Docker IP}:8080/word?term=Test"
```
##### Response Example
```json
{
    "word":"tseT"
}
```

   [PlDb]: <https://docs.docker.com/installation/>