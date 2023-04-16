package ck0.e$a$a;
import java.lang.Runnable;
import ck0.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.screencapture.ScreenCaptureToolbox;
import ck0.e;
import java.util.Objects;
import java.lang.Integer;
import java.lang.StringBuilder;
import ek0.d;
import lj0.c;
import lj0.d;
import ik0.m;
import com.kuaishou.krn.delegate.KrnDelegate;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import java.util.WeakHashMap;
import java.lang.Boolean;
import java.util.Map;
import java.util.ArrayList;
import qrd.l1;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.krn.apm.screencapture.ScreenCaptureToolbox$a;

public final class e$a$a implements Runnable	// class@0004d4
{
    public final e$a b;

    public void e$a$a(e$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$a$a.class, "1")) {
          return;
       }
       ScreenCaptureToolbox g = ScreenCaptureToolbox.g;
       e d = this.b.a.d;
       Objects.requireNonNull(g);
       ScreenCaptureToolbox screenCaptur = ScreenCaptureToolbox.class;
       if (!PatchProxy.isSupport(screenCaptur) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(d), g, screenCaptur, "6")) {
          if (d <= null) {
             d.i("ScreenCaptureToolbox onFmpFinished: invalid rootTag:"+d);
          }else {
             c uoc = d.b(d);
             if (uoc == null) {
                d.i("ScreenCaptureToolbox onFmpFinished: KrnContext is null for rootTag="+d);
             }else {
                m om = uoc.l();
                if (om != null) {
                   KrnDelegate krnDelegate = om.getKrnDelegate();
                   if (krnDelegate != null) {
                      objArray = krnDelegate.g();
                   }
                }
                if (objArray == null) {
                   d.i("ScreenCaptureToolbox onFmpFinished: ReactRootView is null for rootTag="+d);
                }else {
                   Object c = ScreenCaptureToolbox.c;
                   _monitor_enter(c);
                   g.a().put(objArray, Boolean.TRUE);
                   ArrayList e = ScreenCaptureToolbox.e;
                   ScreenCaptureToolbox.e = new ArrayList();
                   _monitor_exit(c);
                   Iterator iterator = e.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().run();
                   }
                }
             }
          }
       }
       return;
    }
}
