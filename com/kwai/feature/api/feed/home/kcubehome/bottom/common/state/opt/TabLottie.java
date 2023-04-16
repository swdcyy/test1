package com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.TabLottie;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TabLottie	// class@000f0c
{
    public final String id;
    public final int lottieDelay;
    public final int lottieDisplayMaxCount;
    public final int lottieDisplayStyle;
    public final List lottieUrls;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TabLottie.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TabLottie && (a.g(this.id, p0.id) && (this.lottieDelay == p0.lottieDelay && (this.lottieDisplayMaxCount == p0.lottieDisplayMaxCount && (this.lottieDisplayStyle == p0.lottieDisplayStyle && a.g(this.lottieUrls, p0.lottieUrls))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TabLottie obj = PatchProxy.apply(null, this, TabLottie.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.id;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((((i1 * 31) + this.lottieDelay) * 31) + this.lottieDisplayMaxCount) * 31) + this.lottieDisplayStyle) * 31;
       TabLottie tlottieUrls = this.lottieUrls;
       if (tlottieUrls != null) {
          i = tlottieUrls.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TabLottie.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TabLottie\(id="+this.id+", lottieDelay="+this.lottieDelay+", lottieDisplayMaxCount="+this.lottieDisplayMaxCount+", lottieDisplayStyle="+this.lottieDisplayStyle+", lottieUrls="+this.lottieUrls+"\)";
    }
}
