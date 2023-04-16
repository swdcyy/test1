package com.google.gson.internal.bind.TypeAdapters$23;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.net.InetAddress;
import com.google.gson.stream.b;

public class TypeAdapters$23 extends TypeAdapter	// class@000598
{

    public void TypeAdapters$23(){
       super();
    }
    public Object read(a p0){
       InetAddress inetAddress;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          inetAddress = null;
       }else {
          inetAddress = InetAddress.getByName(p0.E());
       }
       return inetAddress;
    }
    public void write(b p0,Object p1){
       p1 = (p1 == null)? null: p1.getHostAddress();
       p0.O(p1);
       return;
    }
}
