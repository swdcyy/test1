package djc.m;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.share.widget.CardsAdapter;
import djc.q1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.ViewTreeObserver;

public final class m implements ViewTreeObserver$OnGlobalLayoutListener	// class@002209
{
    public final CardsAdapter b;
    public final q1 c;

    public void m(CardsAdapter p0,q1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       if (this.c.a().getWidth() > 0) {
          this.c.a().setPivotX((float)this.c.a().getWidth());
          this.c.a().setPivotY(0);
          this.c.a().setScaleX(this.b.K0());
          this.c.a().setScaleY(this.b.K0());
          this.c.a().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       }
       return;
    }
}
