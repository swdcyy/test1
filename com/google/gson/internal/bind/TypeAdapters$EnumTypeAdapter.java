package com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Enum;
import java.lang.String;
import java.lang.reflect.Field;
import al.c;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.lang.AssertionError;
import com.google.gson.stream.a;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;

public final class TypeAdapters$EnumTypeAdapter extends TypeAdapter	// class@0005af
{
    public final Map a;
    public final Map b;

    public void TypeAdapters$EnumTypeAdapter(Class p0){
       super();
       this.a = new HashMap();
       HashMap hashMap = new HashMap();
       try{
          this.b = hashMap;
          Enum[] enumConstant = p0.getEnumConstants();
          int len = enumConstant.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = enumConstant[i];
             String str = oobject.name();
             c annotation = p0.getField(str).getAnnotation(c.class);
             if (annotation != null) {
                str = annotation.value();
                String[] stringArray = annotation.alternate();
                int len1 = stringArray.length;
                for (int i1 = 0; i1 < len1; i1 = i1 + 1) {
                   this.a.put(stringArray[i1], oobject);
                }
             }
             this.a.put(str, oobject);
             this.b.put(oobject, str);
          }
          return;
       }catch(java.lang.NoSuchFieldException e12){
          throw new AssertionError(e12);
       }
    }
    public Object read(a p0){
       Enum uEnum;
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          uEnum = null;
       }else {
          uEnum = this.a.get(p0.E());
       }
       return uEnum;
    }
    public void write(b p0,Object p1){
       p1 = (p1 == null)? null: this.b.get(p1);
       p0.O(p1);
       return;
    }
}
