pipeline {
    agent any
    tools {
        maven 'Maven 3.8.4'
    }
    stages {

        // stage('Get the Repo')
        // {
        //     steps{
        //         bat 'git clone "https://github.com/anirudhk999/java_sorting_algorithms"'
        //     }
        // }
        stage('Build') {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Run Unit Tests') {
            steps 
            {
                // Compile the Java code and run the unit tests on Windows
                bat 'mvn test'

            }
        }

    }
}