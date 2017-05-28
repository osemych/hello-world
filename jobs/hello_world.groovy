String gitrepo = 'https://github.com/osemych/hello-world.git'

int index = 1;

while (index <= 2) {
    job('job-hello-world-slave0'+index) {
        label('slave-node0'+index)
        scm {
            git gitrepo
        }
        steps {
            shell 'sh hello-world.sh'
        }
    }
    index++;
}