package gu1.b;
import java.lang.Runnable;
import st1.c;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.utility.TextUtils;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import st1.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;

public final class b implements Runnable	// class@002580
{
    public final c b;
    public final String c;
    public final String d;
    public final ClientContent$LiveStreamPackage e;
    public final e0 f;

    public void b(c p0,String p1,String p2,ClientContent$LiveStreamPackage p3,e0 p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MULTI_ADVERSARY_SCREEN_CARD";
       uElementPack.params = e.i(this.b, ImmutableMap.of("anchor_user_id", TextUtils.k(this.c), "live_stream_id", TextUtils.k(this.d)));
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = this.e;
       u1.B(new ClickMetaData().setElementPackage(uElementPack).setContentPackage(uContentPack).setLogPage(this.f));
       return;
    }
}
