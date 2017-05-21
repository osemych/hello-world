String gitrepo = 'https://github.com/osemych/hello-world.git'

job("job-hello-world") {
  scm {
    git gitrepo
  }
  triggers {
    scm 'H/5 * * * *'
  }
  steps {
    shell 'sh Hello world!'
  }
}
