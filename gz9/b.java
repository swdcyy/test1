package gz9.b;
import gz9.b$a;
import nsd.u;
import v6a.m0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.PayCourseApiService;
import brd.t;
import zfc.b;
import erd.o;
import cjd.e;
import gz9.b$b;
import gz9.b$c;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.paycourse.TrialPlayInfo;
import vca.i;
import android.app.Activity;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import org.greenrobot.eventbus.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;

public final class b	// class@002517
{
    public final a a;
    public final PhotoDetailParam b;
    public final a c;
    public final x d;
    public final Activity e;
    public final BaseFragment f;
    public final QPhoto g;
    public ProgressFragment h;
    public a i;
    public static final b$a j;

    static {
       b.j = new b$a(null);
    }
    public void b(m0 p0){
       a.p(p0, "callerContext");
       super();
       this.a = p0.Z;
       a c = p0.c;
       this.b = c;
       this.c = p0.j;
       this.d = p0.p;
       this.e = p0.a;
       this.f = p0.b;
       this.g = c.mPhoto;
       this.i = new a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b th = this.h;
       if (th != null) {
          th.dismiss();
       }
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       this.g();
       this.i.c(b.a(0x74d268f).checkOrder(p0).retryWhen(new b(3, 1000)).map(new e()).subscribe(new b$b(this), new b$c(this)));
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       this.a();
       this.f();
       return;
    }
    public final String d(){
       b obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       a.o(obj, "mPhoto");
       return i.a(obj.getEntity()).mCourseId;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "14")) {
          return;
       }
       this.e.onBackPressed();
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       a.d().k(new PlayEvent(this.g, PlayEvent$Status.RESUME, 19));
       return;
    }
    public final void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          return;
       }
       b th = this.h;
       if (th == null) {
          th = new ProgressFragment();
          th.Ih(R.string.loading);
          this.h = th;
       }
       b tf = this.f;
       a.o(tf, "it");
       if (tf.isAdded()) {
          objArray = tf;
       }
       if (objArray != null) {
          c fragmentMana = objArray.getFragmentManager();
          if (fragmentMana != null) {
             th.show(fragmentMana, "PayCoursePaymentController");
          }
       }
       return;
    }
}
