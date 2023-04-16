package bc9.q;
import java.lang.Runnable;
import fc9.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.lang.CharSequence;

public final class q implements Runnable	// class@000402
{
    public final a b;
    public final Ref$BooleanRef c;

    public void q(a p0,Ref$BooleanRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       TextView textView = this.b.f();
       a.o(textView, "it.btnTextView");
       String str = (this.c.element != null)? a1.p(R.string.arg_RES_7f100233): a1.p(R.string.arg_RES_7f100234);
       textView.setText(str);
       return;
    }
}
