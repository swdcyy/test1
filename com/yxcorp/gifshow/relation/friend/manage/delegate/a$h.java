package com.yxcorp.gifshow.relation.friend.manage.delegate.a$h;
import erd.g;
import z1.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class a$h implements g	// class@0018c1
{
    public final a b;

    public void a$h(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$h.class, "1")) {
       }else {
          p0 = this.b;
          if (p0 != null) {
             p0.accept(Boolean.FALSE);
          }
       }
       return;
    }
}
