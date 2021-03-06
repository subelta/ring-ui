package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Publish'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Publish")) {
    dependencies {
        expect(RelativeId("GeminiTests")) {
            snapshot {
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        update(RelativeId("GeminiTests")) {
            snapshot {
                onDependencyFailure = FailureAction.CANCEL
                onDependencyCancel = FailureAction.CANCEL
            }
        }

    }
}
