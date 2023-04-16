package com.yxcorp.gifshow.relation.friend.manage.delegate.b$h;
import erd.g;
import z1.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class b$h implements g	// class@0018cb
{
    public final a b;

    public void b$h(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$h.class, "1")) {
       }else {
          p0 = this.b;
          if (p0 != null) {
             p0.accept(Boolean.FALSE);
          }
       }
       return;
    }
}
