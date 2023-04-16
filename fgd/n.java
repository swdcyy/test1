package fgd.n;
import erd.g;
import fgd.l;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.widget.selector.view.SelectShapeButton;
import android.widget.Button;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.moved.ks_page.fragment.AttrAnimProgressFragment;
import lnc.a1;
import e17.i;
import v56.g;
import fgd.m;
import java.lang.Runnable;
import ekd.k1;

public final class n implements g	// class@000e2f
{
    public final l b;
    public final WeakReference c;

    public void n(l p0,WeakReference p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
       }else {
          p0 = this.b;
          if (l.P8(p0).isEnabled()) {
             p0 = this.b.s;
             if (p0 == null) {
                a.S("mCacheSizeView");
             }
             p0.setText("0.00 MB");
             p0 = this.c.get();
             if (p0 != null) {
                p0.dismiss();
             }
             p0 = this.b;
             l.P8(p0).setEnabled(false);
             i.d(R.style.arg_RES_7f110669, a1.p(R.string.arg_RES_7f10058c));
             g.f(0);
             k1.r(m.b, 1000);
          }
       }
       return;
    }
}
