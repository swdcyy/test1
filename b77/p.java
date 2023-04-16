package b77.p;
import erd.g;
import b77.q;
import java.lang.Object;
import java.lang.String;
import y43.a;
import c77.p;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u37.g;
import u37.e;
import com.kuaishou.android.live.model.QLivePlayConfig;
import brd.t;
import cjd.e;
import erd.o;
import b77.r;
import b77.s;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class p implements g	// class@0003e7
{
    public final q b;

    public void p(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       tb.y = p0;
       tb.P8(tb.w.p.Q2());
       if (TextUtils.x(p0)) {
          tb.S8();
       }else if(PatchProxy.applyVoid(null, tb, q.class, "5")){
          tb.X7(e.e().c(tb.w.R().mLiveStreamId).map(new e()).subscribe(new r(tb), new s(tb)));
       }
       return;
    }
}
