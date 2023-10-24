
def runIntegrationTests() {
    sh 'mvn verify -DskipUnitTests'
}
