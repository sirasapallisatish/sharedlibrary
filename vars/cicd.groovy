def gitDownload(repo)
{
     git "https://github.com/sirasapallisatish/${repo}"
}

def contbuild()
{
     sh 'mvn package'
}
