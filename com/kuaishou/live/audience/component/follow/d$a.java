package com.kuaishou.live.audience.component.follow.d$a;
import hq5.a;
import com.kuaishou.live.audience.component.follow.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import erd.g;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;

public class d$a implements a	// class@000ad1
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void Wj(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.y5(p0, null);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void y5(int p0,g p1){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       this.b.S8(true, p0, p1, null);
       return;
    }
}
