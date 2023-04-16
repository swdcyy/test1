package com.kuaishou.client.log.content.packages.nano.ContentWrapperEnumMapping;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class ContentWrapperEnumMapping	// class@00073f
{
    public static boolean mHasInited = true;

    public void ContentWrapperEnumMapping(){
       super();
    }
    public static synchronized String getContentWrapperEnumName(String p0,String p1,int p2){
       _monitor_enter(ContentWrapperEnumMapping.class);
       int hashCode = ContentWrapperEnumMapping.getHashCode(p0+"|"+p1+"|"+p2);
       switch (hashCode){
           case 0x9347c161:
             _monitor_exit(ContentWrapperEnumMapping.class);
             return "UNKNOWN4";
           case 0x9347c162:
             _monitor_exit(ContentWrapperEnumMapping.class);
             return "VOICE_PARTY_END2";
           case 0x9347c163:
             _monitor_exit(ContentWrapperEnumMapping.class);
             return "LEAVE_KTV";
           case 0x9347c164:
             _monitor_exit(ContentWrapperEnumMapping.class);
             return "LEAVE_LIVE3";
           default:
             switch (hashCode){
                 case 0x96ce9ac2:
                   _monitor_exit(ContentWrapperEnumMapping.class);
                   return "UNKNOWN3";
                 case 0x96ce9ac3:
                   _monitor_exit(ContentWrapperEnumMapping.class);
                   return "BGM_END";
                 case 0x96ce9ac4:
                   _monitor_exit(ContentWrapperEnumMapping.class);
                   return "PLAY_NEXT";
                 case 0x96ce9ac5:
                   _monitor_exit(ContentWrapperEnumMapping.class);
                   return "NO_HEARTBEAT";
                 case 0x96ce9ac6:
                   _monitor_exit(ContentWrapperEnumMapping.class);
                   return "LEAVE_LIVE2";
                 case 0x96ce9ac7:
                   _monitor_exit(ContentWrapperEnumMapping.class);
                   return "LEAVE_KTV1";
                 case 0x96ce9ac8:
                   _monitor_exit(ContentWrapperEnumMapping.class);
                   return "VOICE_PARTY_END3";
                 case 0x96ce9ac9:
                   _monitor_exit(ContentWrapperEnumMapping.class);
                   return "PLAY_OTHER_PLAYER1";
                 default:
                   switch (hashCode){
                       case 0x9b1e53ce:
                         _monitor_exit(ContentWrapperEnumMapping.class);
                         return "UNKNOWN1";
                       case 0x9b1e53cf:
                         _monitor_exit(ContentWrapperEnumMapping.class);
                         return "INVITER";
                       case 0x9b1e53d0:
                         _monitor_exit(ContentWrapperEnumMapping.class);
                         return "INVITEE";
                       default:
                         switch (hashCode){
                             case 0x9b55716c:
                               _monitor_exit(ContentWrapperEnumMapping.class);
                               return "UNKNOWN1";
                             case 0x9b55716d:
                               _monitor_exit(ContentWrapperEnumMapping.class);
                               return "PHOTO_LIKE";
                             case 0x9b55716e:
                               _monitor_exit(ContentWrapperEnumMapping.class);
                               return "FOLLOW";
                             case 0x9b55716f:
                               _monitor_exit(ContentWrapperEnumMapping.class);
                               return "MOMENT";
                             case 0x9b557170:
                               _monitor_exit(ContentWrapperEnumMapping.class);
                               return "RECOMMEND";
                             case 0x9b557171:
                               _monitor_exit(ContentWrapperEnumMapping.class);
                               return "USER_RECOMMEND";
                             case 0x9b557172:
                               _monitor_exit(ContentWrapperEnumMapping.class);
                               return "COMMENT";
                             case 0x9b557173:
                               _monitor_exit(ContentWrapperEnumMapping.class);
                               return "INTEREST_PHOTO";
                             case 0x9b557174:
                               _monitor_exit(ContentWrapperEnumMapping.class);
                               return "PHOTO_SHARE";
                             default:
                               switch (hashCode){
                                   case 0xa00790de:
                                     _monitor_exit(ContentWrapperEnumMapping.class);
                                     return "UNKNOWN1";
                                   case 0xa00790df:
                                     _monitor_exit(ContentWrapperEnumMapping.class);
                                     return "LIKE_TAB";
                                   case 0xa00790e0:
                                     _monitor_exit(ContentWrapperEnumMapping.class);
                                     return "MY_TAB";
                                   default:
                                     switch (hashCode){
                                         case 0xa39be42c:
                                           _monitor_exit(ContentWrapperEnumMapping.class);
                                           return "UNKNOWN4";
                                         case 0xa39be42d:
                                           _monitor_exit(ContentWrapperEnumMapping.class);
                                           return "USER_PLAY";
                                         case 0xa39be42e:
                                           _monitor_exit(ContentWrapperEnumMapping.class);
                                           return "USER_PAUSE";
                                         default:
                                           switch (hashCode){
                                               case 0xa483aaf5:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKONWN1";
                                               case 0xa483aaf6:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "USER";
                                               case 0xa483aaf7:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MUSIC_TAG";
                                               case 0xa483aaf8:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "TOPIC_TAG";
                                               case 0xa483aaf9:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "POI_TAG";
                                               case 0xa483aafa:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MAGIC_FACE_TAG";
                                               case 0xa483aafb:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MUSIC";
                                               case 0xa483aafc:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PHOTO";
                                               case 0xa483aafd:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LIVE_STREAM";
                                               case 0xa483aafe:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "GIF_STICKER";
                                               case 0xb4f83d6f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKONWN2";
                                               case 0xb4f83d70:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "RECOMMEND";
                                               case 0xb4f83d71:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "SEARCH";
                                               case 0xb4f83d72:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ASSOCIATIVE_WORD";
                                               case 0xb4f83d73:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "TRENDING_WORD";
                                               case 0xb4f83d74:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "SEARCH_PUSH";
                                               case 0xb4f83d75:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "SEARCH_SILENT";
                                               case 0xb4f83d76:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "SEARCH_GUESS";
                                               case 0xb4f83d77:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "SEARCH_HISTORY";
                                               case 0xb60d9939:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN";
                                               case 0xb60d993a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ANCHOR";
                                               case 0xb60d993b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "AUDIENCE";
                                               case 0xb60d993c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "GUEST";
                                               case 0xb60d993d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "SINGER";
                                               case 0xb9851d67:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN";
                                               case 0xb9851d68:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "NORMAL";
                                               case 0xb9851d69:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "VOICE_PARTY";
                                               case 0xc079f76f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN1";
                                               case 0xc079f770:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "FRIEND";
                                               case 0xc079f771:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "FOLLOWED";
                                               case 0xc079f772:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "FOLLOWING";
                                               case 0xc1440585:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN1";
                                               case 0xc1440586:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "HORIZONTAL";
                                               case 0xc1440587:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "VERTICAL";
                                               case 0xc1440588:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PHOTO_MOVIE";
                                               case 0xc33d0388:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN2";
                                               case 0xc33d0389:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LIKE";
                                               case 0xc33d038a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNLIKE";
                                               case 0xc405ea29:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN";
                                               case 0xc405ea2a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "FRIEND";
                                               case 0xc405ea2b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "RANDOM";
                                               case 0xcc9405ec:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "JOIN_PK_TEAM";
                                               case 0xcc9405ed:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "SWITCH_VOICE_PARTY_TYPE";
                                               case 0xd0e2315d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "FALSE";
                                               case 0xd0e2315e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "TRUE";
                                               case 0xd869c211:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN1";
                                               case 0xd869c212:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PHOTO";
                                               case 0xd869c213:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LIVE_STREAM";
                                               case 0xd869c214:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MOMENT";
                                               case 0xd869c215:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ARTICLE";
                                               case 0xd869c216:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "IMAGE";
                                               case 0xd869c217:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ATLAS";
                                               case 0xd869c218:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "APPLET";
                                               case 0xd869c219:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PANORAMIC";
                                               case 0xd869c21a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MOOD";
                                               case 0xdb26c77b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN";
                                               case 0xdb26c77c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ACTIVE";
                                               case 0xdb26c77d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "INACTIVE";
                                               case 0xdb26c77e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "BACKGROUND";
                                               case 0xe03a0c8d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NATION_RANK_LIVE";
                                               case 0xe03a0c8e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SQUARE_RESOURCE_LOCATION";
                                               case 0xe03a0c8f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEBULA_GOLD_LIVE_SQUARE_AGGREGATE_PAGE";
                                               case 0xe03a0c90:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEBULA_HOT_PUSH";
                                               case 0xe03a0c91:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_HOT_PREVIEW_LIVE";
                                               case 0xe03a0c92:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_BROADCAST_PUSH";
                                               case 0xe03a0c93:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAME_CENTER_COMPETITION";
                                               case 0xe03a0c94:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY_LOCAL_TV";
                                               case 0xe03a0c95:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_PK_RANK_GAME_OPPONENT";
                                               case 0xe03a0c96:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_PK_RANK_GAME_THIS_WEEK_LIST";
                                               case 0xe03a0cac:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_PK_RANK_GAME_WINNING_STREAK_LIST";
                                               case 0xe03a0cad:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_PK_RANK_GAME_PREWEEK_TOP_LIST";
                                               case 0xe03a0cae:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEBULA_HOT_TIPS";
                                               case 0xe03a0caf:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MORE_SQUARE_SEARCH";
                                               case 0xe03a0cb0:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SEARCH_ALADDIN_MORE";
                                               case 0xe03a0cb1:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEW_GAME_CENTER_DETAIL";
                                               case 0xe03a0cb2:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MUSIC_STATION_HOME";
                                               case 0xe03a0cb3:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MUSIC_TAG_V1";
                                               case 0xe03a0cb4:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MUSIC_TAG_V2";
                                               case 0xe03a0cb5:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "TEXT_MUSIC_TAG";
                                               case 0xe03a0ccb:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "FREQUENTLY_VISITED_AUTHOR";
                                               case 0xe03a0ccc:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_AUTO_PROFILE";
                                               case 0xe03a0ccd:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_ASSISTANT_LIVE_PUSH";
                                               case 0xe03a0cce:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LIVE_FRONT";
                                               case 0xe03a0ccf:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "RIGHT_HEAD_OF_AUTHOR";
                                               case 0xe03a0cd0:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_TOPIC_HOMEPAGE_AVATAR";
                                               case 0xe03a0cd1:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_TOPIC_DETAIL_AVATAR";
                                               case 0xe03a0cd2:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GIFT_HINT";
                                               case 0xe03a0cd3:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GUARDIAN_HEAD";
                                               case 0xe03a0cd4:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_BOTTOM_SIDEBAR_FEATURED";
                                               case 0xe03a0cea:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FEATURED_PREVIEW";
                                               case 0xe03a0ceb:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_ONLINE_USER_PROFILE_CARD";
                                               case 0xe03a0cec:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_WEEK_RANK_PROFILE_CARD";
                                               case 0xe03a0ced:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KUAIXIANG_CONVENIENCE";
                                               case 0xe03a0cee:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_ORDER_CALENDAR";
                                               case 0xe03a0cef:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_ORDER_PRIVATE_LETTER";
                                               case 0xe03a0cf0:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_BOTTOM_SIDEBAR_FEATURED_SINGLE_LINE";
                                               case 0xe03a0cf1:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_BOTTOM_SIDEBAR_FEATURED_SINGLE_LINE_AVATAR";
                                               case 0xe03a0cf2:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_BOTTOM_SIDEBAR_FEATURED_DOUBLE_LINE_AVATAR";
                                               case 0xe03a0cf3:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_FREQUENTLY_VISITED";
                                               case 0xe03a0d09:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_HOT_PREVIEW_LIVE_RECO";
                                               case 0xe03a0d0a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_HOT_LIVE";
                                               case 0xe03a0d0b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_ORDER_PLC";
                                               case 0xe03a0d0c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_ORDER_PUSH";
                                               case 0xe03a0d0d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "NEW_LIVE_MORE_SQUARE_AVATAR";
                                               case 0xe03a0d0e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_SHOT_MESSAGE";
                                               case 0xe03a0d0f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_GIFT_EXPIRE_SHOT_MESSAGE";
                                               case 0xe03a0d10:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_SPLASH_AD";
                                               case 0xe03a0d11:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_TAG_GAME_LIVE";
                                               case 0xe03a0d12:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SQUARE_RESOURCE_DISTRICT_RANK";
                                               case 0xe03a0d28:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_BUSINESS_RANK_LIVE";
                                               case 0xe03a0d29:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_ONLINE";
                                               case 0xe03a0d2a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MENU_KWAISHOP_HOMEPAGE";
                                               case 0xe03a0d2b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_TIME_TAB";
                                               case 0xe03a0d2c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_SQUARE_SLIDE_UPDOWN";
                                               case 0xe03a0d2d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_WATCH_NO_MORE_LIVE_POP_LIVE_CARD";
                                               case 0xe03a0d2e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_WATCH_NO_MORE_LIVE_POP_BUTTON";
                                               case 0xe03a0d2f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_EXIT_LIVE_WATCH_RECOMMENDED_LIVE_CARD";
                                               case 0xe03a0d30:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_EXIT_LIVE_WATCH_RECOMMENDED_LIVE_AUTHOR_OVERT";
                                               case 0xe03a0d31:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_WATCH_NO_MORE_LIVE_POP_AUTHOR_OVERT";
                                               case 0xe03a0d47:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KSNEBULA_COIN_CONTROL_MODULE";
                                               case 0xe03a0d48:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KSNEBULA_COIN_TASK_CARD";
                                               case 0xe03a0d49:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_BUSINESS_COIN_TASK_CENTER";
                                               case 0xe03a0d4a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_HOT_CHANNEL_KWAISHOP_HOMEPAGE";
                                               case 0xe03a0d4b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_TOP_NAVIGATION_KWAISHOP_HOMEPAGE";
                                               case 0xe03a0d4c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_TABBAR_NEARBY_CHANNEL_KWAISHOP_HOMEPAGE";
                                               case 0xe03a0d4d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_CHANNEL_PAGE_KWAISHOP_HOMEPAGE";
                                               case 0xe03a0d4e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_CLOSE_FROM_ANCHOR_LIVE_ENTER_OTHER_LIVE";
                                               case 0xe03a0d4f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_CORONA_GAME_BANNER";
                                               case 0xe03a0d50:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_CORONA_GAME_SUB_CHANNEL";
                                               case 0xe03a0d66:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_ACTIVITY_RED_PACKET_RAIN";
                                               case 0xe03a0d67:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_PK_ADVERSARY_SCREEN";
                                               case 0xe03a0d68:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_ONLINE_ADVERSARY_SCREEN";
                                               case 0xe03a0d69:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_SEND_RED_PACKET_HEAD_BUTTON";
                                               case 0xe03a0d6a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_ACCOMPANY_SQUARE";
                                               case 0xe03a0d6b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_RECEIVE_RED_PACKET_RECOMMEND_LIST";
                                               case 0xe03a0d6c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FIND_VERTICAL_FIELD_FEED_CARD";
                                               case 0xe03a0d6d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY_FEED_CARD";
                                               case 0xe03a0d6e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FIND_FEED_CARD";
                                               case 0xe03a0d6f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GLOBAL_LIVE_ROOM";
                                               case 0xe03a0d85:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_LIVE_PLAY_TOGETHER_TAB";
                                               case 0xe03a0d86:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_PAY_SUCCESS_LAOTIE";
                                               case 0xe03a0d87:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_BUSINESS_COIN_LAOTIE";
                                               case 0xe03a0d88:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NAVIGATION_MODULE_CARD";
                                               case 0xe03a0d89:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MORE_MODULE_CARD";
                                               case 0xe03a0d8a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_BUYER_HOME_NEWBUYER_COUPON";
                                               case 0xe03a0d8b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_THANOS_FIND_FEATURED_RECO_CARD";
                                               case 0xe03a0d8c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LIVE_PREVIEW_UN_BEAUTIFUL_TIME";
                                               case 0xe03a0d8d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_WATCH_TOPIC_CIRCLE_PANEL";
                                               case 0xe03a0d8e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_EXPLORE_CARD";
                                               case 0xe03a0da4:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FRIENDS";
                                               case 0xe03a0da5:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_MARCHANT_MORECATEGORY";
                                               case 0xe03a0da6:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_LABOR_DAY_COLLECT_CARD";
                                               case 0xe03a0da7:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_APPEARANCE_HOURLY_RANK";
                                               case 0xe03a0da8:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY_TOP_RANK_LIVE";
                                               case 0xe03a0da9:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_COMMON_NOTIFICATION_SHOW";
                                               case 0xe03a0daa:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_DSP_FEED_AD";
                                               case 0xe03a0dab:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEWS_FEED";
                                               case 0xe03a0dac:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_GOLDEN_HOURLY_RANK";
                                               case 0xe03a0dad:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_WATCH_TOPIC_CIRCLE_PANEL_REFEREAL_AUCHOR";
                                               case 0xe03a104e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_LIVE_TRUST_CARD_BANNER_COUPON";
                                               case 0xe03a104f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_ESHOP_SHOPPING_DAY";
                                               case 0xe03a1050:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_AWARD_VIDEO_AD";
                                               case 0xe03a1051:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_EXPLORE_LIVE";
                                               case 0xe03a1052:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LIVE_PREVIEW_MERCHANT_COUPON_EXPLAIN";
                                               case 0xe03a1053:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_TO_AGGREGATION_LIVE_CARD";
                                               case 0xe03a1054:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_EXPLORE_POPULAR_DIVERSION_POSITION";
                                               case 0xe03a1055:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_VOICE_PARTY_LIST_FIND";
                                               case 0xe03a1056:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_VOICE_PARTY_LIST_FILM_FIND";
                                               case 0xe03a1057:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MOMENT_LIVE";
                                               case 0xe03a106d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_ESHOP_CENT_LOTTERY";
                                               case 0xe03a106e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_FVA_USER_RECOMMEND";
                                               case 0xe03a106f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_ESHOP_OLYMPICS";
                                               case 0xe03a1070:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_TRUST_CHANNEL";
                                               case 0xe03a1071:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_OLYMPICS_TASK_NEWBUYER";
                                               case 0xe03a1072:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_OLYMPICS_WALLET_SEARCH";
                                               case 0xe03a1073:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_OLYMPICS_NEWBUYER_COUPON";
                                               case 0xe03a1074:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_GROUP_CHAT_NOTICE";
                                               case 0xe03a1075:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FIND_LIVE_TAB_HOURLY_RANK";
                                               case 0xe03a1076:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FIND_LIVE_TAB_OWN_LIVE";
                                               case 0xe03a108c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_OLYMIC_H5_HOMEPAGE_FIND_WATCH";
                                               case 0xe03a108d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "SOCIAL_GROUP_CHAT_MESSAGE_DETAIL_SHOW_PHOTO";
                                               case 0xe03a108e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "SOCIAL_MY_PROFILE";
                                               case 0xe03a108f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "FIND_CHANNEL_AUTHOR_COLUMN_LIVE_CARD";
                                               case 0xe03a1090:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SINGLE_LINE_PHOTO_FEED_USER_AVATAR_RIGHT_BAR";
                                               case 0xe03a1091:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SINGLE_LINE_PHOTO_FEED_USER_AVATAR_BOTTOM_BAR";
                                               case 0xe03a1092:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SINGLE_LINE_PHOTO_FEED_SIDEBAR_SHOW_PHOTO";
                                               case 0xe03a1093:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FIND_VOICE_PARTY_ONE_CLICK";
                                               case 0xe03a1094:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_VOICE_PARTY_ONE_CLICK";
                                               case 0xe03a1095:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_QIXI_ACTIVITY_RED_PACKET";
                                               case 0xe03a10ab:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_SUPER_DIVERSION_POSITION_GIFT";
                                               case 0xe03a10ac:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GZONE_LIVE_HOUR_RANK";
                                               case 0xe03a10ad:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_QIXI_FEED";
                                               case 0xe03a10ae:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_INTERSTITIAL_AD";
                                               case 0xe03a10af:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY_VOICE_PARTY_ONE_CLICK";
                                               case 0xe03a10b0:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GZONE_LIVE_KSHELL_RANK";
                                               case 0xe03a10b1:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_BET_SQUARE";
                                               case 0xe03a10b2:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_PROFILE_BACKGROUD";
                                               case 0xe03a10b3:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_ACTIVITY_SUPER_FANS_GROUP_PAGE";
                                               case 0xe03a10b4:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SINGLE_LINE_PHOTO_FEED_AT_FRIEND";
                                               case 0xe03a10ca:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_POPULARITY_RANK_LIVE";
                                               case 0xe03a10cb:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_ACTIVITY_SUPER_AUTHOR_CHALLENGE_PAGE";
                                               case 0xe03a10cc:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_EXIT_LIVE_WATCH_RECOMMENDED_LIVE_SEE_NOW";
                                               case 0xe03a10cd:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KSNEBULA_COIN_TASK_LIST_WATCH_LIVE";
                                               case 0xe03a10ce:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KSNEBULA_COIN_TASK_LIST_SEND_LIVE_GIFTS";
                                               case 0xe03a10cf:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_DOUBLE_ELEVEN_LIVE_COMMODITY";
                                               case 0xe03a10d0:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_DOUBLE_ELEVEN_RECOMMEND";
                                               case 0xe03a10d1:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_DOUBLE_ELEVEN_SUB_LIVE_COMMODITY";
                                               case 0xe03a10d2:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_DOUBLE_ELEVEN_COUPON_LIVE";
                                               case 0xe03a10d3:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_SHUANGSHIYI_ACTIVITY_RED_PACKET";
                                               case 0xe03a10e9:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_DOUBLE_ELEVEN_OPERATE_RECOMMEND";
                                               case 0xe03a10ea:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_MERCHANT_ANCHOR_RECOMMEND";
                                               case 0xe03a10eb:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_MERCHANT_ANCHOR_RECOMMEND_LIVE";
                                               case 0xe03a10ec:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KS_COIN_TASK_LIST_WATCH_LIVE";
                                               case 0xe03a10ed:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KS_COIN_TASK_LIST_SEND_LIVE_GIFTS";
                                               case 0xe03a10ee:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SPECIAL_FOLLOW_WIDGET_POPUP";
                                               case 0xe03a10ef:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAI_ACTIVE_PENDANT_USER_HEAD";
                                               case 0xe03a10f0:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_NIANDUSHENGDIAIN_ACTIVITY_RED_PACKET";
                                               case 0xe03a10f1:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_ACTIVITY_CHUNJIE_CONTENT_RECO_LIVE_HEAD";
                                               case 0xe03a10f2:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_ACTIVITY_CHUNJIE_CONTENT_TRAILER_HEAD";
                                               case 0xe03a1108:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_ACTIVITY_CHUNJIE_CONTENT_HOT_CARD";
                                               case 0xe03a1109:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_BUCKCAR_LIVE_CARD";
                                               case 0xe03a110a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_BUCKCAR_ENTER_LIVE_BUTTON";
                                               case 0xe03a110b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_TAKE_A_SHOT";
                                               case 0xe03a110c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY_MAP_LIVE";
                                               case 0xe03a110d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY_MAP_HOT";
                                               case 0xe03a110e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_NIANDUSHENGDIAIN_ACTIVITY_HOT_CRAD";
                                               case 0xe03a110f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_NIANDUSHENGDIAIN_ACTIVITY_LIVE_CARD";
                                               case 0xe03a1110:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_NIANDUSHENGDIAIN_ACTIVITY_HOT_WORD";
                                               case 0xe03a1111:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_ACTIVITY_HOMEPAGE_H5_TEMPORARY_ENTRANCE";
                                               case 0xe03a1127:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_OP_ACTIVITY_MAIN_PAGE_BANNER";
                                               case 0xe03a1128:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_CNY_TASK_RECHANGE";
                                               case 0xe03a1129:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_CNY_WARM_UP";
                                               case 0xe03a112a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_CNY_TASK_FANSGROUP";
                                               case 0xe03a112b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_CNY_TASK_WISH";
                                               case 0xe03a112c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MY_PROFILE_WISH_ENTER";
                                               case 0xe03a112d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY_POST_GROUP";
                                               case 0xe03a112e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_ESP_MOBILE_H5";
                                               case 0xe03a112f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_PREVIEW";
                                               case 0xe03a1130:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_CNY_WISH_ROOM_NOTIFICATIONS";
                                               case 0xe03a1146:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_HOURLY_RANK_TOP_AUTHOR";
                                               case 0xe03a1147:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEWS_SLIDE";
                                               case 0xe03a1148:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_TV_STATION";
                                               case 0xe03a1149:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOWING_LIST_HEAD";
                                               case 0xe03a114a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SINGLE_LINE_PHOTO_FEED_USER_AVATAR_RIGHT_BAR_GREAT_VIDEO";
                                               case 0xe03a114b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SINGLE_LINE_PHOTO_FEED_USER_AVATAR_BOTTOM_BAR_GREAT_VIDEO";
                                               case 0xe03a114c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SINGLE_LINE_PHOTO_FEED_SIDEBAR_SHOW_PHOTO_GREAT_VIDEO";
                                               case 0xe03a114d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_MEMBER_MANAGEMENT_LIST_HEAD";
                                               case 0xe03a114e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SEARCH_LIST_LIVE";
                                               case 0xe03a114f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SEARCH_LIST_SHOP";
                                               case 0xe03a1165:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LIVE_VOICE_PARTY_GUIDE_MIC";
                                               case 0xe03a1166:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_MAGIC_BOX_PANEL_BANNER_RECO_LIVE_STREAM";
                                               case 0xe03a1167:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_MAGIC_BOX_PANEL_BANNER_RECO_CARD_ITEM";
                                               case 0xe03a1168:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KISS_GIFT_H5_HEAD";
                                               case 0xe03a1169:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_MAGIC_BOX_TIME_RANK_ITEM";
                                               case 0xe03a116a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_MAGIC_BOX_PANEL_PVP_BANNER";
                                               case 0xe03a116b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_INTERACTIVEGAME_TV";
                                               case 0xe03a116c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MERCHANT_CS_CRM";
                                               case 0xe03a116d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_ALLIANCE_PROFILE";
                                               case 0xe03a116e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MERCHANT_GOODS_LIST_ITEM";
                                               case 0xe03a140f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEAABY_PREVIEW";
                                               case 0xe03a1410:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_PREVIEW_SECOND";
                                               case 0xe03a1411:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KSNEBULA_COIN_EXCHANGE_POPUP";
                                               case 0xe03a1412:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KSNEBULA_GOLD_COIN_EXCHANGE_LIST";
                                               case 0xe03a1413:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_MULTI_PK";
                                               case 0xe03a1414:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_AD_WATCH_LIST_DETAIL";
                                               case 0xe03a1415:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_PUSH";
                                               case 0xe03a1416:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KSNEBULA_COIN_TASK_SPEED_CARD";
                                               case 0xe03a1417:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LVIE_BLIND_DATA_WRITE_RESULT_PAGE_BUTTON";
                                               case 0xe03a1418:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_WISH_LIVE_WISH_POPUP";
                                               case 0xe03a142e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_DELIVERY_JOB_LIVE_AVATAR";
                                               case 0xe03a142f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MERCHANT_BUYER_MALL_TAB";
                                               case 0xe03a1430:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_DP_CHANEL";
                                               case 0xe03a1431:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MERCHANT_LXJ_AVATAR";
                                               case 0xe03a1432:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MERCHANT_LXJ_DETAIL_AVATAR";
                                               case 0xe03a1433:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SIMPLE_BOTTOM_EXPENTION";
                                               case 0xe03a1434:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_HOTSPOT_DETAIL";
                                               case 0xe03a1435:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_POI_DETAIL_LIVE_MODULE";
                                               case 0xe03a1436:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_HOURLY_RANK_CITY_LIVE";
                                               case 0xe03a1437:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_AND_HONGMENG_CARD_H5_ENTRY";
                                               case 0xe03a144d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_POST_RANK";
                                               case 0xe03a144e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_KWAISHOP_RECO";
                                               case 0xe03a144f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_BROADCAST_GIFT_HIGH_VALUE";
                                               case 0xe03a1450:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_COMMENT_NOTICE";
                                               case 0xe03a1451:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_HOT_INSIDE_FEED_PREVIEW_LIVE";
                                               case 0xe03a1452:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_HOT_SEARCH_KBOX_CARD_LIVE";
                                               case 0xe03a1453:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_HOT_SINGLE_AGGR_CARD_LIVE";
                                               case 0xe03a1454:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FIND_CARD_USER_AVATAR";
                                               case 0xe03a1455:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LITE_SIDE_LIVE_CARD";
                                               case 0xe03a1456:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LITE_SIDE_RETURN";
                                               case 0xe03a146c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GRABCARD_AUTO_ENTER_ACTIVITY_LIVE";
                                               case 0xe03a146d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_ANCHOR_ENDPAGE_RECO_LIVE";
                                               case 0xe03a146e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_MASK_MORE_LIVE";
                                               case 0xe03a146f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_2023_4TAB";
                                               case 0xe03a1470:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_PROFILE_FANGCHAN_CARD";
                                               case 0xe03a1471:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FANGCHAN_MARKET_ACTIVITY_PAGE";
                                               case 0xe03a1472:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_XTAB_LIFE_CARD_LIVING_PHOTO";
                                               case 0xe03a1473:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_HOTSPOT_PREVIEW_LIVE";
                                               case 0xe03a1474:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY_MAP_LIVE_VOICE";
                                               case 0xe03a1475:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_RESERVE_STICKER";
                                               case 0xe03a148b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_TV_STATION_CARD";
                                               case 0xe03a148c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_COIN_TASK_GANDI_CARD";
                                               case 0xe03a148d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_HOT_LIVE_CHANNEL_PREVIEW";
                                               case 0xe03a148e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SCHOOL_MAP";
                                               case 0xebf1b3fa:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "CREATIVITY";
                                               case 0xebf1b3fb:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MOMENT";
                                               case 0xebf1b3fc:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PERSONAL_CHAT";
                                               case 0xebf1b3fd:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "GROUP_CHAT";
                                               case 0xebf1b3fe:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PUBLIC_GROUP_CHAT";
                                               case 0xf522409e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ARYA_BROADCAST";
                                               case 0xf522409f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PERSISTENT_CONNECTION";
                                               case 0xf752dd6d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN6";
                                               case 0xf752dd6e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "NORMAL_MIC";
                                               case 0xf752dd6f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LOCKED_MIC";
                                               case 0xf752dd70:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MUTED_MIC";
                                               case 0xfd4f0275:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN2";
                                               case 0xfd4f0276:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "VOICE_PARTY_END1";
                                               case 0xfd4f0277:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LEAVE_LIVE1";
                                               case 0xfe48fe96:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN4";
                                               case 0xfe48fe97:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "VIDEO";
                                               case 0xfe48fe98:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PICTURE";
                                               case 0x631fbf6:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN";
                                               case 0x631fbf7:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "HORIZONTAL";
                                               case 0x631fbf8:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "VERTICAL";
                                               case 0x631fbf9:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "SINGLE";
                                               case 0xd1c823f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LIVE_PUSH";
                                               case 0xd1c8240:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LIVE_COVER";
                                               case 0x18421e7e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN3";
                                               case 0x18421e7f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "COMMON";
                                               case 0x18421e80:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PANORAMIC_PHOTO";
                                               case 0x1c3445cc:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_UNKNOWN";
                                               case 0x1c3445cd:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FEED";
                                               case 0x1c3445ce:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_PUSH";
                                               case 0x1c3445cf:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_SUBSCRIPTION";
                                               case 0x1c3445d0:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW";
                                               case 0x1c3445d1:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_HOT";
                                               case 0x1c3445d2:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY";
                                               case 0x1c3445d3:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY_ROAMING";
                                               case 0x1c3445d4:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SHARE";
                                               case 0x1c3445d5:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_PK";
                                               case 0x1f12f558:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN";
                                               case 0x1f12f559:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "WHOLE";
                                               case 0x1f12f55a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "HOT_CLIP";
                                               case 0x22350e5e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN2";
                                               case 0x22350e5f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MANUAL_END";
                                               case 0x22350e60:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LIVE_END";
                                               case 0x22350e61:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "CANCEL_INVITATION";
                                               case 0x22350e62:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "REJECT_INVITATION";
                                               case 0x22350e63:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "CONNECT_TIMEOUT";
                                               case 0x22350e64:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ESTABLISH_TIMEOUT";
                                               case 0x22350e65:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ARYA_STOP";
                                               case 0x22350e66:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PEER_LIVE_END";
                                               case 0x22350e67:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PEER_MANUAL_END";
                                               case 0x246cbdb1:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PEER_HEARTBEAT_TIMEOUT";
                                               case 0x246cbdb2:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PEER_REJECT_INVITATION";
                                               case 0x246cbdb3:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PEER_TIMEOUT";
                                               case 0x246cbdb4:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ACCEPT_REQUEST_FAILED";
                                               case 0x246cbdb5:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "READY_REQEUST_FAILED";
                                               case 0x29f4f075:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "NONE";
                                               case 0x29f4f076:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "NAME";
                                               case 0x29f4f077:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "VIP";
                                               case 0x2cd0a4a4:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN5";
                                               case 0x2cd0a4a5:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "GUEST_APPLY_MANUAL_ACCEPT";
                                               case 0x2cd0a4a6:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "GUEST_APPLY_AUTO_ACCEPT";
                                               case 0x2cd0a4a7:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ANCHOR_MANUAL_INVITE";
                                               case 0x2cd0a4a8:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ANCHOR_AUTO_INVITE";
                                               case 0x2cd0a4a9:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "KTV_STAGE";
                                               case 0x2cd0a4aa:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MANUAL_MIC";
                                               case 0x2cd0a4ab:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "AUTO_MIC";
                                               case 0x2cd0a4ac:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "CLICK_EMPTY_MIC";
                                               case 0x2cd0a4ad:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MANUAL_INVITE";
                                               case 0x3c5b652b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN2";
                                               case 0x3c5b652c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LONG_ARTICLE";
                                               case 0x451ce67d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LYRICS_UNKNOWN";
                                               case 0x451ce67e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LYRICS_EXIST";
                                               case 0x451ce67f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LYRICS_NONE";
                                               case 0x488b5d99:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN1";
                                               case 0x488b5d9a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "FRIEND";
                                               case 0x488b5d9b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "FOLLOWED";
                                               case 0x488b5d9c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "FOLLOWING";
                                               case 0x488b5d9d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MYSELF";
                                               case 0x488b5d9e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "STRANGER";
                                               case 0x488b5d9f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PYML";
                                               case 0x654cd198:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN7";
                                               case 0x654cd199:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ONLINE_AUDIENCE_LIST";
                                               case 0x654cd19a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "SEARCH";
                                               case 0x654cd19b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PERSONAL_CARD";
                                               case 0x6a547403:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_WEB";
                                               case 0x6a547404:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SMALL_PROGRAM";
                                               case 0x6a547405:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FANS_TOP";
                                               case 0x6a547406:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_PRIVATE_MESSAGE";
                                               case 0x6a547407:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_BROADCAST_GIFT";
                                               case 0x6a547408:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_BROADCAST_GIFT_RED_PACKAGE";
                                               case 0x6a547409:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_PROFILE";
                                               case 0x6a54740a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_PROFILE_CARD";
                                               case 0x6a54740b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_CLOSE_PAGE";
                                               case 0x6a54740c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_MUSIC_STATION_CAPTION";
                                               case 0x6a547422:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_PROFILE_LIKE";
                                               case 0x6a547423:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FEED_DETAIL_USER_AVATAR";
                                               case 0x6a547424:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_USER_AVATAR";
                                               case 0x6a547425:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_USER_PRODUCTS_PAGE";
                                               case 0x6a547426:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEWS";
                                               case 0x6a547427:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_FOLLOW_CHANNEL";
                                               case 0x6a547428:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_LIVE_GAME_WIDGET";
                                               case 0x6a547429:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_VIDEO_GAME_TAG";
                                               case 0x6a54742a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_NEARBY_GAME_ENTRY";
                                               case 0x6a54742b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_SEARCH_GAME_ENTRY";
                                               case 0x6a547441:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_SIDEBAR_ENTRY";
                                               case 0x6a547442:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_LINK_EXTERNAL";
                                               case 0x6a547443:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_WEB";
                                               case 0x6a547444:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_VOICE_PARTY_AGGREGATION_RECOMMEND";
                                               case 0x6a547445:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_VOICE_PARTY_AGGREGATION_NEARBY";
                                               case 0x6a547446:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_VOICE_PARTY_AGGREGATION_KTV";
                                               case 0x6a547447:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_VOICE_PARTY_AGGREGATION_TOPIC";
                                               case 0x6a547448:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY_LIVE";
                                               case 0x6a547449:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_HELP";
                                               case 0x6a54744a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_TOPICTAG_GAME_SEARCH_RECOMMEND";
                                               case 0x6a547460:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_TOPICTAG_GAME_SEARCH_KEYWORD";
                                               case 0x6a547461:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_TOPICTAG_GAME_DETAIL";
                                               case 0x6a547462:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_PUSH_ARROW_REDPACK";
                                               case 0x6a547463:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_USER_CENTER";
                                               case 0x6a547464:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_SIX_SIX_RING";
                                               case 0x6a547465:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_CARD";
                                               case 0x6a547466:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_AGGR_CARD";
                                               case 0x6a547467:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_AUTO_PLAY";
                                               case 0x6a547468:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_WATCH_SIDEBAR";
                                               case 0x6a547469:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FEED_DETAIL_BROADCAST_GIFT";
                                               case 0x6a54747f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_GAME_SUBSCRIBE_MESSAGE";
                                               case 0x6a547480:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_CARD_USER_AVATAR";
                                               case 0x6a547481:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_HOT_LIVE_CHANNEL";
                                               case 0x6a547482:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_LAB_BY_GAME";
                                               case 0x6a547483:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_CARD_AUTO_ENTER";
                                               case 0x6a547484:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_THANOS_LIVE_SQUARE";
                                               case 0x6a547485:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_AGGRGATE_PAGE";
                                               case 0x6a547486:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_MY_FOLLOW_NOTICE";
                                               case 0x6a547487:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_TOP_GUIDE_CARD";
                                               case 0x6a547488:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_AGGREGATION";
                                               case 0x6a54749e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_RECO_LIVE_SQUARE_AGGREGATE_PAGE";
                                               case 0x6a54749f:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_CAMERA_CHAIN_LIVE";
                                               case 0x6a5474a0:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_DISTRICT_RANK_LIVE";
                                               case 0x6a5474a1:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY_RESOURCE_LOCATION";
                                               case 0x6a5474a2:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_VOICE_PARTY_CHANNEL_TOPIC_ITEM";
                                               case 0x6a5474a3:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_ROBOT_PET_CONTRIBUTE_LIST";
                                               case 0x6a5474a4:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_LIVE_ROBOT_PET_SOCIAL_LIST";
                                               case 0x6a5474a5:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_THANOS_LIVE_SQUARE_AGGREGATE_PAGE";
                                               case 0x6a5474a6:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_KWAI_VOICE";
                                               case 0x6a5474a7:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_KWAI_VOICE_MOMMENT";
                                               case 0x6a5474bd:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SEARCH_MUSIC_STATION_CHANNEL";
                                               case 0x6a5474be:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_TAG_ENTRANCE";
                                               case 0x6a5474bf:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_KWAI_VOICE_ENTRANCE";
                                               case 0x6a5474c0:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MUSIC_STATION_KWAI_VOICE_H5";
                                               case 0x6a5474c1:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_LIVE";
                                               case 0x6a5474c2:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NOTIFICATIONS";
                                               case 0x6a5474c3:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FEATURED_LIVE_SQUARE_AGGREGATE_PAGE";
                                               case 0x6a5474c4:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MENU_LIVE_SQUARE_AGGREGATE_PAGE";
                                               case 0x6a5474c5:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_MENU";
                                               case 0x6a5474c6:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GIFT_WHEEL_EXPENSIVE_GIFT";
                                               case 0x6a5474dc:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_VOICE_PARTY_AGGREGATION_RECOMMEND_CHANNEL";
                                               case 0x6a5474dd:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SF_PREHEAT_TASK";
                                               case 0x6a5474de:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SF_MAIN_BREAKOUT_VENUE_RESOURCE";
                                               case 0x6a5474df:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMECENTER_VIDEO_FEEDS";
                                               case 0x6a5474e0:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SFENTRANCE";
                                               case 0x6a5474e1:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEARBY_LIVE_SQUARE_AGGREGATE_PAGE";
                                               case 0x6a5474e2:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SF2020_LIVE_SQUARE_AGGREGATE_PAGE";
                                               case 0x6a5474e3:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SF2020_LIVE_THANKS_RED_PACK_LIST";
                                               case 0x6a5474e4:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SF2020_LIVE_THANKS_RED_PACK_NOTIFICATION";
                                               case 0x6a5474e5:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SF2020_LIVE_THANKS_RED_PACK_TOKEN_POPUP";
                                               case 0x6a5474fb:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_VOICE_PARTY_HOTROOM_PANDENT";
                                               case 0x6a5474fc:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_SEARCH";
                                               case 0x6a5474fd:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_NEBULA_LIVE_SQUARE_AGGREGATE_PAGE";
                                               case 0x6a5474fe:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "NEW_LIVE_MORE_SQUARE";
                                               case 0x6a5474ff:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "MY_FOLLOW_LIVE";
                                               case 0x6a547500:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_RECO";
                                               case 0x6a547501:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_GAMEZONE_NEW_LIVE_GAME_TV_TAB";
                                               case 0x6a547502:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FOLLOW_FVA";
                                               case 0x6a547503:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_OPERATION_H5";
                                               case 0x6a547504:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LS_FANS_TOP_ORDER_HELP_BUY";
                                               case 0x6d43f02b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "DISCARD_JOIN_PK_TEAM";
                                               case 0x6d43f02c:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "ANCHOR_PK_TEAM_INVITE";
                                               case 0x6d43f02d:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "AUDIENCE_JOIN_PK_TEAM";
                                               case 0x6d43f02e:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "CLOSE_FROM_ANCHOR_LIVE_ENTER_OTHER_LIVE";
                                               case 0x72da2569:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN";
                                               case 0x72da256a:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LIVE_VIDEO";
                                               case 0x72da256b:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LIVE_STREAM";
                                               case 0x7a3652c3:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "UNKNOWN1";
                                               case 0x7a3652c4:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "VOICE_PARTY_END";
                                               case 0x7a3652c5:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LEAVE_MIC_SEAT";
                                               case 0x7a3652c6:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "FORCE_LEAVE_MIC_SEAT";
                                               case 0x7a3652c7:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "KICK_OUT";
                                               case 0x7a3652c8:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LEAVE_LIVE";
                                               case 0x7a3652c9:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "AUDIENCE_LEAVE_KTV_STAGE";
                                               case 0x7a3652ca:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "PLAY_OTHER_PLAYER";
                                               case 0x7a3652cb:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "AUTHOR_LOCK_MIC";
                                               case 0x7a3652cc:
                                                 _monitor_exit(ContentWrapperEnumMapping.class);
                                                 return "LOOK_ONLY";
                                               default:
                                                 switch (hashCode){
                                                     case 0xa90a67da:
                                                       _monitor_exit(ContentWrapperEnumMapping.class);
                                                       return "UNKNOWN3";
                                                     case 0xa90a67db:
                                                       _monitor_exit(ContentWrapperEnumMapping.class);
                                                       return "ENTER";
                                                     case 0xa90a67dc:
                                                       _monitor_exit(ContentWrapperEnumMapping.class);
                                                       return "EXIT";
                                                     case 0xa90a67dd:
                                                       _monitor_exit(ContentWrapperEnumMapping.class);
                                                       return "PLAY_FIVE_SECOND";
                                                     default:
                                                       switch (hashCode){
                                                           case 0xad81bb26:
                                                             _monitor_exit(ContentWrapperEnumMapping.class);
                                                             return "CHAT";
                                                           case 0xad81bb27:
                                                             _monitor_exit(ContentWrapperEnumMapping.class);
                                                             return "KTV";
                                                           default:
                                                             switch (hashCode){
                                                                 case 0xaef4d0b4:
                                                                   _monitor_exit(ContentWrapperEnumMapping.class);
                                                                   return "ALLOWED";
                                                                 case 0xaef4d0b5:
                                                                   _monitor_exit(ContentWrapperEnumMapping.class);
                                                                   return "NONE";
                                                                 case 0xaef4d0b6:
                                                                   _monitor_exit(ContentWrapperEnumMapping.class);
                                                                   return "END";
                                                                 case 0xaef4d0b7:
                                                                   _monitor_exit(ContentWrapperEnumMapping.class);
                                                                   return "FAIL";
                                                                 default:
                                                                   _monitor_exit(ContentWrapperEnumMapping.class);
                                                                   return null;
                                                             }
                                                       }
                                                 }
                                           }
                                     }
                               }
                         }
                   }
             }
       }
    }
    public static int getHashCode(String p0){
       int i = 0;
       if (p0.length() > 0) {
          int i1 = 0;
          for (; i < p0.length(); i = i + 1) {
             i1 = i1 * 31;
             i1 = i1 + p0.charAt(i);
          }
          i = i1;
       }
       return i;
    }
    public static synchronized int init(){
       _monitor_enter(ContentWrapperEnumMapping.class);
       _monitor_exit(ContentWrapperEnumMapping.class);
       return 533;
    }
}
