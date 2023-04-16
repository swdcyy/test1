package lq1.c$f;
import lf3.g;
import lq1.c;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lf3.f;

public final class c$f implements g	// class@002ffc
{
    public final c b;

    public void c$f(c p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$f.class, "1")) {
       }else {
          this.b.b0(p0, "scLineOpenedSignalListener");
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
