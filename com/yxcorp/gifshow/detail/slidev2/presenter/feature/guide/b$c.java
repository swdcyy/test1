package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b$c;
import jd5.i;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import java.lang.Runnable;
import ekd.k1;

public class b$c implements i	// class@001984
{
    public final b a;

    public void b$c(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       NasaFeatureGuideManager.f().q(false);
       k1.m(this.a.I);
       return;
    }
    public void b(int p0,int p1){
    }
    public void c(){
    }
}
