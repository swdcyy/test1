package com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GiftTab extends Enum	// class@001324
{
    public static final GiftTab[] $VALUES;
    public static final GiftTab FansGroupGift;
    public static final GiftTab NormalGift;
    public static final GiftTab PacketGift;
    public static final GiftTab PrivilegeGift;
    public static final GiftTab PropsPanel;

    static {
       GiftTab giftTab = new GiftTab("NormalGift", 0);
       GiftTab.NormalGift = giftTab;
       GiftTab giftTab1 = new GiftTab("PacketGift", 1);
       GiftTab.PacketGift = giftTab1;
       GiftTab giftTab2 = new GiftTab("PrivilegeGift", 2);
       GiftTab.PrivilegeGift = giftTab2;
       GiftTab giftTab3 = new GiftTab("FansGroupGift", 3);
       GiftTab.FansGroupGift = giftTab3;
       GiftTab giftTab4 = new GiftTab("PropsPanel", 4);
       GiftTab.PropsPanel = giftTab4;
       GiftTab[] giftTabArray = new GiftTab[]{giftTab,giftTab1,giftTab2,giftTab3,giftTab4};
       GiftTab.$VALUES = giftTabArray;
    }
    public void GiftTab(String p0,int p1){
       super(p0, p1);
    }
    public static GiftTab valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GiftTab.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GiftTab.class, p0);
    }
    public static GiftTab[] values(){
       Object obj = PatchProxy.apply(null, null, GiftTab.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GiftTab.$VALUES.clone();
    }
}
