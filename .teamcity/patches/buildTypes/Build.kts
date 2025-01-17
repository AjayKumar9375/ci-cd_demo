package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Build'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Build")) {
    expectSteps {
        python {
            name = "python_runner"
            command = file {
                filename = "req_py_script.py"
                scriptArguments = "--filename requirement1.txt --package_name V1/1.2.1/release"
            }
        }
        python {
            name = "python_runner"
            command = file {
                filename = "req_py_script.py"
                scriptArguments = "--filename requirement2.txt --package_name V3/1.2.1/release"
            }
        }
        python {
            name = "python_runner"
            command = file {
                filename = "req_py_script.py"
                scriptArguments = "--filename requirement3.txt --package_name L1/smd/1.2.1/release"
            }
        }
        python {
            name = "python_runner4"
            command = file {
                filename = "req_py_script.py"
                scriptArguments = "--filename requirement4.txt --package_name L3/1.2.1/release"
            }
        }
    }
    steps {
        insert(4) {
            python {
                name = "create virtual environment"
                id = "create_virtual_environment"
                command = custom {
                    arguments = """
                        import os
                        import subprocess
                        
                        subprocess.check_call([os.sys.executable, '-m', 'venv', 'venv'])
                    """.trimIndent()
                }
            }
        }
    }
}
