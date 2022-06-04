# Vet-Case
Vet Case is a veterinary automation.
## [Live Preview](http://20.37.0.71:8080)
Deployed with Azure VPS
## Used Technologies
|  |  |
| ------ | ------ |
| Spring Boot | Web Framework  |
| Thymeleaf | Template Engine  |
| JPA Hibernate | ORM |
| Maven | Package Manager  |


## Features
- Register and Login
- Search by animal name or owner name
- Up to n animal definitions can be made for one animal owner.
- Changes can be made to an existing record.
- Existing records can be reviewed
- An existing record can be deleted

## How To Run
1- Clone the database repository with the command 
```sh
 git clone https://github.com/zeynepyldrm/vetcase-database
```
2- Get build in dockerfile and go into the file and run these commands
```sh
  docker build ./
```
3- Run database container with command
```sh
  docker run -p 3306:3306 <image_id> --detach
```
4- Clone this java repos and run the project
```sh
 https://github.com/zeynepyldrm/Vet-Case
 mvn spring-boot:run 
```
