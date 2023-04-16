package com.kwai.performance.stability.policy._Patrons;
import java.lang.String;
import java.util.regex.Pattern;
import com.yxcorp.utility.AbiUtil;
import com.kwai.performance.stability.policy.a$a;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.System;
import java.lang.Object;
import java.util.Timer;
import com.kwai.performance.stability.policy._Patrons$a;
import java.util.TimerTask;
import android.os.Build$VERSION;
import android.os.Process;
import java.io.FileInputStream;
import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.Integer;

public class _Patrons	// class@00127e
{
    public static final Pattern a;
    public static final float b;
    public static a$a c;
    public static Timer d;
    public static boolean e;
    public static long f;
    public static final AtomicInteger g;
    public static b h;

    static {
       _Patrons.a = Pattern.compile("[^0-9]");
       float f = (AbiUtil.c())? 0x4f800000: 0x4f400000;
       _Patrons.b = f;
       _Patrons.c = new a$a();
       _Patrons.d = null;
       _Patrons.e = false;
       _Patrons.g = new AtomicInteger(false);
       if (_Patrons.d()) {
          System.loadLibrary("dalvik-heap-trimmer");
          _Patrons.e = true;
       }
    }
    public void _Patrons(){
       super();
    }
    public static native int __init(boolean p0,boolean p1,boolean p2);
    public static synchronized int a(){
       _monitor_enter(_Patrons.class);
       if (!_Patrons.d() || !_Patrons.e) {
          _monitor_exit(_Patrons.class);
          return 2001;
       }else {
          a$a c = _Patrons.c;
          int i = _Patrons.__init(true, c.a, c.g);
          if (i) {
             _monitor_exit(_Patrons.class);
             return i;
          }else {
             long l = _Patrons.getCurrentRegionSpaceSize() / 0x100000;
             _Patrons.f = l;
             long l1 = 0;
             if (l - l1 <= 0 || l - 1024 > 0) {
                _monitor_exit(_Patrons.class);
                return 2002;
             }else {
                a$a c1 = _Patrons.c;
                if (l - (long)c1.f < 0) {
                   _monitor_exit(_Patrons.class);
                   return 2003;
                }else if(c1.b != null){
                   if (_Patrons.e() - l1 < 0) {
                      _monitor_exit(_Patrons.class);
                      return 1001;
                   }else {
                      _Patrons.g.set(0);
                      _Patrons.b(_Patrons.c.e);
                   }
                }
                _monitor_exit(_Patrons.class);
                return 0;
             }
          }
       }
    }
    public static void b(int p0){
       if (_Patrons.c.b != null) {
          Timer d = _Patrons.d;
          if (d != null) {
             d.cancel();
             _Patrons.d = null;
          }
          Timer timer = new Timer();
          _Patrons.d = timer;
          long l = 1000 * (long)p0;
          timer.schedule(new _Patrons$a(), l, l);
       }
       return;
    }
    public static String c(boolean p0){
       if (_Patrons.e) {
          return _Patrons.dumpLogs(p0);
       }
       return "can not dump logs without native libs";
    }
    public static boolean d(){
       boolean sDK_INT = Build$VERSION.SDK_INT;
       sDK_INT = (sDK_INT >= 26 && (sDK_INT <= 30 && !Process.is64Bit()))? true: false;
       return sDK_INT;
    }
    public static native String dumpLogs(boolean p0);
    public static long e(){
       long l = -1;
       try{
          FileInputStream uFileInputSt = new FileInputStream("/proc/"+Process.myPid()+"/status");
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(uFileInputSt));
          while (true) {
             String str = uBufferedRea.readLine();
             if (str != null) {
                str = str.toLowerCase();
                if (str.contains("vmsize")) {
                   l = (long)Integer.parseInt((_Patrons.a.matcher(str).replaceAll("")).trim()) * 1024;
                }
             }
             uFileInputSt.close();
             uBufferedRea.close();
             break ;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static void f(){
       if (_Patrons.c.b != null) {
          Timer d = _Patrons.d;
          if (d != null) {
             d.cancel();
             _Patrons.d = null;
          }
       }
       _Patrons.c.b = false;
       return;
    }
    public static native long getCurrentRegionSpaceSize();
    public static native boolean shrinkRegionSpace(int p0);
}
