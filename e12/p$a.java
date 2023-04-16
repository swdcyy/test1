package e12.p$a;
import qvb.q;
import e12.p;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.basic.liveslide.datasource.b;
import qvb.j;
import e12.c;
import d12.p;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import qvb.p;
import com.kuaishou.live.basic.liveslide.datasource.LiveSlideResponse;
import com.kwai.framework.model.response.CursorResponse;
import la6.b;
import z12.x;

public class p$a implements q	// class@002608
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p$a uoa = p$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       uoa = this.b;
       int i = p0 ^ 0x01;
       Objects.requireNonNull(uoa);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(i), p1, uoa, uob, "7")) {
          uoa.l(i, p1);
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p$a uoa = p$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0) {
          p l = this.b.l;
          if (l != null) {
             l.g0().f(this);
             p$a tb = this.b;
             tb.l = p.a(tb.l);
             this.b.l.h(this);
             Objects.requireNonNull(this.b);
             b.S(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag("LiveSlidePageListAdapterSyncPageModel"), "onStartLoading", "firstPage", Boolean.valueOf(p0));
          }
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       p$a uoa = p$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       Objects.requireNonNull(this.b);
       b.S(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag("LiveSlidePageListAdapterSyncPageModel"), "onFinishLoading", "firstPage", Boolean.valueOf(p0));
       if (this.b.l == null) {
          return;
       }
       LiveSlideResponse liveSlideRes = new LiveSlideResponse();
       liveSlideRes.mFeedItems = x.J(this.b.l.v0().getItems());
       uoa = this.b;
       int i = p0 ^ 0x01;
       Objects.requireNonNull(uoa);
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(i), liveSlideRes, uoa, uob, "5")) {
          uoa.j(i, liveSlideRes);
       }
       return;
    }
}
