package f52.c0;
import java.lang.Runnable;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.n;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import j52.b;

public final class c0 implements Runnable	// class@002882
{
    public final n b;

    public void c0(n p0){
       this.b = p0;
    }
    public final void run(){
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, n.class, "9")) {
       }else {
          b.f(tb.p.Z2.a());
       }
       return;
    }
}
