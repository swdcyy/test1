package com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoH5CountDownPresenter$a;
import erd.g;
import com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoH5CountDownPresenter;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;

public final class AwardVideoH5CountDownPresenter$a implements g	// class@001523
{
    public final AwardVideoH5CountDownPresenter b;

    public void AwardVideoH5CountDownPresenter$a(AwardVideoH5CountDownPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AwardVideoH5CountDownPresenter$a.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          p0.q2 = (long)this.b.r;
          PatchProxy.onMethodExit(AwardVideoH5CountDownPresenter$a.class, "1");
       }
       return;
    }
}
