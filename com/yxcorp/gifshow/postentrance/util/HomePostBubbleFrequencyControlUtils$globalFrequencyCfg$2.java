package com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils$globalFrequencyCfg$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.postentrance.bubblev2.model.HomePostBubbleFrequencyConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xf6.d;
import xf6.l;
import a0c.g;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.sdk.switchconfig.a;
import java.util.Objects;
import com.yxcorp.gifshow.postentrance.bubblev2.model.HomePostBubbleFrequencyConfig$a;
import qrd.p;
import java.lang.reflect.Type;

public final class HomePostBubbleFrequencyControlUtils$globalFrequencyCfg$2 extends Lambda implements a	// class@00107d
{
    public static final HomePostBubbleFrequencyControlUtils$globalFrequencyCfg$2 INSTANCE;

    static {
       HomePostBubbleFrequencyControlUtils$globalFrequencyCfg$2.INSTANCE = new HomePostBubbleFrequencyControlUtils$globalFrequencyCfg$2();
    }
    public void HomePostBubbleFrequencyControlUtils$globalFrequencyCfg$2(){
       super(0);
    }
    public final HomePostBubbleFrequencyConfig invoke(){
       HomePostBubbleFrequencyConfig homePostBubb;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       a obj = PatchProxy.apply(objArray, this, HomePostBubbleFrequencyControlUtils$globalFrequencyCfg$2.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       boolean b = false;
       if (l.c("key_enable_custom_post_entrance_bubble_frequency", b)) {
          int i = l.e("key_post_entrance_bubble_daily_show_max_count", 3);
          int i1 = l.e("key_post_entrance_bubble_life_cycle_show_max_count", 2);
          int i2 = l.e("key_post_entrance_bubble_show_min_interval", 60);
          Object[] objArray1 = new Object[b];
          g.C().w("home_entrance_bubble", "FrequencyControl 自定义频控数据: dailyMaxCount = "+i+", lifeMaxCount = "+i1+", interval = "+i2, objArray1);
          homePostBubb = new HomePostBubbleFrequencyConfig();
          homePostBubb.setDailyShowTimes(i);
          homePostBubb.setLifeCycleShowTimes(i1);
          homePostBubb.setShowInterval(i2);
       }else {
          obj = a.t();
          HomePostBubbleFrequencyConfig$a companion = HomePostBubbleFrequencyConfig.Companion;
          Objects.requireNonNull(companion);
          Object obj1 = PatchProxy.apply(objArray, companion, HomePostBubbleFrequencyConfig$a.class, str);
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = HomePostBubbleFrequencyConfig.defaultHomePostBubbleFrequencyConfig$delegate.getValue();
          }
          homePostBubb = obj.getValue("postEntranceBubbleFrequencyControl", HomePostBubbleFrequencyConfig.class, obj1);
       }
       return homePostBubb;
    }
    public Object invoke(){
       return this.invoke();
    }
}
