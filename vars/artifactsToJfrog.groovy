def call(String jfrogUname, String jfrogPassword, String jfrogEndpoint, String jfrogTargetPath ) {
    sh """
        echo "-------- Pushing Artifacts To JFrog --------"
        curl -X PUT -u ${jfrogUname}:${jfrogPassword} -T ${jfrogTargetPath} ${jfrogEndpoint}
        echo "-------- Pushing Artifacts Complete --------"
    """
}