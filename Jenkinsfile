pipeline {
  agent any
  stages {
    stage('desplegar') {
      steps {
        deploy(adapters: [tomcat7(credentialsId: '7a580f23-3bb3-4f8a-89f7-c896e4259bc5', path: '', url: 'http://localhost:8081')], contextPath: 'repo1', war: '**/*.war')
      }
    }

    stage('test') {
      steps {
        withMaven(maven: 'Maven-1', jdk: 'Java-8') {
          bat 'mvn test -Dmaven.test.failure.ignore=true'
        }

      }
    }

    stage('cobertura') {
      steps {
        cobertura(coberturaReportFile: 'JenkinsJSF\\target\\surefire-reports\\cobertura\\coverage.xml', conditionalCoverageTargets: '70, 0, 0', lineCoverageTargets: '80, 0, 0', methodCoverageTargets: '80, 0, 0', sourceEncoding: 'ASCII')
      }
    }

    stage('reportar') {
      steps {
        withMaven(maven: 'Maven-1', jdk: 'Java-8') {
          bat 'mvn checkstyle:checkstyle pmd:pmd findbugs:findbugs -Dmaven.test.failure.ignore=true'
        }

      }
    }

  }
}