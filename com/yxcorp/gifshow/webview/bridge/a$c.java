package com.yxcorp.gifshow.webview.bridge.a$c;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.component.JsLocationRequestParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vxc.n;
import com.kwai.framework.location.k;
import java.lang.Boolean;
import java.lang.Integer;
import lnc.a1;
import o96.e0;
import q96.b;
import com.kwai.framework.location.j;
import java.lang.StringBuilder;
import java.util.UUID;
import java.lang.System;
import p96.a;
import q87.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import o96.g0;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import e66.e;
import t96.a;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import o96.y;
import com.kwai.framework.location.j$a;
import o96.z;
import com.kwai.framework.location.h;
import u07.u;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import s96.a;
import wk7.j;
import o96.f0;
import com.kwai.framework.location.f;
import o96.a0;
import com.kwai.framework.location.i;

public class a$c extends z	// class@00170f
{
    public final a k;

    public void a$c(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       String str4;
       String str5;
       String str6;
       e0 uoe0;
       j oj;
       Object[] objArray1;
       String str7;
       String str8;
       Object[] objArray2;
       String str9;
       ConcurrentHashMap uConcurrentH;
       a uoa;
       ConcurrentHashMap uConcurrentH1;
       a uoa1;
       Object obj2;
       boolean b1;
       String str10;
       Object[] objArray3;
       String str11;
       String str12;
       String str13;
       String str14;
       String str15;
       int i9;
       a uoa2;
       ConcurrentHashMap uConcurrentH2;
       String str16;
       String str17;
       String str18;
       String str19;
       y oy;
       z oz;
       ConcurrentHashMap uConcurrentH3;
       a uoa3;
       Object[] objArray4;
       a uoa4;
       ConcurrentHashMap uConcurrentH4;
       e0 uoe01;
       String str20;
       f uof;
       a0 uoa0;
       i oi;
       Object[] objArray5;
       int i10;
       String obj = this;
       String obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$c.class, str)) {
       }else if(obj1 == null || obj1.mCallback == null){
          a a = obj.k.a;
          String str1 = "default";
          n on = new n(obj, obj1);
          int a1 = k.a;
          int b = k.b;
          int c = k.c;
          int d = k.d;
          k ok = k.class;
          int i = 10;
          String str2 = "H5";
          String str3 = "";
          int i1 = 4;
          boolean i2 = 3;
          int i3 = 2;
          int i4 = 8;
          int i5 = 7;
          int i6 = 6;
          int i7 = 1;
          int i8 = 0;
          if (PatchProxy.isSupport(ok)) {
             Object[] objArray = new Object[i];
             objArray[i8] = a;
             objArray[i7] = str1;
             objArray[i3] = Boolean.TRUE;
             objArray[i2] = Integer.valueOf(a1);
             objArray[i1] = Integer.valueOf(b);
             objArray[5] = Integer.valueOf(c);
             objArray[i6] = Integer.valueOf(d);
             objArray[i5] = on;
             objArray[i4] = str2;
             objArray[9] = str3;
             if (!PatchProxy.applyVoid(objArray, null, ok, str)) {
             }
          }else {
          }
       }
    label_02fe :
       return;
    }
}
