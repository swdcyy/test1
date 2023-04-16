package h3a.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import vca.i;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.paycourse.PayVideoMeta;
import vca.b;
import tl8.d;
import ok.h;
import tl8.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class a extends PresenterV2	// class@002556
{
    public TextView p;
    public TextView q;
    public View r;
    public TextView s;
    public View t;
    public KwaiImageView u;
    public KwaiImageView v;
    public QPhoto w;
    public final int x;

    public void a(int p0){
       super();
       this.x = p0;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       if (!this.r.getVisibility() && this.x == 10) {
          a tp = this.p;
          if (tp != null) {
             tp.setVisibility(8);
          }
          this.q.setVisibility(8);
          this.t.setVisibility(8);
          this.u.setVisibility(8);
          this.v.setVisibility(8);
          tp = this.w;
          String str = PatchProxy.applyOneRefs(tp, objArray, i.class, "4");
          if (str != PatchProxyResult.class) {
          }else {
             str = e.f(tp.mEntity, PayVideoMeta.class, b.b);
          }
          if (TextUtils.x(str)) {
             this.s.setVisibility(8);
          }else {
             this.s.setText(str);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0a19);
       this.p = m1.f(p0, 0x7f0a2ce5);
       this.r = m1.f(p0, 0x7f0a355e);
       this.v = m1.f(p0, 0x7f0a0335);
       this.u = m1.f(p0, 0x7f0a0334);
       this.t = m1.f(p0, 0x7f0a3554);
       this.s = m1.f(p0, 0x7f0a3560);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.w = this.q8(QPhoto.class);
       return;
    }
}
