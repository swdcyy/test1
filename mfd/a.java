package mfd.a;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import java.lang.String;

public class a	// class@001d14
{

    public static String a(KBoxItem p0,boolean p1){
       String str;
       p0 = p0.mType;
       if (p0 == 6) {
          str = (p1)? "PREVIEW_PLAY_SUBCARD": "PREVIEW_PLAYPAUSE_SUBCARD";
          return str;
       }else if(p0 == 13){
          str = (p1)? "AUTOPLAY_PLAY_SUBCARD": "AUTOPLAY_PLAYPAUSE_SUBCARD";
          return str;
       }else {
          return "";
       }
    }
    public static String b(KBoxItem p0,boolean p1){
       String str;
       p0 = p0.mType;
       if (p0 == 6) {
          str = (p1)? "PREVIEW_SILENT_SUBCARD": "PREVIEW_SOUND_SUBCARD";
          return str;
       }else if(p0 == 13){
          str = (p1)? "AUTOPLAY_SILENT_SUBCARD": "AUTOPLAY_SOUND_SUBCARD";
          return str;
       }else {
          return "";
       }
    }
}
