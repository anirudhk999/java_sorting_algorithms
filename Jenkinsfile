pipeline {
    agent any
    environment {
        GIT_CREDENTIALS_ID = 'your-git-credentials-id' // Set this to your GitHub credentials ID in Jenkins
REPO_URL = 'https://github.com/your-repo-url.git'
        MAIN_BRANCH = 'main'
    }
    tools {
        maven 'Maven 3.8.4'
    }
    stages {
        stage('Run Unit Tests') {
            steps {
                script {
                    try {
                        // Compile the Java code and run the unit tests on Windows
                        bat 'cd java_sorting_algorithms'
                        bat 'mvn test'
                        env.TEST_RESULT = 'SUCCESS'
                    } catch (Exception e) {
                        env.TEST_RESULT = 'FAILURE'
                    }
                }
            }
        }

    }
}