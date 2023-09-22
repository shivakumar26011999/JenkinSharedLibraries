def call(String appName, String appVersion, String hubUser) {
    sh """
      echo "-------- Docker Image Scan --------"
      cat ${hubUser}
      trivy image ${appName}:${appVersion} > scan.txt
      cat scan.txt
      echo "-------- Docker Image Scan Complete --------"
    """
}