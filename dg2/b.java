package dg2.b;
import java.lang.Runnable;
import com.kuaishou.live.core.show.quiz.manager.d;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2QuestionAsked;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.manager.d$a;

public final class b implements Runnable	// class@00250f
{
    public final d b;
    public final LiveQuiz2Proto$SCLiveQuiz2QuestionAsked c;

    public void b(d p0,LiveQuiz2Proto$SCLiveQuiz2QuestionAsked p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tc = this.c;
       d c = this.b.c;
       if (c != null) {
          c.a(tc);
       }
       return;
    }
}
