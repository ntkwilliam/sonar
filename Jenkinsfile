pipeline {
    agent any
    stages {
        stage('Log ant version') {
            steps {
                sh 'ant -version'
            }
        }
        stage('Code checkout and build') {
            steps {
                sh """
                    ant -version
                    ant -f build.xml
                """
            }
        }
    }
}
