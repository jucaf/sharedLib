def call() {
    if (fileExists("requirements.txt")) {
        sh "virtualenv venv"
        sh "venv/bin/pip install -r requirements.txt"
    }
    sh """find . -name '*.py' -print0| xargs -0 -t -L 1 python2 -m py_compile"""
}
