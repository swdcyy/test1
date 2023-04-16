package com.yxcorp.gifshow.relation.friend.manage.delegate.a$a;
import erd.o;
import com.yxcorp.gifshow.relation.friend.manage.delegate.a$b;
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
import java.lang.Throwable;

public final class a$a implements o	// class@0018ba
{
    public final a$b b;
    public final g c;

    public void a$a(a$b p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "res");
          KwaiException kwaiExceptio = 1;
          if (p0.b() != kwaiExceptio) {
             this.b.b(new KwaiException(p0));
             kwaiExceptio = false;
          }else {
             this.c.accept(p0.a());
          }
          uBoolean = Boolean.valueOf(kwaiExceptio);
       }
       return uBoolean;
    }
}
