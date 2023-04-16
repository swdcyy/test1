package com.kuaishou.merchant.transaction.live.dynamic.service.PageInfoParamBuilder$mergeData$$inlined$let$lambda$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonElement;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ue4.h;

public final class PageInfoParamBuilder$mergeData$$inlined$let$lambda$1 extends Lambda implements p	// class@0007c0
{
    public final JsonObject $dest$inlined;

    public void PageInfoParamBuilder$mergeData$$inlined$let$lambda$1(JsonObject p0){
       this.$dest$inlined = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(String p0,JsonElement p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, PageInfoParamBuilder$mergeData$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       h.a(this.$dest$inlined, p0, p1);
       PatchProxy.onMethodExit(PageInfoParamBuilder$mergeData$$inlined$let$lambda$1.class, "1");
       return;
    }
}
