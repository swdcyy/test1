package com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import k2b.h;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import e17.i;
import android.net.Uri$Builder;
import z5c.k0;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;

public final class ProfilePreviewPanelPresenter$b extends m	// class@001275
{
    public final ProfilePreviewPanelPresenter c;

    public void ProfilePreviewPanelPresenter$b(ProfilePreviewPanelPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewPanelPresenter$b.class, str)) {
          return;
       }
       a.p(p0, "v");
       h oh = h.m("3398377", "CHOOSE_PICTURE_BUTTON");
       i3 oi3 = i3.f();
       oi3.c("name", Integer.valueOf(2));
       oh.n(oi3.e());
       oh.i(ProfilePreviewPanelPresenter.P8(this.c));
       ProfilePreviewPanelPresenter t = this.c.t;
       if (t != null && t.getStatus() == 4) {
          i.a(R.style.arg_RES_7f11066a, 0x7f103e9d);
          return;
       }else {
          Uri$Builder uBuilder = new Uri$Builder().scheme("kwai").authority("krn").appendQueryParameter("bundleId", "SocialChooseFeedFromPhoto").appendQueryParameter("componentName", "index").appendQueryParameter("themeStyle", str).appendQueryParameter("bgColor", "#19191E");
          if (!k0.f()) {
             str = "0";
          }
          a.b(b.j(p0.getContext(), uBuilder.appendQueryParameter("enableSinglePhoto", str).toString()), null);
          return;
       }
    }
}
