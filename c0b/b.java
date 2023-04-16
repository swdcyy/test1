package c0b.b;
import com.hpplay.sdk.source.api.IConnectListener;
import com.yxcorp.gifshow.lelink.screencast.KwaiLelink;
import java.lang.Object;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;

public final class b implements IConnectListener	// class@00048e
{
    public final KwaiLelink a;

    public void b(KwaiLelink p0){
       this.a = p0;
       super();
    }
    public void onConnect(LelinkServiceInfo p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       Iterator iterator = this.a.c().iterator();
       while (iterator.hasNext()) {
          iterator.next().onConnect(p0, p1);
       }
       return;
    }
    public void onDisconnect(LelinkServiceInfo p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "2")) {
          return;
       }
       Iterator iterator = this.a.c().iterator();
       while (iterator.hasNext()) {
          iterator.next().onDisconnect(p0, p1, p2);
       }
       return;
    }
}
