package gl9.d;
import yg5.t0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.kwai.component.tabs.panel.a;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import yk9.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.view.View;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;
import android.os.SystemClock;
import java.lang.Long;
import lnc.i3;
import java.lang.Number;
import java.lang.Integer;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import yg5.s0;
import yg5.r0;

public class d implements t0	// class@0024c4
{
    public final GifshowActivity b;
    public final a c;
    public final a d;
    public final ViewGroup e;
    public final FrameLayout f;
    public final CommentsFragment g;
    public final long h;
    public final QComment i;
    public final boolean j;

    public void d(GifshowActivity p0,a p1,a p2,ViewGroup p3,FrameLayout p4,CommentsFragment p5,long p6,QComment p7,boolean p8){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       super();
    }
    public void s(boolean p0){
       d uod = d.class;
       d uod1 = d.class;
       if (PatchProxy.isSupport(uod1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod1, "1")) {
          return;
       }
       if (!p0) {
          this.b.l3(this.c);
          this.d.b();
          this.e.removeView(this.f);
          d uod2 = this.g.Kh();
          Objects.requireNonNull(uod2);
          Object[] objArray = null;
          String str = "";
          if (!PatchProxy.applyVoid(objArray, uod2, uod, "13")) {
             u1.B(new ClickMetaData().setType(1).setElementPackage(uod2.g(objArray, 18, str, "DIALOGUE_COMMENT_POPUP_CLOSE_BUTTON")).setFeedLogCtx(uod2.a.getFeedLogCtx()));
          }
          uod2 = this.g.Kh();
          long l = SystemClock.elapsedRealtime() - this.h;
          d ti = this.i;
          d tj = this.j;
          Objects.requireNonNull(uod2);
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(l), ti, Boolean.valueOf(tj), uod2, d.class, "12")) {
             ClientEvent$ElementPackage uElementPack = uod2.g(ti, 18, str, "DIALOGUE_COMMENT_POPUP");
             i3 oi3 = i3.f();
             oi3.c("duration", Long.valueOf(l));
             oi3.c("is_dialogue_guide_toast", Integer.valueOf(tj));
             uElementPack.params = oi3.e();
             u1.B0(new ShowMetaData().setType(10).setElementPackage(uElementPack).setFeedLogCtx(uod2.a.getFeedLogCtx()));
          }
       }
       return;
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       s0.c(this, p0, p1, p2, p3, p4);
    }
    public void xe(boolean p0,r0 p1){
       s0.b(this, p0, p1);
    }
}
