package ck5.l;
import java.lang.Runnable;
import com.kwai.emotionsdk.core.EmotionManagerDelegate;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.ref.WeakReference;
import ck5.r;

public final class l implements Runnable	// class@0006de
{
    public final EmotionManagerDelegate b;

    public void l(EmotionManagerDelegate p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       Iterator iterator = this.b.f().iterator();
       while (iterator.hasNext()) {
          r or = iterator.next().get();
          if (or != null) {
             or.onInitSuccess();
          }
       }
       return;
    }
}
