package h53.c$b;
import erd.g;
import h53.c;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneBottomLiveCardMessage;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y43.a;
import oq5.a;
import h53.c$c;
import oq5.b;

public class c$b implements g	// class@002c5c
{
    public final SCGzoneBottomLiveCardMessage b;
    public final c c;

    public void c$b(c p0,SCGzoneBottomLiveCardMessage p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
       }else if(this.b.ignoreLandscape != null && this.c.q.v.H2()){
          c$c uoc = new c$c(this.b, p0.intValue());
          if (this.b.forcePortrait != null && this.c.q.v.H2()) {
             p0 = this.c;
             p0.B = uoc;
             p0.z.d();
          }else {
             this.c.Y8(uoc);
          }
       }
       return;
    }
}
