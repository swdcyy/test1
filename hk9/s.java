package hk9.s;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.common.c;
import java.lang.Object;
import com.yxcorp.gifshow.comment.common.c$b;
import android.view.View;
import com.yxcorp.gifshow.comment.common.c$a$a;
import android.widget.TextView;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;

public final class s implements Runnable	// class@0026af
{
    public final c b;

    public void s(c p0){
       this.b = p0;
    }
    public final void run(){
       s tb = this.b;
       if (tb.l.e.a() != null) {
          tb.l.e.a().setText(a1.p(R.string.arg_RES_7f103d8b));
       }
       return;
    }
}
