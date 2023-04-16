package com.kwai.feature.api.live.base.service.quitlive.AnchorQuitLiveCheckOrder;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AnchorQuitLiveCheckOrder extends Enum	// class@000fa5
{
    public boolean mIsOnlyBackPress;
    public static final AnchorQuitLiveCheckOrder[] $VALUES;
    public static final AnchorQuitLiveCheckOrder ANCHOR_EXIT_LANDSCAPE;
    public static final AnchorQuitLiveCheckOrder ANCHOR_LEGACY_BGM;
    public static final AnchorQuitLiveCheckOrder ANCHOR_LUCKY_STAR;
    public static final AnchorQuitLiveCheckOrder ANCHOR_SETTING;
    public static final AnchorQuitLiveCheckOrder ANCHOR_SHOP;
    public static final AnchorQuitLiveCheckOrder ANCHOR_STICKER;
    public static final AnchorQuitLiveCheckOrder ANCHOR_WISH_LIST;
    public static final AnchorQuitLiveCheckOrder FINISH;
    public static final AnchorQuitLiveCheckOrder H5_PENDANT_EXPANSION;
    public static final AnchorQuitLiveCheckOrder MULTI_LINE_CLOSE;
    public static final AnchorQuitLiveCheckOrder MULTI_PK_CLOSE;
    public static final AnchorQuitLiveCheckOrder OPEN_RED_PACKET_TIP;
    public static final AnchorQuitLiveCheckOrder POPULARITY_RANK_CLOSE;
    public static final AnchorQuitLiveCheckOrder PUSH_SUMMARY;
    public static final AnchorQuitLiveCheckOrder QUIT_LIVE_GUIDE;
    public static final AnchorQuitLiveCheckOrder VOICE_PARTY_CLOSE;

    static {
       AnchorQuitLiveCheckOrder uAnchorQuitL = new AnchorQuitLiveCheckOrder("ANCHOR_EXIT_LANDSCAPE", 0, 0);
       AnchorQuitLiveCheckOrder.ANCHOR_EXIT_LANDSCAPE = uAnchorQuitL;
       AnchorQuitLiveCheckOrder uAnchorQuitL1 = new AnchorQuitLiveCheckOrder("POPULARITY_RANK_CLOSE", 1, 0);
       AnchorQuitLiveCheckOrder.POPULARITY_RANK_CLOSE = uAnchorQuitL1;
       AnchorQuitLiveCheckOrder uAnchorQuitL2 = new AnchorQuitLiveCheckOrder("ANCHOR_LUCKY_STAR", 2, 0);
       AnchorQuitLiveCheckOrder.ANCHOR_LUCKY_STAR = uAnchorQuitL2;
       AnchorQuitLiveCheckOrder uAnchorQuitL3 = new AnchorQuitLiveCheckOrder("ANCHOR_SHOP", 3, 1);
       AnchorQuitLiveCheckOrder.ANCHOR_SHOP = uAnchorQuitL3;
       AnchorQuitLiveCheckOrder uAnchorQuitL4 = new AnchorQuitLiveCheckOrder("ANCHOR_SETTING", 4, 1);
       AnchorQuitLiveCheckOrder.ANCHOR_SETTING = uAnchorQuitL4;
       AnchorQuitLiveCheckOrder uAnchorQuitL5 = new AnchorQuitLiveCheckOrder("ANCHOR_WISH_LIST", 5, 1);
       AnchorQuitLiveCheckOrder.ANCHOR_WISH_LIST = uAnchorQuitL5;
       AnchorQuitLiveCheckOrder uAnchorQuitL6 = new AnchorQuitLiveCheckOrder("PUSH_SUMMARY", 6, 1);
       AnchorQuitLiveCheckOrder.PUSH_SUMMARY = uAnchorQuitL6;
       AnchorQuitLiveCheckOrder uAnchorQuitL7 = new AnchorQuitLiveCheckOrder("ANCHOR_LEGACY_BGM", 7, 1);
       AnchorQuitLiveCheckOrder.ANCHOR_LEGACY_BGM = uAnchorQuitL7;
       AnchorQuitLiveCheckOrder uAnchorQuitL8 = new AnchorQuitLiveCheckOrder("MULTI_LINE_CLOSE", 8, 0);
       AnchorQuitLiveCheckOrder.MULTI_LINE_CLOSE = uAnchorQuitL8;
       AnchorQuitLiveCheckOrder uAnchorQuitL9 = new AnchorQuitLiveCheckOrder("MULTI_PK_CLOSE", 9, 0);
       AnchorQuitLiveCheckOrder.MULTI_PK_CLOSE = uAnchorQuitL9;
       AnchorQuitLiveCheckOrder uAnchorQuitL10 = new AnchorQuitLiveCheckOrder("VOICE_PARTY_CLOSE", 10);
       AnchorQuitLiveCheckOrder.VOICE_PARTY_CLOSE = uAnchorQuitL10;
       AnchorQuitLiveCheckOrder uAnchorQuitL11 = new AnchorQuitLiveCheckOrder("OPEN_RED_PACKET_TIP", 11);
       AnchorQuitLiveCheckOrder.OPEN_RED_PACKET_TIP = uAnchorQuitL11;
       AnchorQuitLiveCheckOrder uAnchorQuitL12 = new AnchorQuitLiveCheckOrder("ANCHOR_STICKER", 12, 1);
       AnchorQuitLiveCheckOrder.ANCHOR_STICKER = uAnchorQuitL12;
       AnchorQuitLiveCheckOrder uAnchorQuitL13 = new AnchorQuitLiveCheckOrder("QUIT_LIVE_GUIDE", 13);
       AnchorQuitLiveCheckOrder.QUIT_LIVE_GUIDE = uAnchorQuitL13;
       AnchorQuitLiveCheckOrder uAnchorQuitL14 = uAnchorQuitL13;
       AnchorQuitLiveCheckOrder uAnchorQuitL15 = new AnchorQuitLiveCheckOrder("H5_PENDANT_EXPANSION", 14);
       AnchorQuitLiveCheckOrder.H5_PENDANT_EXPANSION = uAnchorQuitL15;
       AnchorQuitLiveCheckOrder uAnchorQuitL16 = uAnchorQuitL15;
       AnchorQuitLiveCheckOrder uAnchorQuitL17 = new AnchorQuitLiveCheckOrder("FINISH", 15);
       AnchorQuitLiveCheckOrder.FINISH = uAnchorQuitL17;
       AnchorQuitLiveCheckOrder[] uAnchorQuitL18 = new AnchorQuitLiveCheckOrder[16];
       uAnchorQuitL18[0] = uAnchorQuitL;
       uAnchorQuitL18[1] = uAnchorQuitL1;
       uAnchorQuitL18[2] = uAnchorQuitL2;
       uAnchorQuitL18[3] = uAnchorQuitL3;
       uAnchorQuitL18[4] = uAnchorQuitL4;
       uAnchorQuitL18[5] = uAnchorQuitL5;
       uAnchorQuitL18[6] = uAnchorQuitL6;
       uAnchorQuitL18[7] = uAnchorQuitL7;
       uAnchorQuitL18[8] = uAnchorQuitL8;
       uAnchorQuitL18[9] = uAnchorQuitL9;
       uAnchorQuitL18[10] = uAnchorQuitL10;
       uAnchorQuitL18[11] = uAnchorQuitL11;
       uAnchorQuitL18[12] = uAnchorQuitL12;
       uAnchorQuitL18[13] = uAnchorQuitL14;
       uAnchorQuitL18[14] = uAnchorQuitL16;
       uAnchorQuitL18[15] = uAnchorQuitL17;
       AnchorQuitLiveCheckOrder.$VALUES = uAnchorQuitL18;
    }
    public void AnchorQuitLiveCheckOrder(String p0,int p1){
       super(p0, p1);
       this.mIsOnlyBackPress = false;
    }
    public void AnchorQuitLiveCheckOrder(String p0,int p1,boolean p2){
       super(p0, p1);
       this.mIsOnlyBackPress = p2;
    }
    public static AnchorQuitLiveCheckOrder valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AnchorQuitLiveCheckOrder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AnchorQuitLiveCheckOrder.class, p0);
    }
    public static AnchorQuitLiveCheckOrder[] values(){
       Object obj = PatchProxy.apply(null, null, AnchorQuitLiveCheckOrder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AnchorQuitLiveCheckOrder.$VALUES.clone();
    }
    public boolean isOnlyBackPress(){
       return this.mIsOnlyBackPress;
    }
}
