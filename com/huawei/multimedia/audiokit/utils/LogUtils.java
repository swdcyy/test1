package com.huawei.multimedia.audiokit.utils.LogUtils;
import java.lang.Object;
import java.lang.String;
import java.util.Locale;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;

public class LogUtils	// class@0006cf
{

    public void LogUtils(){
       super();
    }
    public static String a(String p0,Object[] p1){
       try{
          return String.format(Locale.ENGLISH, p0.replaceAll("\\{\\}", "%s"), p1);
       }catch(java.util.regex.PatternSyntaxException e3){
       }catch(java.util.IllegalFormatException e3){
       }
       return "log message error : "+e3.getMessage();
    }
    public static void a(String p0,String p1){
    }
    public static void a(String p0,String p1,Object[] p2){
       if (p1 != null) {
          LogUtils.a(p1, p2);
       }
       return;
    }
    public static void b(String p0,String p1){
    }
    public static void b(String p0,String p1,Object[] p2){
       if (p1 != null) {
          LogUtils.a(p1, p2);
       }
       return;
    }
}
