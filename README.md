# ArtifactoryProtectedPath
Artifactory permission plugin to allow deploying to all paths in a repo but preventing overwriting a specific path.

By allowing delete/overwrite permissions on a repository and using this plugin, a user or group can be allowed to deploy anywhere in a repo and to overwrite everything except a certain path that is always protected from being overwritten once it's created.

## Installation
Adjust the path `protectedFilePath` in BlockOverwrite.groovy to the desired path and copy the file to $ARTIFACTORY_HOME/etc/plugins. 

Restart Artifactory.
