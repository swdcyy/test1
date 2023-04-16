package com.kwai.feature.api.corona.fastgson.CoronaCollectionTypeAdapterFactory;
import zk.j;
import com.kwai.feature.api.corona.fastgson.a;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import bl.g;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.reflect.Type;
import com.google.gson.internal.$Gson$Types;
import bl.p;
import com.kwai.feature.api.corona.fastgson.CoronaFastCollectionAdapterKt;

public class CoronaCollectionTypeAdapterFactory implements j	// class@000de2
{
    public final g b;
    public static final x c;

    static {
       CoronaCollectionTypeAdapterFactory.c = Suppliers.a(a.b);
    }
    public void CoronaCollectionTypeAdapterFactory(){
       super();
       this.b = new g(new HashMap());
    }
    public TypeAdapter a(Gson p0,a p1){
       Class obj = PatchProxy.applyTwoRefs(p0, p1, this, CoronaCollectionTypeAdapterFactory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TypeAdapter typeAdapter = null;
       if (!CoronaCollectionTypeAdapterFactory.c.get().booleanValue()) {
          return typeAdapter;
       }
       obj = p1.getRawType();
       if (!Collection.class.isAssignableFrom(obj)) {
          return typeAdapter;
       }
       Type type = $Gson$Types.e(p1.getType(), obj);
       return new CoronaFastCollectionAdapterKt(p0, type, p0.j(a.get(type)), this.b.a(p1));
    }
}
