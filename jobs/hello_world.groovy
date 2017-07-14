String gitrepo = 'https://github.com/osemych/hello-world.git'

int index = 1;

while (index <= 2) {
    job('job-hello-world-slave0'+index) {
        label('docker-slave')
        scm {
            git gitrepo
        }
        steps {
            shell 'sh hello-world.sh'
        }
    }
    index++;
}