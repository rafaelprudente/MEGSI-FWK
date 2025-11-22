pipeline {
    agent any
        tools {
            maven 'MVN'
    }
    stages {
        stage('Build Package') {
            steps {
                sh 'mvn -B -DskipTests clean package deploy'
            }
        }
    }
}