def call(credentialsId){

withSonarQubeEnv(credentialsId: 'SONAR') {
         sh 'mvn clean verify sonar:sonar '
        -Dsonar.host.url=http://localhost:9000 \
        -Dsonar.login=squ_8257b3f3817d02f48e93e939a025e311505bffbd'
        
    }
}
