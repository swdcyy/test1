package jy1.a;
import java.lang.String;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import jy1.b;
import java.lang.StringBuilder;
import jy1.d;
import jy1.b$c;
import jy1.e;
import jy1.i;

public final class a	// class@002c30
{

    public static b a(String p0,LiveMessageFrequencyConfig$FrequencyConfig p1){
       d uod;
       LiveMessageFrequencyConfig$FrequencyConfig mAppearTimes;
       LiveMessageFrequencyConfig$FrequencyConfig uFrequencyCo;
       d uod1;
       String str = "bizConfig.";
       if (p1.mAppearTimesByLiveStream > null) {
          uod = new d(str+p0);
          mAppearTimes = p1.mAppearTimesByLiveStream;
       }else if(p1.mAppearTimesByColdTime > null){
          uod = e.e(str+p0);
          mAppearTimes = p1.mAppearTimesByColdTime;
       }else {
          uod1 = e.e(str+p0+".IMPOSSIBLE!!!");
          uFrequencyCo = 0;
       label_0054 :
          i oi = new i(p0, uFrequencyCo, p1.mAppearColdTimeSpan, uod1);
          return mAppearTimes;
       }
       uFrequencyCo = mAppearTimes;
       uod1 = uod;
       goto label_0054 ;
    }
}
