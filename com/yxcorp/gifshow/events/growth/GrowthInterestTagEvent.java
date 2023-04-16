package com.yxcorp.gifshow.events.growth.GrowthInterestTagEvent;
import java.lang.Object;
import com.yxcorp.gifshow.events.growth.GrowthInterestTagEvent$EditResult;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class GrowthInterestTagEvent	// class@000e87
{
    public GrowthInterestTagEvent$EditResult a;
    public String b;
    public String c;

    public void GrowthInterestTagEvent(){
       super();
       this.a = GrowthInterestTagEvent$EditResult.CANCEL;
       this.b = "";
       this.c = "";
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthInterestTagEvent.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void b(GrowthInterestTagEvent$EditResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthInterestTagEvent.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.a = p0;
       return;
    }
}
