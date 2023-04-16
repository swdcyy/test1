package com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kwai.video.waynelive.util.CommonUtil;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public class LiveQualityItem	// class@000e16
{
    public boolean mIsDefault;
    public int mLevel;
    public String mName;
    public String mQualityType;
    public String mRealResolutionName;
    public String mShortName;
    public static final Map DEFAULT_QUALITY_MAP;

    static {
       LiveQualityItem.DEFAULT_QUALITY_MAP = new HashMap(4);
       LiveQualityItem.resetDefaultQualities();
    }
    public void LiveQualityItem(){
       super();
    }
    public void LiveQualityItem(String p0,String p1,String p2,int p3,boolean p4){
       super();
       this.mQualityType = p0;
       this.mName = p1;
       this.mShortName = p2;
       this.mLevel = p3;
       this.mIsDefault = p4;
    }
    public static LiveQualityItem AutoQuality(){
       Object obj = PatchProxy.apply(null, null, LiveQualityItem.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveQualityItem.DEFAULT_QUALITY_MAP.get("auto").setName(CommonUtil.string(0x7f101e8b));
    }
    public static LiveQualityItem HighQuality(){
       Object obj = PatchProxy.apply(null, null, LiveQualityItem.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveQualityItem.DEFAULT_QUALITY_MAP.get("high").setName(CommonUtil.string(0x7f1024b8));
    }
    public static LiveQualityItem StandardQuality(){
       Object obj = PatchProxy.apply(null, null, LiveQualityItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveQualityItem.DEFAULT_QUALITY_MAP.get("standard").setName(CommonUtil.string(0x7f102c9a));
    }
    public static LiveQualityItem SuperQuality(){
       Object obj = PatchProxy.apply(null, null, LiveQualityItem.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveQualityItem.DEFAULT_QUALITY_MAP.get("super").setName(CommonUtil.string(0x7f102cff));
    }
    public static void fixQualityItemByDefaultIfNeeded(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveQualityItem.class, "5")) {
          return;
       }
       if (!TextUtils.x(p0.mName) && p0.mLevel != null) {
          return;
       }
       LiveQualityItem liveQualityI = LiveQualityItem.DEFAULT_QUALITY_MAP.get(p0.mQualityType);
       if (liveQualityI == null) {
          return;
       }
       if (TextUtils.x(p0.mName)) {
          p0.mName = liveQualityI.mName;
       }
       if (p0.mLevel == null) {
          p0.mLevel = liveQualityI.mLevel;
       }
       return;
    }
    public static void resetDefaultQualities(){
       if (PatchProxy.applyVoid(null, null, LiveQualityItem.class, "10")) {
          return;
       }
       Map dEFAULT_QUAL = LiveQualityItem.DEFAULT_QUALITY_MAP;
       dEFAULT_QUAL.clear();
       LiveQualityItem liveQualityI = new LiveQualityItem("standard", CommonUtil.string(0x7f102c9a), CommonUtil.string(0x7f102c9a), 30, false);
       dEFAULT_QUAL.put("standard", v7);
       LiveQualityItem liveQualityI1 = new LiveQualityItem("high", CommonUtil.string(0x7f1024b8), CommonUtil.string(0x7f1024b8), 50, false);
       dEFAULT_QUAL.put("high", liveQualityI);
       LiveQualityItem liveQualityI2 = new LiveQualityItem("super", CommonUtil.string(0x7f102cff), CommonUtil.string(0x7f102cff), 70, false);
       dEFAULT_QUAL.put("super", liveQualityI);
       liveQualityI2 = new LiveQualityItem("auto", CommonUtil.string(0x7f101e8b), CommonUtil.string(0x7f101e8b), -10, false);
       dEFAULT_QUAL.put("auto", liveQualityI);
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveQualityItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof LiveQualityItem) {
          return false;
       }
       return TextUtils.n(this.mQualityType, p0.mQualityType);
    }
    public String getName(){
       return this.mName;
    }
    public String getRealResolutionName(){
       return this.mRealResolutionName;
    }
    public String getShortName(){
       LiveQualityItem obj = PatchProxy.apply(null, this, LiveQualityItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(this.mShortName)) {
          return this.mShortName;
       }
       if (TextUtils.x(this.mName) || (this.mName).length() < 2) {
          return this.mName;
       }
       obj = this.mName;
       return obj.substring((obj.length() - 2));
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveQualityItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.mQualityType).hashCode();
    }
    public boolean isAutoQuality(){
       Object obj = PatchProxy.apply(null, this, LiveQualityItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mLevel == -10 && (CommonUtil.string(0x7f101e8b)).equals(this.mName))? true: false;
       return b;
    }
    public LiveQualityItem setName(String p0){
       this.mName = p0;
       return this;
    }
    public void setRealResolutionName(String p0){
       this.mRealResolutionName = p0;
    }
    public LiveQualityItem setShortName(String p0){
       this.mShortName = p0;
       return this;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveQualityItem.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceQualityItemModel{mQualityType=\'"+this.mQualityType+'''+", mName=\'"+this.mName+'''+", mShortName=\'"+this.mShortName+'''+", mLevel="+this.mLevel+", mIsDefault="+this.mIsDefault+'}';
    }
}
