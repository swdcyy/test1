package com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptRerankReqEvent;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class NasaLaunchOptRerankReqEvent	// class@000fa5
{
    public List candidates;

    public void NasaLaunchOptRerankReqEvent(List p0){
       a.p(p0, "candidates");
       super();
       this.candidates = p0;
    }
    public final List getCandidates(){
       return this.candidates;
    }
    public final void setCandidates(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaLaunchOptRerankReqEvent.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.candidates = p0;
       return;
    }
}
