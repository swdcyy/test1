package as1.c$a;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleLineChatStartInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class c$a	// class@000298
{
    public final String a;
    public final String b;

    public void c$a(LivePuzzleLineChatStartInfo p0){
       a.p(p0, "startInfo");
       super();
       LivePuzzleLineChatStartInfo questionerCo = p0.questionerConfirmKrnUrl;
       a.o(questionerCo, "startInfo.questionerConfirmKrnUrl");
       this.a = questionerCo;
       p0 = p0.answererConfirmKrnUrl;
       a.o(p0, "startInfo.answererConfirmKrnUrl");
       this.b = p0;
    }
    public final String a(){
       return this.b;
    }
    public final String b(){
       return this.a;
    }
}
