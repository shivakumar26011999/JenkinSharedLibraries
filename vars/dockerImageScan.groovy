def call(String project, String imageTag, String hubUser) {
    sh """
      cat ${hubUser}
      trivy image ${project}:${imageTag} > scan.txt
      cat scan.txt
    """
}