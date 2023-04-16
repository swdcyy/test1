package com.yxcorp.gifshow.activity.web.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mx8.a;
import com.yxcorp.gifshow.activity.web.presenter.a$a;
import com.yxcorp.gifshow.activity.web.presenter.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fr6.a;
import wq6.d;
import fr6.e;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import mx8.b;
import erd.g;
import crd.b;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import ro5.a;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.activity.web.memory.TrimMemoryConfig;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment;
import as6.a;

public class a extends PresenterV2	// class@0014c6
{
    public OperateWebViewFragment p;
    public d q;
    public View r;
    public TrimMemoryConfig s;
    public long t;
    public boolean u;
    public boolean v;
    public final e w;
    public final View$OnAttachStateChangeListener x;
    public final SlidingPaneLayout$d y;

    public void a(){
       super();
       this.s = null;
       this.v = true;
       this.w = new a(this);
       this.x = new a$a(this);
       this.y = new a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tq = this.q;
       if (tq != null && this.s != null) {
          tq.b0().a(this.w);
          this.X7(this.p.Vg().j().subscribe(new b(this)));
       }
       tq = this.r;
       if (tq != null) {
          tq.addOnAttachStateChangeListener(this.x);
       }
       a.a(this.p, this.y);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.s = a.t().getValue("activityTabTrimMemoryConfig", TrimMemoryConfig.class, null);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          tq.b0().d(this.w);
       }
       tq = this.r;
       if (tq != null) {
          tq.removeOnAttachStateChangeListener(this.x);
       }
       a.l(this.p, this.y);
       return;
    }
    public void doBindView(View p0){
       this.r = p0;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       OperateWebViewFragment operateWebVi = this.r8("FRAGMENT");
       this.p = operateWebVi;
       this.q = a.e(operateWebVi);
       return;
    }
}
