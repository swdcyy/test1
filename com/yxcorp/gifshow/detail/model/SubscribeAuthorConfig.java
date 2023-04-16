package com.yxcorp.gifshow.detail.model.SubscribeAuthorConfig;
import com.yxcorp.gifshow.detail.model.NegativeFeedbackConfig;
import com.yxcorp.gifshow.detail.model.SnackBarConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SubscribeAuthorConfig	// class@00158b
{
    public final NegativeFeedbackConfig mNegativeFeedbackConfig;
    public final SnackBarConfig mSnackBarConfig;

    public final NegativeFeedbackConfig a(){
       return this.mNegativeFeedbackConfig;
    }
    public final SnackBarConfig b(){
       return this.mSnackBarConfig;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SubscribeAuthorConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SubscribeAuthorConfig && (a.g(this.mNegativeFeedbackConfig, p0.mNegativeFeedbackConfig) && a.g(this.mSnackBarConfig, p0.mSnackBarConfig)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       SubscribeAuthorConfig obj = PatchProxy.apply(null, this, SubscribeAuthorConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mNegativeFeedbackConfig;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SubscribeAuthorConfig tmSnackBarCo = this.mSnackBarConfig;
       if (tmSnackBarCo != null) {
          i = tmSnackBarCo.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SubscribeAuthorConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SubscribeAuthorConfig\(mNegativeFeedbackConfig="+this.mNegativeFeedbackConfig+", mSnackBarConfig="+this.mSnackBarConfig+"\)";
    }
}
