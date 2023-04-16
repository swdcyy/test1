package gu1.g;
import java.lang.Runnable;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gu1.a;
import com.google.common.collect.ImmutableMap;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;

public final class g implements Runnable	// class@002585
{
    public final int b;
    public final e0 c;
    public final ClientContent$LiveStreamPackage d;
    public final List e;

    public void g(int p0,e0 p1,ClientContent$LiveStreamPackage p2,List p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       ImmutableMap immutableMap = ImmutableMap.of("pk_mode", a.j(this.b));
       a.o(immutableMap, "elementParamsMap");
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.params = this.c.getPageParams();
       urlPackage.page2 = this.c.o();
       ClientContent$ContentPackage uContentPack = a.d(this.d);
       uContentPack.batchUserPackage = a.i(this.e);
       u1.B(new ClickMetaData().setLogPage(this.c).setType(9).setElementPackage(a.g("MULTI_CHAT_LEFT_PROGRESS_CARD", immutableMap)).setContentPackage(uContentPack));
       return;
    }
}
