package k3a.d;
import j3a.b;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import j3a.b$a;
import j3a.a;
import k3a.c;
import java.util.List;
import java.util.Objects;
import k3a.g;
import android.widget.LinearLayout;
import java.util.Iterator;
import k3a.a;
import k3a.b;
import android.view.ViewTreeObserver;
import k3a.f;
import msd.l;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import i2b.a;
import android.animation.LayoutTransition;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.widget.HorizontalScrollView;
import xtd.b;
import xtd.h;

public final class d implements b	// class@002bc6
{
    public g a;
    public LinearLayout b;
    public LayoutTransition c;

    public void d(){
       super();
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       return b$a.a(this, p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
       }else {
          a.p(p0, "element");
          d ta = this.a;
          if (ta == null) {
             a.S("mActionGroupItemHelper");
          }
          List list = p0.h();
          c g = p0.g;
          Objects.requireNonNull(ta);
          String str = "1";
          if (!PatchProxy.applyVoidTwoRefs(list, g, ta, g.class, str)) {
             a.p(list, "items");
             ta.a.removeAllViews();
             if (!list.isEmpty()) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   b uob = uoa.a();
                   Objects.requireNonNull(uob, "null cannot be cast to non-null type com.yxcorp.gifshow.detail.player.panel.elements.ActionElementView");
                   uob.b(ta.a);
                   uob.a(uoa);
                   b uob1 = PatchProxy.apply(null, uob, b.class, str);
                   if (uob1 != PatchProxyResult.class) {
                   }else {
                      uob1 = uob.a;
                      if (uob1 == null) {
                         a.S("container");
                      }
                   }
                   uob1.setId(View.generateViewId());
                   ta.a.addView(uob1);
                   if (!uoa.b() && uoa.e == null) {
                      uob1.setVisibility(8);
                   }
                }
                ta.a.getViewTreeObserver().addOnGlobalLayoutListener(new f(ta, list, g));
             }
          }
       }
       return;
    }
    public View d(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d1161);
       a.o(view, "KwaiLayoutInflater.infla¡­nel_action_element_group\)");
       return view;
    }
    public void k(View p0){
       d uod = this;
       Object obj = p0;
       d uod1 = d.class;
       if (PatchProxy.applyVoidOneRefs(obj, this, uod1, "2")) {
          return;
       }
       a.p(obj, "view");
       LinearLayout linearLayout = obj.findViewById(R.id.action_group_container);
       uod.b = linearLayout;
       a.m(linearLayout);
       uod.a = new g(linearLayout);
       uod.c = new LayoutTransition();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uod1, "4")) {
          PropertyValuesHolder propertyValu = PropertyValuesHolder.ofFloat("scaleX", new float[2]{0x3f800000,0x3f4ccccd});
          a.o(propertyValu, "PropertyValuesHolder.ofF¡­\"scaleX\",\n      1f, 0.8f\)");
          PropertyValuesHolder propertyValu1 = PropertyValuesHolder.ofFloat("scaleY", new float[2]{0x3f800000,0x3f4ccccd});
          a.o(propertyValu1, "PropertyValuesHolder.ofF¡­\"scaleY\",\n      1f, 0.8f\)");
          PropertyValuesHolder propertyValu2 = PropertyValuesHolder.ofFloat("alpha", new float[2]{0x3f800000,0});
          a.o(propertyValu2, "PropertyValuesHolder.ofF¡­at\(\"alpha\",\n      1f, 0f\)");
          PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[]{propertyValu,propertyValu1,propertyValu2};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(objArray, propertyValu3);
          a.o(objectAnimat, "ObjectAnimator.ofPropert¡­1, scaleY1,\n      alpha1\)");
          d c = uod.c;
          a.m(c);
          c.setDuration(3, 250);
          c = uod.c;
          a.m(c);
          c.setAnimator(3, objectAnimat);
          d c1 = uod.c;
          a.m(c1);
          c1.setStartDelay(1, 150);
          c1 = uod.c;
          a.m(c1);
          c1.setDuration(1, 250);
          PropertyValuesHolder propertyValu4 = PropertyValuesHolder.ofFloat("scaleX", new float[2]{0x3f4ccccd,0x3f800000});
          a.o(propertyValu4, "PropertyValuesHolder.ofF¡­\"scaleX\",\n      0.8f, 1f\)");
          propertyValu1 = PropertyValuesHolder.ofFloat("scaleY", new float[2]{0x3f4ccccd,0x3f800000});
          a.o(propertyValu1, "PropertyValuesHolder.ofF¡­\"scaleY\",\n      0.8f, 1f\)");
          PropertyValuesHolder propertyValu5 = PropertyValuesHolder.ofFloat("alpha", new float[2]{0,0x3f800000});
          a.o(propertyValu5, "PropertyValuesHolder.ofF¡­at\(\"alpha\",\n      0f, 1f\)");
          PropertyValuesHolder[] propertyValu6 = new PropertyValuesHolder[]{propertyValu4,propertyValu1,propertyValu5};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(objArray, propertyValu6);
          a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­2, scaleY2,\n      alpha2\)");
          d c2 = uod.c;
          a.m(c2);
          c2.setDuration(2, 250);
          c2 = uod.c;
          a.m(c2);
          c2.setAnimator(2, objectAnimat1);
          d c3 = uod.c;
          a.m(c3);
          c3.setStartDelay(2, 100);
          uod1 = uod.c;
          a.m(uod1);
          uod1.setDuration(0, 250);
       }
       uod1 = uod.b;
       if (uod1 != null) {
          uod1.setLayoutTransition(uod.c);
       }
       h.a(obj);
       return;
    }
}
