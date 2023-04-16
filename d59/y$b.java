package d59.y$b;
import c59.n;
import d59.y;
import java.lang.Object;
import c59.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.lang.Number;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Integer;
import ekd.r$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class y$b implements n	// class@002068
{
    public final y a;

    public void y$b(y p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       m.a(this, p0);
    }
    public void b(float p0,float p1){
       Integer obj;
       y$b uob = y$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uob, "1")) {
          return;
       }
       Float uFloat = Float.valueOf(p1);
       int i = 0;
       y$b uob1 = (uFloat.floatValue() - (float)i >= 0)? 1: null;
       Integer integer = null;
       if (!uob1) {
          obj = integer;
       }
       if (uFloat != null) {
          uFloat = uFloat.floatValue();
          y p = this.a.p;
          if (p == null) {
             a.S("mPlaceholderMaskView");
          }
          p.setAlpha(uFloat);
          p = this.a.q;
          if (p == null) {
             a.S("mContainerCloseView");
          }
          if (!uFloat - 0x3f800000) {
             i = true;
          }
          p.setClickable(i);
          uob1 = this.a;
          obj = uob1.v.evaluate(uFloat, Integer.valueOf(uob1.t), Integer.valueOf(this.a.u));
          if (obj instanceof Integer) {
             integer = obj;
          }
          if (integer != null) {
             this.a.m8().setBackgroundColor(integer.intValue());
          }
       }
       return;
    }
}
