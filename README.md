<p align="center">
    <br>
    <img src="https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/30a0ecf99188be99a3c75a00efb5be61eca9c382/src/java/java.svg" alt="Java Logo">
    <br>
    <br>
    <h1>
    <b>Best Places to Visit on the Vacations</b>
    </h1>
</p>

Api Rest with Srping Boot Framework, Java Programming Language and MongoDB database.

### Spring Initializer Model

![](initializer.png)

### DB Configs - [MongoDB Atlas](https://www.mongodb.com/): db on cloud

- 1. Configure the personal account
- 2. Click on "Project0"

![](step2.png)

- 3. Go to "Browser Collections"

![](step3.png)

- 4. Go to "Add My Own Data"

![](step4.png) 

- 5. Give a name for the database and the collection and click on "Create"


![](step5.png)

- 6. Click on "Insert Document" 

![](step6.png)

- 7. Complete the Json field with the data (in that case, each destiny in your own document)

![](step7.png)

- 8. Go to Overview -> Connect -> Connect your Application -> Copy the Config String and paste on the `application.properties` of the project filling the password and the db name.

![](step8.png)


```spring.data.mongodb.uri=mongodb+srv://raquelmichelonaulas:<password>@clustermichelon.i2gagrh.mongodb.net/<NAMEDB>?retryWrites=true&w=majority
```


### Tests on Insomnia

GET ALL 

![](get.png)

CREATE ONE (POST method)

![](post.png)

### Created the new document on the Database

![](createdOndb.png)

### Deploy on Heroku




