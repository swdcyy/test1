package hx0.b$c;
import lf3.g;
import hx0.b;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateOpen;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lf3.f;

public final class b$c implements g	// class@00279c
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          this.b.Pe(true);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
