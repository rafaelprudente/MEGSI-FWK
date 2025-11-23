pipeline {
    agent any
        tools {
            maven 'mvn'
    }
    stages {
        stage('Build Package') {
            steps {
                sh 'mvn -B -DskipTests clean package deploy'
            }
        }
    }
}