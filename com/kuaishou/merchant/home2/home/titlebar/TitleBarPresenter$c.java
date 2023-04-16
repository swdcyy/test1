package com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.System;
import b04.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.pagedy.a;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import hx3.d;
import java.lang.Integer;
import androidx.fragment.app.FragmentActivity;
import xw3.e;
import iz3.c;
import xw3.c;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import p74.a;
import com.kuaishou.merchant.basic.util.f;
import iz3.a;
import java.util.Objects;
import yz3.c;

public final class TitleBarPresenter$c extends m	// class@0017e0
{
    public final TitleBarPresenter c;

    public void TitleBarPresenter$c(TitleBarPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       TitleBarPresenter$c tc;
       GifshowActivity gifshowActiv;
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarPresenter$c.class, "1")) {
          return;
       }
       int id = p0.getId();
       String str = 2;
       TitleBarPresenter titleBarPres = null;
       if (id == 0x7f0a3f3f) {
          tc = this.c;
          TitleBarPresenter i = tc.I;
          if (i != null) {
             long l = 3;
             if (i != true) {
                if (i != str) {
                   if (i != l) {
                      tc.W8().onBackPressed();
                   }else if(tc.H == null){
                      tc = this.c;
                      if ((System.currentTimeMillis() - TitleBarPresenter.R8(this.c).A0()) - (long)tc.J < 0) {
                         a.a(TitleBarPresenter.P8(tc));
                         a.e(TitleBarPresenter.P8(this.c));
                         tc.H = true;
                      }
                   }
                   this.c.W8().onBackPressed();
                }else if(tc.H != null){
                   tc.W8().onBackPressed();
                }else {
                   a.a(TitleBarPresenter.P8(tc));
                   a.e(TitleBarPresenter.P8(this.c));
                   tc.H = true;
                }
             }else {
                Boolean uBoolean = Boolean.valueOf(TitleBarPresenter.R8(tc).E0());
                if (!(uBoolean.booleanValue() ^ true)) {
                   uBoolean = titleBarPres;
                }
                if (uBoolean != null) {
                   uBoolean.booleanValue();
                   RecyclerView recyclerView = TitleBarPresenter.R8(this.c).u0();
                   if (recyclerView != null) {
                      titleBarPres = Integer.valueOf(d.b(recyclerView, this.c.W8()));
                   }
                   if (titleBarPres != null && titleBarPres.intValue() >= l) {
                      TitleBarPresenter.R8(this.c).T0(true);
                   }
                }
             label_00d3 :
                tc = this.c;
                if (tc.H == null && (TitleBarPresenter.R8(tc).E0() || TitleBarPresenter.R8(this.c).D0())) {
                   this.c.W8().onBackPressed();
                }else {
                   a.a(TitleBarPresenter.P8(this.c));
                   a.e(TitleBarPresenter.P8(this.c));
                   tc.H = true;
                }
             }
          }else {
             tc.W8().onBackPressed();
          }
       }else if(id == 0x7f0a393f){
          e.q0(this.c.W8()).w0(new c("BUTTON_OPENSHOP"));
          gifshowActiv = this.c.W8();
          MerchantHomeLogBiz titleBar = MerchantHomeLogBiz.TitleBar;
          TitleBarPresenter r = this.c.r;
          if (r != null) {
             titleBarPres = r.mOpenShopUrl;
          }
          f.g(gifshowActiv, titleBar, titleBarPres);
       }else if(id == 0x7f0a386a){
          e.q0(this.c.W8()).w0(new a(this.c.X8()));
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(titleBarPres, tc, TitleBarPresenter.class, "14")) {
             if (tc.X8() != 1) {
                str = 1;
             }
             if (tc.W8() instanceof c) {
                gifshowActiv = tc.W8();
                Objects.requireNonNull(gifshowActiv, "null cannot be cast to non-null type com.kuaishou.merchant.home2.main.activity.MerchantHomeSwitchedListener");
                gifshowActiv.d1(str);
             }
          }
       }
       return;
    }
}
