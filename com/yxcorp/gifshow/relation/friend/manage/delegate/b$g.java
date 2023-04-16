package com.yxcorp.gifshow.relation.friend.manage.delegate.b$g;
import erd.g;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$g implements g	// class@0018ca
{
    public final a b;

    public void b$g(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$g.class, "1")) {
       }else {
          p0 = this.b;
          if (p0 != null) {
             p0.accept(Boolean.TRUE);
          }
       }
       return;
    }
}
