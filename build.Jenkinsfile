pipeline {
    agent any
    tools{
    maven 'MAVEN_HOME'
    }
    stages {
        stage('Checkout'){
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
       stage('Deploy'){
            steps {
                sh 'mvn deploy'
            }
       }
    }

    post {
        success {
            echo 'Build and test successful!'
        }
        failure {
            echo 'Build or test failed!'
        }
    }
}
