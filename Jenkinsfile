pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3.6.3') {
                    bat  'mvn formatter:format'
                    bat  'mvn clean install -DskipTests'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3.6.3') {
                    bat  'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3.6.3') {
                    bat  'java -jar -Dspring.profiles.active=local target/demo-0.0.1-SNAPSHOT.jar'
                }
            }
        }
    }
}