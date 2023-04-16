package f3a.n;
import com.yxcorp.gifshow.widget.m;
import f3a.l;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class n extends m	// class@002292
{
    public final l c;
    public final boolean d;

    public void n(l p0,boolean p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       l t = this.c.t;
       a.m(t);
       if (t.isSelected()) {
          this.c.X8("VIDEO_POST", "", "", "3716326");
          this.c.W8(this.d);
       }else {
          a.o(i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103a72)), "KSToast.applyStyle\(R.sty¡­g.ocr_select_text_first\)\)");
       }
       return;
    }
}
