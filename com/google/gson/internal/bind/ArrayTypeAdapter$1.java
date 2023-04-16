package com.google.gson.internal.bind.ArrayTypeAdapter$1;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.reflect.Type;
import java.lang.reflect.GenericArrayType;
import java.lang.Class;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.$Gson$Types;

public class ArrayTypeAdapter$1 implements j	// class@000573
{

    public void ArrayTypeAdapter$1(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Class componentTyp;
       Type type = p1.getType();
       if (!(v0 = type instanceof GenericArrayType) && (!type instanceof Class || !type.isArray())) {
          return null;
       }
       type = (v0)? type.getGenericComponentType(): type.getComponentType();
       return new ArrayTypeAdapter(p0, p0.j(a.get(type)), $Gson$Types.g(type));
    }
}
