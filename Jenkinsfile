pipeline {
  agent any
  stages {
    stage('compilar') {
      steps {
        withMaven(maven: 'Maven-1') {
          bat 'mvn clean install -D skipTest'
        }

      }
    }

  }
}
