package com.kuaishou.live.audience.component.chat.apply.c;
import com.kuaishou.live.audience.component.chat.apply.i$a;
import com.kuaishou.live.audience.component.chat.apply.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import rd1.c0;
import java.util.Objects;
import java.lang.Integer;
import t02.a0;
import com.kwai.framework.model.user.User;
import p91.m;
import px0.i;
import erd.g;
import com.kuaishou.live.common.core.component.follow.cache.c;
import px0.g;

public class c implements i$a	// class@000a65
{
    public final int a;
    public final d b;

    public void c(d p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c0.z(this.b.f.a(), "ABANDON");
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.b.f.a();
       int i = 0x138cd;
       String str = (this.a == i)? "FOLLOW_APPLY": "FUNS_APPLY";
       c0.z(liveStreamPa, str);
       c tb = this.b;
       c ta = this.a;
       Objects.requireNonNull(tb);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(ta), tb, uod, "6")) {
          if (ta == i) {
             tb.d(tb.j.Z2.I(), 232, new i(tb));
          }else if(ta == 0x138ce){
             if (!c.b().c(tb.j.Z2.I().mId)) {
                tb.d(tb.j.Z2.I(), 233, new g(tb));
             }else {
                tb.e();
             }
          }
       }
       return;
    }
}
