A Spring Java web application created with the Spring Initializer.  The application uses the MVC pattern to serve up a jsp page as well as an API to enable a React front end to consume the user data.

The Registration Controller serves up an jsp page which takes a name entered by the user and prints it out to the console.  The page also has validation making the name mandatory.  In addition, I18N has been added to support a Spanish translation by the addition of the "?lang=es" query string.
http://localhost:8080/registration

A resource handler was added to serve up static files.
http://localhost:8080/files/AWSCertifiedCloudPractitioner.pdf

The User Controller is a spring REST controller that creates a list of users and returns either the list or an individual user by adding the user id as a path variable.
http://localhost:8080/api/v1/data/users
http://localhost:8080/api/v1/data/users/id

The api is also set up to be consumed by the React front end.  This required the CorsMapping to be set up.

