def call(body) {
  def config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()
  pipeline {
    agent any
    stages {
      stage('Clone') {
        steps {
          git url: "https://github.com/${githubproject}"
        }
      }
      stage ('Compile') {
        steps{
          sh("ls")
        }
      }
    }
  }
}
