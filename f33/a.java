package f33.a;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.ViewControllerManagerImpl;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import com.kuaishou.live.ext.FragmentViewControllerHostFragment;
import androidx.fragment.app.e;
import f33.a$a;
import androidx.fragment.app.c$b;

public final class a	// class@002853
{

    public static final ViewController a(Fragment p0,int p1,ViewController p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "$this$addViewController");
       a.p(p2, "viewController");
       a.e(p0).G8(p1, p2);
       return p2;
    }
    public static final ViewController b(Fragment p0,ViewGroup p1,ViewController p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$addViewController");
       a.p(p1, "container");
       a.p(p2, "viewController");
       a.e(p0).E2(p1, p2);
       return p2;
    }
    public static final ViewController c(Fragment p0,ViewController p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$addViewController");
       a.p(p1, "viewController");
       return a.a(p0, 0, p1);
    }
    public static final void d(Fragment p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "5")) {
          return;
       }
       a.p(p0, "$this$removeViewController");
       a.p(p1, "viewController");
       a.e(p0).o1(p1);
       return;
    }
    public static final ViewControllerManagerImpl e(Fragment p0){
       FragmentViewControllerHostFragment uFragmentVie;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Fragment obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = "com.kuaishou.live.ext.FragmentViewControllerHostFragment";
       obj = p0.getChildFragmentManager().findFragmentByTag(str);
       if (obj == null) {
          uFragmentVie = new FragmentViewControllerHostFragment();
          e uoe = p0.getChildFragmentManager().beginTransaction();
          uoe.h(uFragmentVie, str);
          uoe.o();
          p0.requireFragmentManager().registerFragmentLifecycleCallbacks(new a$a(p0, uFragmentVie), false);
       }
       FragmentViewControllerHostFragment uFragmentVie1 = PatchProxy.apply(null, uFragmentVie, FragmentViewControllerHostFragment.class, "1");
       if (uFragmentVie1 != patchProxyRe) {
       }else {
          uFragmentVie1 = uFragmentVie.b;
          if (uFragmentVie1 == null) {
             a.S("controllerManager");
          }
       }
       return uFragmentVie1;
    }
}
