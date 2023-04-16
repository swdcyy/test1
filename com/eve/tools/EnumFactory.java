package com.eve.tools.EnumFactory;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Enum;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.eve.tools.EnumTypeAdapter;

public class EnumFactory implements j	// class@001023
{

    public void EnumFactory(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, EnumFactory.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       Class rawType = p1.getRawType();
       if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
          return null;
       }
       if (!rawType.isEnum()) {
          rawType = rawType.getSuperclass();
       }
       return new EnumTypeAdapter(rawType);
    }
}
