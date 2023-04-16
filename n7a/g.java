package n7a.g;
import java.lang.Runnable;
import n7a.h;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import n7a.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n7a.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import o7a.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import com.yxcorp.gifshow.entity.QPhoto;
import o7a.d;

public final class g implements Runnable	// class@0030fa
{
    public final h b;
    public final View c;

    public void g(h p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g tc = this.c;
       h b = this.b.b;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(tc, b, f.class, "10")) {
       }else if(b.u != null){
          Log.g("SlidePlayDetailTagStick", "create fake atlas helper: "+b.p);
          c uoc = new c(b.getActivity(), b.V8(), tc, b.p, b.s);
          b.u = v8;
          v8.i();
          b.u.setEnabled(b.E);
          b.u.setViewSize(tc.getWidth(), tc.getHeight());
          b.u.h(tc.getTop());
       }
       return;
    }
}
