package com.vimeo.stag.KnownTypeAdapters$8;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.stream.b;

public final class KnownTypeAdapters$8 extends TypeAdapter	// class@000ff0
{

    public void KnownTypeAdapters$8(){
       super();
    }
    public Object read(a p0){
       JsonElement jsonElement = KnownTypeAdapters.o.read(p0);
       JsonArray jsonArray = (jsonElement != null && jsonElement.B())? jsonElement.q(): null;
       return jsonArray;
    }
    public void write(b p0,Object p1){
       KnownTypeAdapters.o.write(p0, p1);
    }
}
