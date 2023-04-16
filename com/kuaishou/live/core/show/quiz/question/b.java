package com.kuaishou.live.core.show.quiz.question.b;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionAnswerStateView;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionAnswerStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Long;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.ProgressBar;
import lnc.a1;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionAnswerStateProgressBar;

public class b extends CountDownTimer	// class@000e3e
{
    public final LiveQuizQuestionAnswerStateView$a a;
    public final LiveQuizQuestionAnswerStateView b;

    public void b(LiveQuizQuestionAnswerStateView p0,long p1,long p2,LiveQuizQuestionAnswerStateView$a p3){
       this.b = p0;
       this.a = p3;
       super(p1, p2);
    }
    public void onFinish(){
       b tb;
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b ta = this.a;
       if (ta != null) {
          ta.a();
       }
       this.b.e.s();
       this.b.e.setVisibility(0);
       View[] viewArray = new View[]{tb.b,tb.c};
       tb = this.b;
       n.Z(8, viewArray);
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       long l = (p0 / 1000) + 1;
       int i = (int)l;
       tb.h = i;
       if (tb.g != i) {
          tb.b.setText(String.valueOf(l));
          tb = this.b;
          tb.g = tb.h;
          tb.a();
       }
       LiveQuizQuestionAnswerStateView c = this.b.c;
       c.setProgress((int)((long)c.getMax() - p0));
       b tb1 = this.b;
       if (tb1.i != null && (i <= 3 && i)) {
          tb1.i = false;
          this.a.b();
          this.b.c.setProgressColor(a1.a(R.color.arg_RES_7f061547));
       }
    label_0068 :
       return;
    }
}
