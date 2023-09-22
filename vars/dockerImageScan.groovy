def call(String appName, String appVersion, String hubUser) {
    sh """
      echo "-------- Docker Image Scan --------"
      trivy image ${appName}:${appVersion} > scan.txt
      cat scan.txt
      echo "-------- Docker Image Scan Complete --------"
    """
}