package b59.d;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.tachikoma.bridge.follow.RegisterFollowListenerBridge;
import a59.c;
import b59.b;
import b59.a;

public final class d extends TkBridgeGroup	// class@00036f
{

    public void d(f p0){
       a.p(p0, "tkBridgeContext");
       super();
       this.i(new RegisterFollowListenerBridge(p0));
       this.i(new b(p0));
       this.i(new a(p0));
    }
}
