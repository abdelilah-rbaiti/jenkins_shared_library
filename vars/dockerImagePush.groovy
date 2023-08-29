//def call(String project, String ImageTag, String hubUser){
    // withCredentials([usernamePassword(
           //  credentialsId: "docker",
         //    usernameVariable: "USER",
       //      passwordVariable: "PASS"
     //)]) {
           //sh """
         //   echo \$PASS | docker login -u \$USER --password-stdin
       //     docker image push ${hubUser}/${project}:${ImageTag}
     //       docker image push ${hubUser}/${project}:latest
   //     """  
 //}
//}


def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
     aws ecr get-login-password --region eu-north-1 | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.eu-north-1.amazonaws.com
     docker push ${aws_account_id}.dkr.ecr.eu-north-1.amazonaws.com/${ecr_repoName}:latest
    """
}
