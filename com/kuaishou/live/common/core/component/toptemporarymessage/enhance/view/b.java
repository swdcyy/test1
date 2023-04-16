package com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.b;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.animation.ValueAnimator;
import ny1.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ny1.e;
import android.animation.Animator$AnimatorListener;

public final class b implements Runnable	// class@0017b0
{
    public final LiveTempEnhanceView b;

    public void b(LiveTempEnhanceView p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       boolean b = false;
       tb.i = b;
       if (PatchProxy.applyVoid(null, tb, LiveTempEnhanceView.class, "11")) {
       }else {
          int[] ointArray = new int[]{tb.b.getWidth(),LiveTempEnhanceView.l};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          tb.f = valueAnimato;
          valueAnimato.setDuration(300);
          tb.f.addUpdateListener(new c(tb));
          tb.f.addListener(new e(tb));
          tb.f.start();
       }
       return;
    }
}
