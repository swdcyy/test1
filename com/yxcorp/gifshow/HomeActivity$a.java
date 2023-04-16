package com.yxcorp.gifshow.HomeActivity$a;
import hka.a;
import com.yxcorp.gifshow.HomeActivity;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import ya5.a;
import java.lang.System;
import java.util.Objects;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import ekd.x0;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import kn5.c;
import wkd.b;
import bn5.a;
import tkd.b;
import tkd.d;
import fp5.a;
import e17.i;
import com.kwai.feature.post.api.feature.recommend.PostRecommendDataManager;
import j8c.d;
import com.yxcorp.utility.Log;
import android.util.SparseArray;

public class HomeActivity$a implements a	// class@0012e6
{
    public final HomeActivity b;

    public void HomeActivity$a(HomeActivity p0){
       this.b = p0;
       super();
    }
    public boolean onBackPressed(){
       int b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.applyWithListener(objArray, this, HomeActivity$a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "1");
       String str = null;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          long l = System.currentTimeMillis();
          if ((l - a.a) - 2500 < 0) {
             b = true;
          }else {
             a.a = l;
             b = false;
          }
       }
       HomeActivity$a tb = this.b;
       Objects.requireNonNull(tb);
       Object obj1 = PatchProxy.apply(objArray, tb, HomeActivity.class, "75");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          Intent intent = tb.getIntent();
          b1 = (intent != null && intent.getData() != null)? Boolean.parseBoolean(x0.b(intent.getData(), "returnBack", "false")): false;
       }
       if (b || b1) {
          HomeActivity$a tb1 = this.b;
          b = (b)? 2: 1;
          tb1.D3(b);
          PostRecommendDataManager.b().a();
          d uod = d.g();
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoid(objArray, uod, d.class, "7")) {
             Log.g("PrePostConsumeRecord", "clean...");
             uod.a = objArray;
             uod.b = objArray;
             uod.d.clear();
             uod.c = "";
          }
          this.b.W1();
          PatchProxy.onMethodExit(HomeActivity$a.class, "1");
          return true;
       }else if(q.p0(this.b).s0() && q.p0(this.b).o0(str)){
          a.a();
          PatchProxy.onMethodExit(HomeActivity$a.class, "1");
          return true;
       }else {
          HomeActivity b2 = this.b.B;
          if (b2 != null && b2.onBackPressed()) {
             a.a();
             PatchProxy.onMethodExit(HomeActivity$a.class, "1");
             return true;
          }else {
             this.b.D3(true);
             if (b.a(-92954732).b(this.b)) {
                PatchProxy.onMethodExit(HomeActivity$a.class, "1");
                return true;
             }else if(d.a(0x31a55ac8).s0(this.b)){
                PatchProxy.onMethodExit(HomeActivity$a.class, "1");
                return true;
             }else {
                i.a(R.style.arg_RES_7f11066a, 0x7f100da1);
                PatchProxy.onMethodExit(HomeActivity$a.class, "1");
                return true;
             }
          }
       }
    }
}
