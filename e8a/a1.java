package e8a.a1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.l;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.e0;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import android.text.TextPaint;
import android.widget.TextView;
import android.animation.AnimatorSet;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import sf5.g;
import android.widget.ImageView;

public class a1 extends l	// class@002095
{
    public static final float U0;
    public static final float V0;

    static {
       a1.U0 = (float)a1.e(18.00f);
       a1.V0 = (float)a1.e(21.50f);
    }
    public void a1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a1.class, "1")) {
          return;
       }
       super.E8();
       RoundingParams roundingPara = this.r.getHierarchy().n();
       if (roundingPara != null) {
          roundingPara.j(a1.a(R.color.arg_RES_7f06203d), (float)a1.e(0x3f000000));
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, a1.class, "2")) {
          return;
       }
       e0 tu = this.u;
       if (tu != null) {
          tu.getPaint().setFakeBoldText(true);
       }
       tu = this.v;
       if (tu != null) {
          tu.getPaint().setFakeBoldText(true);
       }
       return;
    }
    public AnimatorSet a9(){
       Object obj = PatchProxy.apply(null, this, a1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.b(this.U, a1.U0, a1.V0, l.Z);
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, a1.class, "3")) {
          return;
       }
       this.s.setImageResource(R.drawable.arg_RES_7f080a8b);
       return;
    }
}
