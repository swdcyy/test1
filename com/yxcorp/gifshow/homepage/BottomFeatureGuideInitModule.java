package com.yxcorp.gifshow.homepage.BottomFeatureGuideInitModule;
import com.kwai.framework.init.TTIInitModule;
import com.yxcorp.gifshow.homepage.BottomFeatureGuideInitModule$a;
import nsd.u;
import crd.a;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.homepage.BottomFeatureGuideInitModule$b;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager;
import qrd.p;
import java.lang.Boolean;
import android.app.Activity;
import o56.f;
import zk0.e;
import java.lang.Integer;
import zk0.a;
import java.util.Map;
import com.kwai.kcube.TabIdentifier;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import lo5.a;
import ko5.c;
import on5.b;
import wkd.b;
import tjc.c;
import tra.b;
import q87.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.homepage.BottomFeatureGuideInitModule$c;
import erd.g;
import crd.b;
import uv8.r0;
import uv8.q0;
import tra.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.homepage.BottomFeatureGuideInitModule$d;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class BottomFeatureGuideInitModule extends TTIInitModule	// class@00169b
{
    public boolean q;
    public final a r;
    public static final BottomFeatureGuideInitModule$a s;

    static {
       BottomFeatureGuideInitModule.s = new BottomFeatureGuideInitModule$a(null);
    }
    public void BottomFeatureGuideInitModule(){
       super();
       this.r = new a();
    }
    public int f0(){
       return 14;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomFeatureGuideInitModule.class, "1")) {
          return;
       }
       k1.o(new BottomFeatureGuideInitModule$b(this));
       return;
    }
    public final void n0(){
       Object obj;
       TabIdentifier f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BottomFeatureGuideInitModule.class, "2")) {
          return;
       }
       Boolean uBoolean = PatchProxy.apply(objArray, objArray, HomeExperimentManager.class, "7");
       if (uBoolean == patchProxyRe) {
          uBoolean = HomeExperimentManager.g.getValue();
       }
       if (!uBoolean.booleanValue()) {
          this.r.d();
          return;
       }else {
          Activity uActivity = f.a();
          int i = 1;
          e uoe = e.class;
          if (PatchProxy.isSupport(uoe)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(i), objArray, uoe, "4");
             if (obj != patchProxyRe) {
             label_005a :
                if (obj != null) {
                   objArray = obj.b;
                }
                QCurrentUser mE = QCurrentUser.ME;
                a.o(mE, "QCurrentUser.ME");
                if (mE.isLogined() && (objArray == null || uActivity == null)) {
                   this.r.d();
                   return;
                }else {
                   f = b.f;
                   this.q = c.b(uActivity).e(f);
                   if (!a.g(objArray, b.b) && (a.g(objArray, b.c) || a.g(objArray, f))) {
                      if (!b.a(-1608526086).S()) {
                         Object[] objArray1 = new Object[0];
                         b.C().s("BottomFeatureGuideInitModule", "no Splash this time£¬tryShow Normal", objArray1);
                         this.o0();
                      }
                   }else {
                      this.r.d();
                   }
                   this.r.c(RxBus.f.f(e.class).observeOn(d.a).subscribe(new BottomFeatureGuideInitModule$c(this)));
                   return;
                }
             }
          }
          obj = e.a.get(Integer.valueOf(i));
          goto label_005a ;
       }
    }
    public final void o0(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       r0 or0 = r0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BottomFeatureGuideInitModule.class, "4")) {
          return;
       }
       this.r.d();
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       String id = mE.getId();
       Map map = PatchProxy.apply(objArray, objArray, or0, "5");
       if (map != patchProxyRe) {
       }else {
          Type l = q0.L;
          String str = "";
          String str1 = a.a.getString("userInFeatureTopStateBeforeMap", str);
          map = (str1 == null || str1 == str)? objArray: b.a(str1, l);
       }
       if (map == null) {
          map = new LinkedHashMap();
       }
       if (map.isEmpty() || map.get(id) == null) {
          map.put(id, Boolean.valueOf(this.q));
          if (!PatchProxy.applyVoidOneRefs(map, objArray, or0, "6")) {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putString("userInFeatureTopStateBeforeMap", b.e(map));
             g.a(uEditor);
          }
          Object[] objArray1 = new Object[0];
          b.C().s("BottomFeatureGuideInitModule", "map is null ,first time to store", objArray1);
          return;
       }else if(a.g(map.get(id), Boolean.TRUE) && this.q == null){
          Object obj = PatchProxy.apply(objArray, this, BottomFeatureGuideInitModule.class, "6");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             Object obj1 = PatchProxy.apply(objArray, objArray, or0, "7");
             b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.a.getBoolean("HasShownFeatureBottomDialog", 0);
          }
          if (!b) {
             k1.r(new BottomFeatureGuideInitModule$d(this), 3000);
          }
       }
    label_00a0 :
       return;
    }
}
