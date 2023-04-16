package com.kwai.sharelib.tools.Gsons$KWAI_GSON$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.google.gson.Gson;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zk.d;
import com.kwai.sharelib.tools.Gsons$KWAI_GSON$2$a;
import java.lang.reflect.Type;
import el.a;
import com.kwai.sharelib.tools.MapDeserializer;
import com.yxcorp.utility.gson.ForwardingGsonLifecycleFactory;
import zk.j;

public final class Gsons$KWAI_GSON$2 extends Lambda implements a	// class@0016fd
{
    public static final Gsons$KWAI_GSON$2 INSTANCE;

    static {
       Gsons$KWAI_GSON$2.INSTANCE = new Gsons$KWAI_GSON$2();
    }
    public void Gsons$KWAI_GSON$2(){
       super(0);
    }
    public final Gson invoke(){
       d obj = PatchProxy.apply(null, this, Gsons$KWAI_GSON$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d();
       obj.f(new Gsons$KWAI_GSON$2$a().getType(), new MapDeserializer());
       obj.g(new ForwardingGsonLifecycleFactory(null));
       obj.j();
       return obj.b();
    }
    public Object invoke(){
       return this.invoke();
    }
}
