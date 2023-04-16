package gu1.c;
import java.lang.Runnable;
import k2b.e0;
import st1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import gu1.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class c implements Runnable	// class@002581
{
    public final e0 b;
    public final int c;
    public final boolean d;
    public final c e;
    public final int f;
    public final ClientContent$LiveStreamPackage g;

    public void c(e0 p0,int p1,boolean p2,c p3,int p4,ClientContent$LiveStreamPackage p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       u1.B(new ClickMetaData().setLogPage(this.b).setType(1).setElementPackage(a.f(this.c, this.d, this.e, this.f)).setContentPackage(a.d(this.g)));
       return;
    }
}
