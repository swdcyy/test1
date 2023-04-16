package dg2.c;
import java.lang.Runnable;
import com.kuaishou.live.core.show.quiz.manager.d;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.manager.d$a;

public final class c implements Runnable	// class@002510
{
    public final d b;
    public final LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed c;

    public void c(d p0,LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c tc = this.c;
       d c = this.b.c;
       if (c != null) {
          c.b(tc);
       }
       return;
    }
}
