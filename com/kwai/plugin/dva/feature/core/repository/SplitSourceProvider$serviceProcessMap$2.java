package com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider$serviceProcessMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;
import java.lang.Object;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
import com.kwai.plugin.dva.feature.core.repository.a;
import java.lang.StringBuilder;
import java.lang.reflect.Field;
import java.lang.ClassNotFoundException;
import kotlin.jvm.internal.a;

public final class SplitSourceProvider$serviceProcessMap$2 extends Lambda implements a	// class@000e7d
{
    public final SplitSourceProvider this$0;

    public void SplitSourceProvider$serviceProcessMap$2(SplitSourceProvider p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       String str2;
       HashMap obj = PatchProxy.apply(null, this, SplitSourceProvider$serviceProcessMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap(0);
       Iterator iterator = this.this$0.d().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          HashMap obj1 = PatchProxy.applyOneRefs(str, null, a.class, "6");
          if (obj1 != PatchProxyResult.class) {
          }else {
             str = str+"_SERVICE_TO_PROCESS";
             try{
                obj1 = new HashMap();
                Field field = a.a().getField(str);
                boolean b = true;
                field.setAccessible(b);
                str = field.get(null);
                if (str != null) {
                   String[] stringArray = str.split(",");
                   if (stringArray.length) {
                      int len = stringArray.length;
                      for (int i = 0; i < len; i = i + 1) {
                         object oobject = stringArray[i];
                         int i1 = oobject.indexOf(45);
                         String str1 = oobject.substring(0, i1);
                         if (((oobject.substring(i1)).trim()).length() == b) {
                            str2 = "";
                         }else {
                            i1 = i1 + 1;
                            str2 = oobject.substring(i1);
                         }
                         obj1.put(str1, str2);
                      }
                   }
                }
             }catch(java.lang.NoSuchFieldException e0){
             }catch(java.lang.IllegalAccessException e0){
             }catch(java.lang.ClassNotFoundException e5){
                e5.printStackTrace();
             }
          }
          a.o(obj1, "getServiceProcessMap\(splitName\)");
          obj.putAll(obj1);
       }
       return obj;
    }
}
