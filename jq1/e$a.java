package jq1.e$a;
import pr1.f;
import jq1.e;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.protobuf.livestream.nano.SCLiveScoreLineChatStatistic;

public final class e$a implements f	// class@002bfa
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(LiveScoreLineChatState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       a.p(p0, "lineChatState");
       this.a.a.setValue(Integer.valueOf(p0.status));
       return;
    }
    public void c(SCLiveScoreLineChatStatistic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "3")) {
          return;
       }
       a.p(p0, "lineStatisticSignal");
       return;
    }
    public void d(LiveScoreLineChatState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       a.p(p0, "lineChatState");
       this.a.a.setValue(Integer.valueOf(p0.status));
       return;
    }
    public void e(){
    }
}
