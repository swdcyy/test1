package com.kwai.live.gzone.accompanyplay.anchor.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import java.util.List;
import android.widget.ImageView;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyMemberInfo;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import com.kwai.live.gzone.accompanyplay.anchor.y$c;
import java.lang.Runnable;
import ekd.k1;
import e17.i;
import com.kwai.library.widget.popup.common.c;
import android.app.Activity;
import java.lang.Boolean;
import j37.b;
import j37.a;
import brd.t;
import com.yxcorp.gifshow.fragment.ObservableBox;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gr8.b;
import brd.x;
import com.kwai.live.gzone.accompanyplay.anchor.y$f;
import sfc.a;
import erd.g;
import crd.b;
import java.lang.Integer;
import android.view.View;
import u07.t$a;
import u07.f;
import com.kwai.live.gzone.accompanyplay.anchor.y$e;
import u07.u;
import com.kwai.live.gzone.accompanyplay.anchor.y$d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import ekd.m1;
import com.kwai.live.gzone.accompanyplay.anchor.y$a;
import android.view.View$OnClickListener;
import android.content.Context;
import d61.f0;
import com.kwai.live.gzone.accompanyplay.anchor.y$b;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment;
import k37.p1;

public class y extends PresenterV2	// class@000b45
{
    public c A;
    public LiveGzoneAnchorAccompanyFleetStateFragment B;
    public p1 C;
    public KwaiBindableImageView p;
    public KwaiBindableImageView q;
    public KwaiBindableImageView r;
    public TextView s;
    public TextView t;
    public View u;
    public View v;
    public LiveGzoneAccompanyFleetInfo w;
    public String x;
    public String y;
    public c z;
    public static boolean D;

    public void y(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, y.class, "3")) {
          return;
       }
       int i = 8;
       if (this.w == null) {
          this.R8(i);
          return;
       }else {
          int i1 = 0;
          this.R8(i1);
          this.s.setText(String.valueOf(this.w.mWaitingMemberCount));
          ConstraintLayout$LayoutParams layoutParams = this.s.getLayoutParams();
          LiveGzoneAccompanyFleetInfo mWaitingUser = this.w.mWaitingUserList;
          if (mWaitingUser != null && mWaitingUser.size() > 0) {
             if (this.w.mWaitingUserList.size() >= 3) {
                this.p.setVisibility(i1);
                this.q.setVisibility(i1);
                this.r.setVisibility(i1);
                this.p.L(this.w.mWaitingUserList.get(i1).mIcon);
                this.q.L(this.w.mWaitingUserList.get(1).mIcon);
                this.r.L(this.w.mWaitingUserList.get(2).mIcon);
                layoutParams.leftMargin = a1.e(86.00f);
             }else if(this.w.mWaitingUserList.size() == 2){
                this.p.setVisibility(i1);
                this.q.setVisibility(i1);
                this.r.setVisibility(i);
                this.p.L(this.w.mWaitingUserList.get(i1).mIcon);
                this.q.L(this.w.mWaitingUserList.get(1).mIcon);
                layoutParams.leftMargin = a1.e(67.00f);
             }else {
                this.p.setVisibility(i1);
                this.q.setVisibility(i);
                this.r.setVisibility(i);
                this.p.L(this.w.mWaitingUserList.get(i1).mIcon);
                layoutParams.leftMargin = a1.e(48.00f);
             }
          }else {
             this.p.setVisibility(i);
             this.q.setVisibility(i);
             this.r.setVisibility(i);
             layoutParams.leftMargin = a1.e(12.00f);
          }
          if (!y.D && this.w.mReachWaitingLimit != null) {
             this.S8(1);
             this.t.setText(R.string.arg_RES_7f102335);
          }else if(this.w.isEnableQueuing()){
             this.t.setText(R.string.arg_RES_7f1023c6);
          }else if(y.D){
             this.t.setText(R.string.arg_RES_7f102335);
             if (this.w.mWaitingMemberCount == null) {
                y tB = this.B;
                if (tB != null && (tB.h0().getVisibility() == i && this.w.mOnBoardMembers.size() > 0)) {
                   k1.r(new y$c(this), 2000);
                }else {
                   i.a(R.style.arg_RES_7f11066a, 0x7f10238c);
                }
             }
          }else {
             this.t.setText(R.string.arg_RES_7f1023c2);
          }
          y.D = this.w.mReachWaitingLimit;
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, y.class, "8")) {
          return;
       }
       y tz = this.z;
       if (tz != null) {
          tz.o();
          this.z = null;
       }
       tz = this.A;
       if (tz != null) {
          tz.o();
          this.A = null;
       }
       return;
    }
    public void P8(Activity p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(y.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, y.class, "7")) {
          return;
       }
       ObservableBox.a(a.b().c(this.x, p1)).compose(p0.ge()).subscribe(new y$f(this, p2, p1), new a());
       return;
    }
    public final void R8(int p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oy, "4")) {
          return;
       }
       this.p.setVisibility(p0);
       this.q.setVisibility(p0);
       this.r.setVisibility(p0);
       this.s.setVisibility(p0);
       this.t.setVisibility(p0);
       this.u.setVisibility(p0);
       this.v.setVisibility(p0);
       return;
    }
    public final void S8(boolean p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oy, "5")) {
          return;
       }
       Activity activity = this.getActivity();
       if (a1.i(activity)) {
          t$a uoa = f.e(new t$a(activity));
          uoa.W0(R.string.arg_RES_7f1023ac);
          uoa.y0(R.string.arg_RES_7f1023b4);
          uoa.S0(R.string.arg_RES_7f103a83);
          uoa.u0(new y$e(this, p0));
          this.A = uoa.Y(new y$d(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0f05);
       this.q = m1.f(p0, 0x7f0a0f06);
       this.r = m1.f(p0, 0x7f0a0f07);
       this.s = m1.f(p0, 0x7f0a0f0b);
       this.t = m1.f(p0, 0x7f0a0f0c);
       this.u = m1.f(p0, 0x7f0a33b2);
       this.v = m1.f(p0, 0x7f0a33b1);
       this.t.setOnClickListener(new y$a(this));
       y ts = this.s;
       f0.i(ts, ts.getContext());
       y$b uob = new y$b(this);
       this.p.setOnClickListener(uob);
       this.q.setOnClickListener(uob);
       this.r.setOnClickListener(uob);
       this.s.setOnClickListener(uob);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       this.w = this.s8(LiveGzoneAccompanyFleetInfo.class);
       this.x = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_ID");
       this.y = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_LIVE_STREAM_ID");
       this.B = this.s8(LiveGzoneAnchorAccompanyFleetStateFragment.class);
       this.C = this.q8(p1.class);
       return;
    }
}
