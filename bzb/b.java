package bzb.b;
import f26.a;
import java.lang.Object;
import android.content.Intent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import q87.c;
import lnc.d7;
import r46.e;
import java.lang.Integer;
import android.net.Uri;
import ekd.x0;
import q46.d;
import java.lang.Boolean;
import java.lang.Number;
import java.util.Map;
import kotlin.jvm.internal.a;
import java.util.Objects;
import lq.i;
import azb.e;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.StrArg;
import com.kuaishou.android.post.PostPageArg;
import org.json.JSONObject;
import java.lang.CharSequence;
import com.kwai.feature.post.api.model.BridgeConfig;
import f55.g;
import i46.b;
import i46.a;
import o26.c;
import azb.m;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.google.gson.JsonObject;
import java.lang.Float;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import czb.e;
import com.yxcorp.gifshow.widget.GrowthWebViewDialogFragment;
import com.yxcorp.gifshow.widget.GrowthWebViewDialogFragment$a;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.content.Context;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import com.google.gson.JsonElement;
import zk.g;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.lang.Math;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import android.app.Activity;
import java.util.LinkedHashSet;
import czb.c;
import androidx.fragment.app.KwaiDialogFragment;
import czb.d;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import lq.e;
import java.util.List;
import java.lang.Runnable;
import java.lang.StringBuilder;
import android.text.TextUtils;
import java.util.Collection;
import lq.e$c;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import bzb.b$a;
import bzb.b$b;
import erd.g;
import crd.b;

public class b implements a	// class@0004dd
{

