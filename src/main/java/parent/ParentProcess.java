package parent;

import child.ChildProcess;

import java.io.File;
import java.io.IOException;

public class ParentProcess {
    public static void main(String[] args) throws IOException, InterruptedException {

        String javaHome = System.getProperty("java.home");
        String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
        String classpath = System.getProperty("java.class.path");
        String className = ChildProcess.class.getCanonicalName();

        ProcessBuilder builder = new ProcessBuilder(javaBin, "-cp", classpath, className);

        Process process = builder.start();

        process.waitFor();
    }
}
