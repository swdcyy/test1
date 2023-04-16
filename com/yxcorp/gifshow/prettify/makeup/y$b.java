package com.yxcorp.gifshow.prettify.makeup.y$b;
import com.yxcorp.gifshow.prettify.makeup.m$a;
import com.yxcorp.gifshow.prettify.makeup.y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.prettify.makeup.d;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import p0c.f;
import brd.t;
import f1c.b1;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class y$b implements m$a	// class@0011a1
{
    public final y a;

    public void y$b(y p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y$b.class, "1")) {
          return;
       }
       y$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, y.class, "33")) {
          ta.X7(d.a().c(ta.q.h(), ta.q.e(), ta.q.a(), ta.q.c()).subscribe(new b1(ta)));
       }
       return;
    }
}
