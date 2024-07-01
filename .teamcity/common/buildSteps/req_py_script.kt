package reqbuild

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.BuildSteps
import jetbrains.buildServer.configs.kotlin.buildSteps.ScriptBuildStep

import jetbrains.buildServer.configs.kotlin.buildSteps.python
// import jetbrains.buildServer.configs.kotlin.buildSteps.PythonBuildStep

fun BuildSteps.pythonScrip(init: ScriptBuildStep.() -> Unit = {}){
            python {
            id = "python_runner"
            command = file {
                filename = "req_py_script.py"
                scriptArguments = "requirement.txt"
            }
        }
}