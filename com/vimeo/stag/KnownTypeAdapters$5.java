package com.vimeo.stag.KnownTypeAdapters$5;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Float;
import com.google.gson.stream.b;
import java.lang.Number;

public final class KnownTypeAdapters$5 extends TypeAdapter	// class@000fed
{

    public void KnownTypeAdapters$5(){
       super();
    }
    public Object read(a p0){
       return Float.valueOf((float)p0.u());
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
