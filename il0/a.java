package il0.a;
import erd.g;
import com.kuaishou.lite.presenter.LiveLiteAdLogPresenter;
import java.lang.Object;
import wl9.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.lite.LiveLiteParam;
import e93.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.model.ReportAdLogActionParam;
import tkd.b;
import tkd.d;
import ol9.a;
import com.kwai.framework.model.feed.BaseFeed;

public final class a implements g	// class@002940
{
    public final LiveLiteAdLogPresenter b;

    public void a(LiveLiteAdLogPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a tb = this.b;
          a.o(p0, "event");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveLiteAdLogPresenter.class, "16")) {
             LiveLiteAdLogPresenter j = tb.J;
             if (j == null) {
                a.S("mAudienceInfoService");
             }
             LiveLiteParam liveLitePara = j.ok();
             a.o(liveLitePara, "mAudienceInfoService.liveLiteParam");
             LiveStreamFeed liveStreamFe = liveLitePara.getLiveStreamFeed();
             a.o(liveStreamFe, "liveStreamFeed");
             if (p0.b(liveStreamFe.getId())) {
                p0.a().mLiveRoomPattern = 2;
                p0.a().mSimplifiedLiveRoomType = 1;
                d.a(0x4ffa335e).hf(liveStreamFe, p0.a());
             }
          }
       }
       return;
    }
}
