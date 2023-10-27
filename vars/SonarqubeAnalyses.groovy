def call(credentialsId){

withSonarQubeEnv(credentialsId: 'SONAR') {
         sh """
         mvn clean verify sonar:sonar \
        -Dsonar.login=squ_8257b3f3817d02f48e93e939a025e311505bffbd
     """
    }
}
