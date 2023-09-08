pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'javac Calculator.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java Calculator'
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
