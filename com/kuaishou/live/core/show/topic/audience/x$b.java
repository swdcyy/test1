package com.kuaishou.live.core.show.topic.audience.x$b;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$c;
import com.kuaishou.live.core.show.topic.audience.x;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import ql2.o0;
import ql2.a;
import ql2.g0;
import lb2.i;
import ab2.i$b;
import wj2.r0;
import ok.x;
import io.reactivex.subjects.PublishSubject;
import ql2.l0;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import ql2.j0;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ql2.i0;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import ql2.k0;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment;

public class x$b implements LiveDialogContainerFragment$c	// class@001221
{
    public final long a;
    public final String b;
    public final x c;

    public void x$b(x p0,long p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       o0 oo0;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, x$b.class, "1")) {
          return;
       }
       x k = obj.c.K;
       if (k != null && k.getHost() != null) {
          x$b c = obj.c;
          x k1 = c.K;
          x$b a = obj.a;
          x$b b = obj.b;
          Objects.requireNonNull(c);
          if (PatchProxy.isSupport(x.class)) {
             oo0 = PatchProxy.applyThreeRefs(k1, Long.valueOf(a), b, c, x.class, "8");
             if (oo0 != PatchProxyResult.class) {
             label_00a2 :
                c.L = oo0;
                e uoe = obj.c.K.getChildFragmentManager().beginTransaction();
                uoe.f(R.id.live_bottom_dialog_container_root, new LiveAudienceTopicDetailFragment());
                uoe.m();
             }
          }
          a uoa = new a(c.N, c.Q, c.S, new g0(c), c.T);
          oo0 = ViewModelProviders.of(k1, new l0(c, a, oo0)).get(o0.class);
          oo0.d.setValue(b);
          oo0.b = c.O.mSlidePlayId;
          c.X7(oo0.e.subscribe(new j0(c)));
          c.X7(oo0.f.subscribe(new i0(k1)));
          c.X7(oo0.g.subscribe(new k0(c)));
          goto label_00a2 ;
       }
       return;
    }
}
