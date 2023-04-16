package com.google.gson.internal.bind.TypeAdapters$21;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.net.URL;
import com.google.gson.stream.b;

public class TypeAdapters$21 extends TypeAdapter	// class@000596
{

    public void TypeAdapters$21(){
       super();
    }
    public Object read(a p0){
       URL uRL = null;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
       }else {
          String str = p0.E();
          if (!("null").equals(str)) {
             uRL = new URL(str);
          }
       }
       return uRL;
    }
    public void write(b p0,Object p1){
       p1 = (p1 == null)? null: p1.toExternalForm();
       p0.O(p1);
       return;
    }
}
