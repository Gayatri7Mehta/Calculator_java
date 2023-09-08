pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac Calculator.java'
            }
        }

        stage('Test') {
            steps {
                sh 'java Calculator'
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
