package hl9.h;
import u07.u;
import com.yxcorp.gifshow.comment.utils.b;
import java.lang.String;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.comment.utils.b$a;
import k2b.e0;
import lnc.a1;

public final class h implements u	// class@0026d0
{
    public final b b;
    public final int c;
    public final String d;

    public void h(b p0,int p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       h tb = this.b;
       Objects.requireNonNull(tb);
       p0.o();
       tb.b.a();
       b.d(tb.a, this.c, a1.p(R.string.cancel), this.d);
    }
}
