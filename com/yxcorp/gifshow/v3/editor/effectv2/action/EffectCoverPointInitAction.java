package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectCoverPointInitAction;
import xvc.b;
import uxb.e$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import uxb.f;

public final class EffectCoverPointInitAction extends b	// class@000f24
{
    public final e$a enterCoverPointTrackInfo;

    public void EffectCoverPointInitAction(){
       super(null, 1, null);
    }
    public void EffectCoverPointInitAction(e$a p0){
       a.p(p0, "enterCoverPointTrackInfo");
       super();
       this.enterCoverPointTrackInfo = p0;
    }
    public void EffectCoverPointInitAction(e$a p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = f.a();
       }
       super(p0);
       return;
    }
    public final e$a getEnterCoverPointTrackInfo(){
       return this.enterCoverPointTrackInfo;
    }
}
