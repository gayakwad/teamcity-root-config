package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object RootProjectConfig : GitVcsRoot({
    uuid = "597cf052-5365-4e26-a674-7fc4e3a105bb"
    extId = "RootProjectConfig"
    name = "RootProjectConfig"
    url = "https://github.com/gayakwad/teamcity-root-config.git"
    pushUrl = "https://github.com/gayakwad/teamcity-root-config.git"
    authMethod = uploadedKey {
        uploadedKey = "VSC Key"
    }
    agentCleanPolicy = AgentCleanPolicy.ALWAYS
    branchSpec = """
        +:refs/heads/(master)
        +:refs/heads/(release/*)
        +:refs/(pull-requests/*)/from
    """.trimIndent()
})
