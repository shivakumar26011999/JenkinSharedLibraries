def call(String project, String imageTag, String hubUser) {
    sh """
     trivy image ${hubUser}/${project}:${imageTag} > scan.txt
     cat scan.txt
    """
}