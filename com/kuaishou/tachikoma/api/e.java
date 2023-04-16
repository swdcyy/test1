package com.kuaishou.tachikoma.api.e;
import tx4.h;
import com.tkruntime.v8.V8Function;
import com.tachikoma.core.bridge.d;
import java.lang.Object;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import tx4.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.bridge.a$b;
import java.util.concurrent.Executor;
import com.tachikoma.core.bridge.a;
import tw4.m;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;
import java.lang.Throwable;
import wp8.a;
import tw4.n;
import tw4.l;

public class e implements h	// class@000f7f
{
    public final JsValueRef a;
    public final d b;

    public void e(V8Function p0,d p1){
       super();
       this.a = y.b(p0, this);
       this.b = p1;
    }
    public void a(a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       if (this.b.j()) {
          a.b(false, this.b.b().f()).execute(new m(this, p0, p1));
       }else {
          this.b(p0, p1);
       }
       return;
    }
    public final Object b(a p0,Object[] p1){
       e obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null || !y.a(obj.get())) {
          if (p0 != null) {
             p0.a(new Throwable("Function is inValid"));
          }
          return null;
       }else {
          p1 = V8ObjectUtilsQuick.getValue(this.a.get().call(null, p1));
          if (p0 != null) {
             p0.onSuccess(p1);
          }
          return p1;
       }
    }
    public Object call(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.b.j()) {
          return this.b(null, p0);
       }
       a.b(false, this.b.b().f()).execute(new n(this, p0));
       return null;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       if (this.b.j()) {
          a.b(false, this.b.b().f()).execute(new l(this));
       }else {
          y.c(this.a);
       }
       return;
    }
}
