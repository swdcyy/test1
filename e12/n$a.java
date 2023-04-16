package e12.n$a;
import qvb.q;
import e12.n;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.Objects;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.liveslidesquare.LiveSlideSquareResponse;
import wvb.e;
import com.kwai.framework.model.response.CursorResponse;
import la6.b;
import wvb.e$a;
import qvb.n0;

public class n$a implements q	// class@002603
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       Objects.requireNonNull(this.b);
       b.S(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag("LiveSlidePageListAdapterPageModel"), "onStartLoading", "firstPage", Boolean.valueOf(p0));
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       n n;
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       Objects.requireNonNull(this.b);
       b.S(LiveLogTag.LIVE_NEW_SLIDE_CONTAINER.appendTag("LiveSlidePageListAdapterPageModel"), "onFinishLoading", "firstPage", Boolean.valueOf(p0));
       n$a tb = this.b;
       if (tb.n != null) {
          LiveSlideSquareResponse liveSlideSqu = new LiveSlideSquareResponse();
          if (this.b.n.L0() instanceof CursorResponse) {
             liveSlideSqu.mCursor = this.b.n.L0().getCursor();
             n = this.b.n;
             liveSlideSqu.mItems = n.c.a(n.L0().getItems());
             this.b.m = liveSlideSqu;
          }
       }else {
          tb.m = tb.l.L0();
       }
       if (p0) {
          n.B(this.b);
       }else {
          n.C(this.b);
       }
       return;
    }
}
