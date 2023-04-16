package com.yxcorp.gifshow.location.LocationFragment$c;
import qvb.f;
import com.yxcorp.gifshow.location.LocationFragment;
import java.lang.String;
import brd.t;
import cx8.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;
import com.yxcorp.gifshow.activity.share.model.LocationResponse;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import lq.i;
import lq.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Activity;
import j2b.s;
import qvb.n0;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import cx8.a$a;
import cx8.d;
import io.reactivex.g;
import cx8.e;
import cjd.e;
import erd.o;
import qvb.n0$a;
import com.yxcorp.gifshow.location.b;
import java.util.List;
import vw8.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import e17.i;
import java.util.Iterator;
import com.kuaishou.android.model.mix.Location;
import la6.b;
import java.util.Collections;
import com.yxcorp.gifshow.location.LocationFragment$d;
import com.kwai.sdk.switchconfig.a;

public class LocationFragment$c extends f	// class@001ada
{
    public String p;
    public final LocationFragment q;

    public void LocationFragment$c(LocationFragment p0,String p1){
       this.q = p0;
       super();
       this.p = p1;
    }
    public t I1(){
       Object[] objArray1;
       LocationFragment j;
       LocationFragment h;
       t ot;
       Object obj = this;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LocationFragment$c obj1 = PatchProxy.apply(objArray, obj, LocationFragment$c.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = obj.q;
       String str = "LocationFragment";
       int i = 0;
       if (obj1.M != null) {
          objArray1 = new Object[i];
          a.b().w(str, "onCreateRequest\(\) clear old recommend", objArray1);
          obj.q.M = i;
          return t.just(this.i2());
       }else {
          FragmentActivity activity = obj1.getActivity();
          Bundle arguments = obj.q.getArguments();
          String str1 = (arguments != null)? arguments.getString("location_ext_params", objArray): objArray;
          String str2 = (i.h())? i.m().k().o(): objArray;
          LocationFragment$c q = obj.q;
          if (q.I != null && !TextUtils.isEmpty(q.J)) {
             if (activity != null) {
                s.d(activity, obj.q.G);
             }
             String str3 = (!this.K() && this.L0() != null)? this.L0().getCursor(): objArray;
             Object[] objArray2 = new Object[i];
             a.c(str, "onCreateRequest\(\) cursor="+str3+" mKeyword="+obj.q.J, objArray2);
             if (TextUtils.isEmpty(obj.q.J)) {
                return t.empty();
             }else {
                int i1 = 3;
                int i2 = 2;
                int i3 = 1;
                if (PostExperimentUtils.K()) {
                   obj1 = obj.q;
                   j = obj1.J;
                   LocationFragment g = obj1.G;
                   h = obj1.H;
                   LocationFragment$c p = obj.p;
                   Integer integer = s.a();
                   if (PatchProxy.isSupport(uoa)) {
                      Object[] objArray3 = new Object[]{j,str3,g,h,p,integer,str1,str2};
                      ot = PatchProxy.apply(objArray3, null, uoa, "6");
                      if (ot != patchProxyRe) {
                      }else {
                      label_0101 :
                         objArray1 = new Object[i];
                         a.c("LocationAPI", "locationSearchNew\(\) called with: keyword = "+j+", cursor = "+str3+','+" mediaLocation = "+g+", cityName = "+h+", taskId = "+p+", "+"gpsFlag = "+integer+", extParams = "+str1, objArray1);
                         if (j != null && j.length()) {
                            i3 = 0;
                         }
                         if (i3) {
                            ot = t.just(new LocationResponse());
                            a.o(ot, "Observable.just\(LocationResponse\(\)\)");
                         }else {
                            a$a b = a.b;
                            t ot1 = (b != null)? b.d(j, str3): null;
                            if (ot1 != null) {
                               ot = ot1;
                            }else {
                               objArray1 = new Object[i];
                               a.c("LocationAPI", "locationSearchNew\(\) create new context keyword="+j, objArray1);
                               b = a.b;
                               if (b != null) {
                                  b.c();
                               }
                               a.b = new a$a(j);
                               d uod = new d(j, g, p, str2, h);
                               ot = t.create(b);
                               a.o(ot, "Observable.create { emit¡­stContext!!\n      \)\n    }");
                            }
                         }
                      }
                   }else {
                      goto label_0101 ;
                   }
                   return ot;
                }else {
                   obj1 = obj.q;
                   LocationFragment j1 = obj1.J;
                   j = obj1.G;
                   h = obj1.H;
                   LocationFragment$c p1 = obj.p;
                   Integer integer1 = s.a();
                   if (PatchProxy.isSupport(uoa)) {
                      Object[] objArray4 = new Object[]{j1,str3,j,h,p1,integer1,str1};
                      ot = PatchProxy.apply(objArray4, null, uoa, "2");
                      if (ot != patchProxyRe) {
                      label_01f9 :
                         return ot.map(new e());
                      }
                   }
                   ot = a.b().c(j1, str3, j, h, p1, null, integer1, str1);
                   goto label_01f9 ;
                }
             }
          }else if(this.k2()){
             objArray = new Object[i];
             a.b().w(str, "onCreateRequest\(\) start load recommned currsor="+this.h2()+" mMediaLocationStr="+obj.q.G, objArray);
             if (activity != null) {
                s.d(activity, obj.q.G);
             }
             if (PostExperimentUtils.K()) {
                return a.e(this.h2(), obj.q.G, obj.p, s.a(), str1, str2);
             }else {
                return a.d(this.h2(), obj.q.G, obj.p, s.a(), str1).map(new e());
             }
          }else {
             return t.just(this.i2());
          }
       }
    }
    public void K1(n0$a p0){
       JSONObject jSONObject;
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationFragment$c.class, "4")) {
          return;
       }
       LocationFragment$c tq = this.q;
       tq.N.s1(tq.I);
       if (this.q.I != null && p0.a() != null) {
          boolean b = true;
          boolean b1 = (p0.a().getItems() != null && !p0.a().getItems().isEmpty())? true: false;
          if (!TextUtils.isEmpty(this.q.J)) {
             LocationFragment j = this.q.J;
             a uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(j, Boolean.valueOf(b1), null, uoa, "92")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "QUERY_RESULT";
                try{
                   jSONObject = new JSONObject();
                   jSONObject.put("query_word", j);
                   if (b1) {
                      b = false;
                   }
                   jSONObject.put("is_empty_result", b);
                }catch(org.json.JSONException e0){
                   i1.c(e0);
                }
                if (!TextUtils.x(j)) {
                   uElementPack.params = jSONObject.toString();
                }
                u1.u0(3, uElementPack, null);
             }
          }else {
             this.q.N.s1(false);
          }
       }
    label_009e :
       super.K1(p0);
       return;
    }
    public void L1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationFragment$c.class, "7")) {
          return;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       a.b().e("requestLocation", "onLoadError", p0);
       return;
    }
    public void M1(Object p0,List p1){
       this.j2(p0, p1);
    }
    public void a2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationFragment$c.class, "6")) {
          return;
       }
       LocationFragment$c tq = this.q;
       if (tq.N.B != null) {
          return;
       }
       if (tq.F != null) {
          Iterator iterator = p0.iterator();
          while (true) {
             if (iterator.hasNext()) {
                Location location = iterator.next();
                if (!location.getId() - this.q.F.getId()) {
                   this.q.F = location;
                   p0.remove(location);
                }
             }
             p0.add(0, this.q.F);
             break ;
          }
       }
       return;
    }
    public void d2(b p0,List p1){
       this.j2(p0, p1);
    }
    public final String h2(){
       Object obj = PatchProxy.apply(null, this, LocationFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.K() || this.L0() == null) {
          return null;
       }
       return this.L0().getCursor();
    }
    public final LocationResponse i2(){
       Location obj = PatchProxy.apply(null, this, LocationFragment$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Location();
       LocationFragment h = this.q.H;
       obj.mCity = h;
       obj.mTitle = h;
       LocationResponse locationResp = new LocationResponse();
       locationResp.setLocations(Collections.singletonList(obj));
       locationResp.setCityName(this.q.H);
       return locationResp;
    }
    public void j2(LocationResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocationFragment$c.class, "5")) {
          return;
       }
       super.d2(p0, p1);
       if (this.k2() && !TextUtils.isEmpty(p0.getCityName())) {
          String cityName = p0.getCityName();
          LocationFragment r = this.q.R;
          if (r != null) {
             r.a(cityName);
          }
       }
       return;
    }
    public final boolean k2(){
       Object obj = PatchProxy.apply(null, this, LocationFragment$c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!LocationFragment.Gh() || (a.t().d("enablePublishPoiOffsite", false) && !TextUtils.isEmpty(this.q.H))) {
          b = false;
       }
    label_0034 :
       return b;
    }
}
