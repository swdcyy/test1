package n7a.m;
import java.lang.Runnable;
import n7a.n;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import n7a.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o7a.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import n7a.a;
import com.yxcorp.gifshow.entity.QPhoto;
import o7a.d;

public final class m implements Runnable	// class@003100
{
    public final n b;
    public final View c;

    public void m(n p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       m tc = this.c;
       n b = this.b.b;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(tc, b, o.class, "5")) {
       }else if(b.x == null){
          c uoc = new c(b.getActivity(), b.S8(), tc, b.p, b.s);
          b.u = v8;
          v8.i();
          b.u.setEnabled(b.y);
          b.u.h(tc.getTop());
          b.z = b.x.getScrollY();
       }
       return;
    }
}
