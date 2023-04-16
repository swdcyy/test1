package as1.c;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleLineChatStartInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import as1.c$a;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleAnswerInfo;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleLineChatResourceInfo;

public final class c	// class@000299
{
    public final LivePuzzleLineChatResourceInfo a;
    public final LivePuzzleAnswerInfo[] b;
    public final String c;
    public final String d;
    public final c$a e;
    public final String f;
    public final int g;

    public void c(LivePuzzleLineChatStartInfo p0){
       a.p(p0, "startInfo");
       super();
       LivePuzzleLineChatStartInfo resourceInfo = p0.resourceInfo;
       a.o(resourceInfo, "startInfo.resourceInfo");
       this.a = resourceInfo;
       resourceInfo = p0.answerInfo;
       a.o(resourceInfo, "startInfo.answerInfo");
       this.b = resourceInfo;
       resourceInfo = p0.puzzleHeaderPath;
       a.o(resourceInfo, "startInfo.puzzleHeaderPath");
       this.c = resourceInfo;
       resourceInfo = p0.playRoleUrl;
       a.o(resourceInfo, "startInfo.playRoleUrl");
       this.d = resourceInfo;
       this.e = new c$a(p0);
       resourceInfo = p0.puzzleLineChatName;
       a.o(resourceInfo, "startInfo.puzzleLineChatName");
       this.f = resourceInfo;
       this.g = p0.puzzleType;
    }
    public final LivePuzzleAnswerInfo[] a(){
       return this.b;
    }
    public final String b(){
       return this.c;
    }
    public final c$a c(){
       return this.e;
    }
    public final String d(){
       return this.d;
    }
    public final String e(){
       return this.f;
    }
    public final int f(){
       return this.g;
    }
    public final LivePuzzleLineChatResourceInfo g(){
       return this.a;
    }
}
