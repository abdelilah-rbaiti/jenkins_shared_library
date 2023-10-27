def call(credentialsId){

 withCredentials([string(credentialsId: 'SONAR', variable: 'sonarqube')]) {
         sh 'mvn clean verify sonar:sonar \
        -Dsonar.projectKey=project-java \
        -Dsonar.host.url=http://localhost:9000 \
        -Dsonar.login=sqp_6e790995fbde76b214fc934afeaf753d86039d7f'
    }
}
