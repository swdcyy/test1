package com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import v2c.d;

public final class KsLogProfileTag extends Enum implements e	// class@00137c
{
    public String mName;
    public static final KsLogProfileTag[] $VALUES;
    public static final KsLogProfileTag ACTIONBAR_COMPONENT;
    public static final KsLogProfileTag ACTION_BAR_SCROLL;
    public static final KsLogProfileTag BG_DOWNLOAD;
    public static final KsLogProfileTag BG_GUIDE_BUBBLE;
    public static final KsLogProfileTag BG_IMMERSIVE;
    public static final KsLogProfileTag BG_VIDEO;
    public static final KsLogProfileTag BOTTOM_TAB;
    public static final KsLogProfileTag COMMON;
    public static final KsLogProfileTag COMMON_DIALOG;
    public static final KsLogProfileTag COMMON_TEMPLATE_CARD;
    public static final KsLogProfileTag CREATOR_CENTER;
    public static final KsLogProfileTag DRAFT;
    public static final KsLogProfileTag FANS_NUMBER;
    public static final KsLogProfileTag FOLLOW_NUMBER;
    public static final KsLogProfileTag IP_LOCATION;
    public static final KsLogProfileTag LIKE_NUMBER;
    public static final KsLogProfileTag LOCAL_ALBUM;
    public static final KsLogProfileTag MOCK_FEED;
    public static final KsLogProfileTag NEW_FANS_PANEL;
    public static final KsLogProfileTag NEW_FRIEND;
    public static final KsLogProfileTag OVERDUE_PHOTO_TIP;
    public static final KsLogProfileTag PHOTO_EMPTY_VIEW_GUIDE;
    public static final KsLogProfileTag PHOTO_LAST_SEEN;
    public static final KsLogProfileTag PHOTO_LIKE_COUNT;
    public static final KsLogProfileTag PHOTO_PLAY;
    public static final KsLogProfileTag PHOTO_PLAY_COUNT;
    public static final KsLogProfileTag PHOTO_RECORD;
    public static final KsLogProfileTag PHOTO_TAB_PRE_LOAD;
    public static final KsLogProfileTag PROFILE_AVATAR;
    public static final KsLogProfileTag PROFILE_CACHE;
    public static final KsLogProfileTag PROFILE_PENDANT;
    public static final KsLogProfileTag PROFILE_PLUGIN;
    public static final KsLogProfileTag PROFILE_PYMK;
    public static final KsLogProfileTag PROFILE_RELATION;
    public static final KsLogProfileTag RX_ERROR;
    public static final KsLogProfileTag TAB_COUNT;

