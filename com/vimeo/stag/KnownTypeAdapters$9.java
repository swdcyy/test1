package com.vimeo.stag.KnownTypeAdapters$9;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.JsonElement;
import zk.g;
import com.google.gson.stream.b;

public final class KnownTypeAdapters$9 extends TypeAdapter	// class@000ff1
{

    public void KnownTypeAdapters$9(){
       super();
    }
    public Object read(a p0){
       JsonElement jsonElement = KnownTypeAdapters.o.read(p0);
       g og = (jsonElement != null && jsonElement.F())? jsonElement.s(): null;
       return og;
    }
    public void write(b p0,Object p1){
       KnownTypeAdapters.o.write(p0, p1);
    }
}
