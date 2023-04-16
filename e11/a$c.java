package e11.a$c;
import lf3.g;
import e11.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveMiniProgramAudienceBottomEntrance;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import lf3.f;

public final class a$c implements g	// class@002080
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          b.Z(a.B, "receive signal with anchorOpenState: "+p0.entranceStatus);
          SCLiveMiniProgramAudienceBottomEntrance entranceStat = p0.entranceStatus;
          if (entranceStat != null) {
             a$c tb = this.b;
             b = true;
             if (tb.v == null || entranceStat != b) {
                b = false;
             }
             tb.R8(b);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
