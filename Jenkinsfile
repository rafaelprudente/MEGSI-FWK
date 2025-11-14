pipeline {
    agent any
        tools {
            maven 'MVN'   // <-- Name you set in Jenkins Tools
        }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}