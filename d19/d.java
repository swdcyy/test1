package d19.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d19.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import android.content.Context;
import android.content.res.Resources;
import cw9.c;
import ekd.i;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import ekd.m1;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public class d extends PresenterV2	// class@00202a
{
    public Set p;
    public f q;
    public PhotoDetailLogger r;
    public View s;
    public QPhoto t;
    public f u;
    public boolean v;
    public int w;
    public final RecyclerView$r x;

    public void d(){
       super();
       this.v = false;
       this.x = new d$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.p.add(this.x);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       int i = c.b(this.getContext().getResources(), R.dimen.arg_RES_7f070fdf);
       int i1 = (i.c())? n.A(this.getContext()): 0;
       this.w = i + i1;
       return;
    }
    public void P8(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "5")) {
          return;
       }
       if (this.v != p0) {
          this.v = p0;
          if (p0) {
             a.d().k(new PlayEvent(this.t, PlayEvent$Status.PAUSE, 3));
          }else {
             a.d().k(new PlayEvent(this.t, PlayEvent$Status.RESUME, 3));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a30f6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_SCROLL_LISTENERS");
       this.q = this.x8("DETAIL_FULLSCREEN");
       this.r = this.r8("DETAIL_LOGGER");
       this.t = this.q8(QPhoto.class);
       this.u = this.x8("DETAIL_SCROLL_DISTANCE");
       return;
    }
}
