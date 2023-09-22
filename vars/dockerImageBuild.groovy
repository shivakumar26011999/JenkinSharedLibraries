def call(String appName, String appVersion, String commonVersion) {
    sh """
        echo "-------- Building Docker Image --------"
        docker build -t ${appName}:${appVersion} .
        docker build -t ${appName}:${commonVersion} .
        echo "-------- Building Docker Image Complete --------"
    """
}
