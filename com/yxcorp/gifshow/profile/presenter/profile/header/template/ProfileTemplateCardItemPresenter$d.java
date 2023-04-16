package com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import z5c.y1;
import z5c.b3;
import dx5.h$a;
import java.util.Objects;
import java.lang.Integer;
import java.util.Iterator;
import java.util.List;
import dx5.h;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonStatusInfo;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonInfo;
import java.lang.Iterable;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;

public final class ProfileTemplateCardItemPresenter$d extends m	// class@001545
{
    public final ProfileTemplateCardItemPresenter c;
    public final ProfileTemplateCard d;

    public void ProfileTemplateCardItemPresenter$d(ProfileTemplateCardItemPresenter p0,ProfileTemplateCard p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       List a;
       Iterator iterator;
       h oh;
       ProfileTemplateCard obj;
       ProfileTemplateCard$ButtonInfo mButtonStatu;
       Iterator iterator1;
       Object obj1;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileTemplateCardItemPresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "v");
       Activity activity = this.c.getActivity();
       String str = null;
       if (!activity instanceof GifshowActivity) {
          activity = str;
       }
       if (activity != null) {
          ProfileTemplateCardItemPresenter p = this.c.p;
          if (p == null) {
             a.S("mBaseFragment");
          }
          y1.X(p, ProfileTemplateCardItemPresenter.P8(this.c), ProfileTemplateCardItemPresenter.S8(this.c), this.c.B, 1);
          b3 b = b3.b;
          String str1 = ProfileTemplateCardItemPresenter.S8(this.c);
          ProfileTemplateCard profileTempl = ProfileTemplateCardItemPresenter.P8(this.c);
          h$a uoa = this.c.X8();
          ProfileTemplateCardItemPresenter c = this.c.C;
          Objects.requireNonNull(b);
          if (PatchProxy.isSupport(b3.class)) {
             Object[] objArray = new Object[]{activity,str1,profileTempl,uoa,Integer.valueOf(c)};
             if (!PatchProxy.applyVoid(objArray, b, b3.class, "3")) {
             }
          }else {
          }
       }
    }
}
