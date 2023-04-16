package e12.e;
import erd.o;
import e12.f;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.QLiveLaunchInfo;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.util.List;
import com.kuaishou.live.basic.liveslide.datasource.b;
import tkd.b;
import tkd.d;
import lm9.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import e12.d;
import io.reactivex.g;

public final class e implements o	// class@0025f8
{
    public final f b;
    public final boolean c;

    public void e(f p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       t ot;
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          ot = PatchProxy.applyTwoRefs(Boolean.valueOf(tc), p0, tb, uof, "4");
          if (ot != PatchProxyResult.class) {
          }else if(tc == null && (tb.getDataList().isEmpty() && (p0.mLiveStream != null && d.a(-1638991736).SW(p0.mLiveStream, Boolean.FALSE)))){
             b.Z(LiveLogTag.LIVE_TVC_AD, "onLoadComplete need call TVC");
             ot = t.create(new d(tb, p0));
          }else {
             ot = t.just(p0);
          }
       }else {
          goto label_0022 ;
       }
       return ot;
    }
}
