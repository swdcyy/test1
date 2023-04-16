package com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter$a;
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
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;

public final class ProfilePreviewPanelPresenter$a extends m	// class@001274
{
    public final ProfilePreviewPanelPresenter c;

    public void ProfilePreviewPanelPresenter$a(ProfilePreviewPanelPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewPanelPresenter$a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       h oh = h.m("3398377", "CHOOSE_PICTURE_BUTTON");
       i3 oi3 = i3.f();
       oi3.c("name", Integer.valueOf(1));
       oh.n(oi3.e());
       oh.i(ProfilePreviewPanelPresenter.P8(this.c));
       ProfilePreviewPanelPresenter t = this.c.t;
       if (t != null && t.getStatus() == 4) {
          i.a(R.style.arg_RES_7f11066a, 0x7f103e9d);
          return;
       }else {
          this.c.W8(ImageSelectSupplier$Type.GALLERY);
          return;
       }
    }
}
