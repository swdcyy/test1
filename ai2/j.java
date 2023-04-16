package ai2.j;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.richcard.http.UseRichCardResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.richcard.http.UseRichCardResponseData;
import e17.i;
import bi2.e;
import java.lang.CharSequence;

public final class j implements g	// class@0000e0
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          LiveRichCardStateManager h = LiveRichCardStateManager.h;
          b.c0(h.f(), "useRichCard， 使用天降暴富卡", "response", p0);
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
                h.e().e("[useRichCard][SERVER_NO_CARD]");
             }
          }else {
             i.a(R.style.arg_RES_7f110669, 0x7f10430c);
             h.e().j(p0.getData());
          }
       }
       return;
    }
}
