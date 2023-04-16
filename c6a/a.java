package c6a.a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import c6a.b;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import o07.n;

public final class a implements PopupInterface$f	// class@00055b
{
    public final b b;

    public void a(b p0){
       this.b = p0;
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "inflater");
       a.p(p2, "container");
       a tb = this.b;
       if (tb.y == null) {
          tb.y = a.g(p1, 0x7f0d133a, p2, false);
          tb = this.b;
          b y = tb.y;
          a.m(y);
          tb.R8(y);
       }
       this.b.W8();
       b y1 = this.b.y;
       a.m(y1);
       return y1;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
