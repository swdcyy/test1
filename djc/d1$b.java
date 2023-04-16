package djc.d1$b;
import android.view.View$OnClickListener;
import djc.d1;
import uo7.i0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mp7.c;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import yo7.b;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import mp7.a;

public final class d1$b implements View$OnClickListener	// class@0021dc
{
    public final d1 b;
    public final i0 c;
    public final View d;
    public final int e;
    public final int f;

    public void d1$b(d1 p0,i0 p1,View p2,int p3,int p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1$b.class, "1")) {
          return;
       }
       c uoc = this.b.b.Zh();
       if (uoc != null) {
          uoc.g(this.c, this.d, this.e, this.f);
       }
       this.c.execute();
       b uob = this.b.b.Uh();
       if (uob != null) {
          uob.d(this.c, (this.e + 1), (this.f + 1));
       }
       if (this.c.a().mAutoHidePanelWhenClicked != null) {
          a uoa = this.b.b.Yh();
          if (uoa != null) {
             uoa.dismiss();
          }
       }
       return;
    }
}
