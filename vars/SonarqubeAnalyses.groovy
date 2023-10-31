def call(credentialsId){

withSonarQubeEnv(credentialsId: 'SONAR') {
         sh """
         mvn clean verify sonar:sonar \
        -Dsonar.login=squ_c9dbd315d12c14477e6ee03a40c1fd618df133eb
     """
    }
}
