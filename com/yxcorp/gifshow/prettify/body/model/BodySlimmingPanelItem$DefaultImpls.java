package com.yxcorp.gifshow.prettify.body.model.BodySlimmingPanelItem$DefaultImpls;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingPanelItem;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.prettify.body.model.BodySlimmingPanelItem$unbindViewListener$1;
import java.lang.Boolean;

public final class BodySlimmingPanelItem$DefaultImpls	// class@00112e
{

    public static void a(BodySlimmingPanelItem p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, BodySlimmingPanelItem$DefaultImpls.class, "2")) {
          return;
       }
       a.p(p1, "callback");
       p0.j(p1);
       return;
    }
    public static void b(BodySlimmingPanelItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, BodySlimmingPanelItem$DefaultImpls.class, "3")) {
          return;
       }
       p0.j(BodySlimmingPanelItem$unbindViewListener$1.INSTANCE);
       return;
    }
    public static void c(BodySlimmingPanelItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, BodySlimmingPanelItem$DefaultImpls.class, "4")) {
          return;
       }
       p0.i().invoke(Boolean.valueOf(p0.k()));
       return;
    }
}
