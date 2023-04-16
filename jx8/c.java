package jx8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import pr6.d;
import com.kwai.kcube.TabIdentifier;
import android.graphics.Rect;
import jx8.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import brd.x;
import jx8.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import jx8.b;
import java.lang.Runnable;
import ekd.k1;

public class c extends PresenterV2	// class@0029d2
{
    public final View p;
    public final d q;
    public final TabIdentifier r;
    public final Rect s;
    public final Runnable t;

    public void c(View p0,d p1,TabIdentifier p2){
       super();
       this.s = new Rect();
       this.t = new c$a(this);
       this.p = p0;
       this.q = p1;
       this.r = p2;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.X7(this.q.m().compose(this.q.c(FragmentEvent.DESTROY)).subscribe(new a(this), Functions.d()));
       this.X7(this.q.h().j().subscribe(new b(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       k1.m(this.t);
       return;
    }
}
