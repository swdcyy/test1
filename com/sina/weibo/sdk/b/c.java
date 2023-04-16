package com.sina.weibo.sdk.b.c;
import java.lang.String;
import java.lang.Thread;
import java.lang.StackTraceElement;
import java.lang.StringBuilder;

public final class c	// class@000bb6
{
    public static boolean ai;

    public static void a(String p0,String p1){
       if (c.ai) {
          object oobject = Thread.currentThread().getStackTrace()[3];
          oobject.getFileName()+"\("+oobject.getLineNumber()+"\) "+oobject.getMethodName();
       }
       return;
    }
    public static void b(String p0,String p1){
       if (c.ai) {
          object oobject = Thread.currentThread().getStackTrace()[3];
          oobject.getFileName()+"\("+oobject.getLineNumber()+"\) "+oobject.getMethodName();
       }
       return;
    }
    public static void setLoggerEnable(boolean p0){
       c.ai = p0;
    }
}
