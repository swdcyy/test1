package naa.a;
import nba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import java.util.List;
import com.google.protobuf.GeneratedMessageLite;
import laa.e;
import com.kuaishou.edit.draft.Beauty;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import naa.b;

public class a extends c implements a	// class@003123
{

    public void a(File p0,List p1,c p2){
       super(p0, p1, p2);
    }
    public boolean B(){
       return false;
    }
    public void a(){
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
       return "edit_beauty";
    }
}