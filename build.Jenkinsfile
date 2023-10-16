pipeline {
    agent any

    stages {
        stage('Checkout'){
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn build'
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
