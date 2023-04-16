package com.vimeo.stag.KnownTypeAdapters$10;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.JsonElement;
import zk.f;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.gson.stream.b;

public final class KnownTypeAdapters$10 extends TypeAdapter	// class@000fe8
{

    public void KnownTypeAdapters$10(){
       super();
    }
    public Object read(a p0){
       JsonElement jsonElement = KnownTypeAdapters.o.read(p0);
       if (jsonElement != null && jsonElement.D()) {
          if (jsonElement.D()) {
          }else {
             throw new IllegalStateException("Not a JSON Null: "+jsonElement);
          }
       }else {
          jsonElement = null;
       }
       return jsonElement;
    }
    public void write(b p0,Object p1){
       KnownTypeAdapters.o.write(p0, p1);
    }
}
