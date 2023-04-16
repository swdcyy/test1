package com.yxcorp.gifshow.ad.util.i;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.animation.ValueAnimator;
import g59.f0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.ad.util.i$a;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import com.yxcorp.gifshow.ad.util.i$c;
import java.lang.Long;
import java.lang.Integer;
import android.animation.ObjectAnimator;
import g59.d0;
import com.yxcorp.gifshow.ad.util.i$b;

public class i	// class@00188a
{

    public void i(){
       super();
       throw new UnsupportedOperationException("cannot instance utils");
    }
    public static void a(TextView p0,TextView p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, i.class, "1")) {
          return;
       }
       if (p1.getVisibility() == 8 && !p0.getVisibility()) {
          p1.setText(p2);
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          valueAnimato.setDuration(500);
          valueAnimato.addUpdateListener(new f0(p1, p0, p0.getTextSize()));
          valueAnimato.addListener(new i$a(p1, p0));
          valueAnimato.start();
       }
       return;
    }
    public static void b(View p0,long p1,View p2,long p3,int p4,i$c p5){
       int i;
       i oi = i.class;
       i = 1;
       int i1 = 2;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),p2,Long.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, oi, "2")) {
             return;
          }
       }
       int[] ointArray = new int[i1];
       ointArray[0] = 0;
       ointArray[i] = p4;
       ValueAnimator valueAnimato = ObjectAnimator.ofInt(ointArray);
       valueAnimato.setDuration(p1);
       valueAnimato.addUpdateListener(new d0(p0));
       i$b uob = new i$b(p2, p3, p4, p5);
       valueAnimato.addListener(p0);
       valueAnimato.start();
       return;
    }
}
