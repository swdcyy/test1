package ad0.g;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.utility.n;
import jd0.a;
import ld0.d;
import com.kuaishou.growth.pendant.model.PendantCommonParamsV2;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import java.lang.StringBuilder;
import ld0.c;
import java.lang.Float;
import java.util.List;
import ed0.d;
import java.util.Iterator;
import java.lang.Iterable;
import ed0.e;
import android.widget.FrameLayout;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import com.kwai.robust.PatchProxyResult;
import zc0.c;
import wc0.a;
import androidx.fragment.app.FragmentActivity;
import ed0.b;
import com.kuaishou.growth.pendant.coin.absorb.widget.AbsorbedLowActivePendant;
import fd0.a;
import fd0.b;
import fd0.k;
import fd0.i;
import kotlin.collections.CollectionsKt__CollectionsKt;
import fd0.p;
import fd0.m;
import fd0.g;
import fd0.d;
import android.app.Activity;
import android.view.ViewGroup;
import dd0.k;

public final class g	// class@000064
{

    public static final void a(View p0,boolean p1,boolean p2){
       float f;
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, g.class, "10")) {
          return;
       }
       a.p(p0, "$this$adjustNewAdsorbedXIfNeed");
       int i = n.z(p0.getContext());
       if (p1) {
          f = (p2)? (float)i - (float)p0.getWidth(): 0;
       }else if(p2){
          f = (float)i;
       }else {
          f = - (float)p0.getWidth();
       }
       p0.setX(f);
       p0.setAlpha(0x3f800000);
       a uoa = d.d();
       PendantCommonParamsV2 pendantCommo = uoa.c();
       if (pendantCommo != null) {
          pendantCommo.setMPendantX((int)p0.getX());
          uoa.h(pendantCommo);
       }
       KemPendantV2 kemPendantV2 = (!p0 instanceof KemPendantV2)? null: p0;
       if (kemPendantV2) {
          kemPendantV2.t("ADSORBED_LOW_ACTIVE_UI_REINFLATE");
       }
       c.c("bindNewAbsorbAttachRunnable start newAbsorbedPendant.x="+p0.getX()+','+"newAbsorbedPendant.y=="+p0.getY());
       return;
    }
    public static final void b(View p0,float p1,boolean p2,boolean p3){
       float f;
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, Float.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), null, g.class, "9")) {
          return;
       }
       a.p(p0, "$this$adjustPendantXIfNeed");
       int i = n.z(p0.getContext());
       if (p2) {
          f = (p3)? (float)i: - (float)p0.getWidth();
       }else if(p3){
          f = (float)i - (float)p0.getWidth();
       }else {
          f = 0;
       }
       p0.setX(f);
       p0.setAlpha(0x3f800000);
       int i1 = 0;
       p0.setVisibility(i1);
       KemPendantV2 kemPendantV2 = (!p0 instanceof KemPendantV2)? null: p0;
       if (kemPendantV2) {
          Iterator iterator = d.a().iterator();
          while (iterator.hasNext()) {
             iterator.next().b(kemPendantV2, p0.getX(), p1, i1);
          }
       }
       c.c("bindNewAbsorbAttachRunnable start kemPendant.x="+p0.getX()+','+"kemPendant"+".y=="+p0.getY());
       return;
    }
    public static final KemPendantV2 c(RxFragmentActivity p0,TaskParamsV2 p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object obj = null;
       String obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, og, "4");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       a.p(p0, "$this$createNewAdsorbedView");
       obj1 = "taskParamsV2";
       a.p(p1, obj1);
       a obj2 = PatchProxy.applyTwoRefs(p0, p1, obj, og, "3");
       if (obj2 != patchProxyRe) {
       }else {
          a.p(p0, "$this$createAdsorbedPendantByBuilder");
          a.p(p1, obj1);
          obj2 = PatchProxy.applyTwoRefs(p0, p1, obj, c.class, "1");
          if (obj2 != patchProxyRe) {
          }else {
             a.p(p0, "activity");
             a.p(p1, obj1);
             obj2 = new a(p0, p1);
             p0 = PatchProxy.apply(obj, obj2, a.class, "1");
             if (p0 != patchProxyRe) {
                obj2 = p0;
             }else {
                obj2.m(true);
                obj2.n(true);
                AbsorbedLowActivePendant uAbsorbedLow = new AbsorbedLowActivePendant(obj2.b());
                uAbsorbedLow.setMBuilder(obj2);
                obj2.o(new a(uAbsorbedLow));
                k[] okArray = new k[true];
                okArray[0] = new i(uAbsorbedLow);
                obj2.k(CollectionsKt__CollectionsKt.P(okArray));
                p[] opArray = new p[true];
                opArray[0] = new m(uAbsorbedLow);
                obj2.l(CollectionsKt__CollectionsKt.P(opArray));
                g[] ogArray = new g[true];
                ogArray[0] = new d(uAbsorbedLow);
                obj2.j(CollectionsKt__CollectionsKt.P(ogArray));
                uAbsorbedLow.n();
                obj2 = uAbsorbedLow;
             }
          }
       }
       return obj2;
    }
    public static final View d(Activity p0){
       View view = null;
       Object obj = PatchProxy.applyOneRefs(p0, view, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$getNewAdsorbedView");
       ViewGroup viewGroup = g.e(p0);
       if (viewGroup != null) {
          view = viewGroup.findViewById(R.id.kem_new_absorb_pendant);
       }
       return view;
    }
    public static final ViewGroup e(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$getRootView");
       return p0.findViewById(0x1020002);
    }
    public static final boolean f(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$inScreenRight");
       boolean b = (p0.getX() - (float)((n.z(p0.getContext()) - p0.getWidth()) / 2) >= 0)? true: false;
       return b;
    }
    public static final void g(Activity p0,View p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, g.class, "18")) {
          return;
       }
       a.p(p0, "$this$notifyHideAnimDone");
       a.p(p1, "pendant");
       a.p(p2, "absorb");
       c.c("pendant@ x="+p1.getX()+",y="+p1.getY());
       c.c("absorb@ x="+p2.getX()+",y="+p2.getY());
       if (p1 instanceof KemPendantV2) {
          p1.t("ADSORBED_LOW_ACTIVE_HIDE_ANIM_DONE");
       }
       if (!p0 instanceof RxFragmentActivity) {
          p0 = null;
       }
       if (p0 != null) {
          Iterator iterator = d.c().cH(p0).iterator();
          while (iterator.hasNext()) {
             iterator.next().t("ADSORBED_LOW_ACTIVE_HIDE_ANIM_DONE");
          }
       }
       if (p2 instanceof KemPendantV2) {
          p2.t("ADSORBED_LOW_ACTIVE_HIDE_ANIM_DONE");
       }
       return;
    }
    public static final void h(Activity p0,View p1,View p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, g.class, "14")) {
          return;
       }
       a.p(p0, "$this$notifyShowAnimDone");
       a.p(p1, "pendant");
       a.p(p2, "absorb");
       c.c("pendant@ x="+p1.getX()+",y="+p1.getY());
       c.c("absorb@ x="+p2.getX()+",y="+p2.getY());
       if (p1 instanceof KemPendantV2) {
          p1.t("ADSORBED_LOW_ACTIVE_SHOW_ANIM_DONE");
       }
       Iterator iterator = d.c().cH(p0).iterator();
       while (iterator.hasNext()) {
          iterator.next().t("ADSORBED_LOW_ACTIVE_SHOW_ANIM_DONE");
       }
       if (p2 instanceof KemPendantV2) {
          p2.t("ADSORBED_LOW_ACTIVE_SHOW_ANIM_DONE");
       }
       return;
    }
    public static final void i(KemPendantV2 p0,TaskParamsV2 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "7")) {
          return;
       }
       a.p(p0, "$this$updateNewAdsorbedParams");
       a.p(p1, "taskParamsV2");
       if (p0 instanceof AbsorbedLowActivePendant) {
          p0.getMBuilder().s(p1);
       }
       return;
    }
}
