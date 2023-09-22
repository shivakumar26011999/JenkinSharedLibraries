def call(String dockerHubUname, String dockerHubPassword, String appName, String appVersion) {
    sh """
        echo "-------- Pushing Docker Image To DockerHub --------"
        echo "-------- Logging To DockerHub --------"
        docker login -u ${dockerHubUname} --password ${dockerHubPassword}
        echo "-------- LoggedIn To DockerHub --------"

        docker tag ${appName}:latest ${dockerHubUname}/${appName}:latest
        docker push ${dockerHubUname}/${appName}:latest

        docker tag ${appName}:"${appVersion}" ${dockerHubUname}/${appName}:"${appVersion}"
        docker push ${dockerHubUname}/${appName}:"${appVersion}"
        docker image prune --all
        echo "-------- Docker Image Pushed --------"
    """
}
