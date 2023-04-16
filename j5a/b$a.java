package j5a.b$a;
import d6a.a;
import j5a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import crd.b;
import lnc.b9;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import j5a.a;
import erd.g;

public class b$a extends a	// class@00290b
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().s("PostRecommendPresenter", "becomesDetachedOnPageSelected", objArray);
       b9.a(this.b.t);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().s("PostRecommendPresenter", "becomesAttachedOnPageSelected", objArray);
       b9.a(this.b.t);
       b$a tb = this.b;
       tb.t = tb.getActivity().m().subscribe(new a(this.b));
       return;
    }
}
