package h19.d$a;
import joc.o;
import h19.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.widget.SwipeLayout;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tkd.b;
import tkd.d;
import vo5.o;
import android.content.Context;
import ekd.i;
import androidx.fragment.app.Fragment;
import g59.m;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;
import im8.f;
import java.lang.Boolean;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import yy6.c;
import k2b.u1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class d$a extends o	// class@002536
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       d q = this.a.q;
       boolean b = true;
       if (q != null) {
          q.setEnabled(b);
       }
       q = this.a.H;
       if (q != null) {
          q.setEnabled(b);
       }
       Activity activity = this.a.getActivity();
       if (d.a(0x69ae4ec0).vO(activity)) {
          i.h(activity, 0, 0);
       }
       if (m.b(this.a.A)) {
          a.d().k(new PlayEvent(this.a.u, PlayEvent$Status.RESUME, 13));
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "4")) {
          return;
       }
       Activity activity = this.a.getActivity();
       if (!d.a(0x69ae4ec0).vO(activity) && this.f()) {
          i.h(activity, 0, 0);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       d q = this.a.q;
       if (q != null) {
          q.setEnabled(false);
       }
       q = this.a.H;
       if (q != null) {
          q.setEnabled(false);
       }
       if (m.b(this.a.A)) {
          a.d().k(new PlayEvent(this.a.u, PlayEvent$Status.PAUSE, 13));
       }
       Activity activity = this.a.getActivity();
       if (d.a(0x69ae4ec0).vO(activity) || this.f()) {
          i.h(activity, false, true);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "3")) {
          return;
       }
       if (!this.a.E.isFinishing() && !this.a.B.get().booleanValue()) {
          this.a.w.get().setLeaveAction(1);
          this.a.y.f(1);
          u1.K0(3);
          this.a.E.finish();
          this.a.E.overridePendingTransition(R.anim.arg_RES_7f0100e5, 0x7f0100e5);
       }
       return;
    }
    public final boolean f(){
       d$a obj = PatchProxy.apply(null, this, d$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = (obj.I != null && !obj.t.getDetailCommonParam().isFromProfile())? true: false;
       return b;
    }
}
