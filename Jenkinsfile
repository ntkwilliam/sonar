pipeline {
    agent any
    stages {
        stage('Log ant version') {
            steps {
                sh 'ant -version'
            }
        }
        stage('Echo random message') {
            steps {
                echo 'In the second stage'
            }
        }
        stage('Code checkout and build') {
            steps {
                ant -version
                ant -f build.xml
            }
        }
    }
}
