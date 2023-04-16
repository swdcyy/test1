package com.yxcorp.gifshow.webview.bridge.a$m;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.bridge.JsSelectImageParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import com.yxcorp.gifshow.webview.jsmodel.component.JsSelectImageResult;
import java.util.TreeMap;
import com.yxcorp.gifshow.webview.bridge.d;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Objects;
import com.yxcorp.utility.i;
import wkd.b;
import j80.c;
import java.io.File;
import vxc.v;
import java.util.SortedMap;
import com.yxcorp.utility.i$d;

public class a$m extends z	// class@001719
{
    public final a k;

    public void a$m(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       v ov;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$m.class, "1")) {
       }else {
          String stringExtra = obj.k.a.getIntent().getStringExtra("KEY_EXTRA");
          JsSelectImageResult jsSelectImag = new JsSelectImageResult();
          TreeMap treeMap = new TreeMap(d.b);
          int i = 0;
          AtomicInteger uAtomicInteg = new AtomicInteger(i);
          a$m k = obj.k;
          Objects.requireNonNull(k);
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray = new Object[]{stringExtra,obj1,uAtomicInteg,jsSelectImag,treeMap,obj};
             if (!PatchProxy.applyVoid(objArray, k, uoa, "5")) {
             }
          }else {
          }
       }
       return;
    }
}
