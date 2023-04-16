package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a$f;
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
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;

public final class a$f implements Observer	// class@001554
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
       }else {
          a.o(p0, "videoStates");
          p0 = p0.entrySet().iterator();
          while (p0.hasNext()) {
             Map$Entry uEntry = p0.next();
             d uod = this.b.c().get(uEntry.getKey());
             if (uod != null) {
                b = uEntry.getValue().booleanValue();
                d uod1 = d.class;
                if (PatchProxy.isSupport(uod1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uod, uod1, "8")) {
                   continue ;
                }
             }
             uod.n().setValue(Boolean.valueOf(b));
          }
       }
       return;
    }
}
