package fw2.a;
import fw2.a$a;
import nsd.u;
import java.lang.Object;
import java.util.WeakHashMap;
import android.view.View;
import android.animation.TimeInterpolator;
import msd.a;
import android.view.ViewPropertyAnimator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import usd.f;
import usd.p;
import java.lang.Comparable;
import usd.g;
import java.lang.Number;
import fw2.a$b;
import android.animation.Animator$AnimatorListener;

public class a	// class@0029ef
{
    public WeakHashMap a;
    public static final a$a b;

    static {
       a.b = new a$a(null);
    }
    public void a(){
       super();
       this.a = new WeakHashMap();
    }
    public static ViewPropertyAnimator c(a p0,View p1,float p2,float p3,long p4,TimeInterpolator p5,a p6,int p7,Object p8){
       float alpha = (p7 & 0x02)? p1.getAlpha(): p2;
       float translationY = (p7 & 0x04)? p1.getTranslationY(): p3;
       int i = (p7 & 0x08)? 100: p4;
       return p0.a(p1, alpha, translationY, i, 0, 0);
    }
    public final ViewPropertyAnimator a(View p0,float p1,float p2,long p3,TimeInterpolator p4,a p5){
       object oobject = p0;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{oobject,Float.valueOf(p1),Float.valueOf(p2),Long.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "view");
       return this.b(p0, p.d(p0.getAlpha(), p1), p.d(p0.getTranslationY(), p2), p3, p4, p5);
    }
    public final ViewPropertyAnimator b(View p0,f p1,f p2,long p3,TimeInterpolator p4,a p5){
       ViewPropertyAnimator obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Long.valueOf(p3),p4,p5};
          obj = PatchProxy.apply(objArray, this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "view");
       a.p(p1, "alpha");
       a.p(p2, "translationY");
       p.d(9.00f, 0x3f800000);
       obj = this.a.remove(p0);
       if (obj != null) {
          obj.cancel();
       }
       p0.setAlpha(p1.getStart().floatValue());
       p0.setTranslationY(p2.getStart().floatValue());
       ViewPropertyAnimator viewProperty = p0.animate().alpha(p1.d().floatValue()).translationY(p2.d().floatValue()).setDuration(p3);
       a$b uob = new a$b(this, viewProperty, p0, p1, p2, p5);
       viewProperty.setListener(v13);
       if (p4 != null) {
          a.o(viewProperty, "animator");
          viewProperty.setInterpolator(p4);
       }
       a.o(viewProperty, "animator");
       return viewProperty;
    }
    public void d(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a.c(this, p0, 0.30f, 0, 200, null, null, 52, null).start();
       return;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "view");
       a.c(this, p0, 0x3f800000, 0, 200, null, null, 52, null).start();
       return;
    }
}
