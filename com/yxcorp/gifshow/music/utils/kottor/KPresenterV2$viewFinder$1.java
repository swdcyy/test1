package com.yxcorp.gifshow.music.utils.kottor.KPresenterV2$viewFinder$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.music.utils.kottor.KPresenterV2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;

public final class KPresenterV2$viewFinder$1 extends Lambda implements p	// class@002099
{
    public final KPresenterV2 this$0;

    public void KPresenterV2$viewFinder$1(KPresenterV2 p0){
       this.this$0 = p0;
       super(2);
    }
    public final View invoke(PresenterV2 p0,int p1){
       if (PatchProxy.isSupport2(KPresenterV2$viewFinder$1.class, "1")) {
          Object obj = PatchProxy.applyTwoRefsWithListener(p0, Integer.valueOf(p1), this, KPresenterV2$viewFinder$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$receiver");
       PatchProxy.onMethodExit(KPresenterV2$viewFinder$1.class, "1");
       return this.this$0.k8(p1);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
}
