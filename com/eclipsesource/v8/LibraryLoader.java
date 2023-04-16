package com.eclipsesource.v8.LibraryLoader;
import java.lang.String;
import com.eclipsesource.v8.LibraryLoader$1;
import java.lang.System;
import java.lang.Object;
import com.eclipsesource.v8.PlatformDetector$OS;
import java.lang.Runtime;
import java.lang.Process;
import java.lang.StringBuilder;
import com.eclipsesource.v8.PlatformDetector$Vendor;
import com.eclipsesource.v8.PlatformDetector$Arch;
import java.lang.StringBuffer;
import java.io.File;
import java.io.InputStream;
import java.lang.Class;
import java.io.FileOutputStream;
import java.lang.UnsatisfiedLinkError;
import com.eclipsesource.v8.NativeLibraryLoader;

public class LibraryLoader	// class@000fca
{
    public static final String DELIMITER;
    public static final String SEPARATOR;
    public static final String[] sAndroidNativeLibraries;
    public static final NativeLibraryLoader sAndroidNativeLibraryLoader;
    public static final String[] sAndroidNativeLiteLibraries;

    static {
       String[] stringArray = new String[]{"kwai-v8","kwai-j2v8"};
       LibraryLoader.sAndroidNativeLibraries = stringArray;
       stringArray = new String[]{"kwai-v8-lite","kwai-j2v8-lite"};
       LibraryLoader.sAndroidNativeLiteLibraries = stringArray;
       LibraryLoader.sAndroidNativeLibraryLoader = new LibraryLoader$1();
       LibraryLoader.DELIMITER = System.getProperty("line.separator");
       LibraryLoader.SEPARATOR = System.getProperty("file.separator");
    }
    public void LibraryLoader(){
       super();
    }
    public static void chmod(String p0,String p1){
       if (PlatformDetector$OS.isWindows()) {
          return;
       }
       String[] stringArray = new String[]{"chmod",p0,p1};
       Runtime.getRuntime().exec(stringArray).waitFor();
       return;
    }
    public static String computeLibraryFullName(boolean p0){
       return "lib"+LibraryLoader.computeLibraryShortName(p0)+"."+PlatformDetector$OS.getLibFileExtension();
    }
    public static String computeLibraryShortName(boolean p0){
       String name = (p0 && PlatformDetector$OS.isLinux())? PlatformDetector$Vendor.getName(): null;
       String name1 = PlatformDetector$OS.getName();
       String name2 = PlatformDetector$Arch.getName();
       StringBuilder str = "j2v8";
       name = (name != null)? "-"+name: "";
       return str+name+"-"+name1+"-"+name2;
    }
    public static boolean extract(String p0,String p1,StringBuffer p2){
       File uFile = new File(p0);
       if (uFile.exists()) {
          uFile.delete();
       }
       InputStream resourceAsSt = LibraryLoader.class.getResourceAsStream("/"+p1);
       if (resourceAsSt != null) {
          byte[] uobyteArray = new byte[4096];
          FileOutputStream uFileOutputS = new FileOutputStream(p0);
          int i = resourceAsSt.read(uobyteArray);
          while (i != -1) {
             uFileOutputS.write(uobyteArray, 0, i);
          }
          uFileOutputS.close();
          resourceAsSt.close();
          LibraryLoader.chmod("755", p0);
          if (LibraryLoader.load(p0, p2)) {
             return true;
          }
       }
    label_006d :
       return 0;
    }
    public static boolean extract(String p0,boolean p1,StringBuffer p2){
       String str = LibraryLoader.computeLibraryFullName(p1);
       return LibraryLoader.extract(p0+LibraryLoader.SEPARATOR+str, str, p2);
    }
    public static boolean load(String p0,StringBuffer p1){
       try{
          if (p0.indexOf(LibraryLoader.SEPARATOR) != -1) {
             System.load(p0);
          }else {
             System.loadLibrary(p0);
          }
          return true;
       }catch(java.lang.UnsatisfiedLinkError e2){
          if (!p1.length()) {
             p1 = p1+LibraryLoader.DELIMITER;
          }
          p1+9+e2.getMessage()+LibraryLoader.DELIMITER;
          return false;
       }
    }
    public static void loadAndroidLibraries(NativeLibraryLoader p0){
       if (p0 != null) {
          p0.loadLibraries();
       }else {
          LibraryLoader.sAndroidNativeLibraryLoader.loadLibraries();
       }
       return;
    }
    public static void loadLibrary(String p0,NativeLibraryLoader p1){
       if (PlatformDetector$OS.isAndroid()) {
          LibraryLoader.loadAndroidLibraries(p1);
          return;
       }else {
          StringBuffer str = "";
          boolean b = true;
          if (LibraryLoader.tryLoad(b, str)) {
             return;
          }
          boolean b1 = false;
          if (LibraryLoader.tryLoad(b1, str)) {
             return;
          }
          if (p0 == null) {
             p0 = System.getProperty("java.io.tmpdir");
          }
          if (LibraryLoader.extract(p0, b, str)) {
             return;
          }else if(LibraryLoader.extract(p0, b1, str)){
             return;
          }else {
             throw new UnsatisfiedLinkError("Could not load J2V8 library. Reasons: "+str);
          }
       }
    }
    public static boolean tryLoad(boolean p0,StringBuffer p1){
       String str = LibraryLoader.computeLibraryShortName(p0);
       String str1 = LibraryLoader.computeLibraryFullName(p0);
       String sEPARATOR = LibraryLoader.SEPARATOR;
       String str2 = System.getProperty("user.dir")+sEPARATOR+"jni"+sEPARATOR+str1;
       if (LibraryLoader.load(str1, p1)) {
          return true;
       }
       if (LibraryLoader.load(str, p1)) {
          return true;
       }
       if (new File(str2).exists() && LibraryLoader.load(str2, p1)) {
          return true;
       }
       return false;
    }
}
