package _Root

import _Root.vcsRoots.RootProjectConfig
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "c757b73b-a630-431e-becd-23255f32d9c1"
    extId = "_Root"
    name = "<Root project>"
    description = "Contains all other projects"

    vcsRoot(RootProjectConfig)

    features {
        versionedSettings {
            id = "PROJECT_EXT_12"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = RootProjectConfig.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }

    cleanup {
        preventDependencyCleanup = false
    }
})
