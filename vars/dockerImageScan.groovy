def call(String project, String imageTag) {
    sh """
     trivy image ${project}:${imageTag} > scan.txt
     cat scan.txt
    """
}