package com.kwai.video.krtc.rtcengine.internal.q;
import com.kwai.video.krtc.observers.AryaLogObserver;
import java.lang.String;

public class q	// class@00088f
{
    public static int a = 0;
    public static int b = 10240;
    public static String c = "";
    public static int d = 3;
    public static boolean e;
    public static AryaLogObserver f;

    public static int a(int p0){
       q.a = p0;
       return 0;
    }
    public static int a(AryaLogObserver p0){
       q.f = p0;
       return 0;
    }
    public static int a(String p0){
       q.c = p0;
       return 0;
    }
    public static int a(boolean p0){
       q.e = p0;
       return 0;
    }
    public static String a(){
       return q.c;
    }
    public static int b(){
       return q.b;
    }
    public static int b(int p0){
       q.b = p0;
       return 0;
    }
    public static int c(){
       return q.a;
    }
    public static int c(int p0){
       q.d = p0;
       return 0;
    }
    public static int d(){
       return q.d;
    }
    public static AryaLogObserver e(){
       return q.f;
    }
    public static boolean f(){
       return q.e;
    }
}
