package com.kuaishou.recruit.live.explain.audience.c$a;
import kt4.q;
import com.kuaishou.recruit.live.explain.audience.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.recruit.live.explain.audience.d;
import java.util.List;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelDisplay;
import lp3.e;
import lp3.c;
import lp3.b;

public class c$a implements q	// class@000ec3
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void Nd(String p0,boolean p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       c a = this.b.A;
       Objects.requireNonNull(a);
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && (!PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), a, uod, "2") && a.i != null)) {
          if (p1) {
             a.l.add(p0);
          }
          a.a(a.g, a.i);
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
}
