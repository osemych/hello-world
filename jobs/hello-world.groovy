def gitrepo = 'https://github.com/osemych/hello-world.git'

job('job-hello-world') {
  scm {
    git(gitrepo)
  }
  steps {
    shell('echo Hello world!')
  }
}

