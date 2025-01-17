import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.triggers.vcs
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

import reqbuild.*
/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2024.03"

project {

    vcsRoot(HttpsGithubComAjayKumar9375requirementGitRefsHeadsMain)

    buildType(Build())
}

class Build : BuildType({
    name = "Build"
    artifactRules = "requirement.txt"
    vcs {
        root(HttpsGithubComAjayKumar9375requirementGitRefsHeadsMain)
    }

    triggers {
        vcs {
        }
    }

    steps{
        pythonScrip1()
        pythonScrip2()
        pythonScrip3()
        pythonScrip4()
    }

    features {
        perfmon {
        }
    }
})

object HttpsGithubComAjayKumar9375requirementGitRefsHeadsMain : GitVcsRoot({
    name = "https://github.com/AjayKumar9375/requirement.git#refs/heads/main"
    url = "https://github.com/AjayKumar9375/requirement.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
})
