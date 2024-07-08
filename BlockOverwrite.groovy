import org.artifactory.request.Request
import org.artifactory.repo.RepoPath
import java.util.regex.Pattern

def protectedFilePath = ~/.*\/protected-file.txt/ // Change this to any regex pattern

storage {
    beforeCreate { item ->
        def repoPath = item.repoPath.path
        if (Pattern.matches(protectedFilePath.pattern(), repoPath) && item.exists()) {
            cancel("Overwriting protected file is not allowed.", 403)
        }
    }
}
