package com.kwai.framework.model.decompose.internal.a;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.google.gson.JsonObject;
import java.util.Objects;
import com.kwai.framework.model.decompose.api.ParseException;
import java.lang.StringBuilder;

public final class a	// class@0016a3
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final JsonElement a(JsonElement p0,String p1){
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "json");
       a.p(p1, "pathStr");
       String[] stringArray = new String[]{"."};
       int i = 0;
       obj = StringsKt__StringsKt.H4(p1, stringArray, false, 0, 6, null).iterator();
       while (true) {
          if (!obj.hasNext()) {
             return p0;
          }
          Object obj1 = obj.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          if (p0 instanceof JsonObject) {
             Objects.requireNonNull(p0, "null cannot be cast to non-null type com.google.gson.JsonObject");
             if (!p0.s0(obj1)) {
                break ;
             }else {
                p0 = p0.e0(obj1);
                a.o(p0, "obj.get\(path\)");
                i = i1;
             }
          }else {
             throw new ParseException(p1+" not json object when deserialize "+obj1);
          }
       }
       return null;
    }
}
