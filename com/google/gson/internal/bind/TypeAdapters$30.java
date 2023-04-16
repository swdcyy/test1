package com.google.gson.internal.bind.TypeAdapters$30;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Enum;
import java.lang.Class;
import com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter;

public class TypeAdapters$30 implements j	// class@0005a1
{

    public void TypeAdapters$30(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Enum uEnum = Enum.class;
       Class rawType = p1.getRawType();
       if (!uEnum.isAssignableFrom(rawType) || rawType == uEnum) {
          return null;
       }
       if (!rawType.isEnum()) {
          rawType = rawType.getSuperclass();
       }
       return new TypeAdapters$EnumTypeAdapter(rawType);
    }
}
