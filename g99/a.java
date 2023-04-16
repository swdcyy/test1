package g99.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import lu7.f;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextPaint;
import g99.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import zz5.d;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class a extends PresenterV2	// class@00243a
{
    public View p;
    public TextView q;
    public View r;
    public User s;
    public QPhoto t;
    public BaseFragment u;

    public void a(){
       super();
    }
    public void E8(){
       a ts;
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          ts = this.s;
          if (ts == null) {
             a.S("mUser");
          }
          tq.setText(f.e(ts));
       }
       tq = this.q;
       if (tq != null) {
          TextPaint paint = tq.getPaint();
          if (paint != null) {
             paint.setFakeBoldText(true);
          }
       }
       tq = this.t;
       if (tq == null) {
          a.S("mPhoto");
       }
       ts = this.u;
       if (ts == null) {
          a.S("mFragment");
       }
       d.b(tq, ts, new a$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.q = m1.f(p0, 0x7f0a3fd7);
       this.p = m1.f(p0, 0x7f0a4384);
       this.r = m1.f(p0, 0x7f0a0371);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.q8(User.class);
       a.o(obj, "inject\(User::class.java\)");
       this.s = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.u = obj;
       return;
    }
}
