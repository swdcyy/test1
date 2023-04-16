package gg2.h;
import erd.g;
import com.kuaishou.live.core.show.quiz.question.g;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.live.core.show.quiz.question.c;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper$LiveQuizSoundType;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper;
import java.lang.Runnable;
import ekd.k1;

public final class h implements g	// class@002b19
{
    public final g b;

    public void h(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       p0 = tb.p.h;
       if (p0 == null) {
       }else {
          p0.c(LiveQuizSoundHelper$LiveQuizSoundType.POPUP);
          tb.p.h.c(LiveQuizSoundHelper$LiveQuizSoundType.BACKGROUND_SOUND);
          p0 = tb.q;
          if (p0 != null) {
             k1.m(p0);
          }
          tb.p.h.c(LiveQuizSoundHelper$LiveQuizSoundType.COUNT_DOWN);
          tb.p.h.a(LiveQuizSoundHelper$LiveQuizSoundType.TIME_UP);
       }
       return;
    }
}
