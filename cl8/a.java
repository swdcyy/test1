package cl8.a;
import java.lang.String;

public class a	// class@000530
{

    public static String a(int p0,boolean p1){
       if (p0 == 5) {
          return "PHOTO";
       }
       if (p0 == 6) {
          return "LIVE_STREAM";
       }
       if (p0 == 22) {
          return "PHOTO_LIVE";
       }
       if (p0 != 39) {
          if (p0 != 41) {
             if (p0 == 46) {
                return "ALADDIN_CARD";
             }
             if (p0 == 51) {
                return "LIVE_PLAYBACK_LIVE";
             }
             if (p0 == 71) {
                return "ALADDIN_ACTIVITY";
             }
             if (p0 == 75) {
                return "BRAND_ADVERT";
             }
             if (p0 == 77) {
                return "ALADDIN_COMMON";
             }
             if (p0 == 85) {
                return "HOME_HOTLIST";
             }
             if (p0 == 53) {
                return "ALADDIN_LONG_VIDEO";
             }
             if (p0 == 54) {
                return "IMAGE_ATLAS_LIVE";
             }
             switch (p0){
                 case '8':
                   return "COMMODITY";
                 case '9':
                   return "ALADDIN_SP";
                 case ':':
                   return "LIVE_SLICE";
                 case ';':
                   return "ACFUN_PHOTO";
                 case '<':
                   return "ALADDIN_SJ";
                 case '=':
                   return "HOT_KEYWORD";
                 case '>':
                   if (p1) {
                      return "ALADDIN_XG_LIVE";
                   }
                   return "ALADDIN_XG";
                   break;
                 default:
                   return "";
             }
          }else if(p1){
             return "ALADDIN_JC_LIVE";
          }else {
             return "ALADDIN_JC";
          }
       }else if(p1){
          return "ALADDIN_JH_LIVE";
       }else {
          return "ALADDIN_JH";
       }
    }
}
