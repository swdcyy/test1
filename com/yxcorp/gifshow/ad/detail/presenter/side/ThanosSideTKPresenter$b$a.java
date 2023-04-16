package com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter$b$a;
import x49.q;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter$b;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import yx.j0;
import com.yxcorp.gifshow.ad.detail.presenter.side.ThanosSideTKPresenter;
import rf5.u;

public final class ThanosSideTKPresenter$b$a implements q	// class@00169c
{
    public final ThanosSideTKPresenter$b a;

    public void ThanosSideTKPresenter$b$a(ThanosSideTKPresenter$b p0){
       this.a = p0;
       super();
    }
    public void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosSideTKPresenter$b$a.class, "2")) {
          return;
       }
       a.p(p0, "e");
       j0.b("ThanosSideTKPresenter", "onRenderFailed ", p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ThanosSideTKPresenter$b$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("ThanosSideTKPresenter", "onRenderSuccess", objArray);
       ThanosSideTKPresenter$b b = this.a.b;
       ThanosSideTKPresenter u = b.u;
       if (u == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       b.V8(u.q());
       return;
    }
}
