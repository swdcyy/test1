package mk1.c;
import java.lang.Object;
import mk1.e;
import mk1.d;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class c	// class@00319c
{
    public boolean a;
    public boolean b;
    public boolean c;
    public e d;
    public d e;
    public d f;
    public d g;
    public d h;

    public void c(){
       super();
       this.a = false;
       this.b = false;
       this.d = new e();
       this.e = new d(GiftTab.NormalGift);
       this.f = new d(GiftTab.PacketGift);
       this.g = new d(GiftTab.PrivilegeGift);
       this.h = new d(GiftTab.FansGroupGift);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{ "+" mGiftTabRecoveryData = "+this.d+" mNormalGiftPanelRecoveryData = "+this.e+" mPacketGiftPanelRecoveryData = "+this.f+" mPrivilegeGiftPanelRecoveryData = "+this.g+" mFansGroupGiftPanelRecoveryData = "+this.h+" mWalletInfoLoaded = "+this.a+" }";
    }
}
