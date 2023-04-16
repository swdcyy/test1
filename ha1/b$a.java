package ha1.b$a;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ha1.b;
import java.util.Iterator;
import java.util.Set;
import java.lang.Integer;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;

public class b$a implements PreLoader$InflateListener	// class@002661
{
    public final int a;

    public void b$a(int p0){
       super();
       this.a = p0;
    }
    public void onFallback(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       Iterator iterator = b.a.iterator();
       while (iterator.hasNext()) {
          b$a ta = this.a;
          if (ta == iterator.next().intValue()) {
             String str = (b.c)? b.a(ta): "";
             b.d0(LiveLiteLogTag.LAYOUT_AX2C, "LiteLayoutInflater.onFallback", "reason", p0, "name", str);
             break ;
          }
       }
       return;
    }
    public void onFinish(int p0,View p1){
    }
    public void onStart(int p0){
    }
}
