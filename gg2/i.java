package gg2.i;
import erd.g;
import com.kuaishou.live.core.show.quiz.question.g;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.live.core.show.quiz.question.c;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper$LiveQuizSoundType;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper;
import java.lang.Runnable;
import ekd.k1;

public final class i implements g	// class@002b1a
{
    public final g b;

    public void i(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       p0 = tb.p.h;
       if (p0 == null) {
       }else {
          p0.c(LiveQuizSoundHelper$LiveQuizSoundType.POPUP);
          tb.p.h.c(LiveQuizSoundHelper$LiveQuizSoundType.BACKGROUND_SOUND);
          p0 = tb.q;
          if (p0 != null) {
             k1.m(p0);
          }
          tb.p.h.a(LiveQuizSoundHelper$LiveQuizSoundType.COUNT_DOWN);
       }
       return;
    }
}
