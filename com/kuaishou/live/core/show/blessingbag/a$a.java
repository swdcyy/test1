package com.kuaishou.live.core.show.blessingbag.a$a;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer$a;
import com.kuaishou.live.core.show.blessingbag.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.blessingbag.c;
import p91.m;
import p32.f;
import com.kuaishou.live.core.show.blessingbag.c$b;
import p32.g;

public class a$a implements LiveBlessingBagContainer$a	// class@000a05
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       this.a.W8(p0);
       return;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       new c("SURPRISE_LUCKY_BAG_PENDANT", this.a.q).d(new f(p0, p1)).c();
       return;
    }
    public void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
          return;
       }
       new c("SURPRISE_LUCKY_BAG_PENDANT", this.a.q).d(new g(p0, p1)).b();
       return;
    }
}
