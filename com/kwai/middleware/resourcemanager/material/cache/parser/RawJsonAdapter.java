package com.kwai.middleware.resourcemanager.material.cache.parser.RawJsonAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.JsonElement;
import com.google.gson.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.google.gson.stream.b;

public final class RawJsonAdapter extends TypeAdapter	// class@000f59
{

    public void RawJsonAdapter(){
       super();
    }
    public Object read(a p0){
       String str = c.b(p0).toString();
       a.o(str, "JsonParser\(\).parse\(reader\).toString\(\)");
       return str;
    }
    public void write(b p0,Object p1){
       if (p0 != null) {
          p0.p(p1);
       }
       return;
    }
}
