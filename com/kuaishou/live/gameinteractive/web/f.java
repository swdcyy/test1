package com.kuaishou.live.gameinteractive.web.f;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a$e;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n43.a;
import pp.a;
import q87.c;
import v43.c;

public class f implements g	// class@001c11
{
    public final a$e b;

    public void f(a$e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else if(p0 != null && (p0.a() != null && this.b.d != null)){
          if (p0.a().a()) {
             Object[] objArray = new Object[0];
             a.C().s("GameInteractiveCommonBridgeImpl", "payKCoin request server success!", objArray);
             this.b.d.onSuccess();
          }else {
             this.b.d.onError(p0.b(), p0.c());
          }
       }
       return;
    }
}
