package com.google.gson.internal.bind.TypeAdapters$28;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.google.gson.stream.JsonToken;
import java.lang.String;
import java.util.StringTokenizer;
import java.util.Locale;
import com.google.gson.stream.b;

public class TypeAdapters$28 extends TypeAdapter	// class@00059e
{

    public void TypeAdapters$28(){
       super();
    }
    public Object read(a p0){
       String str = null;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
       }else {
          StringTokenizer stringTokeni = new StringTokenizer(p0.E(), "_");
          String str1 = (stringTokeni.hasMoreElements())? stringTokeni.nextToken(): str;
          String str2 = (stringTokeni.hasMoreElements())? stringTokeni.nextToken(): str;
          if (stringTokeni.hasMoreElements()) {
             str = stringTokeni.nextToken();
          }
          if (str2 == null && str == null) {
             str = new Locale(str1);
          }else if(str == null){
             str = new Locale(str1, str2);
          }else {
             str = new Locale(str1, str2, str);
          }
       }
       return str;
    }
    public void write(b p0,Object p1){
       p1 = (p1 == null)? null: p1.toString();
       p0.O(p1);
       return;
    }
}
