package com.yxcorp.gifshow.prettify.makeup.d0;
import ub.a;
import com.yxcorp.gifshow.prettify.makeup.b0;
import com.kwai.feature.post.api.componet.prettify.makeup.model.RecoSuiteGroup;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import n1c.d;
import bd.c;

public class d0 extends a	// class@001172
{
    public final RecoSuiteGroup b;
    public final b0 c;

    public void d0(b0 p0,RecoSuiteGroup p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d0.class, "1")) {
          return;
       }
       this.c.p.b();
       if (this.b.getRecoIndex() >= 0 && p1 instanceof c) {
          this.c.p.c(p1);
       }
       return;
    }
}
