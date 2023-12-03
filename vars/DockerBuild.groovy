def call(String imageName, String dockerfilePath = '.') {
    // This function builds a Docker image
    sh "docker build -t ${imageName} ${dockerfilePath}"
}
