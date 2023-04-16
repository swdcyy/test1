package dg2.i;
import lf3.g;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2EmergencyEnded;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;
import hoc.c;
import android.os.Handler;
import android.os.Message;
import lf3.f;

public final class i implements g	// class@002516
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       c b;
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, j.class, "7")) {
       }else if(tb.f == null){
          b.S(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "onReceiveEmergencyEndSignal", "msg", p0);
          tb.a(p0.liveQuiz);
          b = tb.f.b;
          Message message = (b == null)? null: Message.obtain(b, 1, 0, 0x2711);
          tb.i(message);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
