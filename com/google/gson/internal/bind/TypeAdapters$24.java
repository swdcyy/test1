package com.google.gson.internal.bind.TypeAdapters$24;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.util.UUID;
import com.google.gson.stream.b;

public class TypeAdapters$24 extends TypeAdapter	// class@000599
{

    public void TypeAdapters$24(){
       super();
    }
    public Object read(a p0){
       UUID uUID;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          uUID = null;
       }else {
          uUID = UUID.fromString(p0.E());
       }
       return uUID;
    }
    public void write(b p0,Object p1){
       p1 = (p1 == null)? null: p1.toString();
       p0.O(p1);
       return;
    }
}
