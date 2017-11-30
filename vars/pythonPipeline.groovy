def call(String githubproject) {
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
