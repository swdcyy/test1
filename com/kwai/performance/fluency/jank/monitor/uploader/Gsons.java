package com.kwai.performance.fluency.jank.monitor.uploader.Gsons;
import zk.d;
import org.json.JSONArray;
import com.kwai.performance.fluency.jank.monitor.uploader.Gsons$gson$1;
import java.lang.reflect.Type;
import java.lang.Object;
import com.google.gson.Gson;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class Gsons	// class@001090
{
    public static final Gsons a;
    public static final Gson b;

    static {
       Gsons.a = new Gsons();
       d uod = new d();
       uod.f(JSONArray.class, new Gsons$gson$1());
       Gson gson = uod.b();
       a.o(gson, "GsonBuilder\(\).registerTypeAdapter\(\n    JSONArray::class.java, object : TypeAdapter<JSONArray>\(\) {\n      override fun write\(out: JsonWriter?, value: JSONArray?\) {\n        out?.beginArray\(\)\n        value?.let {\n          for \(i in 0 until value.length\(\)\) {\n            when \(val element = value.get\(i\)\) {\n              is String -> out?.value\(element\)\n              is Number -> out?.value\(element\)\n              is Boolean -> out?.value\(element\)\n              is JSONObject -> out?.jsonValue\(element.toString\(\)\)\n              is JSONArray -> write\(out, element\)\n              else -> out?.nullValue\(\)\n            }\n          }\n        }\n        out?.endArray\(\)\n      }\n\n      override fun read\(`in`: JsonReader?\): JSONArray {\n        return JSONArray\(\)\n      }\n    }\).create\(\)");
       Gsons.b = gson;
    }
    public void Gsons(){
       super();
    }
    public final Gson a(){
       return Gsons.b;
    }
}
