package com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import z5c.y1;
import k2b.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import k2b.e0;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import java.util.Objects;
import lnc.a1;
import s1c.o;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import kotlin.jvm.internal.a;
import z5c.l3;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.lang.ref.WeakReference;
import nsd.u;
import y8c.t;
import l3c.a0;
import com.yxcorp.gifshow.profile.http.l;
import qvb.a;
import g9c.d;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public final class MyProfileEmptyGuideTipPresenter$c implements View$OnClickListener	// class@001409
{
    public final MyProfileEmptyGuideTipPresenter b;

    public void MyProfileEmptyGuideTipPresenter$c(MyProfileEmptyGuideTipPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       MyProfileEmptyGuideTipPresenter$c tb;
       SharedPreferences a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MyProfileEmptyGuideTipPresenter myProfileEmp = MyProfileEmptyGuideTipPresenter.class;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MyProfileEmptyGuideTipPresenter$c.class, "1")) {
          return;
       }
       RecyclerFragment recyclerFrag = this.b.X8();
       User mId = this.b.a9().mUser.mId;
       l3 obj = null;
       if (!PatchProxy.applyVoidTwoRefs(recyclerFrag, mId, obj, y1.class, "128")) {
          h oh = h.m("3690316", "CLOSE_BUTTON");
          oh.c(b0.g(mId));
          oh.i(recyclerFrag);
       }
       ProfilePostEmptyCardUtils e = ProfilePostEmptyCardUtils.e;
       if (e.d()) {
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(obj, e, ProfilePostEmptyCardUtils.class, "19")) {
             if (!e.g()) {
                o.v(a1.k());
             }
             o.u(1);
          }
          tb = this.b;
          Objects.requireNonNull(tb);
          myProfileEmp = PatchProxy.apply(obj, tb, myProfileEmp, "12");
          if (myProfileEmp != patchProxyRe) {
          }else {
             myProfileEmp = tb.u;
             if (myProfileEmp == null) {
                a.S("mRxPageBus");
             }
          }
          obj = new l3(-1, this.b.a9().mUserProfileResponse, null, false, false, 28, null);
          myProfileEmp.b("PROFILE_POST_DEFAULT_CARD_SHOW", "MAIN_KEY", tb);
       }else {
          tb = this.b;
          Objects.requireNonNull(tb);
          myProfileEmp = PatchProxy.apply(obj, tb, myProfileEmp, "4");
          if (myProfileEmp != patchProxyRe) {
          }else {
             myProfileEmp = tb.q;
             if (myProfileEmp == null) {
                a.S("mTipsHelper");
             }
          }
          if (myProfileEmp instanceof a0) {
             obj = myProfileEmp;
          }
          if (obj != null) {
             if (!this.b.Y8().getCount()) {
                this.b.h9(obj);
             }else {
                this.b.X8().ia().l1(this.b.W8());
                obj.p();
             }
          }
       }
       a = o.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putLong(b.d("user")+"profile_empty_user_guide_last_shown_time", System.currentTimeMillis());
       g.a(uEditor);
       SharedPreferences$Editor uEditor1 = a.edit();
       uEditor1.putInt(b.d("user")+"profile_empty_user_guide_close_times", (o.i() + 1));
       g.a(uEditor1);
       PatchProxy.onMethodExit(MyProfileEmptyGuideTipPresenter$c.class, "1");
       return;
    }
}
