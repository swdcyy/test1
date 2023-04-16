package com.kuaishou.live.common.multiinteract.stage.MultiInteractPrefDowngradeLayoutConfigInterceptor$a;
import erd.g;
import com.kuaishou.live.common.multiinteract.stage.MultiInteractPrefDowngradeLayoutConfigInterceptor;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.livestage.basic.LayoutConfig;

public final class MultiInteractPrefDowngradeLayoutConfigInterceptor$a implements g	// class@001801
{
    public final MultiInteractPrefDowngradeLayoutConfigInterceptor b;

    public void MultiInteractPrefDowngradeLayoutConfigInterceptor$a(MultiInteractPrefDowngradeLayoutConfigInterceptor p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiInteractPrefDowngradeLayoutConfigInterceptor$a.class, "1")) {
       }else {
          p0 = this.b;
          MultiInteractPrefDowngradeLayoutConfigInterceptor f = p0.f;
          if (f != null) {
             p0.b(f, true);
          }
       }
       return;
    }
}
