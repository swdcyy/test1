package c.t.m.g.bt;
import java.lang.String;
import java.lang.Throwable;
import c.t.m.g.at;
import c.t.m.g.as;
import c.t.m.g.au;
import android.util.Log;
import java.lang.OutOfMemoryError;

public class bt	// class@000bf7
{

    public static void a(int p0,String p1,String p2){
       bt.a(p1, 3, p2, null);
       if (as.b() != null) {
          as.b().a(p0, p1, p2);
       }
       return;
    }
    public static void a(int p0,String p1,String p2,Throwable p3){
       bt.a(p1, p0, p2, p3);
       if (as.a() != null) {
          as.a().a(p0, p1, p2, p3);
       }
       return;
    }
    public static void a(String p0,int p1,String p2,Throwable p3){
       if (as.c() && p3 != null) {
          Log.getStackTraceString(p3);
       }
       return;
    }
    public static void a(String p0,String p1){
       bt.a(3, p0, p1, null);
    }
    public static void a(String p0,String p1,Throwable p2){
       bt.a(6, p0, p1, p2);
       return;
    }
    public static final boolean a(){
       boolean b = (as.c() || as.a() != null)? true: false;
       return b;
    }
    public static void b(String p0,String p1){
       bt.a(6, p0, p1, null);
    }
    public static void c(String p0,String p1){
       bt.a(1006, p0, p1);
    }
}
