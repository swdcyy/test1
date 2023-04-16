package d82.j;
import lf3.g;
import d82.n;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveEntrustOpened;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lf3.f;

public final class j implements g	// class@002493
{
    public final n b;

    public void j(n p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "4")) {
       }else {
          tb.R8();
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
