pipelineJob('Jenkins-File') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('1DevOps2/MyJenkinsfiles')
                    }
                  branch('*/main')
                }
              triggers {          
  						scm('H/5 * * * *')    
						}
            }
            scriptPath('Jenkinsfile')
        }
    }
}

pipelineJob('Jenkins-File') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('1DevOps2/MyJenkinsfiles')
                    }
                  branch('*/main')
                }
              triggers {          
  						scm('H/5 * * * *')    
						}
            }
            scriptPath('Jenkinsfile1')
        }
    }
}

