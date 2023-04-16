package com.eclipsesource.v8.PlatformDetector$OS;
import java.lang.Object;
import java.lang.String;
import java.lang.UnsatisfiedLinkError;
import java.lang.StringBuilder;
import java.lang.System;
import com.eclipsesource.v8.PlatformDetector;
import java.lang.CharSequence;

public class PlatformDetector$OS	// class@000fd1
{

    public void PlatformDetector$OS(){
       super();
    }
    public static String getLibFileExtension(){
       if (PlatformDetector$OS.isWindows()) {
          return "dll";
       }
       if (PlatformDetector$OS.isMac()) {
          return "dylib";
       }
       if (!PlatformDetector$OS.isLinux() && (PlatformDetector$OS.isAndroid() || PlatformDetector$OS.isNativeClient())) {
          return "so";
       }
       throw new UnsatisfiedLinkError("Unsupported platform library-extension for: "+PlatformDetector$OS.getName());
    }
    public static String getName(){
       String property = System.getProperty("os.name");
       String str = PlatformDetector.normalizeOs(property);
       String property1 = System.getProperty("java.specification.vendor");
       String str1 = "android";
       if ((PlatformDetector.normalize(property1)).contains(str1) || str.contains(str1)) {
          return str1;
       }
       if (!str.equals("unknown")) {
          return str;
       }
       throw new UnsatisfiedLinkError("Unsupported platform/vendor: "+property+" / "+property1);
    }
    public static boolean isAndroid(){
       return (PlatformDetector$OS.getName()).equals("android");
    }
    public static boolean isLinux(){
       return (PlatformDetector$OS.getName()).equals("linux");
    }
    public static boolean isMac(){
       return (PlatformDetector$OS.getName()).equals("macosx");
    }
    public static boolean isNativeClient(){
       return (PlatformDetector$OS.getName()).equals("nacl");
    }
    public static boolean isWindows(){
       return (PlatformDetector$OS.getName()).equals("windows");
    }
}
