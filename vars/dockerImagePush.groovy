def call(String project, String ImageTag, String hubUser){
     withCredentials([usernamePassword(
             credentialsId: "docker",
             usernameVariable: "USER",
             passwordVariable: "PASS"
     )]) {
         echo \$PASS | docker login --username \$USER --password-stdin
     }
     sh "docker image push ${hubUser}/${project}:${ImageTag}"
     sh "docker image push ${hubUser}/${project}:latest"   
 }
