package com.eclipsesource.v8.PlatformDetector;
import java.lang.Object;
import java.lang.String;
import java.util.Locale;
import java.lang.Character;
import java.lang.CharSequence;

public class PlatformDetector	// class@000fd3
{

    public void PlatformDetector(){
       super();
    }
    public static String normalize(String p0){
       if (p0 == null) {
          return "";
       }
       return (p0.toLowerCase(Locale.US)).replaceAll("[^a-z0-9]+", "");
    }
    public static String normalizeArch(String p0){
       p0 = PlatformDetector.normalize(p0);
       if (p0.matches("^\(x8664|amd64|ia32e|em64t|x64\)$")) {
          return "x86_64";
       }
       if (p0.matches("^\(x8632|x86|i[3-6]86|ia32|x32\)$")) {
          return "x86_32";
       }
       if (p0.matches("^\(ia64|itanium64\)$")) {
          return "itanium_64";
       }
       if (p0.matches("^\(sparc|sparc32\)$")) {
          return "sparc_32";
       }
       if (p0.matches("^\(sparcv9|sparc64\)$")) {
          return "sparc_64";
       }
       if (p0.matches("^\(arm|arm32\)$") || p0.startsWith("armv7")) {
          return "arm_32";
       }
       if (("aarch64").equals(p0) || p0.startsWith("armv8")) {
          return "aarch_64";
       }
       if (p0.matches("^\(ppc|ppc32\)$")) {
          return "ppc_32";
       }
       if (("ppc64").equals(p0)) {
          return "ppc_64";
       }
       if (("ppc64le").equals(p0)) {
          return "ppcle_64";
       }
       if (("s390").equals(p0)) {
          return "s390_32";
       }
       if (("s390x").equals(p0)) {
          return "s390_64";
       }
       return "unknown";
    }
    public static String normalizeOs(String p0){
       p0 = PlatformDetector.normalize(p0);
       String str = "aix";
       if (p0.startsWith(str)) {
          return str;
       }
       str = "hpux";
       if (p0.startsWith(str)) {
          return str;
       }
       str = "os400";
       if (p0.startsWith(str) && (p0.length() <= 5 || !Character.isDigit(p0.charAt(5)))) {
          return str;
       }
       str = "android";
       if (p0.startsWith(str)) {
          return str;
       }
       str = "linux";
       if (p0.startsWith(str)) {
          return str;
       }
       str = "nacl";
       if (p0.startsWith(str)) {
          return str;
       }
       str = "macosx";
       if (p0.startsWith(str) || p0.startsWith("osx")) {
          return str;
       }
       str = "freebsd";
       if (p0.startsWith(str)) {
          return str;
       }
       str = "openbsd";
       if (p0.startsWith(str)) {
          return str;
       }
       str = "netbsd";
       if (p0.startsWith(str)) {
          return str;
       }
       if (p0.startsWith("solaris") || p0.startsWith("sunos")) {
          return "sunos";
       }
       if (p0.startsWith("windows")) {
          return "windows";
       }
       return "unknown";
    }
    public static String normalizeOsReleaseValue(String p0){
       return (p0.trim()).replace("\"", "");
    }
}
