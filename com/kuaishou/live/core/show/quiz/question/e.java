package com.kuaishou.live.core.show.quiz.question.e;
import y8c.g;
import com.kuaishou.live.core.show.quiz.question.c;
import crd.a;
import gg2.b;
import com.kuaishou.live.core.show.quiz.question.d;
import erd.g;
import crd.b;
import brd.t;
import gg2.a;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.quiz.question.LiveQuizDialogType;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionOptionAnswerListItemPresenter;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionOptionResultListItemPresenter;
import ml8.c;
import androidx.recyclerview.widget.RecyclerView;
import android.os.SystemClock;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import eg2.b;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionDialogFragment$a;

public class e extends g	// class@000e41
{
    public long A;
    public String w;
    public boolean x;
    public c y;
    public final a z;
    public static final int B;

    public void e(c p0){
       super();
       this.w = "";
       this.x = false;
       a uoa = new a();
       this.z = uoa;
       this.y = p0;
       uoa.c(p0.i.subscribe(new b(this), d.b));
       uoa.c(this.y.j.subscribe(new a(this), d.b));
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       View view;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       c f = this.y.f;
       if (f == LiveQuizDialogType.USER_RESULT_RIGHT || f == LiveQuizDialogType.USER_RESULT_WRONG) {
          view = a.i(p0, R.layout.arg_RES_7f0d0d73);
          obj.U7(new LiveQuizQuestionOptionResultListItemPresenter());
       }else {
          view = a.i(p0, R.layout.arg_RES_7f0d0d72);
          obj.U7(new LiveQuizQuestionOptionAnswerListItemPresenter());
       }
       this.n1("key_quiz_question_caller_context", this.y);
       this.n1("ADAPTER", this);
       return new f(view, obj);
    }
    public String r1(){
       return this.w;
    }
    public boolean s1(){
       return this.x;
    }
    public void t1(String p0){
       this.w = p0;
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.u0(p0);
       this.A = SystemClock.elapsedRealtime();
       return;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       this.z.dispose();
       if (TextUtils.x(this.w)) {
          e ty = this.y;
          c l = ty.l;
          if (l != null) {
             l.b(ty.c, ty.g.a, this.w, (SystemClock.elapsedRealtime() - this.A));
          }
       }
       this.A = 0;
       super.z0(p0);
       return;
    }
}
