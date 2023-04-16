package com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.c$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.giftcomboanimation.c;
import android.util.SparseArray;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.util.List;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftBatchConfig;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils;
import java.util.Map;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$a;
import java.util.Set;
import java.util.Iterator;
import java.lang.Number;
import java.lang.StringBuilder;
import java.lang.Boolean;

public final class c$a	// class@00129b
{

    public void c$a(){
       super();
    }
    public void c$a(u p0){
       super();
    }
    public final String a(int p0){
       SparseArray a;
       SparseArray obj1;
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b();
       int i = 0;
       int i1 = c.a.size();
       while (true) {
          if (i < i1) {
             a = c.a;
             if (p0 <= a.keyAt(i)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             obj1 = c.a;
             Object obj2 = obj1.valueAt((obj1.size() - 1));
             a.o(obj2, "comboTargetCount.valueAt…boTargetCount.size\(\) - 1\)");
             return obj2;
          }
       }
       obj1 = a.valueAt(i);
       a.o(obj1, "comboTargetCount.valueAt\(i\)");
       return obj1;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "7")) {
          return;
       }
       if (c.a.size() > 0) {
          return;
       }
       LiveConfigStartupResponse$LiveAudienceGiftConfig liveAudience = a.s(LiveConfigStartupResponse$LiveAudienceGiftConfig.class);
       a.o(liveAudience, "DefaultPreferenceHelper\n…ceGiftConfig::class.java\)");
       LiveConfigStartupResponse$LiveAudienceGiftConfig mGiftBatchCo = liveAudience.mGiftBatchConfigs;
       int i = 0;
       int i1 = (mGiftBatchCo != null)? mGiftBatchCo.size(): 0;
       if (i1 > 0) {
          b.P(LiveLogTag.GIFT.appendTag("LiveGiftComboTargetNumManager"), "[LiveGiftComboEffectRootView][onFinishInflate]:mBatchCount 走Server逻辑 ");
          mGiftBatchCo = liveAudience.mGiftBatchConfigs;
          a.o(mGiftBatchCo, "liveAudienceGiftConfig.mGiftBatchConfigs");
          i1 = mGiftBatchCo.size();
          while (i < i1) {
             LiveConfigStartupResponse$LiveGiftBatchConfig liveGiftBatc = liveAudience.mGiftBatchConfigs.get(i);
             if (liveGiftBatc != null) {
                c.a.put(liveGiftBatc.mGiftBatchCount, liveGiftBatc.mGiftBatchCountDescription);
             }
             i = i + 1;
          }
       }else {
          b.P(LiveLogTag.GIFT.appendTag("LiveGiftComboTargetNumManager"), "[LiveGiftComboEffectRootView][onFinishInflate]:mBatchCount 走本地兜底的逻辑 ");
          Map map = LiveGiftComboButtonAnimationUtils.h.c();
          Iterator iterator = map.keySet().iterator();
          while (iterator.hasNext()) {
             i = iterator.next().intValue();
             c.a.put(i, map.get(Integer.valueOf(i)));
          }
       }
       b.P(LiveLogTag.GIFT.appendTag("LiveGiftComboTargetNumManager"), "[LiveGiftComboEffectRootView][onFinishInflate]:mBatchCount is "+c.a);
       return;
    }
    public final boolean c(int p0){
       boolean b = (p0 >= 1000)? true: false;
       return b;
    }
    public final boolean d(int p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.b();
       int i = 1;
       if (p0 <= i || c.a.indexOfKey(p0) < 0) {
          i = false;
       }
       return i;
    }
}
