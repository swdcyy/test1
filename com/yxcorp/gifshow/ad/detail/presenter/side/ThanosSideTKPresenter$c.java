package com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter$c;
import jta.a;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public final class ThanosSideTKPresenter$c extends a	// class@00169e
{
    public final ThanosSideTKPresenter a;

    public void ThanosSideTKPresenter$c(ThanosSideTKPresenter p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       ThanosSideTKPresenter$c uoc = ThanosSideTKPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.V8(p0);
       return;
    }
}
