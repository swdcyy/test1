package com.yxcorp.gifshow.growth.pad.GrowthPadPluginImpl;
import ayb.g;
import com.yxcorp.gifshow.growth.pad.GrowthPadPluginImpl$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.growth.pad.GrowthPadPluginImpl$coronaDetailLandscapeEnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import vqa.k;
import java.lang.Integer;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import pna.k;
import java.lang.NullPointerException;
import java.lang.Long;
import java.lang.Float;
import java.lang.Number;
import rkd.b;
import com.kwai.framework.abtest.f;
import wq6.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zpa.d;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.List;
import cra.x;
import java.util.Objects;
import xpa.f;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.response.pad.PadDataBean;
import java.lang.ref.WeakReference;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import aqa.b;
import xf6.l;
import com.kwai.sdk.switchconfig.a;

public class GrowthPadPluginImpl implements g	// class@00145a
{
    public String b;
    public final p c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;
    public static Boolean h;
    public static Boolean i;
    public static Boolean j;
    public static final GrowthPadPluginImpl$a k;

    static {
       GrowthPadPluginImpl.k = new GrowthPadPluginImpl$a(null);
    }
    public void GrowthPadPluginImpl(){
       super();
       this.b = "-1";
       this.c = s.c(GrowthPadPluginImpl$coronaDetailLandscapeEnable$2.INSTANCE);
    }
    public String Iy(){
       return this.b;
    }
    public boolean Mb(){
       k b;
       Integer integer;
       int i1;
       Integer integer1;
       Object[] objArray = null;
       Boolean obj = PatchProxy.apply(objArray, this, GrowthPadPluginImpl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = GrowthPadPluginImpl.g;
       if (obj != null) {
          return obj.booleanValue();
       }
       try{
          b = k.b;
          String str = "KEY_PAD_SCAN_LOGIN";
          int i = 0;
          integer = Integer.valueOf(i);
          if (!u.S1(str)) {
             d uod = m0.d(integer.getClass());
             if (a.g(uod, m0.d(Boolean.TYPE))) {
                if (integer instanceof Boolean) {
                   objArray = integer;
                }
                if (objArray != null) {
                   i = objArray.booleanValue();
                }
                integer1 = Boolean.valueOf(b.a().getBoolean(str, i));
             }else if(a.g(uod, m0.d(String.class))){
                if (integer instanceof String) {
                   objArray = integer;
                }
                if (objArray == null) {
                   objArray = "";
                }
                integer1 = b.a().getString(str, objArray);
                if (integer1 == null || !integer1.length()) {
                   i = 1;
                }
                if (!i) {
                   if (integer1 != null) {
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                   }
                }
             }else if(a.g(uod, m0.d(Integer.TYPE))){
                i1 = b.a().getInt(str, integer.intValue());
                if (i1 != Integer.MIN_VALUE) {
                   integer = Integer.valueOf(i1);
                }
             }else if(a.g(uod, m0.d(Long.TYPE))){
                if (integer instanceof Long) {
                   objArray = integer;
                }
                long l = (objArray != null)? objArray.longValue(): Long.MIN_VALUE;
                long longx = b.a().getLong(str, l);
                if (longx - Long.MIN_VALUE) {
                   integer1 = Long.valueOf(longx);
                }
             }else if(a.g(uod, m0.d(Float.TYPE))){
                if (integer instanceof Float) {
                   objArray = integer;
                }
                float f = (objArray != null)? objArray.floatValue(): Float.MIN_VALUE;
                float floatx = b.a().getFloat(str, f);
                if (floatx - 1) {
                   integer1 = Float.valueOf(floatx);
                }
             }
             integer = integer1;
          }
       }catch(java.lang.Exception e0){
       }
    label_0120 :
       i1 = integer.intValue();
       if (i1) {
          obj = (i1 != 1)? Boolean.FALSE: Boolean.TRUE;
          GrowthPadPluginImpl.g = obj;
          a.m(obj);
          return obj.booleanValue();
       }else {
          obj = Boolean.valueOf(b.g());
          GrowthPadPluginImpl.g = obj;
          a.m(obj);
          return obj.booleanValue();
       }
    }
    public void Ml(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthPadPluginImpl.class, "3")) {
          return;
       }
       a.p(p0, "photoId");
       this.b = p0;
       return;
    }
    public boolean bZ(){
       Object obj = PatchProxy.apply(null, this, GrowthPadPluginImpl.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (b.g() && f.a("pad_request"))? true: false;
       return b;
    }
    public boolean fo(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GrowthPadPluginImpl growthPadPlu = GrowthPadPluginImpl.class;
       Object obj = PatchProxy.apply(null, this, growthPadPlu, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Boolean uBoolean = PatchProxy.apply(null, this, growthPadPlu, "1");
       if (uBoolean == patchProxyRe) {
          uBoolean = this.c.getValue();
       }
       return uBoolean.booleanValue();
    }
    public boolean il(){
       Integer integer;
       int i1;
       Integer integer1;
       Object[] objArray = null;
       Boolean obj = PatchProxy.apply(objArray, this, GrowthPadPluginImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = GrowthPadPluginImpl.h;
       if (obj != null) {
          return obj.booleanValue();
       }
       try{
          k b = k.b;
          String str = "KEY_PAD_LOGIN_SIMPLIFY";
          int i = 0;
          integer = Integer.valueOf(i);
          if (!u.S1(str)) {
             d uod = m0.d(integer.getClass());
             if (a.g(uod, m0.d(Boolean.TYPE))) {
                if (integer instanceof Boolean) {
                   objArray = integer;
                }
                if (objArray != null) {
                   i = objArray.booleanValue();
                }
                integer1 = Boolean.valueOf(b.a().getBoolean(str, i));
             }else if(a.g(uod, m0.d(String.class))){
                if (integer instanceof String) {
                   objArray = integer;
                }
                if (objArray == null) {
                   objArray = "";
                }
                integer1 = b.a().getString(str, objArray);
                if (integer1 == null || !integer1.length()) {
                   i = 1;
                }
                if (!i) {
                   if (integer1 != null) {
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                   }
                }
             }else if(a.g(uod, m0.d(Integer.TYPE))){
                i1 = b.a().getInt(str, integer.intValue());
                if (i1 != Integer.MIN_VALUE) {
                   integer = Integer.valueOf(i1);
                }
             }else if(a.g(uod, m0.d(Long.TYPE))){
                if (integer instanceof Long) {
                   objArray = integer;
                }
                long l = (objArray != null)? objArray.longValue(): Long.MIN_VALUE;
                long longx = b.a().getLong(str, l);
                if (longx - Long.MIN_VALUE) {
                   integer1 = Long.valueOf(longx);
                }
             }else if(a.g(uod, m0.d(Float.TYPE))){
                if (integer instanceof Float) {
                   objArray = integer;
                }
                float f = (objArray != null)? objArray.floatValue(): Float.MIN_VALUE;
                float floatx = b.a().getFloat(str, f);
                if (floatx - 1) {
                   integer1 = Float.valueOf(floatx);
                }
             }
             integer = integer1;
          }
       }catch(java.lang.Exception e0){
       }
    label_0120 :
       i1 = integer.intValue();
       if (i1) {
          obj = (i1 != 1)? Boolean.FALSE: Boolean.TRUE;
          GrowthPadPluginImpl.h = obj;
          a.m(obj);
          return obj.booleanValue();
       }else {
          obj = Boolean.FALSE;
          GrowthPadPluginImpl.h = obj;
          a.m(obj);
          return obj.booleanValue();
       }
    }
    public boolean isAvailable(){
       return true;
    }
    public PresenterV2 jd(f p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, GrowthPadPluginImpl.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "containerController");
       PatchProxy.onMethodExit(GrowthPadPluginImpl.class, "9");
       return new d(p0);
    }
    public List rL(boolean p0,HomeFeedResponse p1){
       String obj;
       x a;
       f obj1;
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GrowthPadPluginImpl growthPadPlu = GrowthPadPluginImpl.class;
       if (PatchProxy.isSupport(growthPadPlu)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, growthPadPlu, "11");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "response";
       a.p(p1, obj);
       a = x.a;
       Objects.requireNonNull(a);
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          obj1 = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, a, ox, "3");
          if (obj1 != patchProxyRe) {
          }else {
          label_003b :
             a.p(p1, obj);
             obj1 = f.class;
             if (PatchProxy.isSupport(obj1)) {
                obj1 = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, obj1, "1");
                if (obj1 != patchProxyRe) {
                }
             }
             a.p(p1, obj);
             ArrayList uArrayList = new ArrayList();
             int i = 0;
             String str = "PadRequestManager";
             if (!p0) {
                HomeFeedResponse mQPhotos = p1.mQPhotos;
                if (mQPhotos != null && !mQPhotos.isEmpty()) {
                   mQPhotos = p1.mPadData;
                   if (mQPhotos == null) {
                   label_014a :
                      Object[] objArray = new Object[i];
                      w.C().w(str, "onLoadCompleted return: isFirstLoad = "+p0+"; "+"response.mQPhotos = "+p1.mQPhotos+"; response.mPadData = "+p1.mPadData, objArray);
                   }else if(mQPhotos.isLandscape == b.e()){
                      WeakReference a1 = f.a;
                      if (a1 != null) {
                         SlidePlayViewModel slidePlayVie = a1.get();
                         if (slidePlayVie != null) {
                            a.o(slidePlayVie, "viewModel");
                            int i1 = slidePlayVie.a0();
                            int i2 = i1 + 1;
                            List list = slidePlayVie.V0();
                            Object[] objArray1 = new Object[i];
                            w.C().w(str, "onLoadCompleted remove old data: currIndex = "+i1, objArray1);
                            if (list != null && list.size() > i2) {
                               objArray1 = new Object[i];
                               w.C().w(str, "onLoadCompleted remove old data: feedList.size = "+list.size(), objArray1);
                               ArrayList uArrayList1 = new ArrayList();
                               int i3 = list.size();
                               for (; i2 < i3; i2 = i2 + 1) {
                                  uArrayList1.add(list.get(i2));
                               }
                               if (uArrayList1.isEmpty() ^ 0x01) {
                                  slidePlayVie.D1(uArrayList1, slidePlayVie.U0(i1), "javaClass");
                                  objArray2 = new Object[i];
                                  w.C().w(str, "onLoadCompleted remove old data: removeList.size = "+uArrayList1.size(), objArray2);
                                  uArrayList.addAll(uArrayList1);
                               }
                            }
                         }
                      }
                   }else {
                      objArray2 = new Object[i];
                      w.C().w(str, "onLoadCompleted clear new data: response.mQPhotos.size = "+p1.mQPhotos.size(), objArray2);
                      uArrayList.addAll(p1.mQPhotos);
                      p1.mQPhotos.clear();
                   }
                }else {
                   goto label_014a ;
                }
             }else {
                goto label_014a ;
             }
             obj1 = uArrayList;
          }
       }else {
          goto label_003b ;
       }
       return obj1;
    }
    public void s7(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthPadPluginImpl.class, "8")) {
          return;
       }
       a.p(p0, "presenterV2");
       p0.U7(new b());
       PatchProxy.onMethodExit(GrowthPadPluginImpl.class, "8");
       return;
    }
    public boolean sK(){
       Boolean obj = PatchProxy.apply(null, this, GrowthPadPluginImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = GrowthPadPluginImpl.d;
       if (obj != null) {
          return obj.booleanValue();
       }
       int i = 0;
       int i1 = l.e("KEY_PAD_TAB_PORTRAIT", i);
       if (i1) {
          obj = (i1 != 1)? Boolean.FALSE: Boolean.TRUE;
          GrowthPadPluginImpl.d = obj;
          a.m(obj);
          return obj.booleanValue();
       }else {
          obj = Boolean.valueOf(a.t().d("padTabPortrait", i));
          GrowthPadPluginImpl.d = obj;
          a.m(obj);
          return obj.booleanValue();
       }
    }
    public boolean t50(){
       k b;
       Integer integer;
       int i1;
       Integer integer1;
       Object[] objArray = null;
       Boolean obj = PatchProxy.apply(objArray, this, GrowthPadPluginImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = GrowthPadPluginImpl.f;
       if (obj != null) {
          return obj.booleanValue();
       }
       try{
          b = k.b;
          String str = "KEY_PAD_SCAN_LOGIN";
          int i = 0;
          integer = Integer.valueOf(i);
          if (!u.S1(str)) {
             d uod = m0.d(integer.getClass());
             if (a.g(uod, m0.d(Boolean.TYPE))) {
                if (integer instanceof Boolean) {
                   objArray = integer;
                }
                if (objArray != null) {
                   i = objArray.booleanValue();
                }
                integer1 = Boolean.valueOf(b.a().getBoolean(str, i));
             }else if(a.g(uod, m0.d(String.class))){
                if (integer instanceof String) {
                   objArray = integer;
                }
                if (objArray == null) {
                   objArray = "";
                }
                integer1 = b.a().getString(str, objArray);
                if (integer1 == null || !integer1.length()) {
                   i = 1;
                }
                if (!i) {
                   if (integer1 != null) {
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                   }
                }
             }else if(a.g(uod, m0.d(Integer.TYPE))){
                i1 = b.a().getInt(str, integer.intValue());
                if (i1 != Integer.MIN_VALUE) {
                   integer = Integer.valueOf(i1);
                }
             }else if(a.g(uod, m0.d(Long.TYPE))){
                if (integer instanceof Long) {
                   objArray = integer;
                }
                long l = (objArray != null)? objArray.longValue(): Long.MIN_VALUE;
                long longx = b.a().getLong(str, l);
                if (longx - Long.MIN_VALUE) {
                   integer1 = Long.valueOf(longx);
                }
             }else if(a.g(uod, m0.d(Float.TYPE))){
                if (integer instanceof Float) {
                   objArray = integer;
                }
                float f = (objArray != null)? objArray.floatValue(): Float.MIN_VALUE;
                float floatx = b.a().getFloat(str, f);
                if (floatx - 1) {
                   integer1 = Float.valueOf(floatx);
                }
             }
             integer = integer1;
          }
       }catch(java.lang.Exception e0){
       }
    label_0120 :
       i1 = integer.intValue();
       if (i1) {
          obj = (i1 != 1)? Boolean.FALSE: Boolean.TRUE;
          GrowthPadPluginImpl.f = obj;
          a.m(obj);
          return obj.booleanValue();
       }else {
          obj = Boolean.valueOf(b.g());
          GrowthPadPluginImpl.f = obj;
          a.m(obj);
          return obj.booleanValue();
       }
    }
    public boolean z50(){
       Boolean obj = PatchProxy.apply(null, this, GrowthPadPluginImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = GrowthPadPluginImpl.e;
       if (obj != null) {
          return obj.booleanValue();
       }
       boolean b = (b.g() && f.a("pad_lianbo_key"))? true: false;
       obj = Boolean.valueOf(b);
       GrowthPadPluginImpl.e = obj;
       a.m(obj);
       return obj.booleanValue();
    }
}
