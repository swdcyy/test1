package gg2.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionOptionAnswerListItemPresenter;
import java.lang.Object;
import android.view.View;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bg2.c;
import java.lang.String;
import com.kuaishou.live.core.show.quiz.question.e;
import eg2.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.quiz.question.c;
import eg2.b;
import dg2.d;
import com.kuaishou.live.core.show.quiz.manager.j;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import bg2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper$LiveQuizSoundType;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.core.show.quiz.question.LiveQuizQuestionDialogFragment$a;
import android.os.SystemClock;

public final class c implements View$OnClickListener	// class@002b14
{
    public final LiveQuizQuestionOptionAnswerListItemPresenter b;

    public void c(LiveQuizQuestionOptionAnswerListItemPresenter p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c c;
       c tb = this.b;
       if (c.g(tb.getContext())) {
       }else if(TextUtils.n(tb.s.r1(), tb.r.a)){
          LiveQuizQuestionOptionAnswerListItemPresenter t = tb.t;
          c = t.c;
          String str = String.valueOf(t.g.a);
          a a = tb.r.a;
          int i = 1;
          int i1 = 0;
          boolean b = (tb.t.m.e().g != null)? true: false;
          ClientContent$LiveStreamPackage liveStreamPa = tb.t.a.a();
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray = new Object[]{c,str,a,Boolean.valueOf(b),liveStreamPa};
             if (PatchProxy.applyVoid(objArray, null, uoa, "15")) {
             label_00a9 :
                c h = tb.t.h;
                if (h != null) {
                   h.a(LiveQuizSoundHelper$LiveQuizSoundType.CLICK);
                }
                a a1 = tb.r.a;
                if (!PatchProxy.applyVoidOneRefs(a1, tb, LiveQuizQuestionOptionAnswerListItemPresenter.class, "5")) {
                   tb.s.t1(a1);
                   tb.s.k0();
                   c = tb.t.l;
                   if (c != null) {
                      c.a(a1);
                      t = tb.t;
                      t.l.b(t.c, t.g.a, tb.s.r1(), (SystemClock.elapsedRealtime() - tb.s.A));
                   }
                }
             }
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "QUESTION_ANSWER_LIST";
          i3 oi3 = i3.f();
          oi3.d("quizId", c);
          oi3.d("question_id", str);
          oi3.d("option_id", a);
          str = (b)? "1": "0";
          oi3.d("if_function", str);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          if (liveStreamPa != null) {
             uContentPack.liveStreamPackage = liveStreamPa;
          }
          u1.u(i, uElementPack, uContentPack);
          goto label_00a9 ;
       }
       return;
    }
}
