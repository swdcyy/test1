package com.yxcorp.gifshow.ad.detail.router.AdDetailUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import com.yxcorp.gifshow.ad.detail.router.AdDetailUriHandler$a;
import nsd.u;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import xh7.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import yh7.a;
import android.app.Activity;
import lnc.y0;
import android.net.Uri;
import ekd.x0;
import java.lang.Long;
import java.lang.CharSequence;
import android.view.Window;
import android.view.View;
import android.view.ViewGroup;
import ekd.i;
import i2b.a;
import android.widget.FrameLayout;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import java.lang.StringBuilder;
import yx.j0;
import brd.t;
import com.yxcorp.gifshow.feed.g;
import com.yxcorp.gifshow.ad.detail.router.AdDetailUriHandler$b;
import erd.o;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.x;
import com.yxcorp.gifshow.ad.detail.router.AdDetailUriHandler$c;
import com.yxcorp.gifshow.ad.detail.router.AdDetailUriHandler$d;
import erd.g;
import crd.b;

public final class AdDetailUriHandler extends AnnotationUriHandler	// class@0016e6
{
    public static final AdDetailUriHandler$a b;

    static {
       AdDetailUriHandler.b = new AdDetailUriHandler$a(null);
    }
    public void AdDetailUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       Object[] objArray;
       View decorView;
       Object obj = this;
       Object[] obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, AdDetailUriHandler.class, "1")) {
          return;
       }
       a.p(obj1, "uriRequest");
       a.p(obj2, "uriCallback");
       Context uContext = p0.b();
       String str = null;
       if (!uContext instanceof GifshowActivity) {
          uContext = str;
       }
       Context uContext1 = uContext;
       a uoa = new a(200);
       String str1 = "AdDetailUriHandler";
       int i = 0;
       if (uContext1 == null || y0.o(uContext1)) {
          obj1 = new Object[i];
          j0.f(str1, "activity is finishingOrDestroyed", obj1);
          uoa.a = 406;
          obj2.a(uoa);
          return;
       }else {
          try{
             Uri uri = p0.g();
             a.o(uri, "uriRequest.uri");
             String str2 = "photoId";
             String str3 = "";
             String str4 = x0.b(uri, str2, str3);
             String str5 = x0.b(uri, "serverExpTag", str3);
             String str6 = "extraInfo";
             String str7 = x0.b(uri, str6, str3);
             StringBuilder str8 = x0.b(uri, "playStartTime", str3);
             long l = 0;
             if (str8 != null) {
                l = Long.parseLong(str8);
             }
             a.o(str4, str2);
             boolean b = true;
             int i1 = (!str4.length())? 1: 0;
             if (!i1) {
                a.o(str7, str6);
                str8 = (!str7.length())? 1: null;
                if (!str8) {
                   try{
                      Window window = uContext1.getWindow();
                      if (window != null) {
                         decorView = window.getDecorView();
                      label_0092 :
                         if (decorView instanceof ViewGroup) {
                            str = decorView;
                         }
                         if (str != null) {
                            i.i(uContext1, i, i, b);
                            a.k(str, R.layout.arg_RES_7f0d004e, b).findViewById(R.id.ad_loading_view).k();
                         }
                      }else {
                         decorView = str;
                         goto label_0092 ;
                      }
                   }catch(java.lang.Exception e0){
                      objArray = new Object[i];
                      j0.c(str1, "add view exception:"+e0, objArray);
                   }
                   AdDetailUriHandler$b uob = new AdDetailUriHandler$b(this, str5, str7, l);
                   g.e(str4, str5).map(str6).compose(uContext1.ge()).subscribe(new AdDetailUriHandler$c(obj, uContext1, obj2, uoa), super(uoa, obj2));
                   return;
                }
             }
             objArray = new Object[i];
             j0.c(str1, str4+"-----"+str7, objArray);
             uoa.a = 400;
             obj2.a(uoa);
             return;
          }catch(java.lang.Exception e0){
          }
       }
    }
}
