package org.organization
class PythonCompiler {
  static def compileDirectory(script, directory) {
    script.sh """find ${directory} -name '*.py' -print 0 | xargs -0 -t -L 1 python2 -m py_compile"""
  }
}
