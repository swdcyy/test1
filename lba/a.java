package lba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import com.kuaishou.edit.draft.OriginalVoice;
import com.google.protobuf.GeneratedMessageLite;
import laa.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lba.b;

public class a extends c	// class@002da4
{

    public void a(File p0,OriginalVoice p1,c p2){
       super(p0, p1, p2);
    }
    public boolean B(){
       return false;
    }
    public e i(GeneratedMessageLite p0){
       b uob = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(this.q(), p0, this.c);
       }
       return uob;
    }
    public String r(){
       return "voice";
    }
}
