package com.kuaishou.live.lite.anchorinfo.LiteRecommendAnchorInfoController$c;
import xc3.l;
import com.kuaishou.live.lite.anchorinfo.LiteRecommendAnchorInfoController;
import java.lang.Object;
import xc3.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;

public final class LiteRecommendAnchorInfoController$c implements l	// class@001e2a
{
    public final LiteRecommendAnchorInfoController a;

    public void LiteRecommendAnchorInfoController$c(LiteRecommendAnchorInfoController p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       k.a(this, p0);
    }
    public void b(float p0){
       k.b(this, p0);
    }
    public void c(float p0){
       LiteRecommendAnchorInfoController$c uoc = LiteRecommendAnchorInfoController$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       uoc = this.a;
       int i = (Float.valueOf(p0).equals(Float.valueOf(0)))? 0: 8;
       uoc.W2(i);
       return;
    }
    public void d(float p0){
       k.d(this, p0);
    }
}
