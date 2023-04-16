package com.kuaishou.merchant.marketing.shop.auction.start.a$b;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.marketing.shop.auction.start.a$a;
import io.reactivex.g;
import t45.d;
import brd.z;
import java.util.List;
import crd.b;
import crd.c;
import e94.e;
import e94.f;
import erd.g;

public class a$b	// class@001bc9
{
    public final String a;
    public t b;
    public Object c;
    public Throwable d;
    public List e;

    public void a$b(String p0){
       super();
       this.e = new ArrayList();
       this.a = p0;
    }
    public t a(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new a$a(this)).observeOn(d.a);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "5")) {
          return;
       }
       this.c = null;
       this.d = null;
       this.e.clear();
       return;
    }
    public void c(t p0){
       this.b = p0;
    }
    public b d(){
       Object[] objArray = null;
       a$b obj = PatchProxy.apply(objArray, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.c = objArray;
       this.d = objArray;
       obj = this.b;
       if (obj == null) {
          return c.b();
       }
       return obj.subscribe(new e(this), new f(this));
    }
}
