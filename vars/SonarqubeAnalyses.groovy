def call(credentialsId){

withSonarQubeEnv(credentialsId: 'SONAR') {
         sh 'mvn clean verify sonar:sonar '
        -Dsonar.host.url=http://localhost:9000 \
        -Dsonar.login=sqp_6e790995fbde76b214fc934afeaf753d86039d7f'
        
    }
}
