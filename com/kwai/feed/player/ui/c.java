package com.kwai.feed.player.ui.c;
import sc6.d$a;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.lang.Object;
import sc6.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import b56.z;
import b56.d;
import b56.f0;
import java.util.Iterator;
import java.util.Set;
import com.kwai.feed.player.ui.KwaiXfControlPanel$i;

public class c implements d$a	// class@0014bb
{
    public final KwaiXfControlPanel a;

    public void c(KwaiXfControlPanel p0){
       this.a = p0;
       super();
    }
    public void a(d p0,int p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, c.class, "1")) {
          return;
       }
       if (p2) {
          if (this.a.k == null) {
             return;
          }else {
             long l = z.b(p1, p0.e(), this.a.getPanelDisplayDurationMs());
             c ta = this.a;
             ta.g.e(l, ta.getPanelDisplayDurationMs());
             ta = this.a;
             if (ta.A != null) {
                ta.f.f(l, ta.getPanelDisplayDurationMs());
             }
             KwaiXfControlPanel e = this.a.E;
             if (e != null) {
                Iterator iterator = e.iterator();
                while (iterator.hasNext()) {
                   iterator.next().b(l, this.a.getPanelDisplayDurationMs());
                }
             }
          }
       }
       return;
    }
    public void b(d p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "3")) {
          return;
       }
       if (this.a.k != null) {
          uoc = this.a;
          uoc.j(z.b(p1, p0.e(), this.a.getPanelDisplayDurationMs()), uoc.getPanelDisplayDurationMs());
       }
       this.a.l(1);
       this.a.g.h();
       c ta = this.a;
       ta.H = false;
       KwaiXfControlPanel e = ta.E;
       if (e != null) {
          Iterator iterator = e.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }
       return;
    }
    public void c(d p0,int p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, c.class, "2")) {
          return;
       }
       c ta = this.a;
       ta.H = true;
       ta.o(true);
       return;
    }
}
