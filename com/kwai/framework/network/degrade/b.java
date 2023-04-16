package com.kwai.framework.network.degrade.b;
import retrofit2.a;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade;
import okhttp3.Call;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import retrofit2.p;
import okhttp3.Response;
import byd.f;
import java.lang.IllegalStateException;
import byd.a;
import java.util.Objects;
import com.kwai.framework.network.degrade.b$a;
import okhttp3.Callback;
import java.lang.Boolean;
import okhttp3.Request;

public class b implements a	// class@0017b9
{
    public final a b;
    public Call c;
    public final DegradeConfig$UrlDegrade d;
    public boolean e;
    public boolean f;

    public void b(a p0,DegradeConfig$UrlDegrade p1,Call p2){
       super();
       this.b = p0;
       this.d = p1;
       this.c = p2;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.f = true;
       _monitor_enter(this);
       b tc = this.c;
       _monitor_exit(this);
       if (tc != null) {
          tc.cancel();
       }
       return;
    }
    public Object clone(){
       return this.clone();
    }
    public a clone(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this.b, this.d, this.c.clone());
    }
    public p execute(){
       b obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       _monitor_enter(this);
       if (this.e != null) {
          throw new IllegalStateException("Already executed.");
       }
       this.e = true;
       obj = this.c;
       _monitor_exit(this);
       if (this.f != null) {
          obj.cancel();
       }
       return f.a(this.b, obj.execute());
    }
    public void h4(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0, "callback == null");
       _monitor_enter(this);
       if (this.e != null) {
          throw new IllegalStateException("Already executed.");
       }
       this.e = true;
       b tc = this.c;
       _monitor_exit(this);
       if (this.f != null) {
          tc.cancel();
       }
       tc.enqueue(new b$a(this, p0));
       return;
    }
    public boolean isCanceled(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       if (this.f != null) {
          return b;
       }
       _monitor_enter(this);
       obj = this.c;
       if (obj == null || !obj.isCanceled()) {
          b = false;
       }
       _monitor_exit(this);
       return b;
    }
    public boolean isExecuted(){
       return this.e;
    }
    public Request request(){
       Object obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.request();
    }
}
