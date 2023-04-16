package bd0.a;
import java.lang.Runnable;
import android.widget.TextView;
import android.view.View;
import com.kuaishou.growth.pendant.coin.absorb.widget.AbsorbedLowActivePendant;
import com.kuaishou.growth.pendant.model.RewardV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.lang.StringBuilder;
import ld0.c;
import qf0.b;
import android.animation.ValueAnimator;
import zc0.b;
import of0.b;
import android.animation.TimeInterpolator;
import kotlin.jvm.internal.a;
import bd0.a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import bd0.a$b;
import bd0.a$c;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import bd0.a$d;

public final class a implements Runnable	// class@00027d
{
    public final TextView b;
    public final int c;
    public final View d;
    public final AbsorbedLowActivePendant e;
    public final RewardV2 f;

    public void a(TextView p0,int p1,View p2,AbsorbedLowActivePendant p3,RewardV2 p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       String str1;
       Object obj = this;
       String str = "1";
       if (PatchProxy.applyVoidWithListener(null, obj, a.class, str)) {
          return;
       }
       obj.e.x = new AnimatorSet();
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(obj.b, "alpha", new float[2]{0,0x3f800000});
       objectAnimat.setDuration(100);
       float y = obj.b.getY();
       c.c("AbsorbedLowActivePendantA->mTaskCompleted->originalTextY="+y+",originalTextY="+y);
       long l = 300;
       ValueAnimator valueAnimato = b.c(obj.b, ((float)b.b(R.dimen.arg_RES_7f070334) + y), y, l);
       float f = 0.05f;
       float f1 = 0.20f;
       valueAnimato.setInterpolator(new b(f, f1, f1, 0x3f800000));
       int[] ointArray = new int[]{obj.d.getHeight(),obj.d.getHeight() + obj.c};
       ValueAnimator valueAnimato1 = ValueAnimator.ofInt(ointArray);
       valueAnimato1.setInterpolator(new b(f, f1, f1, 0x3f800000));
       valueAnimato1.setDuration(l);
       a.o(valueAnimato1, "ValueAnimator.ofInt\(\n   ¡­uration = 300\n          }");
       valueAnimato1.addUpdateListener(new a$a(obj));
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(obj.b, "alpha", new float[2]{0x3f800000,0});
       objectAnimat1.setDuration(100);
       objectAnimat1.setStartDelay(2300);
       int[] ointArray1 = new int[]{obj.d.getHeight() + obj.c,obj.d.getHeight()};
       ValueAnimator valueAnimato2 = ValueAnimator.ofInt(ointArray1);
       valueAnimato2.setInterpolator(new b(f, f1, f1, 0x3f800000));
       valueAnimato2.setDuration(l);
       valueAnimato2.setStartDelay(2300);
       valueAnimato2.addUpdateListener(new a$b(obj));
       AbsorbedLowActivePendant x = obj.e.x;
       if (x != null) {
          a$c uoc = f1;
          a uoa = this;
          float f2 = y;
          ObjectAnimator objectAnimat2 = objectAnimat1;
          objectAnimat1 = objectAnimat;
          ValueAnimator valueAnimato3 = valueAnimato;
          ValueAnimator valueAnimato4 = valueAnimato1;
          ObjectAnimator objectAnimat3 = objectAnimat2;
          str1 = str;
          a$c uoc1 = f1;
          ValueAnimator valueAnimato5 = valueAnimato2;
          uoc = new a$c(uoa, f2, objectAnimat1, valueAnimato3, valueAnimato4, objectAnimat3, valueAnimato5);
          x.addListener(uoc1);
          a$d uod = new a$d(uoa, f2, objectAnimat1, valueAnimato3, valueAnimato4, objectAnimat3, valueAnimato5);
          x.addListener(uoc1);
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,valueAnimato,valueAnimato1,objectAnimat2,valueAnimato2};
          x.playTogether(uAnimatorArr);
          x.start();
          c.c("AbsorbedLowActivePendantA->mTaskCompleted->reward anim start");
       }else {
          str1 = str;
       }
       obj.e.v = null;
       PatchProxy.onMethodExit(a.class, str1);
       return;
    }
}
