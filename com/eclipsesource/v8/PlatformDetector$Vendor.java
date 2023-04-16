package com.eclipsesource.v8.PlatformDetector$Vendor;
import java.lang.String;
import java.lang.Object;
import java.io.Closeable;
import java.io.File;
import java.lang.UnsatisfiedLinkError;
import java.lang.StringBuilder;
import com.eclipsesource.v8.PlatformDetector$OS;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import com.eclipsesource.v8.PlatformDetector;
import java.util.Locale;
import java.lang.CharSequence;

public class PlatformDetector$Vendor	// class@000fd2
{
    public static final String[] LINUX_OS_RELEASE_FILES;

    static {
       String[] stringArray = new String[]{"/etc/os-release","/usr/lib/os-release"};
       PlatformDetector$Vendor.LINUX_OS_RELEASE_FILES = stringArray;
    }
    public void PlatformDetector$Vendor(){
       super();
    }
    public static void closeQuietly(Closeable p0){
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static String getLinuxOsReleaseId(){
       File uFile;
       String[] lINUX_OS_REL = PlatformDetector$Vendor.LINUX_OS_RELEASE_FILES;
       int len = lINUX_OS_REL.length;
       int i = 0;
       while (true) {
          if (i < len) {
             uFile = new File(lINUX_OS_REL[i]);
             if (uFile.exists()) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             File uFile1 = new File("/etc/redhat-release");
             if (uFile1.exists()) {
                return PlatformDetector$Vendor.parseLinuxRedhatReleaseFile(uFile1);
             }
             throw new UnsatisfiedLinkError("Unsupported linux vendor: "+PlatformDetector$Vendor.getName());
          }
       }
       return PlatformDetector$Vendor.parseLinuxOsReleaseFile(uFile);
    }
    public static String getName(){
       if (PlatformDetector$OS.isWindows()) {
          return "microsoft";
       }
       if (PlatformDetector$OS.isMac()) {
          return "apple";
       }
       if (PlatformDetector$OS.isLinux()) {
          return PlatformDetector$Vendor.getLinuxOsReleaseId();
       }
       if (PlatformDetector$OS.isAndroid()) {
          return "google";
       }
       throw new UnsatisfiedLinkError("Unsupported vendor: "+PlatformDetector$Vendor.getName());
    }
    public static String parseLinuxOsReleaseFile(File p0){
       Closeable uCloseable;
       String str = null;
       try{
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(new FileInputStream(p0), "utf-8"));
          try{
             String str1 = uBufferedRea.readLine();
             while (str1 != null) {
                if (str1.startsWith("ID=")) {
                   str = PlatformDetector.normalizeOsReleaseValue(str1.substring(3));
                   break ;
                }
             }
             PlatformDetector$Vendor.closeQuietly(uBufferedRea);
             return str;
          }catch(java.io.IOException e0){
             PlatformDetector$Vendor.closeQuietly(uCloseable);
             return e0;
          }
       }catch(java.io.IOException e0){
          uCloseable = e0;
          goto label_0036 ;
       }
    }
    public static String parseLinuxRedhatReleaseFile(File p0){
       Closeable uCloseable;
       String str = "centos";
       String str1 = null;
       try{
          InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(p0), "utf-8");
          try{
             BufferedReader uBufferedRea = new BufferedReader(inputStreamR);
             String str2 = uBufferedRea.readLine();
             if (str2 != null) {
                str2 = str2.toLowerCase(Locale.US);
                if (!str2.contains(str)) {
                   if (str2.contains("fedora")) {
                      str = "fedora";
                   }else if(str2.contains("red hat enterprise linux")){
                      str = "rhel";
                   }else {
                      PlatformDetector$Vendor.closeQuietly(uBufferedRea);
                      return str1;
                   }
                }
                PlatformDetector$Vendor.closeQuietly(uBufferedRea);
                return str;
             }
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
          uCloseable = str1;
       }
       PlatformDetector$Vendor.closeQuietly(uCloseable);
       return str1;
    }
}
