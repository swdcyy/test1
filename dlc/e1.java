package dlc.e1;
import erd.g;
import dlc.f1;
import java.lang.Object;
import com.yxcorp.gifshow.trending.inject.event.OnPlayTrendingInfoChangeEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.TrendingInfo;
import com.yxcorp.gifshow.trending.inject.event.OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction;
import com.yxcorp.gifshow.entity.QPhoto;
import sy6.a;
import com.kwai.framework.model.feed.BaseFeed;
import alc.a;

public final class e1 implements g	// class@002242
{
    public final f1 b;

    public void e1(f1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f1.class, "3")) {
       }else if(p0 == null || p0.a.isSubTrending()){
          if (OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.SLIDE_UP == p0.b && tb.p.getCurrentPhoto() != null) {
             a.m(tb.p.getCurrentPhoto().getEntity(), true);
             tb.P8();
          }else if(OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.SLIDE_DOWN == p0.b && tb.p.getCurrentPhoto() != null){
             a.m(tb.p.getCurrentPhoto().getEntity(), false);
             tb.P8();
          }else if(OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.JUMP_TO_NEXT == p0.b){
             tb.P8();
          }
       }
       return;
    }
}
