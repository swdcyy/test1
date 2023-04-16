package com.yxcorp.gifshow.matrix.MatrixInitModuleForMainProcess;
import com.kwai.framework.init.TTIInitModule;
import com.yxcorp.gifshow.matrix.MatrixInitModuleForMainProcess$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import ax7.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ikc.b;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import zk.g;

public final class MatrixInitModuleForMainProcess extends TTIInitModule	// class@001cdf
{
    public Boolean q;
    public static final MatrixInitModuleForMainProcess$a r;

    static {
       MatrixInitModuleForMainProcess.r = new MatrixInitModuleForMainProcess$a(null);
    }
    public void MatrixInitModuleForMainProcess(){
       super();
    }
    public int f0(){
       return 9;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, MatrixInitModuleForMainProcess.class, "2")) {
          return;
       }
       if (!this.n0()) {
          return;
       }
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       c.a(uApplication, true);
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, MatrixInitModuleForMainProcess.class, "1")) {
          return;
       }
       if (!this.n0()) {
          return;
       }
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       c.a(uApplication, false);
       return;
    }
    public final boolean n0(){
       boolean b1;
       Boolean tRUE;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, MatrixInitModuleForMainProcess.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.q == null) {
          obj = PatchProxy.apply(objArray, this, MatrixInitModuleForMainProcess.class, "4");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(a.d()){
             b1 = b.b.a();
          }else {
             b1 = false;
          }
          if (b1) {
             tRUE = Boolean.TRUE;
          }else {
             f uof = a.t().f("matrixSDK");
             JsonElement jsonElement = (uof != null)? uof.c(): objArray;
             if (!jsonElement instanceof JsonObject) {
                jsonElement = objArray;
             }
             if (jsonElement != null) {
                g og = jsonElement.r0("enable_matrix");
                if (og != null) {
                   objArray = Boolean.valueOf(og.d());
                }
             }
             tRUE = Boolean.valueOf(a.g(Boolean.TRUE, objArray));
          }
          this.q = tRUE;
       }
       MatrixInitModuleForMainProcess tq = this.q;
       if (tq != null) {
          b = tq.booleanValue();
       }
       return b;
    }
}
