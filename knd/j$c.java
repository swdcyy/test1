package knd.j$c;
import o75.j0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import faa.a;
import w46.b;
import com.kwai.chat.kwailink.data.PacketData;
import q87.c;

public final class j$c implements j0	// class@0017e8
{
    public final j0 a;

    public void j$c(j0 p0){
       this.a = p0;
       super();
    }
    public void onFailed(int p0,String p1){
       j$c uoc = j$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "2")) {
          return;
       }
       a.p(p1, "s");
       Object[] objArray = new Object[0];
       a.D().t("TTSBaseManagerV2", "sendMessage2IM onFailed: ", objArray);
       this.a.onFailed(p0, p1);
       return;
    }
    public void onResponse(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$c.class, "1")) {
          return;
       }
       a.p(p0, "packetData");
       Object[] objArray = new Object[0];
       a.D().w("TTSBaseManagerV2", "sendMessage2IM onResponse: ", objArray);
       this.a.onResponse(p0);
       return;
    }
}
