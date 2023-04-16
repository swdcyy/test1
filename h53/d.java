package h53.d;
import erd.g;
import h53.c;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneBottomLiveCardMessage;
import java.lang.Object;
import com.kwai.live.gzone.api.model.LiveGzonePendantUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d implements g	// class@002c5f
{
    public final SCGzoneBottomLiveCardMessage b;
    public final int c;
    public final c d;

    public void d(c p0,SCGzoneBottomLiveCardMessage p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else if(p0.isEnable()){
          this.d.R8(this.b, this.c);
       }
       return;
    }
}
