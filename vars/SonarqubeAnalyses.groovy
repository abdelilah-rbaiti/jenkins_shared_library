def call(credentialsId){

 withCredentials([string(credentialsId: 'SONAR', variable: 'sonarqube')]) {
              sh "sonar-scanner -Dsonar.host.url=https://localhost:9000 -Dsonar.token='SONAR'"
    }
}
