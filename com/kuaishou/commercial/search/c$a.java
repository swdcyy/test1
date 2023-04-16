package com.kuaishou.commercial.search.c$a;
import d6a.a;
import com.kuaishou.commercial.search.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import tw.e;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class c$a extends a	// class@00154c
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       c$a tb = this.b;
       tb.u = false;
       if (!e.f(tb.p)) {
          this.b.r.getDetailPlayConfig().setContinuePlayStrategy(2);
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "2")) {
          return;
       }
       this.b.u = true;
       return;
    }
}
