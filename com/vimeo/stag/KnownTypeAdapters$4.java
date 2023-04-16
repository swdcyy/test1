package com.vimeo.stag.KnownTypeAdapters$4;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Long;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;
import java.lang.Number;

public final class KnownTypeAdapters$4 extends TypeAdapter	// class@000fec
{

    public void KnownTypeAdapters$4(){
       super();
    }
    public Object read(a p0){
       try{
          return Long.valueOf(p0.x());
       }catch(java.lang.NumberFormatException e3){
          throw new JsonSyntaxException(e3);
       }
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
