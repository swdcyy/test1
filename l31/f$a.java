package l31.f$a;
import ds5.c;
import l31.f;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData;
import com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData$SourceType;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.util.Objects;
import java.lang.Long;
import tj3.i;
import tj3.e;
import tj3.k;
import java.lang.Throwable;

public class f$a implements c	// class@002e71
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return b.a(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       f$a tb = this.b;
       f a1 = tb.a1;
       QLivePlayConfig mWatchingCou = a1.mWatchingCount;
       if (mWatchingCou >= 0) {
          tb.t9(new WatchingCountData(WatchingCountData$SourceType.API_START_PLAY, mWatchingCou, a1.mDisplayWatchingCount));
          tb = this.b;
          QLivePlayConfig mWatchingCou1 = tb.a1.mWatchingCount;
          Objects.requireNonNull(tb);
          f uof = f.class;
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Long.valueOf(mWatchingCou1), tb, uof, "17")) {
             tb.V0.h().y(mWatchingCou1);
             tb.V0.x().t0(mWatchingCou1);
          }
       }
       tb = this.b;
       tb.t9(new WatchingCountData(WatchingCountData$SourceType.API_START_PLAY_OF_TOTAL, 0, tb.a1.mLiveAccumulatedWatchCount));
       this.b.x9(false, "LivePlayConfigListener.onAfterConfigUpdated");
       return;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public boolean xi(){
       return b.e(this);
    }
}
