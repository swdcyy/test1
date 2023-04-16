package com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$splitReceivers$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kwai.plugin.dva.feature.core.repository.a;
import java.lang.StringBuilder;
import java.lang.reflect.Field;
import java.lang.ClassNotFoundException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;

public final class SplitSourceProvider$splitReceivers$2 extends Lambda implements a	// class@000e81
{
    public final SplitSourceProvider this$0;

    public void SplitSourceProvider$splitReceivers$2(SplitSourceProvider p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       List obj = PatchProxy.apply(null, this, SplitSourceProvider$splitReceivers$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0.d();
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          String[] stringArray = PatchProxy.applyOneRefs(str, null, a.class, "5");
          if (stringArray != patchProxyRe) {
          }else {
             str = str+"_RECEIVERS";
             try{
                Field field = a.a().getField(str);
                field.setAccessible(true);
                str = field.get(null);
                if (str != null) {
                   stringArray = str.split(",");
                }
             }catch(java.lang.NoSuchFieldException e0){
             }catch(java.lang.IllegalAccessException e0){
             }catch(java.lang.ClassNotFoundException e4){
                e4.printStackTrace();
             }
             stringArray = null;
          }
          uArrayList.add(objArray);
       }
       return u.c0(uArrayList);
    }
}
