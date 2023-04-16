package com.kuaishou.live.gzone.v2.activity.c$e;
import c77.n;
import com.kuaishou.live.gzone.v2.activity.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import c77.j;
import java.util.Objects;
import w53.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.view.View;
import com.kuaishou.live.gzone.v2.activity.LiveGzoneActivityIconTab;

public class c$e extends n	// class@001cb7
{
    public final c d;

    public void c$e(c p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$e.class, "1")) {
          return;
       }
       c$e td = this.d;
       if (td.A == null) {
          td.A = new HashMap();
       }
       j oj = this.d.A.get(this.a);
       if (oj == null) {
          oj = new j(this.a, this.c, this.b);
          this.d.A.put(this.a, oj);
       }else {
          oj.q = this.c;
          oj.r = this.b;
       }
       c$e td1 = this.d;
       Objects.requireNonNull(td1);
       if (!PatchProxy.applyVoidOneRefs(oj, td1, c.class, "6")) {
          int i = td1.C.j();
          int i1 = 0;
          while (i1 < i) {
             PagerSlidingTabStrip$d uod = td1.C.b(i);
             if (uod.b() instanceof LiveGzoneActivityIconTab) {
                uod.b().setIcon(oj.q);
                uod.b().setName(oj.r);
             }
             i1 = i1 + 1;
          }
       }
       return;
    }
}
