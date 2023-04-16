package com.yxcorp.gifshow.profile.fragment.ProfilePreLoadFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import y8c.t;
import o3c.v;
import wh5.c;
import wkd.b;
import o3c.l;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import z5c.k0;
import com.yxcorp.gifshow.profile.util.b;
import com.kwai.components.social.util.network.NetworkTrace;
import li5.a;
import cjd.e;
import erd.o;
import brd.z;
import io.reactivex.android.schedulers.a;
import k3c.r1;
import k3c.q1;
import erd.g;
import crd.b;
import tkd.b;
import tkd.d;
import nx5.c;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.fragment.ProfilePreLoadFragment$a;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.Number;
import a3c.e;
import i2b.a;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import z5c.k1;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.content.res.Resources;
import cw9.c;
import ekd.m1;
import m4c.s;
import android.widget.TextView;
import zf6.j;
import lnc.b9;

public class ProfilePreLoadFragment extends RxFragment	// class@001315
{
    public View c;
    public View d;
    public ViewGroup e;
    public t f;
    public b g;
    public int h;
    public String i;
    public static final int j;

    public void ProfilePreLoadFragment(){
       super();
    }
    public final Map Vg(){
       HashMap obj = PatchProxy.apply(null, this, ProfilePreLoadFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (this.getArguments() != null) {
          String str = this.getArguments().getString("businessServiceProfileParams");
          if (!TextUtils.x(str)) {
             obj.put("businessServiceProfileParams", str);
          }
       }
       return obj;
    }
    public void Wg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreLoadFragment.class, "6")) {
          return;
       }
       this.f.d(true);
       v.a("PROFILE");
       int i = 0x37313f08;
       t ot = (c.j())? b.a(i).z(p0, true, this.h, 1, RequestTiming.DEFAULT, this.Vg()): b.a(i).h(p0, true, this.h, 3, RequestTiming.DEFAULT, this.Vg(), this.i, b.d(k0.o()), a.c("ProfilePreLoadFragment"));
       this.g = ot.map(new e()).observeOn(a.c()).subscribe(new r1(this), new q1(this));
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreLoadFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.getArguments() != null) {
          String str = this.getArguments().getString("user_id");
          this.h = this.getArguments().getInt("scene");
          this.i = this.getArguments().getString("arg_business_scene_type");
          if (this.h == null) {
             this.h = d.a(0x37332120).w20(null);
          }
          this.f = new ProfilePreLoadFragment$a(this, this.e, this, str);
          this.Wg(str);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfilePreLoadFragment.class, "1");
       if (p2 != patchProxyRe) {
          return p2;
       }
       Object[] objArray = null;
       p2 = PatchProxy.apply(objArray, this, ProfilePreLoadFragment.class, "9");
       if (p2 != patchProxyRe) {
          i = p2.intValue();
       }else if(e.a(k0.o())){
          i = 0x7f0d0506;
       }else {
          i = 0x7f0d0505;
       }
       View view = a.g(p0, i, p1, false);
       this.c = view;
       this.e = view.findViewById(0x7f0a3f11);
       this.d = this.c.findViewById(0x7f0a03a0);
       if (!PatchProxy.applyVoid(objArray, this, ProfilePreLoadFragment.class, "2")) {
          KwaiActionBar kwaiActionBa = this.c.findViewById(R.id.title_root);
          View view1 = this.c.findViewById(R.id.status_bar_padding_view);
          if (k1.a(this.getActivity())) {
             i = n.A(a.a().a());
             kwaiActionBa.getLayoutParams().height = c.b(this.getResources(), 0x7f070fdf) + i;
             view1.getLayoutParams().height = i;
             view1.setVisibility(false);
          }
          kwaiActionBa.e(R.drawable.arg_RES_7f081d45, -1, "");
       }
       if (!PatchProxy.applyVoid(objArray, this, ProfilePreLoadFragment.class, "3")) {
          view = m1.f(this.c, R.id.follow_group);
          if (k0.n() == 1) {
             s.a(this.d, this.getContext());
             TextView textView = m1.f(this.c, R.id.following_tv);
             TextView textView1 = m1.f(this.c, R.id.follower_tv);
             TextView textView2 = m1.f(this.c, R.id.like_tv);
             m1.f(this.c, R.id.follower).setTextSize(1, 20.00f);
             textView1.setTextSize(1, 14.00f);
             textView1.setTextColor(j.d(textView1, R.color.arg_RES_7f061641));
             m1.f(this.c, R.id.following).setTextSize(1, 20.00f);
             textView.setTextSize(1, 14.00f);
             textView.setTextColor(j.d(textView1, R.color.arg_RES_7f061641));
             m1.f(this.c, R.id.like).setTextSize(1, 20.00f);
             textView2.setTextSize(1, 14.00f);
             textView2.setTextColor(j.d(textView1, R.color.arg_RES_7f061641));
          }
          View[] viewArray = new View[]{view};
          n.Z(false, viewArray);
       }
       return this.c;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ProfilePreLoadFragment.class, "5")) {
          return;
       }
       b9.a(this.g);
       super.onDestroy();
       return;
    }
}
