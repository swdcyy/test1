package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.a$a;
import jta.a;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import le5.f;
import aoc.a;

public class a$a extends a	// class@000f30
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!f.o()) {
          this.a.t.c(p0);
       }
       return;
    }
}
