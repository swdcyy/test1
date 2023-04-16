package kgd.d2$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kgd.d2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.a;
import ai5.m;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.view.View;
import ekd.m1;

public class d2$a extends PresenterV2	// class@001785
{
    public TextView p;
    public final d2 q;

    public void d2$a(d2 p0){
       this.q = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d2$a.class, "2")) {
          return;
       }
       if (a.q < m.a()) {
          this.p.setCompoundDrawablesWithIntrinsicBounds(null, null, this.l8().getDrawable(R.drawable.arg_RES_7f080e8a), null);
       }else {
          this.p.setCompoundDrawables(null, null, null, null);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d2$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6d);
       return;
    }
}
