package com.yxcorp.gifshow.profile.fragment.ProfileTabAsyncLoadFragment;
import k3c.w1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import s1c.r0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nkc.c;
import com.kwai.framework.model.user.User;
import z5c.d3;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import java.lang.Throwable;
import tkd.b;
import tkd.d;
import qw5.a;
import os5.k;
import xx5.a;
import android.app.Activity;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import k3c.t1;
import k3c.s1;
import erd.g;
import crd.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import lnc.b9;
import com.yxcorp.gifshow.profile.fragment.ProfileTabAsyncLoadFragment$a;
import nkc.a;
import nkc.d;

public class ProfileTabAsyncLoadFragment extends BaseFragment implements w1	// class@001317
{
    public r0 j;
    public b k;
    public c l;

    public void ProfileTabAsyncLoadFragment(){
       super();
    }
    public void Fc(r0 p0){
       this.j = p0;
    }
    public void ch(){
       t ot;
       if (PatchProxy.applyVoid(null, this, ProfileTabAsyncLoadFragment.class, "3")) {
          return;
       }
       this.l.d(true);
       ProfileTabAsyncLoadFragment tj = this.j;
       if (tj == null) {
          return;
       }
       boolean b = d3.a(tj.b);
       r0 c = this.j.c;
       FragmentActivity activity = this.getActivity();
       r0 f = this.j.f;
       if (PatchProxy.isSupport(ProfileTabAsyncLoadFragment.class)) {
          ot = PatchProxy.applyFourRefs(activity, Integer.valueOf(c), f, Boolean.valueOf(b), null, ProfileTabAsyncLoadFragment.class, "4");
          if (ot != PatchProxyResult.class) {
          }else {
          label_004b :
             String str = null;
             String str1 = 0x27ae02e4;
             if (c != 5) {
                if (c != 9) {
                   if (c != 12) {
                      if (c != 18) {
                         g.a(KsLogProfileTag.PROFILE_PLUGIN.appendTag("ProfileTabAsyncLoadFragment"), "tabId error: "+c);
                         ot = t.just(Throwable.class);
                      }else {
                         ot = d.a(str1).Rc(activity, str);
                      }
                   }else {
                      ot = d.a(-129360148).zh();
                   }
                }else {
                   ot = d.a(0x17b84847).gq(activity);
                }
             }else if(b){
                ot = d.a(str1).Q8(activity, str);
             }else {
                ot = d.a(str1).x6(activity, str);
             }
          }
       }else {
          goto label_004b ;
       }
       this.k = ot.delay(0, TimeUnit.MICROSECONDS).observeOn(d.a).subscribe(new t1(this, b, c), new s1(this));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileTabAsyncLoadFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d126e, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ProfileTabAsyncLoadFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.k);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileTabAsyncLoadFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.l = new ProfileTabAsyncLoadFragment$a(this, new a(p0.findViewById(0x7f0a3f11)));
       this.ch();
       return;
    }
}
