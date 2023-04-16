package c.t.m.g.ed;
import android.content.Context;
import java.lang.String;
import java.io.File;
import c.t.m.g.dn;
import java.lang.StringBuilder;
import java.lang.Thread;
import java.lang.Throwable;
import android.util.Log;

public class ed	// class@000c66
{
    public static boolean a;
    public static dn b;

    public static void a(Context p0){
       if (ed.a) {
          ed.b = new dn(p0, p0.getExternalFilesDir("t_log"));
       }
       return;
    }
    public static void a(String p0){
       ed.a("#", 4, p0);
    }
    public static void a(String p0,int p1,String p2){
       if (ed.a && p2 != null) {
          dn b = ed.b;
          if (b != null) {
             b.a(p0, p1, Thread.currentThread().getName()+","+p2);
          }
       }
       return;
    }
    public static void a(String p0,String p1){
       ed.a(p0, 4, p1);
    }
    public static void a(String p0,String p1,Throwable p2){
       ed.a(p0, 6, p1+" exception: "+Log.getStackTraceString(p2));
    }
    public static void b(String p0,String p1){
       ed.a(p0, 6, p1);
    }
}
