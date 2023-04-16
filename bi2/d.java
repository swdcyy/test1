package bi2.d;
import ah1.c;
import bi2.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.PendantData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import java.lang.Integer;

public final class d extends c	// class@0003f6
{
    public final e i;

    public void d(e p0){
       a.p(p0, "richCardModel");
       super("LiveAutoGrabModel", null, false, false, 14, null);
       this.i = p0;
    }
    public final String f(PendantData p0){
       i3 obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.c("jumpCountDownTime", Long.valueOf(p0.b));
       obj.c("grabTimeCountDown", Long.valueOf(p0.a));
       obj.c("autoGrabState", Integer.valueOf(p0.a()));
       obj.d("pendantMainPartImageUrl", p0.b());
       obj.d("willTransitionNextRoomImageUrl", p0.c());
       obj.d("clickUrl", p0.f);
       obj.d("logParams", p0.g);
       String str = obj.e();
       a.o(str, "JsonStringBuilder.newIns¡­logParams\)\n      .build\(\)");
       return str;
    }
}
