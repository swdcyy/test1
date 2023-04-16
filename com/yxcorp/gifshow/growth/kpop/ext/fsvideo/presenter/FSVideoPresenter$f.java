package com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$f;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import toa.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.kpop.ext.model.VideoConfig;
import java.lang.CharSequence;
import zsd.u;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qrd.l1;
import k2b.u1;

public final class FSVideoPresenter$f implements b$b	// class@001404
{
    public final FSVideoPresenter b;

    public void FSVideoPresenter$f(FSVideoPresenter p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       FSVideoPresenter$f uof = FSVideoPresenter$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "1")) {
          return;
       }
       if (p0 == 6) {
          b b = b.b;
          Activity activity = this.b.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          FSVideoPresenter h = this.b.H;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidTwoRefs(activity, h, b, b.class, "2")) {
             a.p(activity, "iLogPage");
             a.p(h, "config");
             if (!u.S1(h.getAction2VideoFinish())) {
                ShowMetaData showMetaData = new ShowMetaData();
                showMetaData.setLogPage(activity);
                showMetaData.setType(8);
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = h.getAction2VideoFinish();
                showMetaData.setElementPackage(uElementPack);
                u1.B0(showMetaData);
             }
          }
          this.b.R8("complete");
       }
       return;
    }
}
