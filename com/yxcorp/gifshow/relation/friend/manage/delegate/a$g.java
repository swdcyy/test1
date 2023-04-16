package com.yxcorp.gifshow.relation.friend.manage.delegate.a$g;
import erd.g;
import z1.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$g implements g	// class@0018c0
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$g.class, "1")) {
       }else {
          p0 = this.b;
          if (p0 != null) {
             p0.accept(Boolean.TRUE);
          }
       }
       return;
    }
}
