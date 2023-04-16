package com.yxcorp.gifshow.webview.bridge.a$j;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.component.JsRenderImageParams;
import com.yxcorp.gifshow.webview.helper.H5ImageRenderHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.webview.jsmodel.component.JsRenderImageParams$Data;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.helper.H5ImageRenderHelper$PhantomWebView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import android.view.ViewGroup$LayoutParams;
import vxc.u;
import android.graphics.Bitmap;
import android.widget.AbsoluteLayout;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import brd.z;
import io.reactivex.android.schedulers.a;
import lrd.b;
import com.yxcorp.gifshow.webview.helper.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import erd.o;
import ayc.e;
import com.yxcorp.gifshow.webview.helper.H5ImageRenderHelper$a;
import ayc.d;
import erd.g;
import crd.b;

public class a$j extends z	// class@001716
{
    public final a k;

    public void a$j(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       a a;
       JsRenderImageParams$Data uData;
       Object obj = this;
       JsRenderImageParams obj1 = p0;
       H5ImageRenderHelper h5ImageRende = H5ImageRenderHelper.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$j.class, "1")) {
       }else if(obj1 == null){
          String str = "";
          int i = -1;
          if (obj1.mData == null) {
             obj.d(obj1.mCallback, new JsErrorResult(i, str));
          }else {
             int i1 = 0x1020002;
             boolean b = false;
             if (("start").equals(obj1.mAction)) {
                a.k = obj1.mCallback;
                a.l = new WeakReference(obj.k.a);
                a.m = new WeakReference(obj.k.b);
                a = obj.k.a;
                obj1 = obj1.mData;
                JsRenderImageParams$Data mImageUrl = obj1.mImageUrl;
                JsRenderImageParams$Data mWidth = obj1.mWidth;
                JsRenderImageParams$Data mHeight = obj1.mHeight;
                if (PatchProxy.isSupport(h5ImageRende)) {
                   uData = mWidth;
                   H5ImageRenderHelper$PhantomWebView obj2 = PatchProxy.applyFourRefs(a, mImageUrl, Integer.valueOf(mWidth), Integer.valueOf(mHeight), null, H5ImageRenderHelper.class, "1");
                   if (obj2 != PatchProxyResult.class) {
                      b = obj2.booleanValue();
                   }else if(a == null || a.isFinishing()){
                      obj2 = new H5ImageRenderHelper$PhantomWebView(a);
                      obj2.setImageWidth(uData);
                      obj2.setImageHeight(mHeight);
                      ViewGroup childAt = a.findViewById(i1).getChildAt(b);
                      int i2 = childAt.getChildCount() - 1;
                      while (i2 >= 0) {
                         View childAt1 = childAt.getChildAt(i2);
                         if (childAt1 instanceof H5ImageRenderHelper$PhantomWebView) {
                            childAt.removeView(childAt1);
                            childAt1.removeJavascriptInterface("Kwai");
                         }
                         i2 = i2 - 1;
                      }
                      childAt.addView(obj2, new ViewGroup$LayoutParams(-1, -1));
                      obj2.loadUrl(mImageUrl);
                      b = true;
                   }
                }else {
                   uData = mWidth;
                   goto label_0088 ;
                }
                if (!b) {
                   obj.d(a.k, new JsErrorResult(-1, str));
                }
             }else if(("end").equals(obj1.mAction)){
                a a1 = obj.k.a;
                u ou = new u(obj);
                View view = null;
                if (PatchProxy.applyVoidTwoRefs(a1, ou, view, h5ImageRende, "2") || (a1 != null && !a1.isFinishing())) {
                   ViewGroup childAt2 = a1.findViewById(i1).getChildAt(b);
                   i = childAt2.getChildCount() - 1;
                   while (i >= 0) {
                      View childAt3 = childAt2.getChildAt(i);
                      if (childAt3 instanceof H5ImageRenderHelper$PhantomWebView) {
                         view = childAt3;
                         break ;
                      }
                      i = i - 1;
                   }
                   if (view != null) {
                      Bitmap drawingCache = view.getDrawingCache();
                      view.getImageWidth();
                      view.getImageHeight();
                      if (!PatchProxy.applyVoidFourRefs(a1, view, drawingCache, ou, null, H5ImageRenderHelper.class, "3")) {
                         a.g(a1, "android.permission.WRITE_EXTERNAL_STORAGE").subscribeOn(a.c()).observeOn(b.c()).flatMap(new d(a1, drawingCache)).observeOn(a.c()).subscribe(new e(ou, a1, view), new d(a1, view, ou));
                      }
                   }
                }
             }else if(("failure").equals(obj1.mAction)){
                Activity uActivity = a.l.get();
                WebView webView = a.m.get();
                if (uActivity != null && (!uActivity.isFinishing() && webView != null)) {
                   obj.c(webView, a.k, new JsErrorResult(-1, str));
                }
             }
          }
       }
       return;
    }
}
