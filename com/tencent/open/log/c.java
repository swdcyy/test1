package com.tencent.open.log.c;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.File;
import com.tencent.connect.common.Constants;

public class c	// class@000f63
{
    public static int a = 60;
    public static int b = 60;
    public static String c = "OpenSDK.Client.File.Tracer";
    public static String d;
    public static String e;
    public static long f;
    public static int g;
    public static int h;
    public static int i;
    public static String j;
    public static String k;
    public static String l;
    public static int m;
    public static long n;
    public static String o;

    static {
       String separator = File.separator;
       c.d = "Tencent"+separator+"msflogs"+separator+"com"+separator+"tencent"+separator+"mobileqq"+separator;
       c.e = ".log";
       c.f = 0x800000;
       c.g = 0x40000;
       c.h = 1024;
       c.i = 0x2710;
       c.j = "debug.file.blockcount";
       c.k = "debug.file.keepperiod";
       c.l = "debug.file.tracelevel";
       c.m = 24;
       c.n = 0x240c8400;
       StringBuilder str = Constants.APP_SPECIFIC_ROOT+separator;
       c.o = str+"logs";
    }
}
