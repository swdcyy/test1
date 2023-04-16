package com.kuaishou.live.merchant.hourlytrank.model.LiveMerchantHourlyRankGuideInfo;
import java.io.Serializable;
import com.kuaishou.live.merchant.hourlytrank.model.LiveMerchantHourlyRankGuideInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveMerchantHourlyRankGuideInfo implements Serializable	// class@000cd0
{
    public String mBackgroundEndColor;
    public String mBackgroundStartColor;
    public String mContent;
    public long mDisplayMills;
    public List mIcon;
    public static final LiveMerchantHourlyRankGuideInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveMerchantHourlyRankGuideInfo.Companion = new LiveMerchantHourlyRankGuideInfo$a(null);
    }
    public void LiveMerchantHourlyRankGuideInfo(){
       super();
       this.mContent = "";
       this.mBackgroundStartColor = "";
       this.mBackgroundEndColor = "";
       this.mDisplayMills = 2000;
    }
    public final String getMBackgroundEndColor(){
       return this.mBackgroundEndColor;
    }
    public final String getMBackgroundStartColor(){
       return this.mBackgroundStartColor;
    }
    public final String getMContent(){
       return this.mContent;
    }
    public final long getMDisplayMills(){
       return this.mDisplayMills;
    }
    public final List getMIcon(){
       return this.mIcon;
    }
    public final void setMBackgroundEndColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantHourlyRankGuideInfo.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBackgroundEndColor = p0;
       return;
    }
    public final void setMBackgroundStartColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantHourlyRankGuideInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBackgroundStartColor = p0;
       return;
    }
    public final void setMContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantHourlyRankGuideInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mContent = p0;
       return;
    }
    public final void setMDisplayMills(long p0){
       this.mDisplayMills = p0;
    }
    public final void setMIcon(List p0){
       this.mIcon = p0;
    }
}
