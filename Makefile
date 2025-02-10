.PHONY: create_java_project exec

# Group Id: project's package
# Artifact Id: project's name
create_java_project:
	mvn archetype:generate \
		-DgroupId=com.bancodigital \
		-DartifactId=. \
		-DarchetypeArtifactId=maven-archetype-quickstart \
		-DarchetypeVersion=1.4 \
		-DinteractiveMode=false \

exec:
	mvn exec:java -Dexec.mainClass=com.bancodigital.App

defprop:
	mvn versions:set-property -Dfoo="bar"
