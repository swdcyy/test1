package com.yxcorp.gifshow.profile.presenter.profile.header.operation.MyProfileAddFriendsPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.MyProfileAddFriendsPresenter$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import brd.t;
import xl8.b;
import s4c.c;
import erd.g;
import crd.b;
import j5c.c;
import s4c.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.x;
import t45.d;
import brd.z;
import s4c.b;
import eda.c;
import s4c.d;
import com.kwai.library.widget.popup.common.c;
import qrd.l1;
import z5c.u;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import android.view.View;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.MyProfileAddFriendsPresenter$a;
import android.view.View$OnClickListener;
import java.lang.Integer;
import wkd.b;
import o3c.l;
import q21.b0;
import z5c.l0;
import com.kwai.framework.model.user.User;
import k2b.e0;
import z5c.y1;
import android.widget.TextView;
import t3c.a;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.profile.model.ButtonStyle;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import zf6.j;
import lnc.a1;
import ekd.m1;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;
import mw4.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.graphics.Typeface;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import android.view.ViewStub;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class MyProfileAddFriendsPresenter extends PresenterV2	// class@0014fa
{
    public int A;
    public View B;
    public a C;
    public ButtonStyle D;
    public final LifecycleObserver E;
    public ViewStub p;
    public TextView q;
    public View r;
    public View s;
    public KwaiImageView t;
    public int u;
    public User v;
    public BaseFragment w;
    public Typeface x;
    public c y;
    public b z;

    public void MyProfileAddFriendsPresenter(){
       super();
       this.E = new MyProfileAddFriendsPresenter$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MyProfileAddFriendsPresenter.class, "5")) {
          return;
       }
       this.w.getLifecycle().addObserver(this.E);
       this.X7(this.z.observable().subscribe(new c(this)));
       this.X7(this.y.e().skip(1).subscribe(new a(this)));
       RxBus f = RxBus.f;
       z a = d.a;
       this.X7(f.f(x.class).observeOn(a).subscribe(new b(this)));
       this.X7(f.f(c.class).observeOn(a).subscribe(new d(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MyProfileAddFriendsPresenter.class, "6")) {
          return;
       }
       u.c(this.C);
       this.w.getLifecycle().removeObserver(this.E);
       return;
    }
    public final void P8(){
       MyProfileAddFriendsPresenter myProfileAdd = MyProfileAddFriendsPresenter.class;
       if (PatchProxy.applyVoid(null, this, myProfileAdd, "2")) {
          return;
       }
       if (this.B == null) {
          return;
       }
       if (HoldoutConfigUtilKt.a()) {
          this.B.setVisibility(4);
       }else {
          this.B.setVisibility(0);
          this.B.setOnClickListener(new MyProfileAddFriendsPresenter$a(this));
       }
       this.R8();
       MyProfileAddFriendsPresenter tA = this.A;
       if (!PatchProxy.isSupport(myProfileAdd) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tA), this, myProfileAdd, "13")) {
          this.X7(b.a(0x37313f08).y(tA).subscribe(b0.b, l0.a));
       }
       if (!this.B.getVisibility() && this.A == null) {
          y1.h(this.w, this.v.getId(), 1, this.A);
       }
       return;
    }
    public final void R8(){
       View[] viewArray;
       String str;
       MyProfileAddFriendsPresenter myProfileAdd = MyProfileAddFriendsPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, myProfileAdd, "7")) {
          return;
       }
       int i = 1;
       int i1 = 8;
       if (HoldoutConfigUtilKt.a()) {
          myProfileAdd = this.q;
          if (myProfileAdd != null) {
             myProfileAdd.setVisibility(i1);
             myProfileAdd = this.B;
             if (myProfileAdd != null) {
                a.d(myProfileAdd);
             }
          }
          viewArray = new View[i];
          viewArray[0] = this.s;
          n.Z(i1, viewArray);
          return;
       }else if(this.D != ButtonStyle.CIRCLE || (!PatchProxy.applyVoid(objArray, this, myProfileAdd, "8") && this.q == null)){
          this.q = new TextView(this.m8().getContext());
          ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-2, -2);
          layoutParams.h = 0;
          layoutParams.e = 0x7f0a3246;
          layoutParams.g = 0x7f0a3246;
          this.q.setLayoutParams(layoutParams);
          this.q.setGravity(17);
          MyProfileAddFriendsPresenter tq1 = this.q;
          tq1.setTextColor(j.d(tq1, R.color.arg_RES_7f061fd5));
          this.q.setTextSize(i, 12.00f);
          this.q.setMinWidth(a1.e(14.00f));
          this.q.setIncludeFontPadding(0);
          this.q.setBackgroundResource(R.drawable.arg_RES_7f081d78);
          m1.f(this.m8(), R.id.header_operation_root_view).addView(this.q);
       }
    label_00a8 :
       int i2 = a.v();
       if (i2 > 0) {
          Activity activity = this.getActivity();
          if (activity instanceof GifshowActivity) {
             a.c(activity, this.B, i2, 0);
          }
          if (this.q != null) {
             View[] viewArray1 = new View[i];
             viewArray1[0] = this.s;
             n.Z(i1, viewArray1);
             this.q.setVisibility(0);
             this.q.setTypeface(this.x);
             MyProfileAddFriendsPresenter tq = this.q;
             if (PatchProxy.isSupport(myProfileAdd)) {
                str = PatchProxy.applyOneRefs(Integer.valueOf(i2), this, myProfileAdd, "9");
                if (str != PatchProxyResult.class) {
                }else if(i2 > 99){
                   str = "99+";
                }else {
                   str = String.valueOf(i2);
                }
             }else {
                goto label_00ef ;
             }
             tq.setText(str);
             y1.h(this.w, this.v.getId(), 2, i2);
          }
       }else {
          myProfileAdd = this.q;
          if (myProfileAdd != null) {
             myProfileAdd.setVisibility(i1);
             myProfileAdd = this.B;
             if (myProfileAdd != null) {
                a.d(myProfileAdd);
             }
          }
          viewArray = new View[i];
          viewArray[0] = this.s;
          n.Z(i1, viewArray);
       }
       g.e(KsLogProfileTag.NEW_FRIEND.appendTag("MyProfileAddFriendsPresenter"), "NewFriendCount: "+i2);
       this.A = i2;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileAddFriendsPresenter.class, "3")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3246);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MyProfileAddFriendsPresenter.class, "4")) {
          return;
       }
       this.v = this.q8(User.class);
       this.w = this.r8("PROFILE_FRAGMENT");
       this.y = this.r8("PROFILE_LOAD_STATE");
       this.z = this.r8("PROFILE_MY_OPERATION_BUTTONS");
       this.u = this.r8("PROFILE_STYLE").intValue();
       return;
    }
}
