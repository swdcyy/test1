package hl9.i;
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

public final class i implements u	// class@0026d2
{
    public final b b;
    public final int c;
    public final String d;

    public void i(b p0,int p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       i tb = this.b;
       Objects.requireNonNull(tb);
       p0.o();
       tb.b.b();
       b.d(tb.a, this.c, a1.p(R.string.arg_RES_7f104637), this.d);
    }
}
