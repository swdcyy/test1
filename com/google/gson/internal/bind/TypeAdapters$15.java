package com.google.gson.internal.bind.TypeAdapters$15;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.lang.Character;
import com.google.gson.JsonSyntaxException;
import java.lang.StringBuilder;
import com.google.gson.stream.b;

public class TypeAdapters$15 extends TypeAdapter	// class@00058f
{

    public void TypeAdapters$15(){
       super();
    }
    public Object read(a p0){
       Character uCharacter;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          uCharacter = null;
       }else {
          String str = p0.E();
          if (str.length() == 1) {
             uCharacter = Character.valueOf(str.charAt(0));
          }else {
             throw new JsonSyntaxException("Expecting character, got: "+str);
          }
       }
       return uCharacter;
    }
    public void write(b p0,Object p1){
       p1 = (p1 == null)? null: String.valueOf(p1);
       p0.O(p1);
       return;
    }
}
