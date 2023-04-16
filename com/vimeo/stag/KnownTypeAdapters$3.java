package com.vimeo.stag.KnownTypeAdapters$3;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Integer;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;
import java.lang.Number;

public final class KnownTypeAdapters$3 extends TypeAdapter	// class@000feb
{

    public void KnownTypeAdapters$3(){
       super();
    }
    public Object read(a p0){
       try{
          return Integer.valueOf(p0.v());
       }catch(java.lang.NumberFormatException e2){
          throw new JsonSyntaxException(e2);
       }
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
