String gitrepo = 'https://github.com/osemych/hello-world.git'

job("job-hello-world") {
  scm {
    git gitrepo
  }
  trigers {
    scm 'H/5 * * * *'
  }
  steps {
    shell 'echo Hello world!'
  }
}
