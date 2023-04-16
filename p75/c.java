package p75.c;
import com.kwai.chat.kwailink.d$a;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import o75.d0;
import o75.f0;

public class c extends d$a	// class@002172
{

    public void c(){
       super();
    }
    public final void d1(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.e("ClientPacketCallback", "onReceive, command="+p0.a()+", seqNo="+p0.j());
       f0.b(d0.a(p0));
       return;
    }
}
