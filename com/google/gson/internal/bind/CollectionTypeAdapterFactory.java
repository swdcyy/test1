package com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import zk.j;
import bl.g;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.reflect.Type;
import java.lang.Class;
import java.util.Collection;
import com.google.gson.internal.$Gson$Types;
import bl.p;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter;

public final class CollectionTypeAdapterFactory implements j	// class@000576
{
    public final g b;

    public void CollectionTypeAdapterFactory(g p0){
       super();
       this.b = p0;
    }
    public TypeAdapter a(Gson p0,a p1){
       Type type = p1.getType();
       Class rawType = p1.getRawType();
       if (!Collection.class.isAssignableFrom(rawType)) {
          return null;
       }
       type = $Gson$Types.e(type, rawType);
       return new CollectionTypeAdapterFactory$Adapter(p0, type, p0.j(a.get(type)), this.b.a(p1));
    }
}
