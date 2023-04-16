package com.kuaishou.live.core.show.gift.a;
import lp3.e;
import vq5.d;
import hf3.a;
import android.content.Context;
import java.lang.Object;
import e92.c;
import xp5.g;
import java.lang.Class;
import lp3.c;
import n91.f;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public class a	// class@000bb6
{
    public final Context a;
    public final d b;
    public e c;
    public g d;
    public f e;
    public a f;
    public final g g;

    public void a(e p0,d p1,a p2,Context p3){
       super();
       this.g = new c(this);
       this.a = p3;
       this.c = p0;
       this.f = p2;
       this.b = p1;
       this.d = this.a(g.class);
       this.e = this.a(f.class);
    }
    public final c a(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.c.a(p0);
       }catch(java.lang.Exception e3){
          b.g0(LiveLogTag.GIFT, "[LiveGiftCommonRouterHandler][getServiceSafely]e:", e3);
          return null;
       }
    }
}
