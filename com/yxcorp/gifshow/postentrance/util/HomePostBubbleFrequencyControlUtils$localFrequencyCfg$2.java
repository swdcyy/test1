package com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils$localFrequencyCfg$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a0c.j;
import ezb.k;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class HomePostBubbleFrequencyControlUtils$localFrequencyCfg$2 extends Lambda implements a	// class@00107e
{
    public static final HomePostBubbleFrequencyControlUtils$localFrequencyCfg$2 INSTANCE;

    static {
       HomePostBubbleFrequencyControlUtils$localFrequencyCfg$2.INSTANCE = new HomePostBubbleFrequencyControlUtils$localFrequencyCfg$2();
    }
    public void HomePostBubbleFrequencyControlUtils$localFrequencyCfg$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       Object[] obj = PatchProxy.apply(objArray, this, HomePostBubbleFrequencyControlUtils$localFrequencyCfg$2.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, objArray, j.class, str);
       if (obj != patchProxyRe) {
       }else {
          Type a = j.a;
          String str1 = k.a.getString("localBubbleFrequency", "{}");
          if (str1 != null && str1 != "") {
             objArray = b.a(str1, a);
          }
          obj = objArray;
       }
       return obj;
    }
}
