package m02.l;
import erd.g;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import java.lang.Object;
import e06.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.share.screenshot.a0;

public final class l implements g	// class@0030cb
{
    public final LivePlayActivity b;

    public void l(LivePlayActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Object obj = p0;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(obj, tb, LivePlayActivity.class, "29")) {
       }else if(!tb.b3()){
          a0.a(tb, obj, tb.A.getPhotoId(), 36, tb.A.getUserId(), tb.A.getExpTag(), tb.A.mEntity);
       }
       return;
    }
}
