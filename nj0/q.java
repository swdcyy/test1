package nj0.q;
import java.lang.Runnable;
import com.kuaishou.krn.delegate.k;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.krn.delegate.KrnDelegate;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mj0.b;
import lj0.c;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import zj0.x;
import zj0.u;
import android.os.Bundle;
import com.facebook.react.ReactRootView;
import com.facebook.react.a;
import ze.v;

public final class q implements Runnable	// class@00333e
{
    public final k b;

    public void q(k p0){
       this.b = p0;
    }
    public final void run(){
       q tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, KrnDelegate.class, "26")) {
       }else {
          b.a();
          tb.f.setBundleId(tb.e.b());
          tb.e.k().B();
          tb.b(tb.f.getAppProperties());
          tb.e.r().d(tb.g());
       }
       return;
    }
}
