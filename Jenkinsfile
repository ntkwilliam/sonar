pipeline {
    agent any
    stages {
        stage('Log ant version') {
            steps {
                sh 'java -version'
                sh 'ant -version'
                sh 'git --version'
            }
        }
//         stage('Code checkout and build') {
//             steps {
//                 sh 'ant -version'
//                 sh 'ant -f build.xml'
//             }
//         }
    }
}
