package dg2.h;
import lf3.g;
import com.kuaishou.live.core.show.quiz.manager.j;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2InitConfig;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;
import com.kuaishou.live.core.show.quiz.manager.j$a;
import lf3.f;

public final class h implements g	// class@002515
{
    public final j b;

    public void h(j p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, j.class, "6")) {
       }else if(tb.f == null){
          b.S(LiveLogTag.LIVE_QUIZ.appendTag("LiveQuizAudienceManager"), "onReceiveQuizInitConfigSignal", "msg", p0);
          tb.a(p0.liveQuiz);
          tb.e.h(p0);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
