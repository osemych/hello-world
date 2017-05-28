String gitrepo = 'https://github.com/osemych/hello-world.git'

job("job-hello-world-slave01") {
    label(slave-node01)
    scm {
        git gitrepo
    }
    steps {
        shell 'sh hello-world.sh'
    }
}

job("job-hello-world-slave02") {
    label(slave-node02)
    scm {
        git gitrepo
    }
    steps {
        shell 'sh hello-world.sh'
    }
}

