package com.yxcorp.gifshow.prettify.makeup.m;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import java.lang.Object;
import java.util.ArrayList;
import f1c.b2;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.feature.post.api.componet.prettify.makeup.model.RecoSuiteGroup;
import com.yxcorp.gifshow.prettify.makeup.m$b;
import com.yxcorp.gifshow.prettify.makeup.MakeupResponse;
import f1c.j0;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import f1c.i0;
import java.lang.Boolean;
import xyb.a;
import q87.c;
import java.util.Collection;
import ekd.q;
import java.util.Objects;
import java.util.Map;
import skd.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import f1c.x1;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import w46.b;
import f1c.a2;
import f1c.z1;
import f1c.y1;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Float;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import f1c.l0;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.prettify.makeup.m$a;

public class m	// class@00118e
{
    public final b2 a;
    public final MakeupKey b;
    public MakeupResponse c;
    public m$b d;
    public m$b e;
    public final List f;
    public c g;
    public final List h;
    public boolean i;
    public m$a j;

    public void m(MakeupKey p0){
       super();
       this.f = new ArrayList();
       this.h = new ArrayList();
       this.b = p0;
       this.a = new b2(p0, this);
    }
    public static String i(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, m.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"-"+p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, m.class, "29")) {
          return;
       }
       this.h.clear();
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          MakeupSuite makeupSuite = iterator.next();
          if (makeupSuite instanceof RecoSuiteGroup) {
             makeupSuite.setRecoList(null);
             makeupSuite.setRecoIndex(-1);
          }
       }
       this.g = null;
       return;
    }
    public String b(){
       m td = this.d;
       m$b a = (td != null)? td.a: "";
       return a;
    }
    public MakeupSuite c(){
       Object obj = PatchProxy.apply(null, this, m.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h(this.d());
    }
    public String d(){
       m te = this.e;
       m$b a = (te != null)? te.a: "";
       return a;
    }
    public int e(){
       m tc = this.c;
       int i = (tc == null)? -1: tc.mLiveDefaultId;
       return i;
    }
    public String f(){
       m tc = this.c;
       String str = (tc == null)? null: tc.mLiveVersionId;
       return str;
    }
    public final MakeupSuite g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.y(this.h, new j0(p0)).orNull();
    }
    public MakeupSuite h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.y(this.f, new i0(p0)).orNull();
    }
    public List j(){
       return this.f;
    }
    public void k(MakeupResponse p0,boolean p1){
       m a;
       Object[] obj3;
       Object[] obj4;
       Iterator iterator1;
       Iterator iterator2;
       Iterator iterator3;
       String str2;
       MakeupResponse makeupRespon = this;
       Object[] obj = p0;
       b2 uob2 = b2.class;
       String str = "1";
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), makeupRespon, m.class, str)) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MakeupModel", "init, type:"+makeupRespon.b, objArray);
       makeupRespon.c = obj;
       objArray = null;
       if (!PatchProxy.isSupport(m.class) || !PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), makeupRespon, m.class, "6")) {
          Object[] objArray1 = new Object[i];
          a.D().w("MakeupModel", "int suite, type:"+makeupRespon.b, objArray1);
          makeupRespon.f.clear();
          List list = p0.cloneSuites();
          if (q.f(list)) {
             obj = new Object[i];
             a.D().A("MakeupModel", "init when no suite", obj);
          }else {
             a = makeupRespon.a;
             Objects.requireNonNull(a);
             Object obj1 = PatchProxy.apply(objArray, a, uob2, str);
             if (obj1 != PatchProxyResult.class) {
             }else {
                str2 = a.a.getString(a.b, objArray);
                if (!TextUtils.x(str2)) {
                   try{
                      obj1 = a.a.i(str2, new x1().getType());
                   }catch(com.google.gson.JsonSyntaxException e0){
                      objArray1 = new Object[i];
                      a.D().u("MakeupModel", e0, objArray1);
                   }
                   obj1 = objArray;
                }else {
                   goto label_00c6 ;
                }
             }
             a = makeupRespon.a;
             Objects.requireNonNull(a);
             Object obj2 = PatchProxy.apply(objArray, a, uob2, "3");
             if (obj2 != PatchProxyResult.class) {
             }else {
                str2 = a.a.getString(a.c, objArray);
                if (!TextUtils.x(str2)) {
                   try{
                      obj2 = a.a.i(str2, new a2().getType());
                   }catch(com.google.gson.JsonSyntaxException e0){
                      obj3 = new Object[i];
                      a.D().u("MakeupModel", e0, obj3);
                   }
                   obj2 = objArray;
                }else {
                   goto label_0102 ;
                }
             }
             a = makeupRespon.a;
             Objects.requireNonNull(a);
             obj3 = PatchProxy.apply(objArray, a, uob2, "2");
             if (obj3 != PatchProxyResult.class) {
             }else {
                str2 = a.a.getString(a.f, objArray);
                if (!TextUtils.x(str2)) {
                   try{
                      obj3 = a.a.i(str2, new z1().getType());
                   }catch(com.google.gson.JsonSyntaxException e0){
                      obj4 = new Object[i];
                      a.D().u("MakeupModel", e0, obj4);
                   }
                   obj3 = objArray;
                }else {
                   goto label_013e ;
                }
             }
             a = makeupRespon.a;
             Objects.requireNonNull(a);
             obj4 = PatchProxy.apply(objArray, a, uob2, "4");
             if (obj4 != PatchProxyResult.class) {
             }else {
                str2 = a.a.getString(a.g, objArray);
                if (!TextUtils.x(str2)) {
                   try{
                      obj4 = a.a.i(str2, new y1().getType());
                   }catch(com.google.gson.JsonSyntaxException e0){
                      Object[] objArray2 = new Object[i];
                      a.D().u("MakeupModel", e0, objArray2);
                   }
                   obj4 = objArray;
                }else {
                   goto label_017a ;
                }
             }
             makeupRespon.f.addAll(list);
             Iterator iterator = makeupRespon.f.iterator();
             while (iterator.hasNext()) {
                MakeupSuite makeupSuite = iterator.next();
                if (makeupSuite.isEmpty() || makeupSuite.isReco()) {
                   iterator1 = iterator;
                }else {
                   List list1 = p0.cloneParts();
                   if (q.f(list1)) {
                      obj = new Object[i];
                      a.D().t("MakeupModel", "init when no part", obj);
                      break ;
                   }else {
                      makeupSuite.setParts(list1);
                      makeupSuite.setPartToPreset(p1);
                      if (obj3 != null) {
                         makeupSuite.setSelectedPart(obj3.get(makeupSuite.mId));
                      }
                      if (obj4 != null) {
                         Float uFloat = obj4.get(makeupSuite.mId);
                         if (uFloat != null) {
                            makeupSuite.setIntensity(uFloat);
                         }
                      }
                      Map map = (obj1 != null)? obj1.get(makeupSuite.mId): objArray;
                      makeupSuite.updatePartsSelectedMaterial(map);
                      if (PatchProxy.applyVoidTwoRefs(makeupSuite, obj2, makeupRespon, m.class, "7") || (obj2 != null && !obj2.isEmpty())) {
                         iterator2 = makeupSuite.getParts().iterator();
                         while (iterator2.hasNext()) {
                            List materials1 = iterator2.next().getMaterials();
                            if (q.f(materials1)) {
                            }else {
                               iterator3 = materials1.iterator();
                               while (iterator3.hasNext()) {
                                  Object obj5 = iterator3.next();
                                  iterator1 = iterator;
                                  Float uFloat1 = obj2.get(m.i(makeupSuite.mId, obj5.mId));
                                  if (uFloat1 != null) {
                                     obj5.setUserIntensity(uFloat1);
                                  }
                                  iterator = iterator1;
                                  obj5 = null;
                               }
                               int i1 = p0;
                            }
                         }
                      }
                      iterator1 = iterator;
                      if (!PatchProxy.applyVoidOneRefs(makeupSuite, makeupRespon, m.class, "8")) {
                         iterator = makeupSuite.getParts().iterator();
                         while (iterator.hasNext()) {
                            MakeupPart makeupPart = iterator.next();
                            List materials = makeupPart.getMaterials();
                            if (q.f(materials)) {
                            }else {
                               iterator2 = materials.iterator();
                               while (iterator2.hasNext()) {
                                  MakeupMaterial makeupMateri = iterator2.next();
                                  iterator3 = iterator;
                                  if (makeupMateri.mId != "-1000") {
                                     makeupMateri.mItemNameStyle = makeupPart.mItemNameStyle;
                                  }
                                  iterator = iterator3;
                               }
                            }
                         }
                      }
                   }
                }
                iterator = iterator1;
                i = 0;
                boolean b = false;
             }
          }
       }
       obj = null;
       if (!PatchProxy.applyVoid(obj, makeupRespon, m.class, "9")) {
          a = makeupRespon.a;
          Objects.requireNonNull(a);
          String str1 = PatchProxy.apply(obj, a, uob2, "7");
          if (str1 != PatchProxyResult.class) {
          }else {
             str1 = a.a.getString(a.d, "-10");
          }
          makeupRespon.p(str1);
          makeupRespon.o(this.d());
       }
       makeupRespon.i = true;
       return;
    }
    public boolean l(){
       return this.i;
    }
    public boolean m(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       m obj = PatchProxy.apply(objArray, this, m.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, b2.class, "5");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.a.getBoolean(obj.e, false);
       return b;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, m.class, "19")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MakeupModel", "saveMakeupConfig, type: "+this.b, objArray);
       if (this.i == null) {
          Object[] objArray1 = new Object[i];
          a.D().A("MakeupModel", "not been initialized.", objArray1);
          return;
       }else {
          c.a(new l0(this));
          return;
       }
    }
    public void o(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "11")) {
          return;
       }
       this.d = new m$b(p0);
       return;
    }
    public void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "13")) {
          return;
       }
       this.e = new m$b(p0);
       return;
    }
    public void q(m$a p0){
       this.j = p0;
    }
}
