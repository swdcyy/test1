package com.kuaishou.live.lite.like.c$a;
import com.kuaishou.live.common.core.component.like.count.b$b;
import com.kuaishou.live.lite.like.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.google.gson.JsonElement;
import wb3.b;
import java.lang.Throwable;
import com.kuaishou.live.common.core.component.like.count.b;
import com.kuaishou.live.common.core.component.like.count.LiveLikeResponse;

public class c$a implements b$b	// class@0009ee
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       c$a ta = this.a;
       b.a(ta.a, 1, ta.b, ta.k, null);
       return;
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "3")) {
          return;
       }
       c$a ta = this.a;
       b.a(ta.a, 8, ta.b, ta.k, ta.c.a());
       return;
    }
    public void c(LiveLikeResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       c$a ta = this.a;
       b.a(ta.a, 7, ta.b, ta.k, ta.c.a());
       return;
    }
}
