def gitDownload(repo)
{
     git "https://github.com/sirasapallisatish/${repo}"
}

def contbuild()
{
     sh 'mvn package'
}

def contDeploy(jobname,ip,appname)
{
      sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war   ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
