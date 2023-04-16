package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.databinding.a$c;
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
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;

public final class a$c implements Observer	// class@001551
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a.o(p0, "layoutMap");
          int i = this.b.b(p0);
          p0 = p0.entrySet().iterator();
          while (p0.hasNext()) {
             d uod = this.b.c().get(p0.next().getKey());
             if (uod != null) {
                d uod1 = d.class;
                if (PatchProxy.isSupport(uod1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uod, uod1, "4")) {
                   continue ;
                }
             }
             uod.l().setValue(Integer.valueOf(i));
          }
       }
       return;
    }
}
