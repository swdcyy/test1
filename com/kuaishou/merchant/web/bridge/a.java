package com.kuaishou.merchant.web.bridge.a;
import la4.b;
import com.kuaishou.merchant.web.bridge.EditAddressFunction;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.web.bridge.EditAddressFunction$JsEditAddressParam;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Object;
import java.lang.Exception;
import la4.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import xs3.c;
import android.content.Intent;
import android.app.Activity;
import n3d.a;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public class a implements b	// class@0009d9
{
    public final GifshowActivity b;
    public final EditAddressFunction$JsEditAddressParam c;
    public final YodaBaseWebView d;
    public final String e;
    public final String f;
    public final String g;
    public final EditAddressFunction h;

    public void a(EditAddressFunction p0,GifshowActivity p1,EditAddressFunction$JsEditAddressParam p2,YodaBaseWebView p3,String p4,String p5,String p6){
       this.h = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public void a(Exception p0){
       a.b(this, p0);
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a tb = this.b;
       a tc = this.c;
       d.a(0x7db42315).Pr(tb, tc.mItemId, tc.mSellerId, tb.getIntent().getBooleanExtra("KEY_ADJUST_PAGE_SPAN_WHEN_SHOW_SOFT", false), this.b.getIntent().getIntExtra("KEY_BOTTOM_MARGIN_WHEN_SOFT", false), this.h.s(this.d, this.e, this.f, this.g));
       return;
    }
    public void e(){
       a.a(this);
    }
    public void f(boolean p0){
       h.d(this, p0);
    }
    public void n(PluginInstallerUIHandler$e p0){
       h.a(this, p0);
    }
    public void o(){
       h.b(this);
    }
    public void onStart(){
       a.c(this);
    }
    public void p(){
       h.c(this);
    }
}
