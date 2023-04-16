package com.kwai.android.common.ext.JsonObjectExtKt;
import com.google.gson.JsonObject;
import java.lang.String;
import com.google.gson.JsonElement;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.lang.Character;
import java.lang.Number;

public final class JsonObjectExtKt	// class@00098f
{

    public static final JsonElement get(JsonObject p0,String p1){
       a.p(p0, "$this$get");
       a.p(p1, "key");
       JsonElement jsonElement = p0.e0(p1);
       a.o(jsonElement, "this.get\(key\)");
       return jsonElement;
    }
    public static final void set(JsonObject p0,String p1,Boolean p2){
       a.p(p0, "$this$set");
       a.p(p1, "key");
       p0.H(p1, p2);
    }
    public static final void set(JsonObject p0,String p1,Character p2){
       a.p(p0, "$this$set");
       a.p(p1, "key");
       p0.N(p1, p2);
    }
    public static final void set(JsonObject p0,String p1,Number p2){
       a.p(p0, "$this$set");
       a.p(p1, "key");
       p0.a0(p1, p2);
    }
    public static final void set(JsonObject p0,String p1,String p2){
       a.p(p0, "$this$set");
       a.p(p1, "key");
       p0.c0(p1, p2);
    }
}
