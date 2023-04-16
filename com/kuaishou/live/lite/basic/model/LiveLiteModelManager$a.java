package com.kuaishou.live.lite.basic.model.LiveLiteModelManager$a;
import lp3.e;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import java.lang.Object;
import java.lang.Class;
import lp3.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.Boolean;
import lp3.i;
import kotlin.jvm.internal.a;

public final class LiveLiteModelManager$a implements e	// class@001e8c
{
    public final LiveLiteModelManager a;

    public void LiveLiteModelManager$a(LiveLiteModelManager p0){
       this.a = p0;
       super();
    }
    public c a(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
       return this.a.c(p0, "");
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, LiveLiteModelManager$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.a.b();
    }
    public c c(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelManager$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       return this.a.d(p0, "");
    }
    public void clear(){
    }
    public boolean d(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelManager$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.a.d(p0);
    }
}
