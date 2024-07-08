import org.artifactory.request.Request
import org.artifactory.repo.RepoPath

def protectedFilePath = "artifactory-repo/path/to/protected-file.txt"

storage {
    beforeCreate { item ->
        def repoPath = item.repoPath
        if (repoPath.path == protectedFilePath && item.exists()) {
            cancel("Overwriting protected file is not allowed.", 403)
        }
    }
}
