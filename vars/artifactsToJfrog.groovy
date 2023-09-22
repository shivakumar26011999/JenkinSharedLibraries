def call(String jfrogUname, String jfrogPassword, String jfrogTargetPath, String jfrogEndpoint) {
    sh """
        echo "-------- Pushing Artifacts To JFrog --------"
        curl -X PUT -u ${jfrogUname}:${jfrogPassword} -T ${jfrogTargetPath} ${jfrogEndpoint}
        echo "-------- Pushing Artifacts Complete --------"
    """
}