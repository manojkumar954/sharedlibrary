def gitdownload(repo) {
    git "https://github.com/manojkumar954/${repo}.git"
}
def buildArtifact()
{
  sh 'mvn package'
}
def deployTomcat(ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${JOB_NAME}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}

def runselenium()
{
  sh "java -jar ${WORKSPACE}/testing.jar"
}
