pipeline {
  agent any
  stages {
    stage('compilar') {
      steps {
        withMaven(maven: 'Maven-1') {
          bat 'mvn clean install -DskipTests=true'
        }

      }
    }
    stage('desplegar') {
      steps {
          deploy adapters: [tomcat7(path: '', url: 'http://localhost:8081')], contextPath: 'repo1', war: '**/*.war'
      }
    } 
  }
}
