def call(credentialsId){

withSonarQubeEnv(credentialsId: 'SONAR') {
         sh 'mvn clean verify sonar:sonar 
        
    }
}
