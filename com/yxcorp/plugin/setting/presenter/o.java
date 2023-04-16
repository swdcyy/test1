package com.yxcorp.plugin.setting.presenter.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.presenter.o$a;
import com.yxcorp.plugin.setting.presenter.o$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences;
import oe6.n;
import android.view.View;
import android.widget.TextView;
import tgd.b0;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.plugin.setting.utils.SettingPageExperiment;
import android.view.View$OnClickListener;
import ghd.v;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.plugin.setting.presenter.n;
import java.lang.Integer;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import gx5.d;
import tgd.c0;
import sfc.a;
import pgd.y;
import com.kwai.framework.model.user.QCurrentUser;
import k2b.e0;
import sgd.b;
import ekd.m1;

public class o extends PresenterV2	// class@0008ea
{
    public TextView p;
    public View q;
    public TextView r;
    public GifshowActivity s;
    public int t;
    public c u;
    public PublishSubject v;
    public g w;
    public View$OnClickListener x;
    public View$OnClickListener y;

    public void o(){
       super();
       this.t = 0;
       this.x = new o$a(this);
       this.y = new o$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       int i = 8;
       if (n.b().getBoolean("commentDenyOfflineKey", false)) {
          this.q.setVisibility(i);
          return;
       }else {
          this.r.setText(R.string.arg_RES_7f10519f);
          this.X7(this.v.subscribe(new b0(this), this.w));
          if (SettingPageExperiment.a()) {
             this.p.setVisibility(i);
             this.q.setOnClickListener(this.y);
          }else {
             this.R8(v.a());
             this.q.setOnClickListener(this.x);
          }
          return;
       }
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       this.s = this.getActivity();
       this.v = PublishSubject.g();
       this.w = n.b;
       return;
    }
    public final void P8(int p0,boolean p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, oo, "6")) {
          return;
       }
       d.a(-1188553266).jg("comment_deny", p1).subscribe(new c0(this, p0), new a());
       p0 = y.b(v.a());
       o ts = this.s;
       Integer integer = Integer.valueOf(p0);
       int i = 1;
       int i1 = QCurrentUser.ME.isAllowPushMyCommentsToOther() ^ i;
       if (p0) {
          if (p0 != i) {
             if (p0 != 2) {
                p0 = (p0 != 3)? 0: 9;
             }else {
                p0 = 7;
             }
          }else {
             p0 = 5;
          }
       }else {
          p0 = 6;
       }
       b.c(ts, "WHO_CAN_COMMENT_ME", integer, i1, p0);
       return;
    }
    public final void R8(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "4")) {
          return;
       }
       if (p0) {
          this.p.setText(R.string.arg_RES_7f103afd);
       }else {
          this.p.setText(R.string.arg_RES_7f1051a0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       p0 = m1.f(p0, R.id.comment_me_around);
       this.q = p0;
       this.p = m1.f(p0, 0x7f0a0d6a);
       this.r = m1.f(this.q, 0x7f0a0d6d);
       return;
    }
}
