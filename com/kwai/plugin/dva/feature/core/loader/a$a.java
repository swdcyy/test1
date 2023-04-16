package com.kwai.plugin.dva.feature.core.loader.a$a;
import com.kwai.plugin.dva.feature.core.loader.a$b;
import android.content.res.Resources;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.reflect.Method;
import java.util.Iterator;
import android.content.res.AssetManager;

public class a$a extends a$b	// class@001311
{

    public void a$a(){
       super();
    }
    public static void p(Resources p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a$a.class, "1")) {
          return;
       }
       Method method = a$b.c();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          Object[] objArray = new Object[]{iterator.next()};
          method.invoke(p0.getAssets(), objArray);
       }
       return;
    }
}
