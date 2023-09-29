pipeline {
    agent any
    stages{
        stage('pull'){
            echo "hello pull complited"
        }
        stage('build'){
            echo "hello build complited"
        }
        stage('test'){
            echo "hellow test comlited"
        }
        stage('deloy'){
            echo "hello deploy complited"
        }
    }
}