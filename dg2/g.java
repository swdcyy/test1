package dg2.g;
import java.lang.Runnable;
import com.kuaishou.live.core.show.quiz.manager.j;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveQuiz2SyncMessage;
import com.kuaishou.live.core.show.quiz.manager.a;
import com.kuaishou.live.core.show.quiz.manager.d;
import java.lang.String;
import bg2.c;

public final class g implements Runnable	// class@002514
{
    public final j b;
    public final LiveFlvStream$LiveFlvStreamMessage c;

    public void g(j p0,LiveFlvStream$LiveFlvStreamMessage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(tb);
       LiveFlvStream$LiveFlvStreamMessage quiz2Sync = tc.quiz2Sync;
       LiveFlvStream$LiveQuiz2SyncMessage syncMessageT = quiz2Sync.syncMessageType;
       if (syncMessageT != 1) {
          if (syncMessageT == 2) {
             tb.h.b(quiz2Sync.questionNumber).e(c.d(tc), "reviewed");
          }
       }else {
          tb.h.a(quiz2Sync.questionNumber).e(c.d(tc), "asked");
       }
       return;
    }
}
