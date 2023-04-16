package knd.k$c$a;
import o75.j0;
import knd.k$c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import w46.b;
import knd.k;
import knd.j$a;
import java.io.FileOutputStream;
import knd.j;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import knd.k$b;
import q87.c;
import zt7.d;
import com.kwai.chat.kwailink.data.PacketData;

public final class k$c$a implements j0	// class@0017ec
{
    public final k$c a;

    public void k$c$a(k$c p0){
       this.a = p0;
       super();
    }
    public void onFailed(int p0,String p1){
       k$c a;
       k$c$a uoc$a = k$c$a.class;
       if (PatchProxy.isSupport(uoc$a) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc$a, "2")) {
          return;
       }
       a.p(p1, "s");
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().t("TTSDownloadManagerV2", "onFailed: i = "+p0+" s = "+p1, objArray);
       k h = this.a.a.h;
       if (h != null) {
          h.b();
       }
       this.a.a.m();
       a = this.a.a;
       File uFile = this.a.a.c();
       a.m(uFile);
       a.b(a.d(), uFile);
       h = this.a.a.g;
       a.m(h);
       h.h().countDown();
       Object[] objArray1 = new Object[i];
       a.D().w("TTSDownloadManagerV2", "onFailed: release mCountDownLatch", objArray1);
       this.a.a.f().e(p0, p1);
       return;
    }
    public void onResponse(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c$a.class, "1")) {
          return;
       }
       a.p(p0, "packetData");
       Object[] objArray = new Object[0];
       a.D().w("TTSDownloadManagerV2", "sendMessage onResponse: ", objArray);
       return;
    }
}
