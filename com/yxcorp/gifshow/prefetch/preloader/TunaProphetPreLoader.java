package com.yxcorp.gifshow.prefetch.preloader.TunaProphetPreLoader;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.System;
import gu7.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import brd.t;
import ju7.b;
import com.yxcorp.gifshow.prefetch.preloader.TunaProphetPreLoader$get$$inlined$let$lambda$1;
import msd.a;
import com.kwai.tuna_preloader.DataPreLoader$LoadController;
import java.lang.Integer;

public abstract class TunaProphetPreLoader	// class@0010df
{
    public final String a;
    public b b;

    public void TunaProphetPreLoader(){
       super();
       this.a = this.d()+'_'+System.currentTimeMillis()+'_'+this.hashCode();
    }
    public abstract b a();
    public boolean b(TunaProphetPreLoader p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TunaProphetPreLoader.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "new");
       p0 = this.b;
       int i = 0;
       if (p0 != null) {
          int state = p0.getState();
          if (state == 1) {
             i = true;
          }else if(state == 4){
             i = p0.d() ^ 0x01;
          }
       }
       return i;
    }
    public final t c(t p0,boolean p1){
       TunaProphetPreLoader tunaProphetP = TunaProphetPreLoader.class;
       if (PatchProxy.isSupport(tunaProphetP)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, tunaProphetP, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "realObservable");
       tunaProphetP = this.b;
       if (tunaProphetP != null) {
          return tunaProphetP.b(p1, new b(new TunaProphetPreLoader$get$$inlined$let$lambda$1(p1, p0)));
       }else {
          return null;
       }
    }
    public abstract String d();
    public final String e(){
       return this.a;
    }
    public final Integer f(){
       Object[] objArray = null;
       TunaProphetPreLoader obj = PatchProxy.apply(objArray, this, TunaProphetPreLoader.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          objArray = Integer.valueOf(obj.getState());
       }
       return objArray;
    }
}
