package ck5.n$a;
import jk5.a;
import ck5.n;
import brd.c0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.emotionsdk.core.EmotionResourceProcessor;
import java.lang.StringBuilder;
import ok5.a;
import com.kwai.emotionsdk.core.exception.EmotionResourceException;
import java.lang.Throwable;
import nsd.u;
import kotlin.jvm.internal.a;
import java.util.Objects;
import bk5.g;

public final class n$a extends a	// class@0006e0
{
    public final n a;
    public final c0 b;

    public void n$a(n p0,c0 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(int p0){
       if (PatchProxy.isSupport2(n$a.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, n$a.class, "1")) {
          return;
       }
       EmotionResourceProcessor.f.d();
       a.a("EmotionResourceProcessor", "downloadEmotionResource - 3,下载取消 - taskId "+p0);
       this.b.onError(new EmotionResourceException("down load resource canceled", null, 2, null));
       PatchProxy.onMethodExit(n$a.class, "1");
       return;
    }
    public void b(int p0,Throwable p1){
       if (PatchProxy.isSupport2(n$a.class, "3") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), p1, this, n$a.class, "3")) {
          return;
       }
       a.p(p1, "e");
       super.b(p0, p1);
       EmotionResourceProcessor.f.d();
       a.a("EmotionResourceProcessor", "downloadEmotionResource 5 下载失败 "+p0+" error "+p1);
       this.b.onError(new EmotionResourceException("download error taskId "+p0, p1));
       PatchProxy.onMethodExit(n$a.class, "3");
       return;
    }
    public void c(int p0,String p1,String p2,String p3){
       n a;
       if (PatchProxy.isSupport2(n$a.class, "2") && PatchProxy.applyVoidFourRefsWithListener(Integer.valueOf(p0), p1, p2, p3, this, n$a.class, "2")) {
          return;
       }
       a.p(p1, "destinationDir");
       a.p(p2, "fileName");
       a.p(p3, "targetFilePath");
       super.c(p0, p1, p2, p3);
       EmotionResourceProcessor.f.d();
       a.a("EmotionResourceProcessor", "downloadEmotionResource 4 下载完成 "+p1+" file "+p2+" targetFilePath"+p3);
       a = this.a.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(p3, a, g.class, "2")) {
          a.p(p3, "<set-?>");
          a.b = p3;
       }
       this.b.onSuccess(this.a.a);
       PatchProxy.onMethodExit(n$a.class, "2");
       return;
    }
}
