package com.kuaishou.live.locallife.explain.view.LocalLifeSpikeTimingLabelView$a;
import ok.h;
import com.kuaishou.live.locallife.explain.view.LocalLifeSpikeTimingLabelView;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage;
import msd.a;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import com.yxcorp.utility.f;
import brd.t;
import com.kuaishou.live.locallife.explain.view.a;
import erd.g;

public final class LocalLifeSpikeTimingLabelView$a implements h	// class@000c24
{
    public final LocalLifeSpikeTimingLabelView b;
    public final long c;
    public final LocalLifeLiveExplainMessage d;
    public final a e;

    public void LocalLifeSpikeTimingLabelView$a(LocalLifeSpikeTimingLabelView p0,long p1,LocalLifeLiveExplainMessage p2,a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LocalLifeSpikeTimingLabelView$a.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = f.d().b(this.c, 1000).subscribe(new a(this));
       }
       return p0;
    }
}
