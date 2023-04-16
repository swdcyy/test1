package com.kwai.android.common.ext.MutableMapExtKt;
import java.util.Map;
import com.google.gson.Gson;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class MutableMapExtKt	// class@000990
{

    public static final String toJson(Map p0,Gson p1){
       a.p(p1, "gson");
       String str = "{}";
       if (p0 == null) {
          return str;
       }
       String str1 = p1.q(p0);
       a.o(str1, "gson.toJson\(this\)");
       return str1;
    }
    public static String toJson$default(Map p0,Gson p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = new Gson();
       }
       return MutableMapExtKt.toJson(p0, p1);
    }
}
