pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t student-web-app .'
            }
        }

        stage('Docker Run') {
            steps {
                bat 'docker stop student-container || exit 0'
                bat 'docker rm student-container || exit 0'
                bat 'docker run -d -p 8080:8080 --name student-container student-web-app'
            }
        }
    }
}