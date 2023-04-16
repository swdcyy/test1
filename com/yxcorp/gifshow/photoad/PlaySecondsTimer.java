package com.yxcorp.gifshow.photoad.PlaySecondsTimer;
import com.yxcorp.gifshow.photoad.PlaySecondsTimer$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.photoad.PlaySecondsTimer$mPlayedReportTimeList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.photoad.PlaySecondsTimer$mProgressUpdateHandler$2;
import ekd.y0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlaySecondsTimer	// class@000f6f
{
    public long a;
    public long b;
    public int c;
    public int d;
    public final p e;
    public final p f;
    public final QPhoto g;
    public final int h;
    public static final PlaySecondsTimer$a i;

    static {
       PlaySecondsTimer.i = new PlaySecondsTimer$a(null);
    }
    public void PlaySecondsTimer(QPhoto p0,int p1){
       a.p(p0, "mLiveQPhoto");
       super();
       this.g = p0;
       this.h = p1;
       this.e = s.c(new PlaySecondsTimer$mPlayedReportTimeList$2(this));
       this.f = s.c(new PlaySecondsTimer$mProgressUpdateHandler$2(this));
    }
    public final y0 a(){
       Object obj = PatchProxy.apply(null, this, PlaySecondsTimer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final int b(){
       return this.h;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, PlaySecondsTimer.class, "4")) {
          return;
       }
       this.a().e();
       return;
    }
}
