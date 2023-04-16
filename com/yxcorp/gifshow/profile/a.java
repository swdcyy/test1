package com.yxcorp.gifshow.profile.a;
import gx5.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import h2c.d;
import com.yxcorp.utility.Log;
import wh5.c;
import wh5.a;
import fg6.a;
import com.yxcorp.gifshow.profile.collect.dialog.KemBottomDialogNewResponse;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import h2c.b;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import r2c.a;
import com.kwai.robust.PatchProxyResult;
import j2c.a;
import java.lang.Integer;
import java.lang.StringBuilder;
import xy5.j;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import o56.f;
import m2c.f;
import q2c.b;
import q2c.e;
import pr6.d;
import m2c.a;
import java.util.List;
import qvb.i;
import yw6.g;
import com.yxcorp.gifshow.profile.collect.network.CollectionSlidePageList;
import q2c.c;
import dv5.a;
import f2c.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.Number;
import s2c.a;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Long;
import java.lang.System;
import m2c.d;
import java.util.Map;
import java.util.HashMap;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class a implements b	// class@0011e8
{

    public void a(){
       super();
    }
    public void B60(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       if (p0 instanceof JsonObject) {
          JsonObject jsonObject = ActivityContext.g().e();
          if (!PatchProxy.applyVoidTwoRefs(jsonObject, p0, null, d.class, "1")) {
             String str = "KemBottomDialogNew";
             if (jsonObject == null) {
                Log.g(str, "activity is null");
             }else if(c.b()){
                Log.g(str, "child locked!");
             }else if(a.f()){
                Log.g(str, "child locked dialog is showing!");
             }else {
                long l = 800;
                if (!a.e()) {
                   l = 5000;
                }
                k1.r(new b(new d(a.a.c(p0, KemBottomDialogNewResponse.class)), jsonObject), l);
             }
          }
       }
       return;
    }
    public void DY(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "11")) {
          return;
       }
       a.b(p0, p1, p2);
       return;
    }
    public boolean E20(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.d();
    }
    public boolean T20(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return a.a(p0, p1, p2);
    }
    public void Vk(Object p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "7")) {
          return;
       }
       Log.g("ProfileCollectionPlugin", "PhotoCollectHelper: source:"+p1+",bizType:"+p2);
       if (!p0 instanceof j) {
          return;
       }
       if (p1 != 90 && (p1 != 204 && (p1 == 82 || p1 == 262))) {
          p0.e();
       }
       return;
    }
    public PresenterV2 W20(Fragment p0,boolean p1){
       PresenterV2 obj;
       if (PatchProxy.isSupport2(a.class, "5")) {
          obj = PatchProxy.applyTwoRefsWithListener(p0, Boolean.valueOf(p1), this, a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       if (p1 && f.b(p0.getActivity())) {
          obj.U7(new f());
       }
       PatchProxy.onMethodExit(a.class, "5");
       return obj;
    }
    public PresenterV2 XB(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new b());
       obj.U7(new e());
       PatchProxy.onMethodExit(a.class, "13");
       return obj;
    }
    public void iC(d p0,int p1,int p2,PresenterV2 p3){
       if (PatchProxy.isSupport2(a.class, "1") && PatchProxy.applyVoidFourRefsWithListener(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, a.class, "1")) {
          return;
       }
       p3.U7(new a(p0, p1, p2));
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public g jU(List p0,i p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 instanceof CollectionSlidePageList) {
          return new c(p0, p1);
       }
       return new c(p0, p1);
    }
    public boolean jV(int p0,a p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       String str = "8";
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, str);
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       uoa = a.a;
       Objects.requireNonNull(uoa);
       if (PatchProxy.isSupport(a.class)) {
          String obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, uoa, a.class, "1");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
          label_003e :
             obj1 = "pluginParams";
             a.p(p1, obj1);
             boolean b1 = false;
             if (p0 != 1) {
                b = false;
             }else {
                a uoa1 = a.class;
                Object obj2 = PatchProxy.applyOneRefs(p1, uoa, a.class, "2");
                if (obj2 != patchProxyRe) {
                   b1 = obj2.booleanValue();
                }else {
                   a.p(p1, obj1);
                   p1 = p1.a;
                   a.o(p1, "pluginParams.mQPhoto");
                   Object[] objArray = null;
                   Object obj3 = PatchProxy.apply(objArray, objArray, uoa1, str);
                   int i = (obj3 != patchProxyRe)? obj3.intValue(): a.a();
                   String obj4 = PatchProxy.apply(objArray, objArray, uoa1, "11");
                   long l = (obj4 != patchProxyRe)? obj4.longValue(): a.a.getLong("lastCollectGuideButtonShowTime", 0);
                   Log.g("CollectBizHelper", "showCount:"+i);
                   Log.g("CollectBizHelper", "lastShowTime:"+DateUtils.f(l));
                   Log.g("CollectBizHelper", "lastPhoto:"+a.b());
                   obj4 = p1.getPhotoId();
                   a.o(obj4, "qPhoto.photoId");
                   if (!a.a(obj4, "is_collect_guide_showing", b1)) {
                      if (i < 3) {
                         if (PatchProxy.isSupport(a.class)) {
                            Object obj5 = PatchProxy.applyOneRefs(Long.valueOf(l), uoa, a.class, "7");
                            if (obj5 != patchProxyRe) {
                               b = obj5.booleanValue();
                            label_0114 :
                               if (!b) {
                               label_011c :
                                  uoa1 = b1 ^ 0x01;
                               }
                            }
                         }
                         b = (DateUtils.f(l)).equals(DateUtils.f(System.currentTimeMillis()));
                         goto label_0114 ;
                      }
                      Log.g("CollectBizHelper", "can NOT show!!!");
                      b1 = 1;
                      goto label_011c ;
                   }else {
                      goto label_011c ;
                   }
                }
             }
          }
       }else {
          goto label_003e ;
       }
       return b;
    }
    public void kc(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "6")) {
          return;
       }
       p0.U7(new d());
       PatchProxy.onMethodExit(a.class, "6");
       return;
    }
    public long tD(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = PatchProxy.apply(null, null, a.class, "2");
       long l = (obj != patchProxyRe)? obj.longValue(): a.b();
       return l;
    }
    public Map vF(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       HashMap obj = PatchProxy.apply(null, this, uoa, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new HashMap();
       String str = "guide_element";
       if (a.a) {
          obj.put(str, "0");
          obj.put("guide_show_timestamp", "0");
          obj.put("guide_title", "0");
       }else {
          obj.put(str, "COLLECTION_GUIDE_BUBBLE");
          StringBuilder str1 = "";
          Object obj1 = PatchProxy.apply(null, this, uoa, "4");
          if (obj1 != patchProxyRe) {
             l = obj1.longValue();
          }else {
             obj1 = PatchProxy.apply(null, null, a.class, "2");
             l = (obj1 != patchProxyRe)? obj1.longValue(): a.b();
          }
          obj.put("guide_show_timestamp", str1+l+"");
          obj.put("guide_title", "COLLECT_GUIDE");
       }
       return obj;
    }
    public void wi(int p0,String p1,a p2){
       a a;
       String photoId;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "9")) {
          return;
       }
       a = a.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, a, a.class, "3")) {
          a.p(p1, "action");
          a.p(p2, "pluginParams");
          int i = 1;
          if (p0 == i) {
             a uoa = a.class;
             if (!PatchProxy.applyVoidTwoRefs(p1, p2, a, a.class, "4")) {
                int i1 = p1.hashCode();
                if (i1 != -1426185374) {
                   if (i1 != 0x3b459efe || (p1.equals("ACTION_CLICKED") && !PatchProxy.applyVoidOneRefs(p2, a, a.class, "5"))) {
                      boolean b = false;
                      if (!PatchProxy.applyVoid(null, null, uoa, "9")) {
                         a.c(b);
                      }
                      uoa = p2.a;
                      a.o(uoa, "pluginParams.mQPhoto");
                      photoId = uoa.getPhotoId();
                      a.o(photoId, "mQPhoto.photoId");
                      a.b(photoId, "is_collect_guide_showing", b);
                      String photoId1 = uoa.getPhotoId();
                      a.o(photoId1, "mQPhoto.photoId");
                      a.b(photoId1, "is_collect_guide_clicked", i);
                   }
                }else if(!p1.equals("ACTION_BECOMEDETACHED") || PatchProxy.applyVoidOneRefs(p2, a, a.class, "6")){
                   Log.g("CollectBizHelper", "onCollectGuideButtonDetached: "+p2.a);
                   a a1 = p2.a;
                   a.o(a1, "pluginParams.mQPhoto");
                   a1 = a1.getPhotoId();
                   if (a1 != null) {
                      if ((a.g(a1, a.b()) ^ i) && !PatchProxy.applyVoid(null, null, uoa, "10")) {
                         a.c((a.a() + i));
                      }
                      if (!PatchProxy.applyVoidOneRefs(a1, null, uoa, "14")) {
                         a.p(a1, "photoId");
                         SharedPreferences$Editor uEditor1 = a.a.edit();
                         uEditor1.putString("lastCollectGuideButtonShowPhotoId", a1);
                         g.a(uEditor1);
                      }
                      long l = System.currentTimeMillis();
                      if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), null, uoa, "12")) {
                         SharedPreferences$Editor uEditor = a.a.edit();
                         uEditor.putLong("lastCollectGuideButtonShowTime", l);
                         g.a(uEditor);
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
