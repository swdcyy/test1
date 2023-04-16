package com.google.gson.internal.bind.TypeAdapters$22;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.net.URI;
import com.google.gson.JsonIOException;
import java.lang.Throwable;
import com.google.gson.stream.b;

public class TypeAdapters$22 extends TypeAdapter	// class@000597
{

    public void TypeAdapters$22(){
       super();
    }
    public Object read(a p0){
       try{
          URI uRI = null;
          if (p0.J() == JsonToken.NULL) {
             p0.A();
          }else {
             String str = p0.E();
             if (!("null").equals(str)) {
                uRI = new URI(str);
             }
          }
          return uRI;
       }catch(java.net.URISyntaxException e4){
          throw new JsonIOException(e4);
       }
    }
    public void write(b p0,Object p1){
       p1 = (p1 == null)? null: p1.toASCIIString();
       p0.O(p1);
       return;
    }
}
