package me9.d$d;
import erd.o;
import java.lang.Object;
import android.util.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.CharSequence;

public final class d$d implements o	// class@002fe9
{
    public static final d$d b;

    static {
       d$d.b = new d$d();
    }
    public void d$d(){
       super();
    }
    public Object apply(Object p0){
       JsonObject jsonObject = PatchProxy.applyOneRefs(p0, this, d$d.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          jsonObject = new JsonObject();
          jsonObject.a0("progress", p0.first);
          Pair second = p0.second;
          String str = (second == null || !second.length())? 1: null;
          if (!str) {
             jsonObject.c0("path", p0.second);
          }
       }
       return jsonObject;
    }
}
