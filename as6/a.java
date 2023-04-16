package as6.a;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import zq6.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wq6.d;
import zq6.r;
import wq6.h;
import com.kwai.kcube.internal.tab.TabNode;
import wq6.m;
import ar6.e;
import com.kwai.kcube.TabIdentifier;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.kcube.KCubeContainerFragment;
import com.kwai.kcube.internal.tab.container.ContainerTabNode;
import wq6.k;
import java.util.Objects;
import com.kwai.kcube.internal.tab.atomic.AtomicTabNode;
import wq6.f;
import ur6.f;
import wq6.g;
import java.lang.Number;

public final class a	// class@0003a6
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final void a(Fragment p0,p p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "8")) {
          return;
       }
       a.p(p0, "fragment");
       a.p(p1, "stateId");
       a.p(p2, "data");
       d uod = a.e(p0);
       if (uod != null) {
          r or = uod.e0();
          if (or != null) {
             or.a(p1, p2);
          }
       }
       return;
    }
    public static final void b(h p0,p p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "9")) {
          return;
       }
       a.p(p0, "tab");
       a.p(p1, "stateId");
       a.p(p2, "data");
       m.b(p0).n().a(p1, p2);
       return;
    }
    public static final boolean c(Fragment p0,TabIdentifier p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "fragment");
       a.p(p1, "tabIdentifier");
       while (true) {
          if (p0 instanceof KCubeContainerFragment && a.g(p0.ah().q(), p1)) {
             return true;
          }
          p0 = p0.getParentFragment();
          if (p0 == null) {
             break ;
          }
       }
       return false;
    }
    public static final d d(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       return a.g(p0).s8();
    }
    public static final d e(Fragment p0){
       d uod = null;
       Object obj = PatchProxy.applyOneRefs(p0, uod, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       k ok = a.h(p0);
       if (ok != null) {
          uod = ok.s8();
       }
       return uod;
    }
    public static final Fragment f(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       while (true) {
          if (p0 == null) {
             return null;
          }
          if (p0 instanceof k && p0.z5() != null) {
             break ;
          }else {
             p0 = p0.getParentFragment();
          }
       }
       return p0;
    }
    public static final k g(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       p0 = a.f(p0);
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kwai.kcube.KCubeTabFragmentInterface");
       return p0;
    }
    public static final k h(Fragment p0){
       Fragment uFragment = null;
       Object obj = PatchProxy.applyOneRefs(p0, uFragment, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "fragment");
       p0 = a.f(p0);
       if (p0 instanceof k) {
          uFragment = p0;
       }
       return uFragment;
    }
    public static final d i(h p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AtomicTabNode obj = PatchProxy.applyOneRefs(p0, null, a.class, "21");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "tab");
       obj = PatchProxy.applyOneRefs(p0, null, m.class, "2");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "$this$toAtomicNode");
          obj = m.b(p0).a();
       }
       return obj.C();
    }
    public static final f j(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof KCubeContainerFragment) {
          return p0.Yg();
       }
       return null;
    }
    public static final f k(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tab");
       return m.a(p0).K();
    }
    public static final Object l(h p0,p p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tab");
       a.p(p1, "stateId");
       return m.b(p0).n().d(p1);
    }
    public static final h m(h p0){
       f uof = null;
       Object obj = PatchProxy.applyOneRefs(p0, uof, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tab");
       ContainerTabNode uContainerTa = m.b(p0).z();
       if (uContainerTa != null) {
          uof = uContainerTa.d0();
       }
       return uof;
    }
    public static final boolean n(Fragment p0,TabIdentifier p1){
       TabIdentifier tabIdentifie = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, tabIdentifie, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "fragment");
       a.p(p1, "containerId");
       d uod = a.e(p0);
       if (uod == null) {
          return false;
       }
       h oh = a.m(uod);
       if (oh != null) {
          tabIdentifie = oh.M2();
       }
       return a.g(tabIdentifie, p1);
    }
    public static final boolean o(h p0,TabIdentifier p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "container");
       a.p(p1, "targetId");
       return p0.a().O(p1);
    }
    public static final int p(TabIdentifier p0,h p1){
       h obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "container");
       a.p(p1, "target");
       obj = a.m(p1);
       while (true) {
          if (obj == null) {
             return -1;
          }
          if (a.g(obj.M2(), p0)) {
             break ;
          }else {
             obj = a.m(obj);
          }
       }
       return obj.a().k(p1.M2());
    }
}
