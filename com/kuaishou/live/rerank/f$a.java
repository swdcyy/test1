package com.kuaishou.live.rerank.f$a;
import jta.a;
import com.kuaishou.live.rerank.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.rerank.LiveRerankLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.rerank.d;

public class f$a extends a	// class@000f68
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!p0 - 0x3f800000) {
          b.P(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankPresenter"), "on sidebar collapse");
          if (this.a.S8()) {
             this.a.s.d();
          }
       }else {
          b.P(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankPresenter"), "on sidebar expand");
          this.a.s.c();
       }
       return;
    }
}
