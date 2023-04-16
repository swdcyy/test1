package com.kwai.feature.component.entry.SearchSceneSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;

public final class SearchSceneSource extends Enum	// class@00120a
{
    public String mLogName;
    public int mPageSource;
    public String mVerticalScene;
    public static final SearchSceneSource[] $VALUES;
    public static final SearchSceneSource FEED_PAGE;
    public static final SearchSceneSource FIND_FRIEND;
    public static final SearchSceneSource GOODS_AFTER_TAKE_PICTURE;
    public static final SearchSceneSource GOODS_PAGE;
    public static final SearchSceneSource HISTORY_PAGE;
    public static final SearchSceneSource HYPERMARKET;
    public static final SearchSceneSource IMAGE_HASHTAG_PAGE;
    public static final SearchSceneSource IMAGE_PAGE;
    public static final SearchSceneSource IM_GROUP_PAGE;
    public static final SearchSceneSource KFLASH;
    public static final SearchSceneSource LIVESTREAM_HASHTAG_PAGE;
    public static final SearchSceneSource LIVE_STREAM;
    public static final SearchSceneSource LONG_VIDEO;
    public static final SearchSceneSource MUSIC_HASHTAG_PAGE;
    public static final SearchSceneSource MUSIC_LIBRARY;
    public static final SearchSceneSource MUSIC_PAGE;
    public static final SearchSceneSource MY_PROFILE;
    public static final SearchSceneSource NEARBY;
    public static final SearchSceneSource NEWEST;
    public static final SearchSceneSource POI;
    public static final SearchSceneSource PROFILE;
    public static final SearchSceneSource REMINDER_FRIEND;
    public static final SearchSceneSource TAG;
    public static final SearchSceneSource UNKNOWN;
    public static final SearchSceneSource USER_PAGE;

