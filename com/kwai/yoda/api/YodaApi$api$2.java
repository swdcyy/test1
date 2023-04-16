package com.kwai.yoda.api.YodaApi$api$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.api.YodaApi;
import java.lang.Object;
import qx7.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t97.b;
import com.kwai.yoda.Yoda;
import kotlin.jvm.internal.a;
import u97.g;
import t97.a;

public final class YodaApi$api$2 extends Lambda implements a	// class@00116d
{
    public final YodaApi this$0;

    public void YodaApi$api$2(YodaApi p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       b obj = PatchProxy.apply(null, this, YodaApi$api$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b("Yoda");
       obj.m(1);
       YodaApi c = this.this$0.c;
       if (c != null) {
          Yoda yoda = Yoda.get();
          a.h(yoda, "Yoda.get\(\)");
          if (yoda.isDebugMode()) {
             obj.k(c);
          }
       }
       return obj.b().a(c.class);
    }
}