    public void b(){
       super();
    }
    public void BN(Intent p0){
       Object[] objArray1;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostGrowth", "lockTaskTypeIfNeeded", objArray);
       if (p0 == null) {
          return;
       }
       d7 a = d7.a;
       if (a.g() != Integer.MIN_VALUE) {
          objArray1 = new Object[0];
          p3.D().w("PostGrowth", "lockTaskTypeIfNeeded already locked", objArray1);
          return;
       }else {
          Object obj = null;
          Integer integer = PatchProxy.applyOneRefs(p0, obj, e.class, "2");
          if (integer != patchProxyRe) {
          }else {
             integer = Integer.valueOf(p0.getIntExtra("entranceTaskType", Integer.MIN_VALUE));
             if (integer != null && integer.intValue() == Integer.MIN_VALUE) {
                Uri data = p0.getData();
                if (data != null) {
                   String str = x0.a(data, "taskType");
                   if (str != null) {
                      integer = Integer.valueOf(Integer.parseInt(str));
                   }
                }
                integer = obj;
             }
          }
          int i = (integer != null)? integer.intValue(): Integer.MIN_VALUE;
          int i1 = 1;
          if (i != Integer.MIN_VALUE) {
             if (!d.c(Integer.valueOf(i))) {
                Integer integer1 = Integer.valueOf(i);
                obj = PatchProxy.applyOneRefs(integer1, obj, d.class, "4");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else if(integer1 != null && integer1.intValue() == 14){
                   b = true;
                }else {
                   b = false;
                }
                if (!b && !d.b(Integer.valueOf(i))) {
                label_00b5 :
                   i1 = 0;
                }
             }
          }else {
             goto label_00b5 ;
          }
          if (i1 || (i == Integer.MIN_VALUE && a.j(p0))) {
             i = 0x2710;
          }
          if (i == Integer.MIN_VALUE) {
             return;
          }else {
             e.b.a().put("entranceTaskType", Integer.valueOf(i));
             a.n(i);
             objArray1 = new Object[0];
             p3.D().w("PostGrowth", "lockTaskTypeIfNeeded, local task", objArray1);
             return;
          }
       }
    }
    public void Nn(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       d7.a.n(p0);
       return;
    }
    public void WL(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "6")) {
          return;
       }
       a.p(p0, "key");
       Objects.requireNonNull(d7.a);
       a.p(p0, "key");
       if (i.h()) {
          i.m().Q(p0, p1);
       }
       return;
    }
    public void Y5(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "9")) {
          return;
       }
       e.b.a(p0, Integer.valueOf(0), null);
       return;
    }
    public Object ZZ(boolean p0){
       String obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       if (p0) {
          if (!i.h()) {
             return obj;
          }else {
             return i.g().getExtActivityParams().get(obj);
          }
       }else if(!i.h()){
          return new JSONObject();
       }else {
          String obj1 = i.m().z("extActivityParamsObject");
          if (obj1 instanceof JSONObject) {
             return obj1;
          }else {
             obj1 = i.g().getExtActivityParams().get(obj);
             JSONObject jSONObject = (!obj1.length())? 1: null;
             if (jSONObject) {
                return new JSONObject();
             }else {
                try{
                   jSONObject = new JSONObject(obj1);
                }catch(java.lang.Exception e0){
                   jSONObject = new JSONObject();
                }
                return jSONObject;
             }
          }
       }
    }
    public String bO(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       return d7.a.p(p0);
    }
    public void dt(BridgeConfig p0,g p1){
       a.a(this, p0, p1);
    }
    public int getTaskType(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return d7.a.g();
    }
    public boolean isAvailable(){
       return true;
    }
    public c jL(){
       return m.b;
    }
    public void lA(GifshowActivity p0,String p1,JsonObject p2,int p3,Float p4,boolean p5,DialogInterface$OnDismissListener p6,DialogInterface$OnShowListener p7){
       e b;
       b uob1;
       String str4;
       Map a;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p6;
       object oobject4 = p7;
       b uob = b.class;
       String str = "3";
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 8;
       int i5 = 0;
       int i6 = 1;
       if (PatchProxy.isSupport2(uob, str)) {
          Object[] objArray = new Object[i4];
          objArray[i5] = oobject;
          objArray[i6] = oobject1;
          objArray[i3] = oobject2;
          objArray[i2] = Integer.valueOf(p3);
          objArray[i1] = p4;
          objArray[i] = Boolean.valueOf(p5);
          objArray[6] = oobject3;
          objArray[7] = oobject4;
          if (PatchProxy.applyVoid(objArray, this, uob, str)) {
             return;
          }
       }else {
          i = this;
       }
       String str1 = "activity";
       a.p(oobject, str1);
       String str2 = "url";
       a.p(oobject1, str2);
       b = e.b;
       Objects.requireNonNull(b);
       e uoe = e.class;
       String str3 = "1";
       if (PatchProxy.isSupport2(uoe, str3)) {
          Object[] objArray1 = new Object[i4];
          objArray1[0] = oobject;
          objArray1[1] = oobject1;
          objArray1[2] = oobject2;
          objArray1[3] = Integer.valueOf(p3);
          objArray1[4] = p4;
          objArray1[5] = Boolean.valueOf(p5);
          objArray1[6] = oobject3;
          objArray1[7] = oobject4;
          if (PatchProxy.applyVoid(objArray1, b, uoe, str3)) {
             uob1 = uob;
             str4 = str;
          }else {
          label_009c :
             a.p(oobject, str1);
             a.p(oobject1, str2);
             GrowthWebViewDialogFragment$a p = GrowthWebViewDialogFragment.P;
             Objects.requireNonNull(p);
             uob1 = uob;
             str4 = str;
             String str5 = str3;
             e uoe1 = uoe;
             Intent intent = PatchProxy.applyThreeRefs(p0, p1, p2, p, GrowthWebViewDialogFragment$a.class, "2");
             if (intent != PatchProxyResult.class) {
             }else {
                a.p(oobject, "context");
                a.p(oobject1, "webUrl");
                KwaiYodaWebViewActivity$c uoc1 = new KwaiYodaWebViewActivity$c(oobject, oobject1);
                str3 = "builder.build\(\)";
                if (oobject2 == null) {
                   intent = uoc1.a();
                   a.o(intent, str3);
                }else {
                   Set set2 = p2.w0();
                   if (set2 != null) {
                      Iterator iterator = set2.iterator();
                      while (iterator.hasNext()) {
                         String str6 = iterator.next();
                         JsonElement jsonElement = oobject2.e0(str6);
                         if (jsonElement != null && jsonElement.F()) {
                            g og = jsonElement.s();
                            a.o(og, "jsonPrimitive");
                            if (og.G()) {
                               uoc1.f(str6, jsonElement.d());
                            }else if(og.N()){
                               uoc1.c(str6, jsonElement.n());
                            }else if(og.a0()){
                               uoc1.f(str6, jsonElement.d());
                            }
                            String str7 = 1;
                         }
                      }
                   }
                   intent = uoc1.a();
                   a.o(intent, str3);
                }
             }
             GrowthWebViewDialogFragment growthWebVie = PatchProxy.applyOneRefs(intent, p, GrowthWebViewDialogFragment$a.class, str5);
             if (growthWebVie != PatchProxyResult.class) {
             }else {
                a.p(intent, "intent");
                growthWebVie = new GrowthWebViewDialogFragment(intent);
             }
             float f = 0;
             if (p4 != null && Float.compare(p4.floatValue(), f) > 0) {
                c uoc = a.a();
                a.o(uoc, "AppEnv.get\(\)");
                Application uApplication = uoc.a();
                a.o(uApplication, "AppEnv.get\(\)\n          .appContext");
                Resources resources = uApplication.getResources();
                a.o(resources, "AppEnv.get\(\)\n          .appContext.resources");
                Configuration configuratio = resources.getConfiguration();
                configuratio = configuratio.densityDpi;
                growthWebVie.Kh((int)(((float)Math.max(((configuratio.screenWidthDp * configuratio) / 160), ((configuratio.screenHeightDp * configuratio) / 160)) * p4.floatValue()) / 100.00f));
             }
             a = e.a;
             Set set = a.get(Integer.valueOf(p0.hashCode()));
             if (set != null && set.contains(oobject1) == true) {
                PatchProxy.onMethodExit(uoe1, str5);
             }else {
                set = a.get(Integer.valueOf(p0.hashCode()));
                if (set == null) {
                   LinkedHashSet set1 = new LinkedHashSet();
                }
                growthWebVie.ph(new c(oobject4));
                growthWebVie.k0(new d(growthWebVie, oobject1, oobject3));
                growthWebVie.Ih(p5);
                growthWebVie.Mh(f);
                int i7 = p3;
                growthWebVie.K = i7;
                growthWebVie.L = i7;
                growthWebVie.M = 0;
                growthWebVie.N = 0;
                growthWebVie.Cb(p0.getSupportFragmentManager(), "GrowthWebDialogFragment");
                set.add(oobject1);
                a.put(Integer.valueOf(p0.hashCode()), set);
                PatchProxy.onMethodExit(uoe1, str5);
             }
          }
       }else {
          int i8 = 0;
          goto label_009c ;
       }
       PatchProxy.onMethodExit(uob1, str4);
       return;
    }
    public String pl(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!i.h()) {
          return objArray;
       }
       obj = i.m().k().c();
       objArray = (obj == null || !obj.length())? 1: 0;
       if (objArray) {
          obj = "";
       }
       return obj;
    }
    public void se(String p0,JSONObject p1,List p2,String p3,String p4,Runnable p5,Runnable p6){
       Object[] objArray3;
       String str3;
       String str4;
       boolean b;
       Object[] objArray4;
       StringBuilder str5;
       int i2;
       int i3;
       StringBuilder obj;
       String str6;
       e$c uoc;
       String str7;
       int i4;
       Object[] objArray5;
       String str8;
       JSONObject jSONObject1;
       Object[] objArray6;
       Iterator iterator;
       String str9;
       i oi1;
       List list;
       Iterator iterator1;
       PostArguments postArgument;
       BasePostActivity uBasePostAct;
       Intent intent;
       String str10;
       Intent intent1;
       Iterator iterator2;
       c uoc1;
       Object[] objArray7;
       VideoContext videoContext;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       b uob = b.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,p5,p6};
          if (PatchProxy.applyVoid(objArray, this, uob, "5")) {
             return;
          }
       }else {
          int i5 = this;
       }
       a.p(oobject2, "topics");
       String str = "atFriends";
       a.p(oobject3, str);
       a.p(oobject4, "initialCaption");
       if (!i.h()) {
          Object[] objArray1 = new Object[i1];
          p3.D().w("FlyWheel", "setPostSessionActivityJson, postSession is null", objArray1);
          if (p6 != null) {
             p6.run();
          }
          return;
       }else {
          Object[] objArray2 = new Object[i1];
          p3.D().w("FlyWheel", "setPostSessionActivityJson, activityId: "+oobject+", activityDetail: "+oobject1, objArray2);
          i oi = i.m();
          String str1 = "PostSession.current\(\)";
          a.o(oi, str1);
          String str2 = oi.k().c();
          JSONObject jSONObject = (str2 == null || !str2.length())? 1: null;
          jSONObject = (!jSONObject)? new JSONObject(str2): new JSONObject();
       }
    }
    public void yo(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "7")) {
          return;
       }
       a.p(p0, "key");
       d7.a.r(p0, p1);
       return;
    }
}
