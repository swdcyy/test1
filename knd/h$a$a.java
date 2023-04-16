package knd.h$a$a;
import o75.j0;
import knd.h$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import w46.b;
import knd.h;
import knd.j$a;
import java.io.FileOutputStream;
import knd.j;
import java.io.File;
import zt7.d;
import com.kwai.chat.kwailink.data.PacketData;
import q87.c;

public final class h$a$a implements j0	// class@0017e1
{
    public final h$a a;

    public void h$a$a(h$a p0){
       this.a = p0;
       super();
    }
    public void onFailed(int p0,String p1){
       h$a a;
       h$a$a uoa$a = h$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa$a, "2")) {
          return;
       }
       a.p(p1, "s");
       Object[] objArray = new Object[0];
       a.D().t("TTSAuditionManagerV2", "onFailed: i = "+p0+" s = "+p1, objArray);
       h l = this.a.a.l;
       if (l != null) {
          l.b();
       }
       a = this.a.a;
       a.b(a.d(), this.a.a.c());
       this.a.a.f().e(p0, p1);
       return;
    }
    public void onResponse(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a$a.class, "1")) {
          return;
       }
       a.p(p0, "packetData");
       Object[] objArray = new Object[0];
       a.D().w("TTSAuditionManagerV2", "sendMessage onResponse: ", objArray);
       return;
    }
}
