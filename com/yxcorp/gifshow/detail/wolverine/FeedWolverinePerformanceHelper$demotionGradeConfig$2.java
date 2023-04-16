package com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHelper$demotionGradeConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.util.HashMap;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import java.lang.Enum;
import java.lang.CharSequence;
import trd.t0;
import fg6.a;
import java.lang.reflect.Type;
import el.a;
import kotlin.jvm.internal.a;
import com.google.gson.Gson;

public final class FeedWolverinePerformanceHelper$demotionGradeConfig$2 extends Lambda implements a	// class@001a7b
{
    public static final FeedWolverinePerformanceHelper$demotionGradeConfig$2 INSTANCE;

    static {
       FeedWolverinePerformanceHelper$demotionGradeConfig$2.INSTANCE = new FeedWolverinePerformanceHelper$demotionGradeConfig$2();
    }
    public void FeedWolverinePerformanceHelper$demotionGradeConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       String str = String.class;
       WolverinePerformanceLevel obj = PatchProxy.apply(null, this, FeedWolverinePerformanceHelper$demotionGradeConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = false;
       if (a.t().d("feedWolverineWhenUserExpected", b)) {
          HashMap hashMap = new HashMap();
          obj = WolverinePerformanceLevel.GRADE_E;
          hashMap.put("feed_wolverine_music_wheel_demotion_grade", obj.name());
          hashMap.put("feed_wolverine_music_marquee_demotion_grade", obj.name());
          hashMap.put("feed_wolverine_live_guide_anim_demotion_grade", obj.name());
          hashMap.put("feed_wolverine_share_guide_anim_demotion_grade", obj.name());
          return hashMap;
       }else {
          String str1 = a.t().c("wolverineDegradeConfigNew", "");
          int i = 1;
          Gson gson = (str1 == null || !str1.length())? 1: null;
          if (gson) {
             return t0.z();
          }else {
             Type[] typeArray = new Type[]{str,str};
             a parameterize = a.getParameterized(HashMap.class, typeArray);
             a.o(parameterize, "TypeToken.getParameteriz¡­java, String::class.java\)");
             return a.a.i(str1, parameterize.getType());
          }
       }
    }
}
