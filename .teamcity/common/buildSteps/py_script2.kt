package reqbuild

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.BuildSteps
import jetbrains.buildServer.configs.kotlin.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.buildSteps.python

fun BuildSteps.pythonScrip2(init: ScriptBuildStep.() -> Unit = {}){
            python {
            name = "python_runner"
            command = file {
                filename = "req_py_script.py"
                scriptArguments = "--filename requirement2.txt --package_name V3"
            }
        }
}