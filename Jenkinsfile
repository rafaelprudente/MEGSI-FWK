pipeline {
    agent any
        tools {
            maven 'MVN'
        }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}