node
{
    Stages('Scm Checkout')
    {
        git credentialsId: 'git-creds', url: 'https://github.com/sangameshwar2804/FebAutomation.git'
    }
    Stage('Mvn Package'){
        def mvnHome = tool name: 'maven-3', type: 'maven'
        def mvnCmd = "${mvnHome}/bin/mvn"
        sh "${mvnHome}/bin/mvn package"
    }
    Stage('Build Docker Image'){
        sh 'docker build -t arvayip/myapptest:1.0.0 .'
    }
    Stage('push Docker Image'){
        withCredentials([string(credentialsId: 'docker-pswd', variable: 'dockerHubPwd')]) {
     sh "dcoker login -u aryavip -p ${dockerHubPwd}"
}
        sh 'docker push aryavip/myapptest:1.0.0'
    }
    Stage('Run Container on Srver'){
        sh 'docker run -p 8089:8089 -d -name myapptest aryavip/myapptest:1.0.0'
    }
}
