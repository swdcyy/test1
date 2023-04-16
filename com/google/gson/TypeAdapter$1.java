package com.google.gson.TypeAdapter$1;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;

public class TypeAdapter$1 extends TypeAdapter	// class@00055d
{
    public final TypeAdapter a;

    public void TypeAdapter$1(TypeAdapter p0){
       this.a = p0;
       super();
    }
    public Object read(a p0){
       if (p0.J() != JsonToken.NULL) {
          return this.a.read(p0);
       }
       p0.A();
       return null;
    }
    public void write(b p0,Object p1){
       if (p1 == null) {
          p0.u();
       }else {
          this.a.write(p0, p1);
       }
       return;
    }
}
