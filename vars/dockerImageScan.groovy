def call(String appName, String appVersion, String hubUser) {
    sh """
      cat ${hubUser}
      trivy image ${appName}:${appVersion} > scan.txt
      cat scan.txt
    """
}