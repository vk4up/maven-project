pipeline {
	agent any

	stages {
		stage('Init') {
			steps {
				echo "Now initializing..."
			}
		}
		
		stage('Build') {
			steps {
				echo "Now building..."
				sh 'mvn clean package'
			}
			post {
				success {
					echo "Now archiving..."
					archiveArtifacts artifacts: '**/target/*.war'
				}
			}
		}

		stage('Deploy') {
			steps {
				echo "Deploying..."
			}
		}		
	}
}