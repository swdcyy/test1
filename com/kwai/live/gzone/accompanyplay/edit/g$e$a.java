package com.kwai.live.gzone.accompanyplay.edit.g$e$a;
import erd.o;
import com.kwai.live.gzone.accompanyplay.edit.g$e;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.kwai.live.gzone.accompanyplay.edit.g;
import k37.p1;
import fq5.b;
import h37.f0;
import java.lang.Boolean;
import brd.t;

public class g$e$a implements o	// class@000bea
{
    public final g$e b;

    public void g$e$a(g$e p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, g$e$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else if(p0.mAccompanyStatus == 2){
          g$e b = this.b.b;
          b.n = b.c(b.m.a.getLiveStreamId(), p0.mFleetTitle, p0.mAccompanyId, p0.mRoundId, p0.mEnableOneClick);
          ot = t.just(Boolean.TRUE);
       }else {
          ot = t.just(Boolean.FALSE);
       }
       return ot;
    }
}