    static {
       KsLogProfileTag ksLogProfile = new KsLogProfileTag("COMMON", 0, "Common");
       KsLogProfileTag.COMMON = ksLogProfile;
       KsLogProfileTag ksLogProfile1 = new KsLogProfileTag("RX_ERROR", 1, "RxError");
       KsLogProfileTag.RX_ERROR = ksLogProfile1;
       KsLogProfileTag ksLogProfile2 = new KsLogProfileTag("TAB_COUNT", 2, "TabCount");
       KsLogProfileTag.TAB_COUNT = ksLogProfile2;
       KsLogProfileTag ksLogProfile3 = new KsLogProfileTag("DRAFT", 3, "Draft");
       KsLogProfileTag.DRAFT = ksLogProfile3;
       KsLogProfileTag ksLogProfile4 = new KsLogProfileTag("PHOTO_PLAY", 4, "PhotoPlay");
       KsLogProfileTag.PHOTO_PLAY = ksLogProfile4;
       KsLogProfileTag ksLogProfile5 = new KsLogProfileTag("LOCAL_ALBUM", 5, "LocalAlbum");
       KsLogProfileTag.LOCAL_ALBUM = ksLogProfile5;
       KsLogProfileTag ksLogProfile6 = new KsLogProfileTag("MOCK_FEED", 6, "MockFeed");
       KsLogProfileTag.MOCK_FEED = ksLogProfile6;
       KsLogProfileTag ksLogProfile7 = new KsLogProfileTag("COMMON_DIALOG", 7, "CommonDialog");
       KsLogProfileTag.COMMON_DIALOG = ksLogProfile7;
       KsLogProfileTag ksLogProfile8 = new KsLogProfileTag("COMMON_TEMPLATE_CARD", 8, "CommonTemplateCard");
       KsLogProfileTag.COMMON_TEMPLATE_CARD = ksLogProfile8;
       KsLogProfileTag ksLogProfile9 = new KsLogProfileTag("FOLLOW_NUMBER", 9, "FollowNumber");
       KsLogProfileTag.FOLLOW_NUMBER = ksLogProfile9;
       KsLogProfileTag ksLogProfile10 = new KsLogProfileTag("FANS_NUMBER", 10, "FansNumber");
       KsLogProfileTag.FANS_NUMBER = ksLogProfile10;
       KsLogProfileTag ksLogProfile11 = new KsLogProfileTag("LIKE_NUMBER", 11, "LikeNumber");
       KsLogProfileTag.LIKE_NUMBER = ksLogProfile11;
       KsLogProfileTag ksLogProfile12 = new KsLogProfileTag("NEW_FRIEND", 12, "NewFriend");
       KsLogProfileTag.NEW_FRIEND = ksLogProfile12;
       KsLogProfileTag ksLogProfile13 = ksLogProfile12;
       KsLogProfileTag ksLogProfile14 = new KsLogProfileTag("CREATOR_CENTER", 13, "CreatorCenter");
       KsLogProfileTag.CREATOR_CENTER = ksLogProfile14;
       KsLogProfileTag ksLogProfile15 = ksLogProfile14;
       ksLogProfile12 = new KsLogProfileTag("PHOTO_LIKE_COUNT", 14, "PhotoLikeCount");
       KsLogProfileTag.PHOTO_LIKE_COUNT = ksLogProfile12;
       KsLogProfileTag ksLogProfile16 = ksLogProfile12;
       ksLogProfile14 = new KsLogProfileTag("PHOTO_PLAY_COUNT", 15, "PhotoPlayCount");
       KsLogProfileTag.PHOTO_PLAY_COUNT = ksLogProfile14;
       KsLogProfileTag ksLogProfile17 = ksLogProfile14;
       ksLogProfile12 = new KsLogProfileTag("PHOTO_LAST_SEEN", 16, "PhotoLastSeen");
       KsLogProfileTag.PHOTO_LAST_SEEN = ksLogProfile12;
       KsLogProfileTag ksLogProfile18 = ksLogProfile12;
       ksLogProfile14 = new KsLogProfileTag("PHOTO_EMPTY_VIEW_GUIDE", 17, "PhotoEmptyViewGuide");
       KsLogProfileTag.PHOTO_EMPTY_VIEW_GUIDE = ksLogProfile14;
       KsLogProfileTag ksLogProfile19 = ksLogProfile14;
       ksLogProfile12 = new KsLogProfileTag("NEW_FANS_PANEL", 18, "NewFansPanel");
       KsLogProfileTag.NEW_FANS_PANEL = ksLogProfile12;
       KsLogProfileTag ksLogProfile20 = ksLogProfile12;
       ksLogProfile14 = new KsLogProfileTag("PROFILE_PENDANT", 19, "ProfilePendant");
       KsLogProfileTag.PROFILE_PENDANT = ksLogProfile14;
       KsLogProfileTag ksLogProfile21 = ksLogProfile14;
       ksLogProfile12 = new KsLogProfileTag("OVERDUE_PHOTO_TIP", 20, "OverduePhotoTip");
       KsLogProfileTag.OVERDUE_PHOTO_TIP = ksLogProfile12;
       KsLogProfileTag ksLogProfile22 = ksLogProfile12;
       ksLogProfile14 = new KsLogProfileTag("PROFILE_PLUGIN", 21, "ProfilePlugin");
       KsLogProfileTag.PROFILE_PLUGIN = ksLogProfile14;
       KsLogProfileTag ksLogProfile23 = ksLogProfile14;
       ksLogProfile12 = new KsLogProfileTag("ACTIONBAR_COMPONENT", 22, "actionbarComponent");
       KsLogProfileTag.ACTIONBAR_COMPONENT = ksLogProfile12;
       KsLogProfileTag ksLogProfile24 = ksLogProfile12;
       ksLogProfile14 = new KsLogProfileTag("BG_GUIDE_BUBBLE", 23, "BgGuideBubble");
       KsLogProfileTag.BG_GUIDE_BUBBLE = ksLogProfile14;
       KsLogProfileTag ksLogProfile25 = ksLogProfile14;
       ksLogProfile12 = new KsLogProfileTag("ACTION_BAR_SCROLL", 24, "ActionBarScroll");
       KsLogProfileTag.ACTION_BAR_SCROLL = ksLogProfile12;
       KsLogProfileTag ksLogProfile26 = ksLogProfile12;
       ksLogProfile14 = new KsLogProfileTag("BG_VIDEO", 25, "BgVideo");
       KsLogProfileTag.BG_VIDEO = ksLogProfile14;
       KsLogProfileTag ksLogProfile27 = ksLogProfile14;
       ksLogProfile12 = new KsLogProfileTag("BG_DOWNLOAD", 26, "BgDownload");
       KsLogProfileTag.BG_DOWNLOAD = ksLogProfile12;
       KsLogProfileTag ksLogProfile28 = ksLogProfile12;
       ksLogProfile14 = new KsLogProfileTag("PROFILE_PYMK", 27, "ProfilePymk");
       KsLogProfileTag.PROFILE_PYMK = ksLogProfile14;
       KsLogProfileTag ksLogProfile29 = ksLogProfile14;
       ksLogProfile12 = new KsLogProfileTag("PROFILE_CACHE", 28, "ProfileNetCache");
       KsLogProfileTag.PROFILE_CACHE = ksLogProfile12;
       KsLogProfileTag ksLogProfile30 = ksLogProfile12;
       ksLogProfile14 = new KsLogProfileTag("PHOTO_TAB_PRE_LOAD", 29, "PhotoTabPreLoad");
       KsLogProfileTag.PHOTO_TAB_PRE_LOAD = ksLogProfile14;
       KsLogProfileTag ksLogProfile31 = ksLogProfile14;
       ksLogProfile12 = new KsLogProfileTag("PHOTO_RECORD", 30, "PhotoRecord");
       KsLogProfileTag.PHOTO_RECORD = ksLogProfile12;
       KsLogProfileTag ksLogProfile32 = ksLogProfile12;
       ksLogProfile14 = new KsLogProfileTag("IP_LOCATION", 31, "IpLocation");
       KsLogProfileTag.IP_LOCATION = ksLogProfile14;
       KsLogProfileTag ksLogProfile33 = ksLogProfile14;
       ksLogProfile12 = new KsLogProfileTag("PROFILE_RELATION", 32, "ProfileRelation");
       KsLogProfileTag.PROFILE_RELATION = ksLogProfile12;
       KsLogProfileTag ksLogProfile34 = ksLogProfile12;
       ksLogProfile14 = new KsLogProfileTag("BG_IMMERSIVE", 33, "BgImmersive");
       KsLogProfileTag.BG_IMMERSIVE = ksLogProfile14;
       KsLogProfileTag ksLogProfile35 = ksLogProfile14;
       ksLogProfile12 = new KsLogProfileTag("BOTTOM_TAB", 34, "bottomTab");
       KsLogProfileTag.BOTTOM_TAB = ksLogProfile12;
       KsLogProfileTag ksLogProfile36 = ksLogProfile12;
       ksLogProfile14 = new KsLogProfileTag("PROFILE_AVATAR", 35, "ProfileAvatar");
       KsLogProfileTag.PROFILE_AVATAR = ksLogProfile14;
       KsLogProfileTag[] ksLogProfile37 = new KsLogProfileTag[36];
       ksLogProfile37[0] = ksLogProfile;
       ksLogProfile37[1] = ksLogProfile1;
       ksLogProfile37[2] = ksLogProfile2;
       ksLogProfile37[3] = ksLogProfile3;
       ksLogProfile37[4] = ksLogProfile4;
       ksLogProfile37[5] = ksLogProfile5;
       ksLogProfile37[6] = ksLogProfile6;
       ksLogProfile37[7] = ksLogProfile7;
       ksLogProfile37[8] = ksLogProfile8;
       ksLogProfile37[9] = ksLogProfile9;
       ksLogProfile37[10] = ksLogProfile10;
       ksLogProfile37[11] = ksLogProfile11;
       ksLogProfile37[12] = ksLogProfile13;
       ksLogProfile37[13] = ksLogProfile15;
       ksLogProfile37[14] = ksLogProfile16;
       ksLogProfile37[15] = ksLogProfile17;
       ksLogProfile37[16] = ksLogProfile18;
       ksLogProfile37[17] = ksLogProfile19;
       ksLogProfile37[18] = ksLogProfile20;
       ksLogProfile37[19] = ksLogProfile21;
       ksLogProfile37[20] = ksLogProfile22;
       ksLogProfile37[21] = ksLogProfile23;
       ksLogProfile37[22] = ksLogProfile24;
       ksLogProfile37[23] = ksLogProfile25;
       ksLogProfile37[24] = ksLogProfile26;
       ksLogProfile37[25] = ksLogProfile27;
       ksLogProfile37[26] = ksLogProfile28;
       ksLogProfile37[27] = ksLogProfile29;
       ksLogProfile37[28] = ksLogProfile30;
       ksLogProfile37[29] = ksLogProfile31;
       ksLogProfile37[30] = ksLogProfile32;
       ksLogProfile37[31] = ksLogProfile33;
       ksLogProfile37[32] = ksLogProfile34;
       ksLogProfile37[33] = ksLogProfile35;
       ksLogProfile37[34] = ksLogProfile36;
       ksLogProfile37[35] = ksLogProfile14;
       KsLogProfileTag.$VALUES = ksLogProfile37;
    }
    public void KsLogProfileTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static int getExpectedSize(int p0){
       return (int)(((float)p0 / 0x3f400000) + 0x3f800000);
    }
    public static KsLogProfileTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogProfileTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogProfileTag.class, p0);
    }
    public static KsLogProfileTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogProfileTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogProfileTag.$VALUES.clone();
    }
    public List a(String p0,String p1){
       return d.b(this, p0, p1);
    }
    public List appendTag(String p0){
       return d.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
