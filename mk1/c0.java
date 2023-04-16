package mk1.c0;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class c0	// class@00319b
{
    public static final c0 a;

    static {
       c0.a = new c0();
    }
    public void c0(){
       super();
    }
    public final GiftTab a(String p0){
       GiftTab normalGift;
       Object obj = PatchProxy.applyOneRefs(p0, this, c0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          switch (p0.hashCode()){
              case 0x800e81f8:
                if (p0.equals("PacketGift")) {
                   normalGift = GiftTab.PacketGift;
                label_0048 :
                   return normalGift;
                }
                break;
              case 0xd90f4361:
                if (p0.equals("PrivilegeGift")) {
                   normalGift = GiftTab.PrivilegeGift;
                   goto label_0048 ;
                }
                break;
              case 0xf86dac4f:
                if (p0.equals("FansGroupGift")) {
                   normalGift = GiftTab.FansGroupGift;
                   goto label_0048 ;
                }
                break;
              case 0x559b9294:
                if (p0.equals("PropsPanel")) {
                   normalGift = GiftTab.PropsPanel;
                   goto label_0048 ;
                }
                break;
              default:
          }
       }
       normalGift = GiftTab.NormalGift;
       goto label_0048 ;
    }
}
