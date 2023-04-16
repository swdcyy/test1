package com.kuaishou.commercial.splash.e;
import yy.y0;
import yy.g1;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import wkd.b;
import yy.p;
import java.util.Objects;
import java.lang.Number;
import zw.a;
import zw.c;
import yx.j0;
import java.util.List;
import java.lang.Integer;
import org.json.JSONObject;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import h30.a;
import java.lang.System;
import qw.f;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.yxcorp.gifshow.photoad.IpdxHelper;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collection;
import ekd.q;
import org.json.JSONArray;
import java.util.Iterator;
import lnc.j;
import android.os.Build$VERSION;
import java.lang.Long;
import p49.c;
import p49.f;
import p49.e;
import yy.q;
import p49.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.a0;
import t45.d;
import brd.z;
import com.kuaishou.commercial.splash.c;
import com.kuaishou.commercial.splash.d;
import erd.g;

public class e	// class@0015ac
{
    public final y0 a;
    public final g1 b;
    public b c;
    public SplashAdDataResponse d;
    public boolean e;
    public boolean f;

    public void e(y0 p0,g1 p1){
       super();
       this.e = false;
       this.f = false;
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(){
       boolean b;
       long l1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       p obj = PatchProxy.apply(objArray, this, e.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       long l = b.a(0x946a02c).k();
       obj = b.a(0x946a02c);
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, p.class, "51");
       b = false;
       if (obj1 != patchProxyRe) {
          l1 = obj1.longValue();
       }else {
          obj = obj.b;
          if (obj != null) {
             Object obj2 = PatchProxy.apply(objArray, obj, a.class, "29");
             if (obj2 != patchProxyRe) {
                l1 = obj2.longValue();
             }else if(obj.i()){
                l1 = obj.a.i;
             }
          }else {
             Object[] objArray1 = new Object[b];
             j0.c("SplashAdDiskHelper", "mDiskCache not init", objArray1);
          }
          l1 = 0xc800000;
       }
       if (l - l1 < 0) {
          b = true;
       }
       return b;
    }
    public final String b(int p0,int p1,List p2,List p3){
       JSONObject obj;
       JSONArray jSONArray;
       Iterator iterator;
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, e.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = new JSONObject();
          obj.put("supportGyroscope", this.e);
          obj.put("supportAccelerometer", this.f);
          obj.put("width", p0);
          obj.put("height", p1);
          obj.put("imei", SystemUtil.m(a.B));
          obj.put("oaid", a.d());
          obj.put("timestamp", System.currentTimeMillis());
          obj.put("lastPrefetchTimestamp", f.h());
          obj.put("enableRealtime", d.a(-536296199).LG());
          String str = IpdxHelper.a();
          if (!TextUtils.isEmpty(str)) {
             obj.put("ipdxIP", str);
          }
          if (!q.f(p3)) {
             jSONArray = new JSONArray();
             iterator = p3.iterator();
             while (iterator.hasNext()) {
                jSONArray.put(iterator.next());
             }
             obj.put("splashMaterialIds", jSONArray);
          }
          if (!q.f(p2)) {
             jSONArray = new JSONArray();
             iterator = p2.iterator();
             while (iterator.hasNext()) {
                jSONArray.put(iterator.next());
             }
             obj.put("splashDataIds", jSONArray);
          }
          str = j.d("/data/data");
          if (!TextUtils.isEmpty(str)) {
             obj.put("updateMark", str);
          }
          str = j.c();
          if (!TextUtils.isEmpty(str)) {
             obj.put("bootMark", str);
          }
          obj.put("androidApiLevel", String.valueOf(Build$VERSION.SDK_INT));
          return obj.toString();
       }catch(org.json.JSONException e0){
          return "";
       }
    }
    public final void c(long p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "4")) {
          return;
       }
       Object[] objArray = new Object[]{Long.valueOf(p0)};
       j0.c("SplashAdDownloadHelper", "reportDiskCacheLow diskSize:", objArray);
       e.a(c.T).b(0.10f).h(new q(p0));
       return;
    }
    public void d(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       b9.a(this.c);
       this.c = a0.Y(10, TimeUnit.SECONDS).G(d.c).R(new c(this, p0), d.b);
       return;
    }
}
