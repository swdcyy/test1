package e63.d;
import wj2.n0;
import com.kuaishou.live.gzone.v2.profile.LiveGzoneAnchorProfileTabFragment;
import java.lang.Object;
import com.kwai.component.misc.report.ReportInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import wj2.e;
import ft5.b;
import com.kuaishou.live.comments.view.a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import c77.p;

public class d implements n0	// class@002647
{
    public final LiveGzoneAnchorProfileTabFragment a;

    public void d(LiveGzoneAnchorProfileTabFragment p0){
       this.a = p0;
       super();
    }
    public void a(ReportInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a0 uoa0 = this.a.o.f1;
       if (uoa0 != null) {
          uoa0.c(p0);
       }
       return;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       a0 y1 = this.a.o.Y1;
       if (!y1.M()) {
          a0 h = this.a.o.H;
          if (h != null) {
             h.do(false);
          }
          y1.ed(p0, true, "AUTHOR_PROFILE");
          a0 n1 = this.a.o.N1;
          if (n1 != null) {
             n1.Ub(LiveGzoneTabSource.PROFILE_AT, true);
          }
       }
       return;
    }
}
