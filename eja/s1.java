package eja.s1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import eja.s1$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import lv5.d;
import o26.d;
import o26.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import kzc.c;
import cg6.b;
import java.util.List;
import com.yxcorp.gifshow.widget.popup.c;
import kzc.e;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;

public final class s1 extends PresenterV2	// class@0026f6
{
    public HomeFollowFragment p;
    public final c q;

    public void s1(){
       super();
       this.q = new s1$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s1.class, "5")) {
          return;
       }
       b uob = d.a(-447917650);
       a.o(uob, "PluginManager.get\(MockFeedRepoPlugin::class.java\)");
       uob.XV().J5(this.q);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, s1.class, "6")) {
          return;
       }
       b uob = d.a(-447917650);
       a.o(uob, "PluginManager.get\(MockFeedRepoPlugin::class.java\)");
       uob.XV().Qb(this.q);
       return;
    }
    public final boolean P8(){
       Activity obj = PatchProxy.apply(null, this, s1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getActivity();
       boolean b = true;
       if (obj != null) {
          List list = b.b().l(obj);
          if (q.f(b.a().l(obj)) && q.f(list)) {
             b = false;
          }
       }
       return b;
    }
    public final boolean R8(){
       s1 obj = PatchProxy.apply(null, this, s1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       if (obj == null) {
          a.S("mFragment");
       }
       return obj.Vg().c();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s1.class, "4")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       return;
    }
}
