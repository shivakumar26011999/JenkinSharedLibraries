def call() {
    sh """
        echo "-------- Cleaning Docker Images --------"
        docker image prune -a -f 
        echo "-------- Cleaning Docker Images Complete --------"
    """
}
