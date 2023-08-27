def call(String project, String ImageTag, String hubUser){
     withCredentials([usernamePassword(
             credentialsId: "docker",
             usernameVariable: "USER",
             passwordVariable: "PASS"
     )]) {
           sh """
            echo \$PASS | docker login -u \$USER --password-stdin
            docker image push ${hubUser}/${project}:${ImageTag}
            docker image push ${hubUser}/${project}:latest
        """  
 }
}
