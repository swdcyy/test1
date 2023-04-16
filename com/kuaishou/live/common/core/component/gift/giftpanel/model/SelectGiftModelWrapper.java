package com.kuaishou.live.common.core.component.gift.giftpanel.model.SelectGiftModelWrapper;
import java.lang.Object;
import wl1.f;
import java.lang.String;
import wl1.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.util.Map;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.giftpanel.model.SelectGiftModelWrapper$observer$1;
import ul1.a;
import ah1.c;

public final class SelectGiftModelWrapper	// class@0012dc
{
    public final f a;

    public void SelectGiftModelWrapper(){
       super();
       this.a = new f();
    }
    public final g a(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, SelectGiftModelWrapper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tabId");
       obj = this.a.a();
       g og = (obj != null)? obj.get(p0): null;
       return og;
    }
    public final void b(LifecycleOwner p0,Model$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelectGiftModelWrapper.class, "4")) {
          return;
       }
       a.p(p0, "owner");
       a.p(p1, "observer");
       this.a.b(p0, new SelectGiftModelWrapper$observer$1(p0, p1));
       return;
    }
    public final void c(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelectGiftModelWrapper.class, "2")) {
          return;
       }
       a.p(p0, "source");
       Map map = this.a.a();
       String str = null;
       if (map != null) {
          if (p1 != null) {
             str = p1.d();
          }
          str = map.get(str);
       }
       if (str != null) {
          str.e(p0, p1);
       }
       return;
    }
}
