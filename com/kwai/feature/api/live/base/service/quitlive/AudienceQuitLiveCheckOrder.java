package com.kwai.feature.api.live.base.service.quitlive.AudienceQuitLiveCheckOrder;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AudienceQuitLiveCheckOrder extends Enum	// class@000fa6
{
    public boolean mIsOnlyBackPress;
    public static final AudienceQuitLiveCheckOrder[] $VALUES;
    public static final AudienceQuitLiveCheckOrder BANNED;
    public static final AudienceQuitLiveCheckOrder CLICK_PEER_HALF_SCREEN_LEAVE;
    public static final AudienceQuitLiveCheckOrder CLOSE_BY_FEEDBACK_DELETE_ALL_DATA;
    public static final AudienceQuitLiveCheckOrder COURSE;
    public static final AudienceQuitLiveCheckOrder ESCROW_BOTTOM_BAR_DIALOGS;
    public static final AudienceQuitLiveCheckOrder ESCROW_SHOP;
    public static final AudienceQuitLiveCheckOrder FINISH;
    public static final AudienceQuitLiveCheckOrder FLOATING_WINDOW;
    public static final AudienceQuitLiveCheckOrder GZONE_AUDIENCE_CLIP;
    public static final AudienceQuitLiveCheckOrder H5_PENDANT_EXPANSION;
    public static final AudienceQuitLiveCheckOrder LANDSCAPE;
    public static final AudienceQuitLiveCheckOrder LIVE_MERCHANT;
    public static final AudienceQuitLiveCheckOrder LIVE_MERCHANT_HIGH;
    public static final AudienceQuitLiveCheckOrder LIVE_MERCHANT_LOW;
    public static final AudienceQuitLiveCheckOrder LIVE_MERCHANT_MEDIUM;
    public static final AudienceQuitLiveCheckOrder LIVE_NEBULA_SEND_GIFT;
    public static final AudienceQuitLiveCheckOrder LIVE_SLIDE_GUIDE;
    public static final AudienceQuitLiveCheckOrder LIVE_SQUARE;
    public static final AudienceQuitLiveCheckOrder LIVE_SQUARE_LEFT_GUIDE;
    public static final AudienceQuitLiveCheckOrder LIVE_SQUARE_SOURCE_FEED;
    public static final AudienceQuitLiveCheckOrder LIVE_STAY_INFO;
    public static final AudienceQuitLiveCheckOrder MUSIC_STATION;
    public static final AudienceQuitLiveCheckOrder QUIZ;
    public static final AudienceQuitLiveCheckOrder TREASURE_BOX;
    public static final AudienceQuitLiveCheckOrder TREASURE_BOX_TASK;
    public static final AudienceQuitLiveCheckOrder VOICE_PARTY_CLOSE;

    static {
       AudienceQuitLiveCheckOrder uAudienceQui = new AudienceQuitLiveCheckOrder("LIVE_MERCHANT_HIGH", 0);
       AudienceQuitLiveCheckOrder.LIVE_MERCHANT_HIGH = uAudienceQui;
       AudienceQuitLiveCheckOrder uAudienceQui1 = new AudienceQuitLiveCheckOrder("CLICK_PEER_HALF_SCREEN_LEAVE", 1);
       AudienceQuitLiveCheckOrder.CLICK_PEER_HALF_SCREEN_LEAVE = uAudienceQui1;
       AudienceQuitLiveCheckOrder uAudienceQui2 = new AudienceQuitLiveCheckOrder("CLOSE_BY_FEEDBACK_DELETE_ALL_DATA", 2);
       AudienceQuitLiveCheckOrder.CLOSE_BY_FEEDBACK_DELETE_ALL_DATA = uAudienceQui2;
       AudienceQuitLiveCheckOrder uAudienceQui3 = new AudienceQuitLiveCheckOrder("ESCROW_BOTTOM_BAR_DIALOGS", 3, 1);
       AudienceQuitLiveCheckOrder.ESCROW_BOTTOM_BAR_DIALOGS = uAudienceQui3;
       AudienceQuitLiveCheckOrder uAudienceQui4 = new AudienceQuitLiveCheckOrder("ESCROW_SHOP", 4, 1);
       AudienceQuitLiveCheckOrder.ESCROW_SHOP = uAudienceQui4;
       AudienceQuitLiveCheckOrder uAudienceQui5 = new AudienceQuitLiveCheckOrder("BANNED", 5, 1);
       AudienceQuitLiveCheckOrder.BANNED = uAudienceQui5;
       AudienceQuitLiveCheckOrder uAudienceQui6 = new AudienceQuitLiveCheckOrder("LANDSCAPE", 6);
       AudienceQuitLiveCheckOrder.LANDSCAPE = uAudienceQui6;
       AudienceQuitLiveCheckOrder uAudienceQui7 = new AudienceQuitLiveCheckOrder("MUSIC_STATION", 7, 1);
       AudienceQuitLiveCheckOrder.MUSIC_STATION = uAudienceQui7;
       AudienceQuitLiveCheckOrder uAudienceQui8 = new AudienceQuitLiveCheckOrder("LIVE_SQUARE", 8, 1);
       AudienceQuitLiveCheckOrder.LIVE_SQUARE = uAudienceQui8;
       AudienceQuitLiveCheckOrder uAudienceQui9 = new AudienceQuitLiveCheckOrder("LIVE_SLIDE_GUIDE", 9);
       AudienceQuitLiveCheckOrder.LIVE_SLIDE_GUIDE = uAudienceQui9;
       AudienceQuitLiveCheckOrder uAudienceQui10 = new AudienceQuitLiveCheckOrder("LIVE_SQUARE_LEFT_GUIDE", 10);
       AudienceQuitLiveCheckOrder.LIVE_SQUARE_LEFT_GUIDE = uAudienceQui10;
       AudienceQuitLiveCheckOrder uAudienceQui11 = new AudienceQuitLiveCheckOrder("LIVE_SQUARE_SOURCE_FEED", 11);
       AudienceQuitLiveCheckOrder.LIVE_SQUARE_SOURCE_FEED = uAudienceQui11;
       AudienceQuitLiveCheckOrder uAudienceQui12 = new AudienceQuitLiveCheckOrder("LIVE_NEBULA_SEND_GIFT", 12);
       AudienceQuitLiveCheckOrder.LIVE_NEBULA_SEND_GIFT = uAudienceQui12;
       AudienceQuitLiveCheckOrder uAudienceQui13 = new AudienceQuitLiveCheckOrder("QUIZ", 13);
       AudienceQuitLiveCheckOrder.QUIZ = uAudienceQui13;
       AudienceQuitLiveCheckOrder uAudienceQui14 = uAudienceQui13;
       AudienceQuitLiveCheckOrder uAudienceQui15 = new AudienceQuitLiveCheckOrder("COURSE", 14);
       AudienceQuitLiveCheckOrder.COURSE = uAudienceQui15;
       AudienceQuitLiveCheckOrder uAudienceQui16 = uAudienceQui15;
       AudienceQuitLiveCheckOrder uAudienceQui17 = new AudienceQuitLiveCheckOrder("LIVE_MERCHANT_MEDIUM", 15);
       AudienceQuitLiveCheckOrder.LIVE_MERCHANT_MEDIUM = uAudienceQui17;
       AudienceQuitLiveCheckOrder uAudienceQui18 = uAudienceQui17;
       AudienceQuitLiveCheckOrder uAudienceQui19 = uAudienceQui12;
       uAudienceQui13 = new AudienceQuitLiveCheckOrder("LIVE_MERCHANT", 16, false);
       AudienceQuitLiveCheckOrder.LIVE_MERCHANT = uAudienceQui13;
       uAudienceQui15 = new AudienceQuitLiveCheckOrder("LIVE_STAY_INFO", 17);
       AudienceQuitLiveCheckOrder.LIVE_STAY_INFO = uAudienceQui15;
       AudienceQuitLiveCheckOrder uAudienceQui20 = uAudienceQui15;
       uAudienceQui12 = new AudienceQuitLiveCheckOrder("TREASURE_BOX", 18);
       AudienceQuitLiveCheckOrder.TREASURE_BOX = uAudienceQui12;
       AudienceQuitLiveCheckOrder uAudienceQui21 = uAudienceQui12;
       uAudienceQui17 = new AudienceQuitLiveCheckOrder("TREASURE_BOX_TASK", 19);
       AudienceQuitLiveCheckOrder.TREASURE_BOX_TASK = uAudienceQui17;
       AudienceQuitLiveCheckOrder uAudienceQui22 = uAudienceQui17;
       uAudienceQui15 = new AudienceQuitLiveCheckOrder("VOICE_PARTY_CLOSE", 20);
       AudienceQuitLiveCheckOrder.VOICE_PARTY_CLOSE = uAudienceQui15;
       AudienceQuitLiveCheckOrder uAudienceQui23 = uAudienceQui15;
       uAudienceQui12 = new AudienceQuitLiveCheckOrder("GZONE_AUDIENCE_CLIP", 21);
       AudienceQuitLiveCheckOrder.GZONE_AUDIENCE_CLIP = uAudienceQui12;
       AudienceQuitLiveCheckOrder uAudienceQui24 = uAudienceQui12;
       uAudienceQui17 = new AudienceQuitLiveCheckOrder("H5_PENDANT_EXPANSION", 22);
       AudienceQuitLiveCheckOrder.H5_PENDANT_EXPANSION = uAudienceQui17;
       AudienceQuitLiveCheckOrder uAudienceQui25 = uAudienceQui17;
       uAudienceQui15 = new AudienceQuitLiveCheckOrder("FLOATING_WINDOW", 23);
       AudienceQuitLiveCheckOrder.FLOATING_WINDOW = uAudienceQui15;
       AudienceQuitLiveCheckOrder uAudienceQui26 = uAudienceQui15;
       uAudienceQui17 = new AudienceQuitLiveCheckOrder("LIVE_MERCHANT_LOW", 24);
       AudienceQuitLiveCheckOrder.LIVE_MERCHANT_LOW = uAudienceQui17;
       AudienceQuitLiveCheckOrder uAudienceQui27 = uAudienceQui17;
       uAudienceQui15 = new AudienceQuitLiveCheckOrder("FINISH", 25);
       AudienceQuitLiveCheckOrder.FINISH = uAudienceQui15;
       AudienceQuitLiveCheckOrder[] uAudienceQui28 = new AudienceQuitLiveCheckOrder[26];
       uAudienceQui28[0] = uAudienceQui;
       uAudienceQui28[1] = uAudienceQui1;
       uAudienceQui28[2] = uAudienceQui2;
       uAudienceQui28[3] = uAudienceQui3;
       uAudienceQui28[4] = uAudienceQui4;
       uAudienceQui28[5] = uAudienceQui5;
       uAudienceQui28[6] = uAudienceQui6;
       uAudienceQui28[7] = uAudienceQui7;
       uAudienceQui28[8] = uAudienceQui8;
       uAudienceQui28[9] = uAudienceQui9;
       uAudienceQui28[10] = uAudienceQui10;
       uAudienceQui28[11] = uAudienceQui11;
       uAudienceQui28[12] = uAudienceQui19;
       uAudienceQui28[13] = uAudienceQui14;
       uAudienceQui28[14] = uAudienceQui16;
       uAudienceQui28[15] = uAudienceQui18;
       uAudienceQui28[16] = uAudienceQui13;
       uAudienceQui28[17] = uAudienceQui20;
       uAudienceQui28[18] = uAudienceQui21;
       uAudienceQui28[19] = uAudienceQui22;
       uAudienceQui28[20] = uAudienceQui23;
       uAudienceQui28[21] = uAudienceQui24;
       uAudienceQui28[22] = uAudienceQui25;
       uAudienceQui28[23] = uAudienceQui26;
       uAudienceQui28[24] = uAudienceQui27;
       uAudienceQui28[25] = uAudienceQui15;
       AudienceQuitLiveCheckOrder.$VALUES = uAudienceQui28;
    }
    public void AudienceQuitLiveCheckOrder(String p0,int p1){
       super(p0, p1);
       this.mIsOnlyBackPress = false;
    }
    public void AudienceQuitLiveCheckOrder(String p0,int p1,boolean p2){
       super(p0, p1);
       this.mIsOnlyBackPress = p2;
    }
    public static AudienceQuitLiveCheckOrder valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AudienceQuitLiveCheckOrder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AudienceQuitLiveCheckOrder.class, p0);
    }
    public static AudienceQuitLiveCheckOrder[] values(){
       Object obj = PatchProxy.apply(null, null, AudienceQuitLiveCheckOrder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AudienceQuitLiveCheckOrder.$VALUES.clone();
    }
    public boolean isOnlyBackPress(){
       return this.mIsOnlyBackPress;
    }
}
