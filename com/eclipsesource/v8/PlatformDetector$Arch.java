package com.eclipsesource.v8.PlatformDetector$Arch;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import com.eclipsesource.v8.PlatformDetector;
import java.lang.UnsatisfiedLinkError;
import java.lang.StringBuilder;

public class PlatformDetector$Arch	// class@000fd0
{

    public void PlatformDetector$Arch(){
       super();
    }
    public static String getName(){
       String property = System.getProperty("os.arch");
       String str = PlatformDetector.normalizeArch(property);
       if (!str.equals("unknown")) {
          return str;
       }
       throw new UnsatisfiedLinkError("Unsupported arch: "+property);
    }
}
