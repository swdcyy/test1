package cy0.e;
import k51.c;
import cy0.e$a;
import cy0.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kwai.feature.api.live.service.show.comments.sendcomment.CustomerServiceCommentInfo;
import ft5.b;
import android.widget.TextView;
import mrd.c;
import ks3.i0;
import t45.d;
import brd.z;
import brd.t;
import cy0.d;
import erd.r;
import cy0.b;
import cy0.c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Runnable;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import cy0.a;
import android.view.View$OnClickListener;
import fy0.b$b;

public class e extends c	// class@001ea5
{
    public a0 p;
    public b$b q;
    public EmojiEditText r;
    public TextView s;
    public ImageButton t;
    public LinearLayout u;
    public g v;
    public Runnable w;
    public Runnable x;
    public CustomerServiceCommentInfo y;
    public static String sLivePresenterClassName = "LiveAudienceMerchantCSFloatEditorPresenter";

    public void e(){
       super();
       this.w = new e$a(this);
       this.x = new e$b(this);
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       this.y = this.p.Y1.mf();
       e ts = this.s;
       if (ts != null) {
          ts.setText(R.string.arg_RES_7f10321e);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          this.X7(this.p.O2.a().observeOn(d.a).filter(d.b).subscribe(new b(this), c.b));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.m8().removeCallbacks(this.x);
       this.m8().removeCallbacks(this.w);
       this.v = null;
       this.y.reset();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0ca8);
       this.s = m1.f(p0, 0x7f0a0a3a);
       this.t = m1.f(p0, 0x7f0a0a39);
       this.u = m1.f(p0, 0x7f0a0953);
       e tt = this.t;
       if (tt != null) {
          tt.setOnClickListener(new a(this));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.q8(b$b.class);
       return;
    }
}
