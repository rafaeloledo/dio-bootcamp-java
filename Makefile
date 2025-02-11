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

mvnd:
	@mvnd package -DskipTests -T 12 -Dmaven.test.skip=true\
		&& mvnd exec:java -Dexec.mainClass=com.bancodigital.App

mvn:
	@mvn package -DskipTests -T 12 -Dmaven.test.skip=true\
		&& mvn exec:java -Dexec.mainClass=com.bancodigital.App
