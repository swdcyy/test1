package com.yxcorp.gifshow.nearby.common.model.AnimationModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kwai.social.startup.local.model.DarkLightModel;
import java.lang.StringBuilder;

public final class AnimationModel	// class@00211d
{
    public final DarkLightModel mCoverUrl;
    public final String mRibbonAnimation;
    public final String mSubtitle;
    public final String mTitle;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AnimationModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AnimationModel && (a.g(this.mTitle, p0.mTitle) && (a.g(this.mSubtitle, p0.mSubtitle) && (a.g(this.mRibbonAnimation, p0.mRibbonAnimation) && a.g(this.mCoverUrl, p0.mCoverUrl)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       AnimationModel obj = PatchProxy.apply(null, this, AnimationModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTitle;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       AnimationModel tmSubtitle = this.mSubtitle;
       int i2 = (tmSubtitle != null)? tmSubtitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmSubtitle = this.mRibbonAnimation;
       i2 = (tmSubtitle != null)? tmSubtitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmSubtitle = this.mCoverUrl;
       if (tmSubtitle != null) {
          i = tmSubtitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AnimationModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AnimationModel\(mTitle="+this.mTitle+", mSubtitle="+this.mSubtitle+", mRibbonAnimation="+this.mRibbonAnimation+", mCoverUrl="+this.mCoverUrl+"\)";
    }
}
