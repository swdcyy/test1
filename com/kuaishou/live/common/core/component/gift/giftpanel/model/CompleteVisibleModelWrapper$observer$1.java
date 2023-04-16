package com.kuaishou.live.common.core.component.gift.giftpanel.model.CompleteVisibleModelWrapper$observer$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import wl1.b;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import qrd.l1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class CompleteVisibleModelWrapper$observer$1 implements Model$a	// class@0012da
{
    public final LifecycleOwner b;
    public final Model$a c;

    public void CompleteVisibleModelWrapper$observer$1(LifecycleOwner p0,Model$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CompleteVisibleModelWrapper$observer$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (p2 != null) {
             ArrayList uArrayList = new ArrayList(p2.size());
             p1 = p2.entrySet().iterator();
             while (p1.hasNext()) {
                p1.next().getValue().b(this.b, this.c);
                uArrayList.add(l1.a);
             }
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CompleteVisibleModelWrapper$observer$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
