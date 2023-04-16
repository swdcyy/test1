package g19.m;
import com.yxcorp.gifshow.ad.detail.presenter.side.c;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.presenter.side.l;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import android.text.TextPaint;
import android.widget.TextView;
import android.widget.ImageView;

public class m extends c	// class@0023ca
{
    public static final float Y;
    public static final float Z;

    static {
       m.Y = (float)a1.e(18.00f);
       m.Z = (float)a1.e(21.50f);
    }
    public void m(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
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
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       l tu = this.u;
       if (tu != null) {
          tu.getPaint().setFakeBoldText(true);
       }
       tu = this.v;
       if (tu != null) {
          tu.getPaint().setFakeBoldText(true);
       }
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.s.setImageResource(R.drawable.arg_RES_7f080a8b);
       return;
    }
}
