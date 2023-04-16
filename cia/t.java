package cia.t;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.data.f;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.FeedsResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import yga.c;
import java.util.Collection;
import ekd.q;
import lnc.c2;
import com.yxcorp.gifshow.follow.slide.detail.data.a;
import b06.d;

public final class t implements g	// class@000516
{
    public final f b;

    public void t(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "11")) {
       }else {
          p0 = p0.getItems();
          List list = KsLogFollowTag.FOLLOW_NIRVANA.appendTag("NirvanaDetailPageList");
          int i = (p0 != null)? p0.size(): 0;
          c.j(list, "filterResponse", "responseSize", String.valueOf(i));
          if (!q.f(p0)) {
             c2[] uoc2Array = new c2[]{a.a};
             d.e(p0, uoc2Array);
          }
       }
       return;
    }
}
