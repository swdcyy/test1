package f5b.i$b;
import java.lang.Runnable;
import f5b.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.ViewParent;
import android.view.ViewStub;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.widget.AnimTranslationDrawableView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import kotlin.jvm.internal.a;
import f5b.j;
import f5b.k;
import s5b.b;
import q87.c;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import f5b.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.widget.AnimTranslationDrawableView$b;
import ekd.f$j;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import f5b.b;
import android.animation.Animator$AnimatorListener;
import qrd.l1;

public final class i$b implements Runnable	// class@0028ad
{
    public final i b;
    public final View c;

    public void i$b(i p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       AnimTranslationDrawableView i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i$b.class, "1")) {
          return;
       }
       i$b tb = this.b;
       i$b tc = this.c;
       Objects.requireNonNull(tb);
       String str = "2";
       if (!PatchProxy.applyVoidOneRefs(tc, tb, i.class, str) && tc.getParent() != null) {
          ViewStub viewStub = tc.findViewById(R.id.magic_search_tab_animator_stub);
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = objArray;
          objectRef.element = (viewStub != null)? viewStub.inflate(): tc.findViewById(0x7f0a2a39);
          if (objectRef.element != null) {
             View view = tc.findViewById(R.id.custom_tab_view);
             View view1 = tc.findViewById(R.id.magic_tab_replace_view);
             Drawable uDrawable = a1.f(R.drawable.arg_RES_7f081efe);
             Objects.requireNonNull(uDrawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
             Bitmap bitmap = uDrawable.getBitmap();
             Drawable uDrawable1 = a1.f(R.drawable.arg_RES_7f0816cb);
             Drawable uDrawable2 = a1.f(R.drawable.arg_RES_7f0816ca);
             a.o(bitmap, "backgroundBitMap");
             objectRef.element.setTextBackgroundBitmap(bitmap);
             Ref$ObjectRef element = objectRef.element;
             a.o(uDrawable2, "selectedDrawable");
             a.o(uDrawable1, "unSelectedDrawable");
             Objects.requireNonNull(element);
             if (!PatchProxy.applyVoidTwoRefs(uDrawable2, uDrawable1, element, AnimTranslationDrawableView.class, str)) {
                a.p(uDrawable2, "selectDrawable");
                a.p(uDrawable1, "unSelectDrawable");
                element.h = uDrawable2;
                element.i = uDrawable1;
                a.m(uDrawable2);
                element.setDrawableBounds(uDrawable2);
                i = element.i;
                a.m(i);
                element.setDrawableBounds(i);
             }
             element = objectRef.element;
             j oj = new j(view1);
             k ok = new k(view, objectRef);
             Objects.requireNonNull(element);
             if (!PatchProxy.applyVoidTwoRefs(oj, ok, element, AnimTranslationDrawableView.class, "7")) {
                a.p(oj, "targetSelectViewAlphaProvider");
                Object[] objArray1 = new Object[0];
                b.D().s("AnimTranslationDrawableView", "startAnim...", objArray1);
                if (element.l == null) {
                   AnimTranslationDrawableView e = element.e;
                   if (e == null || e.isRunning() != true) {
                      element.m = 0;
                      ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                      valueAnimato.setDuration(4000);
                      valueAnimato.setInterpolator(new LinearInterpolator());
                      valueAnimato.addUpdateListener(new a(valueAnimato, element, oj, ok));
                      valueAnimato.addListener(new b(element, oj, ok));
                      element.e = valueAnimato;
                      valueAnimato.start();
                   }
                }
             }
          }
       }
    label_0136 :
       return;
    }
}
