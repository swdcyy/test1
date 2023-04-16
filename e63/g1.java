package e63.g1;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.gzone.v2.profile.e;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import android.widget.RelativeLayout;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.View;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import e63.o1;
import e63.h1;
import android.animation.Animator$AnimatorListener;
import e63.i1;
import android.widget.LinearLayout;

public class g1 extends RecyclerView$r	// class@00264f
{
    public final e a;

    public void g1(e p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       ObjectAnimator objectAnimat;
       if (PatchProxy.isSupport(g1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g1.class, "1")) {
          return;
       }
       g1 ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, e.class, "30")) {
          p1 = 2;
          int[] ointArray = new int[p1];
          ta.g1.getLocationInWindow(ointArray);
          int[] ointArray1 = new int[p1];
          ta.D.getLocationInWindow(ointArray1);
          int height = ta.D.getHeight();
          int height1 = ta.g1.getHeight();
          int i = ointArray1[1];
          ointArray = ointArray[1];
          float f = (y.d(ta.getActivity()))? 0.43f: 0.33f;
          if (!y.d(ta.getActivity())) {
             ta.F.setPivotX(0);
             ta.F.setPivotY((float)n.c(a.a().a(), 33.00f));
          }else {
             ta.F.setPivotX(0);
             ta.F.setPivotY((float)n.c(a.a().a(), -8.00f));
          }
          i = (i + height) - ointArray;
          float f1 = 0x3f800000;
          if (i > 0 && i < height1) {
             float f2 = f1 - (((f1 - f) / (float)height1) * (float)i);
             ta.F.setScaleX(f2);
             ta.F.setScaleY(f2);
             ta.F.setTranslationX(((f1 - f2) * (float)a1.e(8.00f)));
          }else if(i <= 0){
             ta.F.setScaleX(f1);
             ta.F.setScaleY(f1);
             ta.F.setTranslationX(0);
          }else if(i > height1){
             ta.F.setScaleX(f);
             ta.F.setScaleY(f);
          }
          if (i <= 0 && ta.w1 != null) {
             objectAnimat = j.a(ta.I, new float[p1]{0,0x3f800000});
             objectAnimat.setDuration(10);
             objectAnimat.start();
             ta.w1 = false;
             ta.N.setAlpha(0);
             ta.C1.a(1);
          }else if(i > 0 && ta.w1 == null){
             objectAnimat = j.a(ta.I, new float[p1]{0x3f800000,0});
             objectAnimat.setDuration(10);
             objectAnimat.start();
             ta.C1.a(false);
             ta.w1 = true;
          }else if(i < height1 && ta.x1 != null){
             objectAnimat = j.a(ta.N, new float[p1]{0x3f800000,0});
             objectAnimat.setDuration(10);
             objectAnimat.addListener(new h1(ta));
             objectAnimat.start();
             ta.x1 = false;
          }else if(i > height1 && ta.x1 == null){
             ta.N.setVisibility(false);
             objectAnimat = j.a(ta.N, new float[p1]{0,0x3f800000});
             objectAnimat.setDuration(10);
             objectAnimat.addListener(new i1(ta));
             objectAnimat.start();
             ta.x1 = true;
             ta.I.setAlpha(0);
             ta.C1.a(false);
          }else if(i > height1 && !ta.N.getAlpha()){
             ta.N.setAlpha(f1);
          }
       }
    label_0193 :
       return;
    }
}
