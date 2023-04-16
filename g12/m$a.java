package g12.m$a;
import sc5.f;
import g12.m;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.basic.liveslide.b$a;
import com.kwai.robust.PatchProxyResult;
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
import g12.h;
import com.google.common.collect.ImmutableList;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.liveslide.a$a;
import com.kuaishou.live.core.basic.liveslide.a;
import java.lang.Boolean;
import java.util.List;
import z12.x;
import b51.d;
import com.kuaishou.live.core.basic.liveslide.b;
import c51.d;
import c51.i;
import c51.h;
import com.kuaishou.live.basic.liveslide.a;
import com.kuaishou.live.core.basic.liveslide.b$b;
import bw6.a;
import cw6.b;
import wg3.b;

public class m$a implements f	// class@002a31
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public void a(Map p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       m$a ta = this.a;
       Objects.requireNonNull(ta);
       b$a uoa = b$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, ta, m.class, "9") || (p0 == null || (!p0.isEmpty() && !q.f(ta.p)))) {
          Activity activity = ta.getActivity();
          Objects.requireNonNull(activity);
          ImmutableList immutableLis = m.s(ta.p).p(i.b).p(new h(p0.entrySet(), e.h(activity))).B();
          if (!q.f(immutableLis)) {
             b.a0(LiveLogTag.LIVE_END_FILTER, "removeEndLiveFromList", c.j("endLiveFeedList: ", immutableLis.toString()));
             a$a uoa1 = ta.q.j();
             Objects.requireNonNull(uoa1);
             i obj = PatchProxy.applyOneRefs(immutableLis, uoa1, a$a.class, "3");
             if (obj != PatchProxyResult.class) {
                obj.booleanValue();
             }else {
                List list = x.J(immutableLis);
                obj = PatchProxy.applyOneRefs(list, uoa1, uoa, "11");
                if (obj != PatchProxyResult.class) {
                   obj.booleanValue();
                }else {
                   obj = uoa1.a.e().p();
                   Objects.requireNonNull(obj);
                   Object obj2 = PatchProxy.applyOneRefs(list, obj, i.class, "12");
                   b = (obj2 != PatchProxyResult.class)? obj2.booleanValue(): obj.b.m(list);
                   if (b) {
                      uoa1.a.e().o().C0(uoa1.a(), uoa1.a.e().o().b0(uoa1.a.h().a()), -1, false);
                   }
                }
             }
             if (ta.q.j().b() == (ta.q.j().a().size() - 1)) {
                a$a uoa2 = ta.q.j();
                Objects.requireNonNull(uoa2);
                Object obj1 = PatchProxy.apply(null, uoa2, uoa, "2");
                if (obj1 != PatchProxyResult.class) {
                   obj1.booleanValue();
                }else {
                   uoa2.a.e().p().b0();
                }
             }
             ta.P8();
          }
       }
    label_0138 :
       return;
    }
}
