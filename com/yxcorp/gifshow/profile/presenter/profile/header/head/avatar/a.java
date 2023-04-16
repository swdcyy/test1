package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import mz6.b;
import android.app.Activity;
import android.content.Context;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.User;
import lnc.a1;
import android.text.SpannableString;
import java.lang.CharSequence;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.a$b;
import mz6.b$d;
import o4c.a;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import android.view.View;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.a$a;
import android.view.View$OnClickListener;
import ekd.m1;
import o4c.b;
import android.view.View$OnLongClickListener;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;

public class a extends PresenterV2	// class@0014e4
{
    public ProfileParam p;
    public User q;
    public BaseProfileFragment r;

    public void a(){
       super();
    }
    public final void P8(boolean p0,boolean p1){
       b$d uod;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "5")) {
          return;
       }
       b uob = new b(this.getActivity());
       if (p0) {
          String str = "ID:"+this.q.getId();
          SpannableString spannableStr = new SpannableString(str+" "+a1.p(0x7f1005cd));
          a$b uob1 = new a$b(a1.a(0x7f061c1a), a1.a(0x7f061c32), a1.d(0x7f070f89), a1.e(2.00f), a1.e(4.00f));
          spannableStr.setSpan(v3, (str.length() + 1), spannableStr.length(), 17);
          uod = new b$d(spannableStr, null, -1);
          uod.e(R.string.arg_RES_7f1005cd);
          uob.a(uod);
       }
       if (p1) {
          uod = new b$d(0x7f1031c8, -1, -1);
          uod.e(R.string.arg_RES_7f1031c8);
          uob.a(uod);
       }
       uob.l(new a(this));
       uob.q();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       m1.a(p0, new a$a(this), R.id.avatar);
       m1.d(p0, new b(this), R.id.avatar);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.p = this.q8(ProfileParam.class);
       this.q = this.q8(User.class);
       this.r = this.r8("PROFILE_FRAGMENT");
       return;
    }
}
