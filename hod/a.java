package hod.a;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import god.a;
import ynd.g;
import iod.a;
import android.widget.ImageView;
import hod.a$a;
import hod.a$b;
import hod.a$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import android.view.View$OnClickListener;
import hod.c;
import hod.b;
import java.lang.Boolean;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class a extends a	// class@000fa0
{
    public final g c;
    public final a d;
    public final ImageView e;
    public final ImageView f;
    public final View g;
    public boolean h;
    public final View$OnClickListener i;
    public final Observer j;
    public AnimatorSet k;
    public final a$c l;
    public final Fragment m;

    public void a(Fragment p0,View p1){
       a a;
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       super(p1);
       this.m = p0;
       a = a.a;
       this.c = a.c(p0);
       this.d = a.b(p0);
       View view = p1.findViewById(R.id.text_panel_fold_btn);
       a.o(view, "rootView.findViewById\(R.id.text_panel_fold_btn\)");
       this.e = view;
       view = p1.findViewById(R.id.text_panel_recommend_text_btn);
       a.o(view, "rootView.findViewById\(R.¡­panel_recommend_text_btn\)");
       this.f = view;
       view = p1.findViewById(R.id.gap_view);
       a.o(view, "rootView.findViewById\(R.id.gap_view\)");
       this.g = view;
       this.h = true;
       this.i = new a$a(this);
       this.j = new a$b(this);
       this.l = new a$c(this);
    }
    public void B(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       this.d.o0().observe(this.m, this.j);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          this.e.setOnClickListener(this.i);
          if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             int i = 8;
             if (this.c.b()) {
                this.f.setVisibility(0);
                this.f.setTranslationX(c.a);
                this.g.setVisibility(i);
                this.f.setOnClickListener(new b(this, 100));
             }else {
                this.f.setVisibility(i);
                this.g.setVisibility(i);
             }
          }
       }
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.d.o0().removeObserver(this.j);
       return;
    }
    public final void D(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       this.f.setClickable(p0);
       this.e.setClickable(p0);
       return;
    }
    public final void E(boolean p0){
       float[] uofloatArray;
       ObjectAnimator objectAnimat;
       ObjectAnimator objectAnimat1;
       ObjectAnimator objectAnimat2;
       ObjectAnimator objectAnimat3;
       a tk;
       Animator[] uAnimatorArr;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       int i = 0;
       if (this.h == p0) {
          Object[] objArray = new Object[i];
          a.D().w("RecoTextAndFoldBtnViewBinder", "folded: "+p0+" state is same, don\'t need to animate", objArray);
          return;
       }else {
          this.h = p0;
          uoa = this.k;
          if (uoa != null && uoa.isRunning() == true) {
             uoa = this.k;
             if (uoa != null) {
                uoa.cancel();
             }
          }
          this.k = new AnimatorSet();
          int i1 = 3;
          int i2 = 4;
          int i3 = 0;
          if (p0) {
             uofloatArray = new float[]{i3,c.a};
             objectAnimat = ObjectAnimator.ofFloat(this.f, View.TRANSLATION_X, uofloatArray);
             objectAnimat1 = ObjectAnimator.ofFloat(this.e, View.SCALE_X, new float[2]{0x3f800000,0x3f000000});
             objectAnimat2 = ObjectAnimator.ofFloat(this.e, View.SCALE_Y, new float[2]{0x3f800000,0x3f000000});
             objectAnimat3 = ObjectAnimator.ofFloat(this.e, View.ALPHA, new float[2]{0x3f800000,0});
             tk = this.k;
             if (tk != null) {
                uAnimatorArr = new Animator[i2];
                uAnimatorArr[i] = objectAnimat;
                uAnimatorArr[1] = objectAnimat1;
                uAnimatorArr[2] = objectAnimat2;
                uAnimatorArr[i1] = objectAnimat3;
                tk.playTogether(uAnimatorArr);
             }
          }else {
             uofloatArray = new float[]{c.a,i3};
             objectAnimat = ObjectAnimator.ofFloat(this.f, View.TRANSLATION_X, uofloatArray);
             objectAnimat1 = ObjectAnimator.ofFloat(this.e, View.SCALE_X, new float[2]{0x3f000000,0x3f800000});
             objectAnimat2 = ObjectAnimator.ofFloat(this.e, View.SCALE_Y, new float[2]{0x3f000000,0x3f800000});
             objectAnimat3 = ObjectAnimator.ofFloat(this.e, View.ALPHA, new float[2]{0,0x3f800000});
             tk = this.k;
             if (tk != null) {
                uAnimatorArr = new Animator[i2];
                uAnimatorArr[i] = objectAnimat;
                uAnimatorArr[1] = objectAnimat1;
                uAnimatorArr[2] = objectAnimat2;
                uAnimatorArr[i1] = objectAnimat3;
                tk.playTogether(uAnimatorArr);
             }
          }
          a tk1 = this.k;
          if (tk1 != null) {
             tk1.addListener(this.l);
          }
          tk1 = this.k;
          if (tk1 != null) {
             tk1.setInterpolator(new DecelerateInterpolator(0x3fc00000));
          }
          tk1 = this.k;
          if (tk1 != null) {
             tk1.setDuration(350);
          }
          tk1 = this.k;
          if (tk1 != null) {
             tk1.start();
          }
          return;
       }
    }
}
