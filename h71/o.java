package h71.o;
import yc1.d;
import asd.c;
import com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchor$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.Result;
import o63.m;
import o63.m$a;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import com.kuaishou.live.bridge.commands.LiveJsCmdSendGiftToAnchor$b;

public final class o implements d	// class@002641
{
    public final c a;
    public final LiveJsCmdSendGiftToAnchor$a b;

    public void o(c p0,LiveJsCmdSendGiftToAnchor$a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public boolean onError(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "error");
       b.Z(LiveJsBridgeLogTag.COMMON, "sendGiftToAnchor "+this.b.d()+' '+"error "+p0);
       this.a.resumeWith(Result.constructor-impl(m$a.e(m.g, null, 1, null)));
       return false;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
       }else {
          this.a.resumeWith(Result.constructor-impl(m$a.g(m.g, new LiveJsCmdSendGiftToAnchor$b(null, p0), false, 2, null)));
       }
       return;
    }
}
