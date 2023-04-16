package com.vimeo.stag.KnownTypeAdapters$6;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Double;
import com.google.gson.stream.b;
import java.lang.Number;

public final class KnownTypeAdapters$6 extends TypeAdapter	// class@000fee
{

    public void KnownTypeAdapters$6(){
       super();
    }
    public Object read(a p0){
       return Double.valueOf(p0.u());
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
