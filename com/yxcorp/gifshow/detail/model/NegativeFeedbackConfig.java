package com.yxcorp.gifshow.detail.model.NegativeFeedbackConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NegativeFeedbackConfig	// class@001587
{
    public final String mTitle;
    public final String mToast;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NegativeFeedbackConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NegativeFeedbackConfig && (a.g(this.mTitle, p0.mTitle) && a.g(this.mToast, p0.mToast)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       NegativeFeedbackConfig obj = PatchProxy.apply(null, this, NegativeFeedbackConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTitle;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       NegativeFeedbackConfig tmToast = this.mToast;
       if (tmToast != null) {
          i = tmToast.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NegativeFeedbackConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NegativeFeedbackConfig\(mTitle="+this.mTitle+", mToast="+this.mToast+"\)";
    }
}
