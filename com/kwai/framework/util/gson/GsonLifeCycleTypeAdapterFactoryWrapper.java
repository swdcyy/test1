package com.kwai.framework.util.gson.GsonLifeCycleTypeAdapterFactoryWrapper;
import zk.j;
import java.lang.Object;
import java.util.ArrayList;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import mkd.a;
import com.kwai.framework.util.gson.GsonLifeCycleTypeAdapterWrapper;

public class GsonLifeCycleTypeAdapterFactoryWrapper implements j	// class@000ce5
{
    public List b;

    public void GsonLifeCycleTypeAdapterFactoryWrapper(){
       super();
       this.b = new ArrayList();
    }
    public TypeAdapter a(Gson p0,a p1){
       TypeAdapter typeAdapter;
       Class obj = PatchProxy.applyTwoRefs(p0, p1, this, GsonLifeCycleTypeAdapterFactoryWrapper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.getRawType();
       Iterator iterator = this.b.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          typeAdapter = iterator.next().a(p0, p1);
          if (typeAdapter != null) {
             if (!a.class.isAssignableFrom(obj)) {
                return typeAdapter;
             }
             break ;
          }
       }
       return new GsonLifeCycleTypeAdapterWrapper(typeAdapter);
    }
}
