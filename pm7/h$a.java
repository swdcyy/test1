package pm7.h$a;
import android.os.Handler;
import pm7.h;
import android.os.Looper;
import android.os.Message;
import rm7.a;
import pm7.e;
import pm7.d;
import java.lang.Object;
import java.lang.String;
import pm7.m;
import pm7.b;
import java.util.Iterator;
import java.util.List;
import java.lang.Class;

public class h$a extends Handler	// class@0021d9
{
    public final h a;

    public void h$a(h p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       String str;
       p0 = p0.obj;
       if (p0 != null) {
          int i = 2;
          Object[] objArray = new Object[i];
          objArray[0] = this.a.i.b();
          objArray[1] = p0.b();
          d.b().a("PatchContext", "handleMessage before mCurrentState=%s event:%s", objArray);
          h i1 = this.a.i;
          Iterator iterator = i1.b.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().isInstance(p0)) {
                   str = 1;
                }
             }else {
                str = null;
             }
             if (str) {
                p0.e(i1);
                i1.a(p0, "Process");
             }else {
                i1.a(p0, "Skip");
             }
             objArray = new Object[0];
             this.a.h(p0, objArray);
             Object[] objArray1 = new Object[i];
             objArray1[0] = this.a.i.b();
             objArray1[1] = p0.b();
             d.b().a("PatchContext", "handleMessage after mCurrentState=%s event:%s", objArray1);
             break ;
          }
       }
       return;
    }
}
