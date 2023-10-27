def call(credentialsId){

 withCredentials([string(credentialsId: 'SONAR', variable: 'sonarqube')]) {
         sh 'mvn clean package sonar:sonar'
    }
}
