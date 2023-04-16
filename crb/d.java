package crb.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import zq6.b;
import wq6.f;
import zn5.b;
import crb.b;
import zq6.p;
import zq6.u;
import zq6.s;
import xq6.b;
import brb.e;
import com.kwai.kcube.decorator.IContainerDecorator;

public class d extends PresenterV2	// class@00239e
{
    public s p;
    public f q;
    public final b r;

    public void d(){
       super();
       this.r = new c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.getActivity().i3(this.r);
       this.p = this.q.y().b(b.g, new b(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d tp = this.p;
       if (tp != null) {
          tp.release();
       }
       this.getActivity().s3(this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.q8(e.class).c();
       return;
    }
}
