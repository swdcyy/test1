package b58.d;
import erd.d;
import b58.p;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.lang.StringBuilder;
import com.mini.d;
import b58.p$b;
import b58.p$a;

public final class d implements d	// class@0002fe
{
    public final p a;

    public void d(p p0){
       this.a = p0;
    }
    public final boolean a(Object p0,Object p1){
       d ta = this.a;
       boolean b = true;
       if (p0.intValue() < b) {
       }else {
          b = false;
       }
       if (b) {
          int i = p0.intValue();
          Objects.requireNonNull(ta);
          p op = p.class;
          if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), p1, ta, op, "7")) {
             i = "下载失败，进入第"+i+"次，"+"继续下载"+",\n"+p1.getLocalizedMessage();
             d.c("AppSoBackupDownloader", i);
             p.a(new p$b("retry", ta.a, i, null));
          }
       }
       return b;
    }
}
