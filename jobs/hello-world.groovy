def giturl = "https://github.com/osemych/hello-world.git"

job("job-hello-world") {
  scm {
    git(giturl)
  }
  steps {
     shell("sh hello-world.sh")
  }
}
