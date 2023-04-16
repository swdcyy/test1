package c.t.m.g.bp;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import android.os.Message;
import java.lang.Runnable;
import java.lang.Thread;

public class bp	// class@000bef
{

    public static boolean a(Handler p0){
       Looper looper = (p0 == null)? null: p0.getLooper();
       return bp.a(looper);
    }
    public static boolean a(Handler p0,int p1){
       return bp.a(p0, p1, 0);
    }
    public static boolean a(Handler p0,int p1,int p2,int p3,Object p4){
       boolean b = (p0 == null)? false: bp.a(p0, bp.b(p0, p1, p2, p3, p4));
       return b;
    }
    public static boolean a(Handler p0,int p1,long p2){
       Message message = (p0 == null)? null: p0.obtainMessage(p1);
       return bp.a(p0, message, p2);
    }
    public static boolean a(Handler p0,Message p1){
       return bp.a(p0, p1, 0);
    }
    public static boolean a(Handler p0,Message p1,long p2){
       if (p1 != null && bp.a(p0)) {
          return p0.sendMessageDelayed(p1, p2);
       }
       return false;
    }
    public static boolean a(Handler p0,Runnable p1){
       return bp.a(p0, p1, 0);
    }
    public static boolean a(Handler p0,Runnable p1,long p2){
       if (p1 != null && bp.a(p0)) {
          return p0.postDelayed(p1, p2);
       }
       return false;
    }
    public static boolean a(Looper p0){
       boolean b = (p0 != null && p0.getThread().isAlive())? true: false;
       return b;
    }
    public static Message b(Handler p0,int p1,int p2,int p3,Object p4){
       Message message = (p0 == null)? new Message(): p0.obtainMessage(p1);
       message.what = p1;
       message.arg1 = p2;
       message.arg2 = p3;
       message.obj = p4;
       return message;
    }
    public static void b(Handler p0){
       if (p0 != null) {
          p0.removeCallbacksAndMessages(null);
       }
       return;
    }
    public static void b(Handler p0,int p1){
       if (p0 != null) {
          p0.removeMessages(p1);
       }
       return;
    }
}
