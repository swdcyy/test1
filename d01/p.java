package d01.p;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import d01.o;
import java.lang.Long;
import d01.p$a;
import java.lang.Enum;
import ow0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class p	// class@001ee4
{
    public long a;
    public long b;
    public long c;
    public long d;
    public final HashMap e;

    public void p(){
       super();
       HashMap hashMap = new HashMap();
       this.e = hashMap;
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
       }else {
          hashMap.put(GiftTab.PacketGift, new o(R.id.live_gift_packet_title_container));
          hashMap.put(GiftTab.PrivilegeGift, new o(R.id.live_privilege_gift_title_container));
          hashMap.put(GiftTab.FansGroupGift, new o(R.id.live_fans_group_gift_title_container));
          hashMap.put(GiftTab.PropsPanel, new o(R.id.live_props_title_container));
       }
       return;
    }
    public void a(GiftTab p0,long p1){
       SharedPreferences$Editor uEditor;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, op, "6")) {
          return;
       }
       int i = p$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   uEditor = a.a.edit();
                   uEditor.putLong("liveLatestUpdatePropsTime", p1);
                   g.a(uEditor);
                }
             }else {
                uEditor = a.a.edit();
                uEditor.putLong("liveLatestUpdatePrivilegeGiftTime", p1);
                g.a(uEditor);
             }
          }else {
             uEditor = a.a.edit();
             uEditor.putLong("liveLatestUpdateFansGroupGiftTime", p1);
             g.a(uEditor);
          }
       }else {
          uEditor = a.a.edit();
          uEditor.putLong("liveLatestUpdatePacketPrizeTime", p1);
          g.a(uEditor);
       }
       return;
    }
}
