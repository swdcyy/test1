package com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2;
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
import iz3.b;

public final class TitleBarPresenterV2$d extends m	// class@001773
{
    public final TitleBarPresenterV2 c;

    public void TitleBarPresenterV2$d(TitleBarPresenterV2 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       TitleBarPresenterV2$d tc;
       GifshowActivity gifshowActiv;
       MerchantHomeLogBiz titleBar;
       TitleBarPresenterV2 r;
       HomePage mRedDotConte;
       if (PatchProxy.applyVoidOneRefs(p0, this, TitleBarPresenterV2$d.class, "1")) {
          return;
       }
       int id = p0.getId();
       String str = 2;
       TitleBarPresenterV2 titleBarPres = null;
       boolean b = true;
       if (id == 0x7f0a3f3f) {
          tc = this.c;
          TitleBarPresenterV2 n = tc.N;
          if (n != null) {
             long l = 3;
             if (n != b) {
                if (n != str) {
                   if (n != l) {
                      tc.Y8().onBackPressed();
                   }else if(tc.M == null){
                      tc = this.c;
                      if ((System.currentTimeMillis() - TitleBarPresenterV2.R8(this.c).A0()) - (long)tc.O < 0) {
                         a.a(TitleBarPresenterV2.P8(tc));
                         a.e(TitleBarPresenterV2.P8(this.c));
                         tc.M = b;
                      }
                   }
                   this.c.Y8().onBackPressed();
                }else if(tc.M != null){
                   tc.Y8().onBackPressed();
                }else {
                   a.a(TitleBarPresenterV2.P8(tc));
                   a.e(TitleBarPresenterV2.P8(this.c));
                   tc.M = b;
                }
             }else {
                Boolean uBoolean = Boolean.valueOf(TitleBarPresenterV2.R8(tc).E0());
                if (!(uBoolean.booleanValue() ^ b)) {
                   uBoolean = titleBarPres;
                }
                if (uBoolean != null) {
                   uBoolean.booleanValue();
                   RecyclerView recyclerView = TitleBarPresenterV2.R8(this.c).u0();
                   if (recyclerView != null) {
                      titleBarPres = Integer.valueOf(d.b(recyclerView, this.c.Y8()));
                   }
                   if (titleBarPres != null && titleBarPres.intValue() >= l) {
                      TitleBarPresenterV2.R8(this.c).T0(b);
                   }
                }
             label_00d3 :
                tc = this.c;
                if (tc.M == null && (TitleBarPresenterV2.R8(tc).E0() || TitleBarPresenterV2.R8(this.c).D0())) {
                   this.c.Y8().onBackPressed();
                }else {
                   a.a(TitleBarPresenterV2.P8(this.c));
                   a.e(TitleBarPresenterV2.P8(this.c));
                   tc.M = b;
                }
             }
          }else {
             tc.Y8().onBackPressed();
          }
       }else if(id == 0x7f0a393f){
          e.q0(this.c.Y8()).w0(new c("BUTTON_OPENSHOP"));
          gifshowActiv = this.c.Y8();
          titleBar = MerchantHomeLogBiz.TitleBar;
          r = this.c.r;
          if (r != null) {
             titleBarPres = r.mOpenShopUrl;
          }
          f.g(gifshowActiv, titleBar, titleBarPres);
       }else if(id == 0x7f0a386a){
          e.q0(this.c.Y8()).w0(new a(this.c.Z8()));
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(titleBarPres, tc, TitleBarPresenterV2.class, "19")) {
             if (tc.Z8() != b) {
                str = 1;
             }
             if (tc.Y8() instanceof c) {
                gifshowActiv = tc.Y8();
                Objects.requireNonNull(gifshowActiv, "null cannot be cast to non-null type com.kuaishou.merchant.home2.main.activity.MerchantHomeSwitchedListener");
                gifshowActiv.d1(str);
             }
          }
       }else if(id == 0x7f0a394b){
          e uoe = e.q0(this.c.Y8());
          r = this.c.r;
          if (r != null) {
             mRedDotConte = r.mRedDotContext;
             if (mRedDotConte != null) {
             label_01b4 :
                uoe.w0(new b("SHOPPING_CART", mRedDotConte));
                gifshowActiv = this.c.Y8();
                titleBar = MerchantHomeLogBiz.TitleBar;
                r = this.c.r;
                if (r != null) {
                   titleBarPres = r.mShoppingCartUrl;
                }
                f.g(gifshowActiv, titleBar, titleBarPres);
             }
          }
          mRedDotConte = "";
          goto label_01b4 ;
       }
       return;
    }
}
