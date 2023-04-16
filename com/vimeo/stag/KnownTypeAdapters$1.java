package com.vimeo.stag.KnownTypeAdapters$1;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Byte;
import com.google.gson.JsonSyntaxException;
import java.lang.Throwable;
import com.google.gson.stream.b;
import java.lang.Number;

public final class KnownTypeAdapters$1 extends TypeAdapter	// class@000fe9
{

    public void KnownTypeAdapters$1(){
       super();
    }
    public Object read(a p0){
       try{
          return Byte.valueOf((byte)p0.v());
       }catch(java.lang.NumberFormatException e2){
          throw new JsonSyntaxException(e2);
       }
    }
    public void write(b p0,Object p1){
       p0.M(p1);
    }
}
