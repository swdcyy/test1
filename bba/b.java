package bba.b;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import com.kuaishou.edit.draft.Publish;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bba.a;
import laa.e;
import com.yxcorp.gifshow.edit.draft.model.c$b;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import android.util.Pair;
import java.lang.Integer;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import bba.c;

public class b extends c	// class@000447
{

    public void b(File p0,Publish p1,c p2){
       super(p0, p1, p2);
    }
    public boolean B(){
       return false;
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       a a = a.a;
       e uoe = this.u();
       if (!PatchProxy.applyVoidThreeRefs("PUBLISH_CAPTION_PARAM", a, uoe, this, c.class, "50")) {
          int i = a.a(uoe);
          Object[] objArray = new Object[0];
          f.D().w("BaseDraft", "registerParamVersion key:"+"PUBLISH_CAPTION_PARAM"+",paramVersion:"+a+",item:"+uoe+",initVersion:"+i, objArray);
          this.j.put("PUBLISH_CAPTION_PARAM", new Pair(a, Integer.valueOf(i)));
       }
       return;
    }
    public e i(GeneratedMessageLite p0){
       c uoc = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(this.q(), p0, this.c);
       }
       return uoc;
    }
    public String r(){
       return "publish";
    }
}
