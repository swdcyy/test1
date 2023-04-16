package com.kwai.middleware.skywalker.gson.KwaiGsonBuilder;
import com.kwai.middleware.skywalker.gson.KwaiGsonBuilder$a;
import nsd.u;
import com.kwai.middleware.skywalker.gson.KwaiGsonBuilder$Companion$defaultGson$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.HashMap;
import java.lang.reflect.Type;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.google.gson.Gson;
import zk.d;
import java.lang.Double;
import com.kwai.middleware.skywalker.gson.adapter.DoubleTypeAdapter;
import java.lang.Integer;
import com.kwai.middleware.skywalker.gson.adapter.IntegerTypeAdapter;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.FieldNamingPolicy;
import vb7.a;

public final class KwaiGsonBuilder	// class@000d76
{
    public boolean a;
    public boolean b;
    public boolean c;
    public Map d;
    public a e;
    public static final p f;
    public static final KwaiGsonBuilder$a g;

    static {
       KwaiGsonBuilder.g = new KwaiGsonBuilder$a(null);
       KwaiGsonBuilder.f = s.c(KwaiGsonBuilder$Companion$defaultGson$2.INSTANCE);
    }
    public void KwaiGsonBuilder(){
       super();
       this.a = true;
       this.b = true;
       this.c = true;
       this.d = new HashMap();
    }
    public final KwaiGsonBuilder a(Type p0,Object p1){
       a.q(p0, "type");
       a.q(p1, "typeAdapter");
       this.d.put(p0, p1);
       return this;
    }
    public final Gson b(){
       d uod = new d();
       uod.f(Double.class, new DoubleTypeAdapter());
       uod.f(Double.TYPE, new DoubleTypeAdapter());
       uod.f(Integer.class, new IntegerTypeAdapter());
       uod.f(Integer.TYPE, new IntegerTypeAdapter());
       Iterator iterator = this.d.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Type key = uEntry.getKey();
          uod.f(key, uEntry.getValue());
       }
       if (this.a != null) {
          uod.m(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
       }
       if (this.b != null) {
          uod.j();
       }
       if (this.c != null) {
          uod.c();
       }
       KwaiGsonBuilder te = this.e;
       if (te != null) {
          a.h(uod, "builder");
          uod = te.a(uod);
       }
       Gson gson = uod.b();
       a.h(gson, "builder.create\(\)");
       return gson;
    }
}
