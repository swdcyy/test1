package cia.w$b;
import df5.b;
import java.util.Set;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import vy6.a;

public final class w$b implements b	// class@00051a
{
    public final WeakReference a;

    public void w$b(Set p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void a(QPhoto p0){
    }
    public void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w$b.class, "1")) {
          return;
       }
       if (this.a.get() != null) {
          Iterator iterator = this.a.get().iterator();
          while (iterator.hasNext()) {
             iterator.next().i2();
          }
       }
       return;
    }
    public void c(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w$b.class, "2")) {
          return;
       }
       if (this.a.get() != null) {
          Iterator iterator = this.a.get().iterator();
          while (iterator.hasNext()) {
             iterator.next().F1();
          }
       }
       return;
    }
}
