package com.kuaishou.tuna_core.button.e;
import erd.o;
import java.lang.String;
import java.lang.Object;
import com.kwai.feature.api.social.login.model.PrePhoneNumModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna_core.button.f;
import java.util.Objects;
import com.kuaishou.tuna_core.button.f$a;
import java.lang.Integer;
import brd.t;
import wkd.b;
import e05.a;
import cjd.e;
import com.kuaishou.tuna_core.button.c;
import t45.d;
import brd.z;

public final class e implements o	// class@0010bc
{
    public final int b;
    public final String c;
    public final String d;

    public void e(int p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       f$a a;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, e.class, "1");
       if (obj2 != PatchProxyResult.class) {
       }else {
          a.p(obj1, "data");
          a = f.a;
          e b = obj.b;
          e c = obj.c;
          e d = obj.d;
          Objects.requireNonNull(a);
          if (PatchProxy.isSupport(f$a.class)) {
             obj2 = PatchProxy.applyFourRefs(obj1, Integer.valueOf(b), c, d, a, f$a.class, "4");
             if (obj2 != PatchProxyResult.class) {
             }
          }
          obj2 = b.a(-93866330).f(d, b, obj1.operatorType, obj1.mAccessCode, obj1.mAccessToken, c).map(new e()).map(c.b).subscribeOn(d.b);
          a.o(obj2, "Singleton.get\(TunaAdServ¡­waiSchedulers.NETWORKING\)");
       }
       return obj2;
    }
}
