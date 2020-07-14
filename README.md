# deploy-spring-boot-aws-eb


#### src/test/resources/application.properties

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${RDS_HOSTNAME:localhost}:${RDS_PORT:3306}/${RDS_DB_NAME:todos}
spring.datasource.username=${RDS_USERNAME:todos-user}
spring.datasource.password=${RDS_PASSWORD:dummytodos}
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL57Dialect

### Create Production Build

npm run build --prod


### S3 Access for Static Content

{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "AddPerm",
            "Effect": "Allow",
            "Principal": "*",
            "Action": "s3:GetObject",
            "Resource": "arn:aws:s3:::fullstack-frontend/*"
        }
    ]
}
