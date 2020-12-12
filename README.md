## Project Details

This project is the backend application for the CV builder project, I have used the java programing language and SPRING BOOT framework to create REST API.

This application connects with the MySQL database a datastore. SPRING framework used here to make a connections between java code and database. CV builder collects data from the user like basic personal details, professional details for building the CV, with the CV builder application we can create, update, and delete the CV we need.

### `Funtional Details` 

At the first step, we have a home page that describes the product details and relevant pricing options like CV writing, Cover letter writing, and LinkedIn writing. There is a signup option and then sign in into the CV builder application. 

Once we have chosen the product then the application will be navigated to the CV information page where we can provide all the required details and save it. The application will create your information in the database. Similarly, we can do the update if we already have the cv information. 

Once we saved or updated the CV there is an option to delete the CV information then at the final step we can do the payment. Once the payment is completed the user will be navigated to the home page. In the background, the CV will be submitted to the CV agent and they will write the CV then deliver it via email id which is provided. 

There can be options to update the CV on the CV builder application so that the user can log in and look at the CV then ask for a second version if required. This functionality has not been covered in this project.

### `Technical Details`

TODO:

### `Commands to run the project locally and deploy`

Run CVBuilderAPI.java file
If you are running from IDE, right click on the CVBuilderAPI.java and run as a java application
If you are using command line interface then run 'java CVBuilderAPI.java' then we can see the spring initialization on the output file.

mvn clean

mvn install
This command will create a .war file in the target folder
We can deploy the .war file on your tomcat locally or any other servers

### `Run the project at AWS`

The code has been deployed in the Elastic beanstalk as a continuous deployment. I have used CodePipeline for CI/CD.

Since it is a continuous deployment it automatically trigger the pipeline whenever there is a change in this github repository's master branch. Once the code has been merged into master branch from other branches the pipeline will be triggered.

The pipeline has Source, Build and Deploy stages.
  *  Source is pull the code from the provided repository, I have chosen the gitub as my repository.
   * Build is to package the code from pulled git repository code.
   * Deploy is to deploy the code into the specific environment, I have chosen Elastic beanstalk for deployment.

Elastic beanstalk provides the endpoint for the application.
