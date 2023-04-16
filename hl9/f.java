package hl9.f;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.yxcorp.gifshow.comment.utils.b;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.util.Objects;
import k2b.e0;
import com.yxcorp.gifshow.comment.utils.b$a;

public final class f implements PopupInterface$d	// class@0026cc
{
    public final b a;
    public final int b;
    public final String c;

    public void f(b p0,int p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(c p0,int p1){
       f ta = this.a;
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(ta);
       if (p1 == 2) {
          b.e(ta.a, tb, tc);
          ta.b.c();
       }
       return;
    }
}
