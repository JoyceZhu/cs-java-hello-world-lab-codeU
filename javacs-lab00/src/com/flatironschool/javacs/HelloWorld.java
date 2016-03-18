package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
       String version = System.getProperty("java.version");
       // System.out.println("Version: " + version);
       int underscore_position = version.indexOf('_');
       return Double.parseDouble(version.substring(0, underscore_position - 2));
    }

    public static void main(String[] args) {
	getVersion();
    }
}
