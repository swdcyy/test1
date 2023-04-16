package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.m$c;
import jta.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public class m$c extends a	// class@00199c
{
    public final m a;

    public void m$c(m p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       m$c uoc = m$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (p0 - 0x3f800000) {
          this.a.R8();
       }
       return;
    }
}
