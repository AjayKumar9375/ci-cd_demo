package reqbuild

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.BuildSteps
import jetbrains.buildServer.configs.kotlin.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.buildSteps.python

fun BuildSteps.pythonScrip1(init: ScriptBuildStep.() -> Unit = {}){
            python {
            name = "python_runner"
            command = file {
                filename = "req_py_script.py"
                scriptArguments = "--filename requirement1.txt --package_name V1/1.2.1/release"
            }
        }
}