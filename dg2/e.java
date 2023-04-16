package dg2.e;
import lf3.g;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2CloseConfig;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.quiz.manager.LiveQuizStatus;
import lf3.f;

public final class e implements g	// class@002512
{
    public final j b;

    public void e(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, j.class, "5")) {
       }else if(tb.f == null){
          b.c0(LiveLogTag.LIVE_QUIZ, "onReceiveCloseSignal", "signal", p0);
          tb.c = LiveQuizStatus.Quiz_End;
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
