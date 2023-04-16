package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$f;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$m;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;

public class LiveFloatingWindowManager$f implements LiveFloatingWindowManager$m	// class@000b66
{
    public final LiveFloatingWindowManager a;

    public void LiveFloatingWindowManager$f(LiveFloatingWindowManager p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       LiveFloatingWindowManager$f uof = LiveFloatingWindowManager$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uof, "3")) {
          return;
       }
       Iterator iterator = this.a.Q.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public void b(int p0,int p1){
       LiveFloatingWindowManager$f uof = LiveFloatingWindowManager$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uof, "4")) {
          return;
       }
       Iterator iterator = this.a.Q.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1);
       }
       return;
    }
    public void c(LiveFloatingWindowCloseType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowManager$f.class, "1")) {
          return;
       }
       Iterator iterator = this.a.Q.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingWindowManager$f.class, "2")) {
          return;
       }
       Iterator iterator = this.a.Q.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       return;
    }
}
