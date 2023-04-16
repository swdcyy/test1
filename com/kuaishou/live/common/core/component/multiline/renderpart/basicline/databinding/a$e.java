package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a$e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.HashMap;
import j83.d;
import androidx.lifecycle.MutableLiveData;

public final class a$e implements Observer	// class@001553
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String value;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          a.o(p0, "userTagMap");
          p0 = p0.entrySet().iterator();
          while (p0.hasNext()) {
             Map$Entry uEntry = p0.next();
             d uod = this.b.c().get(uEntry.getKey());
             if (uod != null) {
                value = uEntry.getValue();
                if (PatchProxy.applyVoidOneRefs(value, uod, d.class, "7")) {
                   continue ;
                }
             }
             uod.m().setValue(value);
          }
       }
       return;
    }
}
