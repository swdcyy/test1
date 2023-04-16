package c98.h;
import java.lang.Runnable;
import com.mini.guide.GuideMiniManagerImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import c98.i;

public class h implements Runnable	// class@0003cb
{
    public final boolean b;
    public final GuideMiniManagerImpl c;

    public void h(GuideMiniManagerImpl p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       Iterator iterator = this.c.c.iterator();
       while (iterator.hasNext()) {
          i oi = iterator.next();
          if (oi != null) {
             oi.a(this.b);
          }
       }
       return;
    }
}
