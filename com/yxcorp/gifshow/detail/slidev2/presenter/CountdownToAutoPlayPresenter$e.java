package com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$e;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class CountdownToAutoPlayPresenter$e implements g	// class@0018ae
{
    public final CountdownToAutoPlayPresenter b;

    public void CountdownToAutoPlayPresenter$e(CountdownToAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CountdownToAutoPlayPresenter$e.class, "1")) {
       }else {
          Log.g("SlidePlayAutoPlay", "兴趣调节记时"+p0);
          int i = 5;
          if (p0 != null && !p0.longValue() - i) {
             p0 = this.b.p;
             if (p0 != null) {
                p0.L(false);
             }
          }
       }
       return;
    }
}
