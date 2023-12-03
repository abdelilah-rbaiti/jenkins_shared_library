def call(String imageName, String imageTag = 'latest', String dockerfilePath = '.') {
    sh "docker build -t ${imageName}:${imageTag} ${dockerfilePath}"
}
