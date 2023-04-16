package com.yxcorp.gifshow.gamezone.UtmSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class UtmSource extends Enum	// class@0012b4
{
    public int mLiveSourceType;
    public String mUtmSourceLabel;
    public static final UtmSource[] $VALUES;
    public static final UtmSource GAMELIVE_TOP_ICON;
    public static final UtmSource LIVEWATCH_PLAY_TOGETHER_TAB;
    public static final UtmSource accompany_square_external;
    public static final UtmSource corona_game_banner;
    public static final UtmSource corona_game_sub_channel;
    public static final UtmSource external;
    public static final UtmSource gameTv;
    public static final UtmSource game_center_competition;
    public static final UtmSource game_center_game_detail;
    public static final UtmSource game_subscribe_message;
    public static final UtmSource gamelive_homepage;
    public static final UtmSource lab_by_game;
    public static final UtmSource live_game_widget;
    public static final UtmSource nearby_game;
    public static final UtmSource search_game;
    public static final UtmSource sf2020;
    public static final UtmSource sidebar_live_game;
    public static final UtmSource tag_game_live;
    public static final UtmSource today_see_mainpage;
    public static final UtmSource topictag_game_detail;
    public static final UtmSource topictag_game_search_keyword;
    public static final UtmSource topictag_game_search_recommend;
    public static final UtmSource video_game_widget;
    public static final UtmSource wonder_show_mainpage;

    static {
       UtmSource utmSource = new UtmSource("live_game_widget", 0, "live_game_widget", 26);
       UtmSource.live_game_widget = utmSource;
       UtmSource utmSource1 = new UtmSource("external", 1, "external", 31);
       UtmSource.external = utmSource1;
       UtmSource utmSource2 = new UtmSource("video_game_widget", 2, "video_game_widget", 27);
       UtmSource.video_game_widget = utmSource2;
       UtmSource utmSource3 = new UtmSource("nearby_game", 3, "nearby_game", 28);
       UtmSource.nearby_game = utmSource3;
       UtmSource utmSource4 = new UtmSource("search_game", 4, "search_game", 29);
       UtmSource.search_game = utmSource4;
       UtmSource utmSource5 = new UtmSource("sidebar_live_game", 5, "sidebar_live_game", 30);
       UtmSource.sidebar_live_game = utmSource5;
       UtmSource utmSource6 = new UtmSource("topictag_game_search_recommend", 6, "topictag_game_search_recommend", 39);
       UtmSource.topictag_game_search_recommend = utmSource6;
       UtmSource utmSource7 = new UtmSource("topictag_game_search_keyword", 7, "topictag_game_search_keyword", 40);
       UtmSource.topictag_game_search_keyword = utmSource7;
       UtmSource utmSource8 = new UtmSource("topictag_game_detail", 8, "topictag_game_detail", 41);
       UtmSource.topictag_game_detail = utmSource8;
       UtmSource utmSource9 = new UtmSource("game_subscribe_message", 9, "game_subscribe_message", 50);
       UtmSource.game_subscribe_message = utmSource9;
       UtmSource utmSource10 = new UtmSource("lab_by_game", 10, "lab_by_game", 53);
       UtmSource.lab_by_game = utmSource10;
       UtmSource utmSource11 = new UtmSource("gamelive_homepage", 11, "gamelive_homepage", 59);
       UtmSource.gamelive_homepage = utmSource11;
       UtmSource utmSource12 = utmSource11;
       UtmSource utmSource13 = new UtmSource("today_see_mainpage", 12, "today_see_mainpage", 59);
       UtmSource.today_see_mainpage = utmSource13;
       UtmSource utmSource14 = utmSource13;
       utmSource11 = new UtmSource("wonder_show_mainpage", 13, "wonder_show_mainpage", 59);
       UtmSource.wonder_show_mainpage = utmSource11;
       UtmSource utmSource15 = utmSource11;
       utmSource13 = new UtmSource("gameTv", 14, "gameTv", 96);
       UtmSource.gameTv = utmSource13;
       UtmSource utmSource16 = utmSource13;
       UtmSource utmSource17 = new UtmSource("sf2020", 15, "sf2020", 59);
       UtmSource.sf2020 = utmSource17;
       UtmSource utmSource18 = utmSource17;
       utmSource11 = new UtmSource("game_center_competition", 16, "game_center_competition", 106);
       UtmSource.game_center_competition = utmSource11;
       UtmSource utmSource19 = utmSource11;
       utmSource17 = new UtmSource("game_center_game_detail", 17, "game_center_game_detail", 115);
       UtmSource.game_center_game_detail = utmSource17;
       UtmSource utmSource20 = utmSource17;
       utmSource11 = new UtmSource("tag_game_live", 18, "tag_game_live", 148);
       UtmSource.tag_game_live = utmSource11;
       UtmSource utmSource21 = utmSource11;
       utmSource17 = new UtmSource("corona_game_banner", 19, "corona_game_banner", 168);
       UtmSource.corona_game_banner = utmSource17;
       UtmSource utmSource22 = utmSource17;
       utmSource11 = new UtmSource("corona_game_sub_channel", 20, "corona_game_sub_channel", 169);
       UtmSource.corona_game_sub_channel = utmSource11;
       UtmSource utmSource23 = utmSource11;
       utmSource17 = new UtmSource("GAMELIVE_TOP_ICON", 21, "GAMELIVE_TOP_ICON", 174);
       UtmSource.GAMELIVE_TOP_ICON = utmSource17;
       UtmSource utmSource24 = utmSource17;
       utmSource13 = new UtmSource("LIVEWATCH_PLAY_TOGETHER_TAB", 22, "LIVEWATCH_PLAY_TOGETHER_TAB", 174);
       UtmSource.LIVEWATCH_PLAY_TOGETHER_TAB = utmSource13;
       UtmSource utmSource25 = utmSource13;
       utmSource17 = new UtmSource("accompany_square_external", 23, "accompany_square_external", 174);
       UtmSource.accompany_square_external = utmSource17;
       UtmSource[] utmSourceArr = new UtmSource[24];
       utmSourceArr[0] = utmSource;
       utmSourceArr[1] = utmSource1;
       utmSourceArr[2] = utmSource2;
       utmSourceArr[3] = utmSource3;
       utmSourceArr[4] = utmSource4;
       utmSourceArr[5] = utmSource5;
       utmSourceArr[6] = utmSource6;
       utmSourceArr[7] = utmSource7;
       utmSourceArr[8] = utmSource8;
       utmSourceArr[9] = utmSource9;
       utmSourceArr[10] = utmSource10;
       utmSourceArr[11] = utmSource12;
       utmSourceArr[12] = utmSource14;
       utmSourceArr[13] = utmSource15;
       utmSourceArr[14] = utmSource16;
       utmSourceArr[15] = utmSource18;
       utmSourceArr[16] = utmSource19;
       utmSourceArr[17] = utmSource20;
       utmSourceArr[18] = utmSource21;
       utmSourceArr[19] = utmSource22;
       utmSourceArr[20] = utmSource23;
       utmSourceArr[21] = utmSource24;
       utmSourceArr[22] = utmSource25;
       utmSourceArr[23] = utmSource17;
       UtmSource.$VALUES = utmSourceArr;
    }
    public void UtmSource(String p0,int p1,String p2,int p3){
       super(p0, p1);
       this.mUtmSourceLabel = p2;
       this.mLiveSourceType = p3;
    }
    public static UtmSource fromText(String p0){
       object oobject;
       UtmSource[] obj = PatchProxy.applyOneRefs(p0, null, UtmSource.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = UtmSource.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return UtmSource.external;
          }
          oobject = obj[i];
          if (oobject.equalIgnorePrefix(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static UtmSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UtmSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UtmSource.class, p0);
    }
    public static UtmSource[] values(){
       Object obj = PatchProxy.apply(null, null, UtmSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UtmSource.$VALUES.clone();
    }
    public boolean equalIgnorePrefix(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UtmSource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.mUtmSourceLabel).equals(p0);
    }
    public int getLiveSourceType(){
       return this.mLiveSourceType;
    }
    public String getUtmSourceLabel(){
       return this.mUtmSourceLabel;
    }
}
