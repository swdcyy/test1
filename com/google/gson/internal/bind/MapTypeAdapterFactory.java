package com.google.gson.internal.bind.MapTypeAdapterFactory;
import zk.j;
import bl.g;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.reflect.Type;
import java.lang.Class;
import java.util.Map;
import com.google.gson.internal.$Gson$Types;
import java.lang.String;
import java.util.Properties;
import java.lang.reflect.ParameterizedType;
import java.lang.Boolean;
import com.google.gson.internal.bind.TypeAdapters;
import bl.p;
import com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter;

public final class MapTypeAdapterFactory implements j	// class@00057b
{
    public final g b;
    public final boolean c;

    public void MapTypeAdapterFactory(g p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public TypeAdapter a(Gson p0,a p1){
       Type[] typeArray;
       Type type = p1.getType();
       if (!Map.class.isAssignableFrom(p1.getRawType())) {
          return null;
       }
       Class uClass = $Gson$Types.g(type);
       Object obj = Object.class;
       String str = String.class;
       int i = 2;
       int i1 = 0;
       if (type == Properties.class) {
          typeArray = new Type[i];
          typeArray[i1] = str;
          typeArray[1] = str;
       }else {
          type = $Gson$Types.h(type, uClass, Map.class);
          if (type instanceof ParameterizedType) {
             typeArray = type.getActualTypeArguments();
          }else {
             typeArray = new Type[i];
             typeArray[i1] = obj;
             typeArray[1] = obj;
          }
       }
       object oobject = typeArray[i1];
       TypeAdapter f = (oobject == Boolean.TYPE || oobject == Boolean.class)? TypeAdapters.f: p0.j(a.get(oobject));
       MapTypeAdapterFactory$Adapter uAdapter = new MapTypeAdapterFactory$Adapter(this, p0, typeArray[i1], f, typeArray[1], p0.j(a.get(typeArray[1])), this.b.a(p1));
       return v10;
    }
}
