package d82.k;
import lf3.g;
import d82.n;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveEntrustClosed;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import lf3.f;

public final class k implements g	// class@002494
{
    public final n b;

    public void k(n p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, n.class, "5")) {
       }else {
          n s = tb.s;
          if (s != null && s.isShowing()) {
             tb.s.dismiss();
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
