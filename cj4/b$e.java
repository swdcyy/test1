package cj4.b$e;
import mu4.d;
import cj4.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.animation.ObjectAnimator;
import android.view.View;
import cj4.e;
import android.os.Bundle;
import com.kuaishou.krn.model.LaunchModel$b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.lang.Long;
import java.lang.Number;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import com.kuaishou.krn.model.LaunchModel;
import android.app.Activity;
import com.kuaishou.merchant.bowl.krn.MerchantKrnContainerView;
import com.kwai.kds.krn.api.page.KwaiRnContainerView;
import vd4.b;
import android.view.ViewParent;
import android.view.ViewGroup;
import cj4.c;
import android.animation.Animator$AnimatorListener;
import cj4.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import mu4.c;

public final class b$e implements d	// class@00047f
{
    public final b a;

    public void b$e(b p0){
       this.a = p0;
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
          return;
       }
       b$e ta = this.a;
       Objects.requireNonNull(ta);
       b uob = b.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, uob, "5") && (!ta.q9() && !PatchProxy.applyVoid(objArray, ta, uob, "6"))) {
          b uob1 = 0x3f800000;
          b e = ta.E;
          if (e != null) {
             uob1 = ta.F;
             a.m(e);
             e.end();
          }
          e = ta.z;
          String str = "mContainer";
          if (e == null) {
             a.S(str);
          }
          e.setVisibility(0);
          String str1 = "mMerchantKrnContainerView";
          if (ta.D == null) {
             e = ta.C;
             a.m(e);
             b c = ta.C;
             a.m(c);
             Bundle uBundle = ta.s9(c);
             if (!PatchProxy.applyVoidTwoRefs(e, uBundle, ta, uob, "12")) {
                LaunchModel$b uob2 = new LaunchModel$b();
                uob2.i(e.a());
                uob2.j(e.b());
                uob2.g(0);
                if (!TextUtils.x(e.c())) {
                   uob2.l(e.c());
                }
                Iterator iterator = uBundle.keySet().iterator();
                while (iterator.hasNext()) {
                   String str2 = iterator.next();
                   Object obj = uBundle.get(str2);
                   if (obj instanceof Long) {
                      uob2.c(str2, obj.longValue());
                   }else if(obj instanceof String){
                      uob2.e(str2, obj);
                   }
                }
                e = ta.A;
                if (e == null) {
                   a.S(str1);
                }
                e.c(ta.P8(), uob2.h());
             }
             ta.D = true;
          }else {
             uob = ta.A;
             if (uob == null) {
                a.S(str1);
             }
             e = ta.C;
             a.m(e);
             uob.Vc(ta.s9(e));
          }
          int i = 2;
          b.m9(ta, "mt_purchase_panel_price_detail_opened", objArray, i, objArray);
          b z = ta.z;
          if (z == null) {
             a.S(str);
          }
          if (z.getParent() instanceof ViewGroup) {
             z = ta.z;
             if (z == null) {
                a.S(str);
             }
             float[] uofloatArray = new float[i];
             e = ta.z;
             if (e == null) {
                a.S(str);
             }
             ViewParent parent = e.getParent();
             Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
             uofloatArray[0] = (float)parent.getHeight() * uob1;
             uofloatArray[1] = 0;
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(z, "translationY", uofloatArray);
             ta.E = objectAnimat;
             a.m(objectAnimat);
             objectAnimat.setDuration(100);
             uob = ta.E;
             a.m(uob);
             uob.start();
             uob = ta.E;
             a.m(uob);
             uob.addListener(new c(ta));
             uob = ta.E;
             a.m(uob);
             uob.addUpdateListener(new d(ta));
          }
       }
    label_0155 :
       return;
    }
    public void destroy(){
       c.a(this);
    }
}
