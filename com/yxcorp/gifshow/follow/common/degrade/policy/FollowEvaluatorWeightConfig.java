package com.yxcorp.gifshow.follow.common.degrade.policy.FollowEvaluatorWeightConfig;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.follow.common.degrade.policy.WeightConfig;
import com.yxcorp.gifshow.follow.common.degrade.policy.FollowLevelWeightType;
import java.lang.Enum;
import java.lang.CharSequence;
import android.text.TextUtils;
import usd.q;
import com.kwai.library.wolverine.entity.TypePerformance;
import com.kwai.library.wolverine.entity.ElementType;
import java.lang.StringBuilder;

public final class FollowEvaluatorWeightConfig implements Serializable	// class@001049
{
    public final List weightConfigList;

    public void FollowEvaluatorWeightConfig(List p0){
       super();
       this.weightConfigList = p0;
    }
    public static FollowEvaluatorWeightConfig copy$default(FollowEvaluatorWeightConfig p0,List p1,int p2,Object p3){
       FollowEvaluatorWeightConfig weightConfig;
       if (p2 & 0x01) {
          weightConfig = p0.weightConfigList;
       }
       return p0.copy(weightConfig);
    }
    public final FollowEvaluatorWeightConfig copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowEvaluatorWeightConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FollowEvaluatorWeightConfig(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowEvaluatorWeightConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FollowEvaluatorWeightConfig && a.g(this.weightConfigList, p0.weightConfigList))) {
          return true;
       }
       return false;
    }
    public final double getWeightScoreByType(String p0){
       FollowLevelWeightType type;
       FollowEvaluatorWeightConfig obj = PatchProxy.applyOneRefs(p0, this, FollowEvaluatorWeightConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       a.p(p0, "type");
       obj = this.weightConfigList;
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             WeightConfig weightConfig = iterator.next();
             type = weightConfig.getType();
             String str = (type != null)? type.toString(): null;
             if (TextUtils.equals(str, p0)) {
                return q.s(weightConfig.getWeight(), 0x3ff0000000000000);
             }
          }
       }
       return 0;
    }
    public final double getWeightSumScore(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowEvaluatorWeightConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       a.p(p0, "typePerformanceList");
       double d = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          d = d + this.getWeightScoreByType(iterator.next().getType().toString());
       }
       return q.s(d, 0x3ff0000000000000);
    }
    public int hashCode(){
       FollowEvaluatorWeightConfig obj = PatchProxy.apply(null, this, FollowEvaluatorWeightConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.weightConfigList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final boolean isConfigValid(){
       FollowEvaluatorWeightConfig obj = PatchProxy.apply(null, this, FollowEvaluatorWeightConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.weightConfigList;
       if (obj == null) {
          return false;
       }
       if (obj.size() < 1) {
          return false;
       }
       Iterator iterator = obj.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (iterator.next().getType() == null) {
             break ;
          }
       }
       return false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FollowEvaluatorWeightConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FollowEvaluatorWeightConfig\(weightConfigList="+this.weightConfigList+"\)";
    }
}
