package com.yxcorp.gifshow.profile.constant.ProfileTab;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ProfileTab extends Enum	// class@0012e9
{
    public int mTabId;
    public String mTabName;
    public static final ProfileTab[] $VALUES;
    public static final ProfileTab TAB_ACFUN;
    public static final ProfileTab TAB_AD_BUSINESS_CUSTOM;
    public static final ProfileTab TAB_ARTICLE;
    public static final ProfileTab TAB_COLLECT;
    public static final ProfileTab TAB_LIKE;
    public static final ProfileTab TAB_LIVE_PLAY_BACK;
    public static final ProfileTab TAB_MAGIC_FACE;
    public static final ProfileTab TAB_MOMENT;
    public static final ProfileTab TAB_MUSIC;
    public static final ProfileTab TAB_PHOTO;
    public static final ProfileTab TAB_PRIVACY;

    static {
       ProfileTab profileTab = new ProfileTab("TAB_PHOTO", 0, 1, "photo");
       ProfileTab.TAB_PHOTO = profileTab;
       ProfileTab profileTab1 = new ProfileTab("TAB_PRIVACY", 1, 2, "privacy");
       ProfileTab.TAB_PRIVACY = profileTab1;
       ProfileTab profileTab2 = new ProfileTab("TAB_LIKE", 2, 3, "like");
       ProfileTab.TAB_LIKE = profileTab2;
       ProfileTab profileTab3 = new ProfileTab("TAB_MUSIC", 3, 4, "music");
       ProfileTab.TAB_MUSIC = profileTab3;
       ProfileTab profileTab4 = new ProfileTab("TAB_MOMENT", 4, 5, "moment");
       ProfileTab.TAB_MOMENT = profileTab4;
       ProfileTab profileTab5 = new ProfileTab("TAB_COLLECT", 5, 6, "collect");
       ProfileTab.TAB_COLLECT = profileTab5;
       ProfileTab profileTab6 = new ProfileTab("TAB_ARTICLE", 6, 8, "article");
       ProfileTab.TAB_ARTICLE = profileTab6;
       ProfileTab profileTab7 = new ProfileTab("TAB_AD_BUSINESS_CUSTOM", 7, 9, "adBusinessCustom");
       ProfileTab.TAB_AD_BUSINESS_CUSTOM = profileTab7;
       ProfileTab profileTab8 = new ProfileTab("TAB_LIVE_PLAY_BACK", 8, 12, "livePlayBack");
       ProfileTab.TAB_LIVE_PLAY_BACK = profileTab8;
       ProfileTab profileTab9 = new ProfileTab("TAB_MAGIC_FACE", 9, 13, "magicFace");
       ProfileTab.TAB_MAGIC_FACE = profileTab9;
       ProfileTab profileTab10 = new ProfileTab("TAB_ACFUN", 10, 14, "acFun");
       ProfileTab.TAB_ACFUN = profileTab10;
       ProfileTab[] profileTabAr = new ProfileTab[11];
       profileTabAr[0] = profileTab;
       profileTabAr[1] = profileTab1;
       profileTabAr[2] = profileTab2;
       profileTabAr[3] = profileTab3;
       profileTabAr[4] = profileTab4;
       profileTabAr[5] = profileTab5;
       profileTabAr[6] = profileTab6;
       profileTabAr[7] = profileTab7;
       profileTabAr[8] = profileTab8;
       profileTabAr[9] = profileTab9;
       profileTabAr[10] = profileTab10;
       ProfileTab.$VALUES = profileTabAr;
    }
    public void ProfileTab(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.mTabId = p2;
       this.mTabName = p3;
    }
    public static ProfileTab valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ProfileTab.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ProfileTab.class, p0);
    }
    public static ProfileTab[] values(){
       Object obj = PatchProxy.apply(null, null, ProfileTab.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ProfileTab.$VALUES.clone();
    }
    public int getTabId(){
       return this.mTabId;
    }
    public String getTabName(){
       return this.mTabName;
    }
}
