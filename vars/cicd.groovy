def gitdownload(repo) {
    git "https://github.com/manojkumar954/${repo}.git"
}
def buildArtifact()
{
  sh 'mvn package'
}
