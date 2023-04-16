package com.yxcorp.gifshow.webview.yoda.function.h;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.kwai.feature.api.platform.bridge.beans.JsBottomSheetParams;
import com.google.gson.Gson;
import mz6.b;
import android.content.Context;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;
import java.util.List;
import com.kwai.feature.api.platform.bridge.beans.JsBottomSheetParams$OptionItem;
import mz6.b$d;
import oyc.j;
import android.content.DialogInterface$OnClickListener;
import oyc.i;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;

public class h extends c	// class@0017bd
{
    public WeakReference f;

    public void h(YodaBaseWebView p0,Activity p1){
       super();
       this.f = new WeakReference(p1);
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, oh, "1")) {
             return;
          }
       }
       Object obj = a.a.h(p3, JsBottomSheetParams.class);
       if (obj == null) {
          this.o(p0, p1, p2, 0x1e84f, "params invalid", p4);
          return;
       }else {
          b uob = new b(this.f.get());
          if (!TextUtils.x(obj.mTitle)) {
             uob.o(obj.mTitle);
          }
          Iterator iterator = obj.mOptions.iterator();
          while (iterator.hasNext()) {
             JsBottomSheetParams$OptionItem optionItem = iterator.next();
             if (optionItem.mType == null) {
                uob.a(new b$d(optionItem.mText));
             }else {
                uob.a(new b$d(optionItem.mText, null, -50640));
             }
          }
          oh = this;
          j oj = new j(oh, obj, p0, p4, p1, p2);
          uob.l(v8);
          i oi = new i(oh, p0, p4, p1, p2);
          uob.k(v6);
          uob.q();
          return;
       }
    }
}
