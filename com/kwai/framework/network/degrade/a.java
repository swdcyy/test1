package com.kwai.framework.network.degrade.a;
import java.util.List;
import java.lang.Object;
import com.google.gson.Gson;
import java.util.HashMap;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegradeConfig;
import fb6.b;
import java.lang.Runnable;
import ekd.k1;
import fb6.a;

public class a	// class@0017b7
{
    public Gson a;
    public Map b;
    public final List c;

    public void a(List p0){
       super();
       this.a = new Gson();
       this.b = new HashMap();
       this.c = p0;
    }
    public synchronized Object a(String p0,Type p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.get(p0) == null) {
          return null;
       }
       obj = this.a;
       return obj.i(obj.q(this.b.get(p0)), p1);
    }
    public synchronized void b(DegradeConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (p0 != null) {
          DegradeConfig mConfig = p0.mConfig;
          if (mConfig != null) {
             DegradeConfig$UrlDegradeConfig mActionConfi = mConfig.mActionConfig;
             if (mActionConfi != null && mActionConfi.size() > 0) {
                this.b.putAll(p0.mConfig.mActionConfig);
                k1.o(new b(this));
                return;
             }
          }
       }
       this.b.clear();
       k1.o(new a(this));
       return;
    }
}
