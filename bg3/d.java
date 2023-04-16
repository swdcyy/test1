package bg3.d;
import java.lang.Runnable;
import bg3.e;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.model.QLivePlayConfig;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import za2.y;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import lb2.i;
import rb2.g;
import e12.c;
import io.reactivex.subjects.PublishSubject;

public final class d implements Runnable	// class@00039f
{
    public final e b;
    public final QPhoto c;

    public void d(e p0,QPhoto p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, e.class, "14")) {
       }else if(TextUtils.n(tc.getPhotoId(), tb.p.c.getPhotoId())){
          e.d(tc.getLivePlayConfig(), tb.getActivity());
          tb.P8();
          if (tb.J != null && tb.t != null) {
             tb.t.d(tc.mEntity, tb.p.l, false);
             tb.J.s();
             tb.J.a(tb.w.mSlidePlayId, tb.q, tc, y.a(tb.getActivity(), tb.w), null);
          }
       }
       return;
    }
}
