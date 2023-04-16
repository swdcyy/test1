package com.vimeo.stag.KnownTypeAdapters$7;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.b;

public final class KnownTypeAdapters$7 extends TypeAdapter	// class@000fef
{

    public void KnownTypeAdapters$7(){
       super();
    }
    public Object read(a p0){
       JsonElement jsonElement = KnownTypeAdapters.o.read(p0);
       JsonObject jsonObject = (jsonElement != null && jsonElement.E())? jsonElement.r(): null;
       return jsonObject;
    }
    public void write(b p0,Object p1){
       KnownTypeAdapters.o.write(p0, p1);
    }
}
