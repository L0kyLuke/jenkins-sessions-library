def call() {
    node { // Ponemos el nodo que estamos usando
        sh '''
        docker version
        node --version
        npm version
        '''
    }
}