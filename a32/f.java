package a32.f;
import java.lang.Runnable;
import a32.e$b;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import a32.e;
import t02.a0;
import com.kwai.framework.model.user.User;
import p91.m;
import java.lang.Boolean;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class f implements Runnable	// class@000024
{
    public final e$b b;
    public final boolean c;

    public void f(e$b p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       b.d0(LiveLogTag.MULTI_WINDOW, "onAdaptInMultiWindowAuthorityChanged", "authorName", tb.a.p.Z2.I().mName, "enableAdaptInMultiWindow", Boolean.valueOf(tc));
       e$b a = tb.a;
       a.s = tc;
       if (tc != null) {
          if (a.P8()) {
             tb.a.S8();
          }
       }else {
          a.R8();
       }
       return;
    }
}
