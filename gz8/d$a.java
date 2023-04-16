package gz8.d$a;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import os5.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gz8.d;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.SearchParams;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import tkd.b;
import tkd.d;
import lm9.a;
import com.kwai.framework.abtest.f;
import java.util.List;
import java.util.Collections;
import os5.e;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;

public final class d$a implements g	// class@002527
{
    public final WeakReference b;
    public final QPhoto c;
    public final QPhoto d;
    public final int e;
    public final BaseFragment f;

    public void d$a(GifshowActivity p0,QPhoto p1,QPhoto p2,int p3,BaseFragment p4){
       a.p(p0, "activity");
       a.p(p1, "liveInfo");
       a.p(p2, "photo");
       a.p(p4, "fragment");
       super();
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.b = new WeakReference(p0);
    }
    public void accept(Object p0){
       d a;
       Integer integer;
       int i1;
       LiveAudienceParam$a uoa;
       QPhoto mEntity;
       LiveAudienceParam liveAudience;
       LiveSlidePlayEnterParam$b uob;
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
       }else {
          a.p(p0, "plugin");
          GifshowActivity gifshowActiv = this.b.get();
          if (gifshowActiv != null) {
             a = d.a;
             a.o(gifshowActiv, "it");
             d$a tc = this.c;
             d$a td = this.d;
             d$a te = this.e;
             d$a tf = this.f;
             Objects.requireNonNull(a);
             d uod = d.class;
             int i = 1;
             if (PatchProxy.isSupport(uod)) {
                Object[] objArray = new Object[]{p0,gifshowActiv,tc,td,Integer.valueOf(te),tf};
                if (!PatchProxy.applyVoid(objArray, a, uod, "4")) {
                }
             }else {
             }
          }
       }
       return;
    }
}
