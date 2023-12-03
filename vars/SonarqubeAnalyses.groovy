def call(credentialsId){

withSonarQubeEnv(credentialsId: 'SONAR') {
         sh """
         mvn clean verify sonar:sonar \
        -Dsonar.login=squ_6244297b60648a5a6dfe9277eeeb5ef63a892ec1
     """
    }
}
