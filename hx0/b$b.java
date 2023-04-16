package hx0.b$b;
import lf3.g;
import hx0.b;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateClose;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lf3.f;

public final class b$b implements g	// class@00279b
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          this.b.Pe(false);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
