package gg2.j;
import java.lang.Runnable;
import com.kuaishou.live.core.show.quiz.question.g;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.question.c;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper$LiveQuizSoundType;
import com.kuaishou.live.core.show.quiz.helper.LiveQuizSoundHelper;

public final class j implements Runnable	// class@002b1b
{
    public final g b;

    public void j(g p0){
       this.b = p0;
    }
    public final void run(){
       this.b.p.h.b(LiveQuizSoundHelper$LiveQuizSoundType.BACKGROUND_SOUND, true);
    }
}
