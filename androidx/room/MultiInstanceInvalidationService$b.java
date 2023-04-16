package androidx.room.MultiInstanceInvalidationService$b;
import androidx.room.v$a;
import androidx.room.MultiInstanceInvalidationService;
import androidx.room.u;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class MultiInstanceInvalidationService$b extends v$a	// class@000944
{
    public final MultiInstanceInvalidationService a;

    public void MultiInstanceInvalidationService$b(MultiInstanceInvalidationService p0){
       this.a = p0;
       super();
    }
    public void B0(u p0,int p1){
       MultiInstanceInvalidationService d = this.a.d;
       _monitor_enter(d);
       this.a.d.unregister(p0);
       this.a.c.remove(Integer.valueOf(p1));
       _monitor_exit(d);
    }
    public void r1(int p0,String[] p1){
       MultiInstanceInvalidationService d = this.a.d;
       _monitor_enter(d);
       String str = this.a.c.get(Integer.valueOf(p0));
       if (str == null) {
          _monitor_exit(d);
          return;
       }else {
          int i = this.a.d.beginBroadcast();
          int i1 = 0;
          while (i1 < i) {
             try{
                int i2 = this.a.d.getBroadcastCookie(i1).intValue();
                String str1 = this.a.c.get(Integer.valueOf(i2));
                if (p0 != i2 && str.equals(str1)) {
                   this.a.d.getBroadcastItem(i1).I0(p1);
                }
             label_0054 :
                i1 = i1 + 1;
             }catch(android.os.RemoteException e0){
             }
          }
          this.a.d.finishBroadcast();
          _monitor_exit(d);
          return;
       }
    }
    public int x0(u p0,String p1){
       int i = 0;
       if (p1 == null) {
          return i;
       }
       MultiInstanceInvalidationService d = this.a.d;
       _monitor_enter(d);
       MultiInstanceInvalidationService$b ta = this.a;
       int i1 = ta.b + 1;
       ta.b = i1;
       if (ta.d.register(p0, Integer.valueOf(i1))) {
          this.a.c.put(Integer.valueOf(i1), p1);
          _monitor_exit(d);
          return i1;
       }else {
          MultiInstanceInvalidationService$b ta1 = this.a;
          ta1.b = ta1.b - 1;
          _monitor_exit(d);
          return i;
       }
    }
}
