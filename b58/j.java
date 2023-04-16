package b58.j;
import java.lang.Runnable;
import b58.l;
import java.lang.String;
import wi8.c;
import com.mini.engine.EngineCallback;
import java.lang.Object;
import java.util.Objects;
import b58.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b58.m;
import com.mini.d;
import b58.n;
import java.util.Collection;
import z0.a;
import zi8.m;
import b58.b;
import java.io.File;
import aj8.b;
import b58.k;
import java.lang.StringBuilder;
import com.mini.utils.g;
import b58.i;
import zi8.d1;

public final class j implements Runnable	// class@000304
{
    public final l b;
    public final String c;
    public final c d;
    public final EngineCallback e;

    public void j(l p0,String p1,c p2,EngineCallback p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       j tb = this.b;
       j tc = this.c;
       j td = this.d;
       j te = this.e;
       l c = tb.c;
       Objects.requireNonNull(c);
       Object obj = PatchProxy.applyOneRefs(tc, c, o.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = m.c(c.a, new n(d.n(), tc));
       }
       if (obj == null) {
          td.b2(new b(tc, te));
       }else {
          File uFile = new File(tb.a(), obj.a);
          if (uFile.exists()) {
             String str = b.b(uFile);
             if ((obj.e).equalsIgnoreCase(str)) {
                d.c("AppSoBackupDownloader", "md5相同，return");
                Objects.requireNonNull(te);
                td.b2(new k(te));
             }else {
                d.c("AppSoBackupDownloader", "so md5不相等,待删除: actual="+str+",expect="+obj.e);
                d.c("AppSoBackupDownloader", "删除文件 "+uFile+", result="+g.p(uFile));
             }
          }
          d1.f(new i(tb, te, obj));
       }
       return;
    }
}
