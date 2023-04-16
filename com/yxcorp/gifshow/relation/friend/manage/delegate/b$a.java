package com.yxcorp.gifshow.relation.friend.manage.delegate.b$a;
import erd.o;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.retrofit.model.KwaiException;

public final class b$a implements o	// class@0018c4
{
    public final g b;
    public final g c;

    public void b$a(g p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "res");
          KwaiException kwaiExceptio = 1;
          if (p0.b() != kwaiExceptio) {
             this.b.accept(new KwaiException(p0));
             kwaiExceptio = false;
          }else {
             this.c.accept(p0.a());
          }
          uBoolean = Boolean.valueOf(kwaiExceptio);
       }
       return uBoolean;
    }
}
