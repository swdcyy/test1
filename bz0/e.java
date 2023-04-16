package bz0.e;
import lm1.i;
import ht5.b;
import t02.a0;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Map;

public class e	// class@000435
{
    public b a;
    public a0 b;
    public String c;
    public boolean d;
    public LiveSendGiftTraceInfo e;
    public i f;

    public void e(i p0,b p1,a0 p2,String p3,boolean p4){
       super();
       if (p0 != null) {
          this.f = p0;
          this.e = p0.e();
       }
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       return;
    }
    public String a(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.f;
       if (obj != null) {
          return obj.get("recoGiftLlsid");
       }
       b.Z(LiveLogTag.GIFT, "[LiveHttpSendGiftContext] [getGiftLlsid]: logExtraInfo is null");
       return objArray;
    }
    public i b(){
       return this.f;
    }
    public LiveSendGiftTraceInfo c(){
       return this.e;
    }
}
