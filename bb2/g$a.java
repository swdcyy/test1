package bb2.g$a;
import sc5.f;
import bb2.g;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.util.Set;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.core.basic.utils.e;
import java.lang.Iterable;
import qk.m;
import g12.i;
import ok.o;
import bb2.b;
import com.google.common.collect.ImmutableList;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public class g$a implements f	// class@0003c8
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       g$a ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, g.class, "9") || (p0 == null || (!p0.isEmpty() && !q.f(ta.p)))) {
          Activity activity = ta.getActivity();
          Objects.requireNonNull(activity);
          QPhoto qPhoto = e.h(activity);
          ImmutableList immutableLis = m.s(ta.p).p(i.b).p(new b(p0.entrySet(), qPhoto)).B();
          if (!q.f(immutableLis)) {
             b.a0(LiveLogTag.LIVE_END_FILTER, "removeEndLiveFromList", c.j("endLiveFeedList: ", immutableLis.toString()));
             ta.p.removeAll(immutableLis);
             ta.v.D1(immutableLis, qPhoto, "LiveGrootSlideDetailFilterPresenter");
             if (ta.v.j() == (ta.v.I0().size() - 1)) {
                ta.v.v1();
             }
             ta.R8();
          }
       }
    label_0095 :
       return;
    }
}
