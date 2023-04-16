package hl9.g;
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

public final class g implements u	// class@0026ce
{
    public final b b;
    public final int c;
    public final String d;

    public void g(b p0,int p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       g tb = this.b;
       Objects.requireNonNull(tb);
       p0.o();
       tb.b.a();
       b.e(tb.a, this.c, this.d);
    }
}
