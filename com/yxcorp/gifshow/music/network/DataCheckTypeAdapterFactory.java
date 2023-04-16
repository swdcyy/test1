package com.yxcorp.gifshow.music.network.DataCheckTypeAdapterFactory;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lc7.a;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;
import kotlin.jvm.internal.a;
import java.lang.RuntimeException;
import com.yxcorp.gifshow.music.network.DataCheckTypeAdapterFactory$create$1$1;

public final class DataCheckTypeAdapterFactory implements j	// class@00124d
{
    public static final DataCheckTypeAdapterFactory b;

    static {
       DataCheckTypeAdapterFactory.b = new DataCheckTypeAdapterFactory();
    }
    public void DataCheckTypeAdapterFactory(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       boolean b1;
       TypeAdapter typeAdapter;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DataCheckTypeAdapterFactory uDataCheckTy = DataCheckTypeAdapterFactory.class;
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, uDataCheckTy, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       if (p1 != null) {
          Class rawType = p1.getRawType();
          if (rawType != null && a.class.isAssignableFrom(rawType)) {
             DataCheckTypeAdapterFactory b = DataCheckTypeAdapterFactory.b;
             Objects.requireNonNull(b);
             Object obj1 = PatchProxy.apply(obj, b, uDataCheckTy, "3");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                b1 = false;
                try{
                   obj1 = f.b("DataCheckSwitch", Boolean.TYPE, Boolean.FALSE);
                   a.o(obj1, "ExperimentManager.getCon¡­olean::class.java, false\)");
                   b1 = obj1.booleanValue();
                }catch(java.lang.RuntimeException e1){
                   e1.toString();
                }
             }
          }
       }
       return obj;
    }
}
