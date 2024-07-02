package reqbuild

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.BuildSteps
import jetbrains.buildServer.configs.kotlin.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.buildSteps.python

fun BuildSteps.pythonScrip4(init: ScriptBuildStep.() -> Unit = {}){
            python {
            name = "python_runner4"
            command = file {
                filename = "req_py_script.py"
                scriptArguments = "--filename requirement4.txt"
            }
        }
}