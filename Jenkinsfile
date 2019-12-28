pipeline {
    agent any
        tools { 
            maven 'Maven 3.6.2' 
            jdk 'JDK 1.8.0_221' 
        }
        stages {
            stage ('checkout') {
                steps {
                    echo 'Checking out the code from Github'
                    checkout([$class: 'GitSCM', 
                              branches: [[name: '*/backend']], 
                              doGenerateSubmoduleConfigurations: false, 
                              extensions: [], 
                              submoduleCfg: [], 
                              userRemoteConfigs: [[credentialsId: 'giribabugnt', 
                                                   url: 'https://github.com/giribabugnt/project_management_soln_backend.git']]]
                            )
                }
            }
            stage ('build') {
                steps {
                    echo 'Building artefact'
                    bat 'cd fsd-assessment & mvn clean install'
                }
            }
            stage ('test') {
                parallel {
                    stage ('unit test') {
                        steps {
                            echo 'Running Unit Tests'
                        }
                    }
                    stage ('integration test') {
                        steps {
                            echo 'Running Integration Tests'
                        }
                    }
                }
            }
        }
}
