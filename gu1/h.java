package gu1.h;
import java.lang.Runnable;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.List;
import k2b.e0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gu1.a;
import com.google.common.collect.ImmutableMap;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;

public final class h implements Runnable	// class@002586
{
    public final int b;
    public final ClientContent$LiveStreamPackage c;
    public final List d;
    public final e0 e;

    public void h(int p0,ClientContent$LiveStreamPackage p1,List p2,e0 p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       ImmutableMap immutableMap = ImmutableMap.of("pk_mode", a.j(this.b));
       a.o(immutableMap, "elementParamsMap");
       ClientContent$ContentPackage uContentPack = a.d(this.c);
       uContentPack.batchUserPackage = a.i(this.d);
       u1.B0(new ShowMetaData().setLogPage(this.e).setType(9).setElementPackage(a.g("MULTI_CHAT_LEFT_PROGRESS_CARD", immutableMap)).setContentPackage(uContentPack));
       return;
    }
}
