package ai2.h;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.richcard.http.UseRichCardResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.http.UseRichCardResponseData;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.android.live.log.b;
import e17.i;
import bi2.e;
import java.lang.CharSequence;

public final class h implements g	// class@0000de
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public void accept(Object p0){
       LiveRichCardStateManager h;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          UseRichCardResponseData data = p0.getData();
          if (data == null || data.getCode() != 1) {
             data = p0.getData();
             if (data != null) {
                String msg = data.getMsg();
                if (msg != null) {
                   i.d(R.style.arg_RES_7f110668, msg);
                }
             }
             p0 = p0.getData();
             if (p0 != null && p0.getCode() == 8) {
                LiveRichCardStateManager.h.e().e("[useRichCard][SERVER_NO_CARD]");
             }
          }else {
             h = LiveRichCardStateManager.h;
             b.Z(h.f(), "useNormalRichCard， 使用普通暴富卡");
             i.a(R.style.arg_RES_7f110669, 0x7f10430c);
             h.e().j(p0.getData());
          }
       }
       return;
    }
}
