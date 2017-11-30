import static org.organization.PythonCompiler.*

def call(String directory = '.') {
    echo ("Compiling ${directory}")
    compileDirectory(this, directory)
}