    static {
       SearchSceneSource searchSceneS = new SearchSceneSource("UNKNOWN", 0, 0, "", "");
       SearchSceneSource.UNKNOWN = v6;
       SearchSceneSource searchSceneS1 = new SearchSceneSource("TAG", 1, 1, "tag", "TAG_PAGE");
       SearchSceneSource.TAG = searchSceneS;
       SearchSceneSource searchSceneS2 = new SearchSceneSource("LIVE_STREAM", 2, 2, "live", "LIVE_SQUARE");
       SearchSceneSource.LIVE_STREAM = v1;
       searchSceneS1 = new SearchSceneSource("GOODS_PAGE", 3, 6, "goods", "GOODS_PAGE");
       SearchSceneSource.GOODS_PAGE = v2;
       searchSceneS2 = new SearchSceneSource("FEED_PAGE", 4, 7, "feed", "FEED_PAGE");
       SearchSceneSource.FEED_PAGE = v3;
       searchSceneS1 = new SearchSceneSource("USER_PAGE", 5, 8, "user", "USER_PAGE");
       SearchSceneSource.USER_PAGE = v4;
       searchSceneS2 = new SearchSceneSource("MUSIC_PAGE", 6, 9, "music", "MUSIC_PAGE");
       SearchSceneSource.MUSIC_PAGE = v5;
       searchSceneS1 = new SearchSceneSource("IMAGE_PAGE", 7, 10, "image", "IMAGE_PAGE");
       SearchSceneSource.IMAGE_PAGE = searchSceneS2;
       SearchSceneSource searchSceneS3 = new SearchSceneSource("IM_GROUP_PAGE", 8, 11, "imGroup", "IM_GROUP_PAGE");
       SearchSceneSource.IM_GROUP_PAGE = searchSceneS1;
       SearchSceneSource searchSceneS4 = new SearchSceneSource("NEARBY", 9, 12, "nearby", "NEARBY");
       SearchSceneSource.NEARBY = v8;
       searchSceneS3 = new SearchSceneSource("FIND_FRIEND", 10, 14, "findFriend", "FIND_FRIEND");
       SearchSceneSource.FIND_FRIEND = v9;
       searchSceneS4 = new SearchSceneSource("GOODS_AFTER_TAKE_PICTURE", 11, 15, "goodsTakePicture", "GOODS_TAKEPICTURE");
       SearchSceneSource.GOODS_AFTER_TAKE_PICTURE = v10;
       searchSceneS3 = new SearchSceneSource("LONG_VIDEO", 12, 16, "longVideo", "VERTICAL_LONG_VIDEO");
       SearchSceneSource.LONG_VIDEO = v11;
       searchSceneS4 = new SearchSceneSource("REMINDER_FRIEND", 13, 17, "reminderFriend", "REMINDER_FRIEND");
       SearchSceneSource.REMINDER_FRIEND = v12;
       searchSceneS3 = new SearchSceneSource("MUSIC_LIBRARY", 14, 18, "musicLibrary", "MUSIC_LIBRARY");
       SearchSceneSource.MUSIC_LIBRARY = searchSceneS4;
       SearchSceneSource searchSceneS5 = new SearchSceneSource("PROFILE", 15, 19, "profile", "PROFILE");
       SearchSceneSource.PROFILE = searchSceneS3;
       SearchSceneSource searchSceneS6 = new SearchSceneSource("KFLASH", 16, 20, "kFlash", "FLASH_INSIDE");
       SearchSceneSource.KFLASH = v15;
       searchSceneS5 = new SearchSceneSource("LIVESTREAM_HASHTAG_PAGE", 17, 22, "", "LIVESTREAM_HASHTAG_PAGE");
       SearchSceneSource.LIVESTREAM_HASHTAG_PAGE = v16;
       searchSceneS6 = new SearchSceneSource("MUSIC_HASHTAG_PAGE", 18, 23, "", "MUSIC_HASHTAG_PAGE");
       SearchSceneSource.MUSIC_HASHTAG_PAGE = v17;
       searchSceneS5 = new SearchSceneSource("IMAGE_HASHTAG_PAGE", 19, 24, "", "IMAGE_HASHTAG_PAGE");
       SearchSceneSource.IMAGE_HASHTAG_PAGE = v18;
       searchSceneS6 = new SearchSceneSource("HYPERMARKET", 20, 25, "hypermarket", "GOODS_PAGE");
       SearchSceneSource.HYPERMARKET = v19;
       searchSceneS5 = new SearchSceneSource("POI", 21, 26, "poi", "POI_SEARCH");
       SearchSceneSource.POI = searchSceneS6;
       SearchSceneSource searchSceneS7 = new SearchSceneSource("MY_PROFILE", 22, 27, "", "MY_PROFILE");
       SearchSceneSource.MY_PROFILE = searchSceneS5;
       SearchSceneSource searchSceneS8 = new SearchSceneSource("NEWEST", 23, 28, "newest", "NEWEST");
       SearchSceneSource.NEWEST = v22;
       searchSceneS7 = new SearchSceneSource("HISTORY_PAGE", 24, 29, "history", "RENCENT_BROWSE");
       SearchSceneSource.HISTORY_PAGE = v23;
       SearchSceneSource searchSceneS9 = v15;
       SearchSceneSource[] searchSceneS10 = new SearchSceneSource[25];
       searchSceneS10[0] = v6;
       searchSceneS10[1] = searchSceneS;
       searchSceneS10[2] = v1;
       searchSceneS10[3] = v2;
       searchSceneS10[4] = v3;
       searchSceneS10[5] = v4;
       searchSceneS10[6] = v5;
       searchSceneS10[7] = searchSceneS2;
       searchSceneS10[8] = searchSceneS1;
       searchSceneS10[9] = v8;
       searchSceneS10[10] = v9;
       searchSceneS10[11] = v10;
       searchSceneS10[12] = v11;
       searchSceneS10[13] = v12;
       searchSceneS10[14] = searchSceneS4;
       searchSceneS10[15] = searchSceneS3;
       searchSceneS10[16] = searchSceneS9;
       searchSceneS10[17] = v16;
       searchSceneS10[18] = v17;
       searchSceneS10[19] = v18;
       searchSceneS10[20] = v19;
       searchSceneS10[21] = searchSceneS6;
       searchSceneS10[22] = searchSceneS5;
       searchSceneS10[23] = v22;
       searchSceneS10[24] = v23;
       SearchSceneSource.$VALUES = searchSceneS10;
    }
    public void SearchSceneSource(String p0,int p1,int p2,String p3,String p4){
       super(p0, p1);
       this.mPageSource = p2;
       this.mVerticalScene = p3;
       this.mLogName = p4;
    }
    public static SearchSceneSource fromInt(int p0){
       SearchSceneSource[] obj;
       object oobject;
       SearchSceneSource searchSceneS = SearchSceneSource.class;
       if (PatchProxy.isSupport(searchSceneS)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, searchSceneS, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = SearchSceneSource.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return SearchSceneSource.UNKNOWN;
          }
          oobject = obj[i];
          if (oobject.mPageSource == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static SearchSceneSource fromString(String p0){
       object oobject;
       SearchSceneSource[] obj = PatchProxy.applyOneRefs(p0, null, SearchSceneSource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SearchSceneSource.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return SearchSceneSource.UNKNOWN;
          }
          oobject = obj[i];
          if ((oobject.mVerticalScene).equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static int fromStringToInt(String p0){
       object oobject;
       SearchSceneSource[] obj = PatchProxy.applyOneRefs(p0, null, SearchSceneSource.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = SearchSceneSource.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return SearchSceneSource.UNKNOWN.toInt();
          }
          oobject = obj[i];
          if ((oobject.mVerticalScene).equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject.toInt();
    }
    public static SearchSceneSource fromTabTypeToScenePage(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SearchSceneSource.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xc1722a7f:
             if (p0.equals("nearby")) {
                i = 0;
             }
             break;
           case 0xc17bfbe6:
             if (p0.equals("newest")) {
                i = 1;
             }
             break;
           case 0x1bf9a:
             if (p0.equals("tag")) {
                i = 2;
             }
             break;
           case 0x2fe59e:
             if (p0.equals("feed")) {
                i = 3;
             }
             break;
           case 0x36ebcb:
             if (p0.equals("user")) {
                i = 4;
             }
             break;
           case 0x5df9756:
             if (p0.equals("goods")) {
                i = 5;
             }
             break;
           case 0x5faa95b:
             if (p0.equals("image")) {
                i = 6;
             }
             break;
           case 0x636ee25:
             if (p0.equals("music")) {
                i = 7;
             }
             break;
           case 0x33e78b8c:
             if (p0.equals("liveStream")) {
                i = 8;
             }
             break;
           case 0x708c8fbb:
             if (p0.equals("imGroup")) {
                i = 9;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return SearchSceneSource.NEARBY;
           case 1:
             return SearchSceneSource.NEWEST;
           case 2:
             return SearchSceneSource.TAG;
           case 3:
             return SearchSceneSource.FEED_PAGE;
           case 4:
             return SearchSceneSource.USER_PAGE;
           case 5:
             return SearchSceneSource.GOODS_PAGE;
           case 6:
             return SearchSceneSource.IMAGE_PAGE;
           case 7:
             return SearchSceneSource.MUSIC_PAGE;
           case 8:
             return SearchSceneSource.LIVE_STREAM;
           case 9:
             return SearchSceneSource.IM_GROUP_PAGE;
           default:
             return SearchSceneSource.UNKNOWN;
       }
    }
    public static SearchSceneSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SearchSceneSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SearchSceneSource.class, p0);
    }
    public static SearchSceneSource[] values(){
       Object obj = PatchProxy.apply(null, null, SearchSceneSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SearchSceneSource.$VALUES.clone();
    }
    public int toInt(){
       return this.mPageSource;
    }
    public String toSceneString(){
       return this.mVerticalScene;
    }
}
