package com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import java.lang.Object;
import java.util.Objects;
import android.view.ViewGroup;
import android.animation.ValueAnimator;
import ny1.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.e;
import android.animation.Animator$AnimatorListener;

public final class a implements Runnable	// class@0017af
{
    public final LiveTempEnhanceView b;

    public void a(LiveTempEnhanceView p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       int[] ointArray = new int[]{LiveTempEnhanceView.l,tb.b.getWidth()};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       tb.e = valueAnimato;
       valueAnimato.setDuration(300);
       tb.e.addUpdateListener(new b(tb));
       tb.e.addListener(new e(tb));
       tb.e.start();
    }
}
