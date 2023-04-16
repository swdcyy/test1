package com.kuaishou.live.core.show.quiz.question.a$a;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionAnswerStateView$a;
import com.kuaishou.live.core.show.quiz.question.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.quiz.question.c;
import java.lang.CharSequence;
import android.widget.TextView;
import o79.i;
import java.lang.Boolean;
import brd.y;

public class a$a implements LiveQuizQuestionAnswerStateView$a	// class@000e3c
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       a$a ta = this.a;
       if (ta.p.d != null) {
          ta.r.setText("时间到");
       }else {
          ta.r.setText("时间到，请稍后作答下一题");
       }
       this.a.r.setTextColor(i.a(R.color.arg_RES_7f060679));
       this.a.r.setVisibility(0);
       this.a.p.j.onNext(Boolean.TRUE);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       this.a.p.k.onNext(Boolean.TRUE);
       return;
    }
}
