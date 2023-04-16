package com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$splitNames$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.feature.core.repository.b;
import java.lang.reflect.Field;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class SplitSourceProvider$splitNames$2 extends Lambda implements a	// class@000e80
{
    public static final SplitSourceProvider$splitNames$2 INSTANCE;

    static {
       SplitSourceProvider$splitNames$2.INSTANCE = new SplitSourceProvider$splitNames$2();
    }
    public void SplitSourceProvider$splitNames$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, SplitSourceProvider$splitNames$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, objArray, b.class, "5");
       if (obj != patchProxyRe) {
       }else {
          try{
             Field field = b.a().getField("DYNAMIC_FEATURES");
             field.setAccessible(true);
             obj = field.get(objArray);
          }catch(java.lang.NoSuchFieldException e0){
             obj = objArray;
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.ClassNotFoundException e0){
          }
       }
    }
}
