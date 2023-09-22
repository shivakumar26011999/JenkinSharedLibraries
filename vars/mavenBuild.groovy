def call() {
    sh '''
      echo "-------- Creating Jar --------"
      mvn clean package
      echo "-------- Jar Creation Complete --------"
    '''
}