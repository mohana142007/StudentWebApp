pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                bat 'mvnd clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvnd test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'C:\\Users\\satya\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin\\docker.exe build -t student-web-app .'
            }
        }

        stage('Docker Run') {
            steps {
              bat 'C:\\Users\\satya\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin\\docker.exe stop student-container || exit 0'
bat 'C:\\Users\\satya\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin\\docker.exe rm student-container || exit 0'
bat 'C:\\Users\\satya\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin\\docker.exe run -d -p 8080:8080 --name student-container student-web-app'
            }
        }
    }
}