package com.yxcorp.gifshow.profile.presenter.profile.header.operation.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewStub;
import android.view.View;
import com.yxcorp.gifshow.profile.widget.DelegateToggleButton;
import android.widget.ToggleButton;
import brd.t;
import j5c.c;
import s4c.e1;
import erd.g;
import z5c.l0;
import crd.b;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.q;
import erd.o;
import s4c.d1;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import t45.d;
import brd.z;
import s4c.f1;
import com.kwai.library.widget.sensormanager.KwaiSensorManager;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.kwai.framework.model.user.User;
import zf6.j;
import lnc.a1;
import java.lang.CharSequence;
import v17.b;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableStringBuilder;
import com.yxcorp.utility.TextUtils;
import lnc.b3;
import android.content.Context;
import android.text.SpannableString;
import ekd.m1;
import s1c.j1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;

public class r extends PresenterV2	// class@001517
{
    public j1 p;
    public User q;
    public BaseFragment r;
    public ProfileParam s;
    public c t;
    public ViewStub u;
    public View v;
    public DelegateToggleButton w;
    public View x;
    public SpannableStringBuilder y;
    public boolean z;

    public void r(){
       super();
       this.z = true;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "4")) {
          return;
       }
       if (this.w == null) {
          this.u.setLayoutResource(R.layout.arg_RES_7f0d15b8);
          View view = this.u.inflate();
          this.v = view;
          this.w = view.findViewById(0x7f0a3d6f);
       }
       this.w.setEnabled(false);
       this.X7(this.t.e().subscribe(new e1(this), l0.a("UserProfileTeenageModeFollowPresenter")));
       this.X7(this.q.observable().distinctUntilChanged(q.b).subscribe(new d1(this), l0.a("UserProfileTeenageModeFollowPresenter")));
       this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new f1(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, r.class, "5")) {
          return;
       }
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, r.class, "11")) {
          return;
       }
       KwaiSensorManager.d().j(this.r.getLifecycle());
       this.w.setShowGravityEffect(false);
       return;
    }
    public final void R8(User p0){
       r tw;
       r or = r.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, or, "6")) {
          return;
       }
       boolean b = false;
       Object[] objArray = null;
       if (p0.isFollowingOrFollowRequesting()) {
          if (!PatchProxy.applyVoid(objArray, this, or, "7")) {
             this.P8();
             tw = this.w;
             tw.setTextColor(j.d(tw, R.color.arg_RES_7f061f94));
             this.w.setBackgroundResource(R.drawable.bar);
             this.w.setText(a1.p(R.string.arg_RES_7f104f05));
             this.z = b;
          }
       }else if(PatchProxy.applyVoid(objArray, this, or, "8")){
          if (!PatchProxy.applyVoid(objArray, this, or, "10")) {
             this.w.setShowGravityEffect(true);
             KwaiSensorManager.d().g(this.r.getLifecycle(), this.w);
          }
          tw = this.w;
          or = PatchProxy.apply(objArray, this, or, "9");
          if (or != PatchProxyResult.class) {
          }else if(TextUtils.x(this.y)){
             SpannableStringBuilder spannableStr = new SpannableStringBuilder();
             b3 uob3 = new b3(this.getContext(), 0x7f0822d2);
             uob3.b(b);
             spannableStr.append(uob3.a());
             spannableStr.append(" ").append(a1.p(R.string.arg_RES_7f100f8f));
             this.y = spannableStr;
          }
          or = this.y;
          tw.setText(or);
          tw = this.w;
          tw.setTextColor(j.d(tw, R.color.arg_RES_7f061ff3));
          this.w.setBackgroundResource(R.drawable.arg_RES_7f08029e);
          this.z = true;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a3d6d);
       this.x = m1.f(p0, 0x7f0a1272);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.p = this.q8(j1.class);
       this.q = this.q8(User.class);
       this.t = this.r8("PROFILE_LOAD_STATE");
       this.r = this.r8("PROFILE_FRAGMENT");
       this.s = this.q8(ProfileParam.class);
       return;
    }
}
