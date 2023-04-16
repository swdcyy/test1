package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.PlayEndControlPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.PlayEndControlPresenter;
import java.lang.Object;
import fy8.b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PlayEndControlPresenter$onBind$1 extends Lambda implements l	// class@0015e9
{
    public final PlayEndControlPresenter this$0;

    public void PlayEndControlPresenter$onBind$1(PlayEndControlPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayEndControlPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0 = p0.a;
       boolean b = true;
       if (p0 != null && (p0 != b && p0 != 2)) {
          if (p0 == 3) {
             p0.y = false;
          }
       }else {
          p0.y = b;
       }
       return;
    }
}
