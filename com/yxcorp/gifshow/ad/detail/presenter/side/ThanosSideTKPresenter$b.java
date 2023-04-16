package com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter$b;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import x49.n;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter$b$a;
import x49.q;

public final class ThanosSideTKPresenter$b extends a	// class@00169d
{
    public final ThanosSideTKPresenter b;

    public void ThanosSideTKPresenter$b(ThanosSideTKPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, ThanosSideTKPresenter$b.class, "2")) {
          return;
       }
       ThanosSideTKPresenter$b tb = this.b;
       if (tb.y == null) {
          return;
       }
       tb.R8().P();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, ThanosSideTKPresenter$b.class, "1")) {
          return;
       }
       ThanosSideTKPresenter$b tb = this.b;
       if (tb.y == null) {
          return;
       }
       tb.R8().r();
       this.b.R8().c(new ThanosSideTKPresenter$b$a(this));
       return;
    }
}
