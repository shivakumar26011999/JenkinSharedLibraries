def call() {
    sh '''
        echo "-------- Executing Testcases --------"
        mvn test
        echo "-------- Testcase Execution Complete --------"
    '''
}
