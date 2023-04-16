package hi1.t;
import erd.o;
import hi1.u;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.domain.effect.api.LiveEffectInteractiveComboResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.lang.Iterable;
import qk.m;
import hi1.j;
import ok.h;
import hi1.m;
import ok.o;
import brd.t;

public final class t implements o	// class@0026e6
{
    public final u b;

    public void t(u p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mEffectInfoList;
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, tb, u.class, "3");
       if (uArrayList != PatchProxyResult.class) {
       }else if(q.f(p0)){
          uArrayList = new ArrayList();
       }else {
          uArrayList = new ArrayList();
          m.s(p0).F(j.b).p(m.b).n(uArrayList);
       }
       return t.just(uArrayList);
    }
}
