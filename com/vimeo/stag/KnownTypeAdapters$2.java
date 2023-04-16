package com.vimeo.stag.KnownTypeAdapters$2;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Short;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;
import java.lang.Number;

public final class KnownTypeAdapters$2 extends TypeAdapter	// class@000fea
{

    public void KnownTypeAdapters$2(){
       super();
    }
    public Object read(a p0){
       try{
          return Short.valueOf((short)p0.v());
       }catch(java.lang.NumberFormatException e2){
          throw new JsonSyntaxException(e2);
       }
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
