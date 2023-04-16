package com.kwai.framework.network.keyconfig.a$b;
import java.util.concurrent.Callable;
import com.kwai.framework.network.keyconfig.a;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ob6.h;
import java.util.Objects;
import ta6.c;
import q87.c;
import ob6.u;
import kotlin.jvm.internal.a;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.util.Iterator;
import java.lang.Iterable;
import ob6.p$b;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class a$b implements Callable	// class@000c22
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public Object call(){
       boolean c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a$b obj = PatchProxy.apply(objArray, this, a$b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.b;
          Objects.requireNonNull(obj);
          p$b obj1 = PatchProxy.apply(objArray, obj, a.class, "21");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             int i = 0;
             Object[] objArray1 = new Object[i];
             c.C().w("KeyConfigManager", "Get local keyConfig", objArray1);
             h oh = u.i();
             Objects.requireNonNull(u.d);
             c = u.c;
             h mBaseConfig = oh.mBaseConfig;
             a.o(mBaseConfig, "keyConfig.mBaseConfig");
             mBaseConfig.i(0);
             String str = (c)? "PREDEFINED": "CACHED";
             obj.o(oh, c, str);
             objArray1 = new Object[i];
             c.C().w("KeyConfigManager", "Get local keyConfig done.", objArray1);
             oh.a = i;
             obj = oh;
          }
          Iterator iterator = this.b.d.iterator();
          while (iterator.hasNext()) {
             obj1 = iterator.next();
             try{
                obj1.a(obj);
             }catch(java.lang.Exception e2){
                ExceptionHandler.handleCaughtException(e2);
                goto label_0068 ;
             }
          }
       }
       return obj;
    }
}
