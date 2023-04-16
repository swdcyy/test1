package com.vivo.push.util.n;
import com.vivo.push.util.o;
import java.lang.StringBuilder;
import java.lang.String;
import android.os.Process;
import java.lang.Object;
import com.vivo.push.util.p;
import com.vivo.push.e.a;
import android.util.Log;
import java.lang.Throwable;
import android.content.Context;
import com.vivo.push.b.n;
import java.util.ArrayList;
import java.util.Iterator;
import com.vivo.push.o;
import com.vivo.push.a.a;

public final class n implements o	// class@0010bc
{
    public static final String a;

    static {
       n.a = "\("+Process.myPid()+"\)";
    }
    public void n(){
       super();
    }
    public static boolean a(){
       p.a();
       if (a.a().c()) {
          return true;
       }
       return false;
    }
    public final int a(String p0,String p1){
       return Log.e(("VivoPush.").concat(String.valueOf(p0)), n.a+p1);
    }
    public final int a(String p0,String p1,Throwable p2){
       return Log.e(("VivoPush.").concat(String.valueOf(p0)), n.a+p1, p2);
    }
    public final int a(String p0,Throwable p1){
       return Log.e(("VivoPush.").concat(String.valueOf(p0)), Log.getStackTraceString(p1));
    }
    public final String a(Throwable p0){
       return Log.getStackTraceString(p0);
    }
    public final void a(Context p0,String p1){
       if (n.a()) {
          this.a(p0, p1, 0);
       }
       return;
    }
    public final void a(Context p0,String p1,int p2){
       n on = new n();
       on.b(p1);
       on.a(p2);
       if (p2 > 0) {
          this.d("LogController", p1);
       }
       if ((p0.getPackageName()).equals("com.vivo.pushservice")) {
          on.a(true);
          Iterator iterator = a.a().b().iterator();
          while (iterator.hasNext()) {
             a.a(p0, on, iterator.next());
          }
          return;
       }else {
          on.a(false);
          a.a(p0, on, p0.getPackageName());
          return;
       }
    }
    public final int b(String p0,String p1){
       return Log.w(("VivoPush.").concat(String.valueOf(p0)), n.a+p1);
    }
    public final int b(String p0,String p1,Throwable p2){
       if (p.a()) {
          return Log.i(("VivoPush.").concat(String.valueOf(p0)), n.a+p1, p2);
       }
       return -1;
    }
    public final void b(Context p0,String p1){
       if (n.a()) {
          this.a(p0, p1, 1);
       }
       return;
    }
    public final int c(String p0,String p1){
       return Log.d(("VivoPush.").concat(String.valueOf(p0)), n.a+p1);
    }
    public final void c(Context p0,String p1){
       if (n.a()) {
          this.a(p0, p1, 2);
       }
       return;
    }
    public final int d(String p0,String p1){
       if (p.a()) {
          return Log.i(("VivoPush.").concat(String.valueOf(p0)), n.a+p1);
       }
       return -1;
    }
    public final int e(String p0,String p1){
       if (p.a()) {
          return Log.v(("VivoPush.").concat(String.valueOf(p0)), n.a+p1);
       }
       return -1;
    }
}
