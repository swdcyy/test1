package com.kwai.video.waynelive.quality.LiveQualityManager;
import java.lang.Object;
import java.util.TreeMap;
import com.kwai.video.waynelive.quality.a;
import java.util.Comparator;
import com.kwai.video.waynelive.debug.Logger;
import java.lang.String;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.android.live.model.AdaptationSet;
import com.kuaishou.android.live.model.AdaptationUrl;
import java.lang.Exception;
import com.kwai.video.waynelive.debug.DebugLog;
import java.util.Map$Entry;
import java.util.Set;
import java.util.Iterator;
import java.lang.Math;
import com.kuaishou.android.live.model.ResolutionPlayUrls;
import java.util.Collection;
import ekd.q;
import com.kwai.video.waynelive.quality.LiveQualityChangeListener;

public class LiveQualityManager	// class@000e17
{
    public LiveQualityItem mCurrentQualityItem;
    public boolean mEnableLastSelectedQuality;
    public LiveQualityChangeListener mLiveQualityChangeListener;
    public final TreeMap mLiveQualityItemLevelMap;
    public Logger mLogger;
    public static int sLastSelectedLiveQualityLevel = -2147483648;

    public void LiveQualityManager(){
       super();
       this.mLiveQualityItemLevelMap = new TreeMap(a.b);
       this.mLogger = new Logger("LiveQualityManager");
       this.mEnableLastSelectedQuality = true;
    }
    public static boolean isLiveQualityItemValid(LiveQualityItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveQualityManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       LiveQualityItem.fixQualityItemByDefaultIfNeeded(p0);
       boolean b = (!TextUtils.isEmpty(p0.getName()) && p0.mLevel != null)? true: false;
       return b;
    }
    public static int lambda$new$0(Integer p0,Integer p1){
       return (p1.intValue() - p0.intValue());
    }
    public void destroy(){
       this.mLiveQualityChangeListener = null;
    }
    public final List getAdaptiveLiveQualityItemList(LiveAdaptiveManifest p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, LiveQualityManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p0 == null) {
          return obj;
       }
       try{
          AdaptationSet mRepresentat = p0.mAdaptationSet.mRepresentation;
          if (mRepresentat == null) {
             return obj;
          }else {
             int i = 0;
             while (i < mRepresentat.size()) {
                AdaptationUrl uAdaptationU = mRepresentat.get(i);
                if (!TextUtils.isEmpty(uAdaptationU.mQualityType)) {
                   LiveQualityItem liveQualityI = new LiveQualityItem((uAdaptationU.mQualityType).toLowerCase(), uAdaptationU.mName, uAdaptationU.mShortName, uAdaptationU.mLevel, uAdaptationU.mDefaultSelect);
                   if (LiveQualityManager.isLiveQualityItemValid(v4)) {
                      obj.add(v4);
                   }
                }
                i = i + 1;
             }
             if (!p0.shouldHideAutoLiveQuality()) {
                obj.add(LiveQualityItem.AutoQuality());
             }
          }
       }catch(java.lang.Exception e12){
          DebugLog.e("LiveQualityManager", e12.getMessage());
       }
       return obj;
    }
    public LiveQualityItem getCurrentQualityItem(){
       Object obj = PatchProxy.apply(null, this, LiveQualityManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mCurrentQualityItem == null) {
          this.mCurrentQualityItem = LiveQualityItem.StandardQuality();
       }
       return this.mCurrentQualityItem;
    }
    public final LiveQualityItem getLastQualityItem(TreeMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveQualityManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map$Entry uEntry = p0.lastEntry();
       LiveQualityItem value = (uEntry != null)? uEntry.getValue(): null;
       return value;
    }
    public final int getLastSelectedQuality(){
       int sLastSelecte = (this.mEnableLastSelectedQuality != null)? LiveQualityManager.sLastSelectedLiveQualityLevel: Integer.MIN_VALUE;
       return sLastSelecte;
    }
    public LiveQualityItem getLowQualityItem(int p0){
       LiveQualityItem liveQualityI;
       LiveQualityManager liveQualityM = LiveQualityManager.class;
       if (PatchProxy.isSupport(liveQualityM)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveQualityM, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.mLiveQualityItemLevelMap.isEmpty() || p0 <= 0) {
          return this.getCurrentQualityItem();
       }else if(p0 == 10){
          return this.getLowestQualityItem();
       }else {
          liveQualityM = Integer.MIN_VALUE;
          Iterator iterator = this.mLiveQualityItemLevelMap.keySet().iterator();
          while (true) {
             if (iterator.hasNext()) {
                Integer integer = iterator.next();
                if (integer.intValue() <= 0) {
                   continue ;
                }else if(integer.intValue() == p0){
                label_0065 :
                   liveQualityI = (p0 > null)? this.mLiveQualityItemLevelMap.get(Integer.valueOf(p0)): null;
                   if (liveQualityI == null) {
                      liveQualityI = this.getLowestQualityItem();
                      break ;
                   }
                   break ;
                }else if(integer.intValue() < p0 && integer.intValue() > liveQualityM){
                   int i = integer.intValue();
                }
             }else {
                LiveQualityManager liveQualityM1 = liveQualityM;
                goto label_0065 ;
             }
          }
          return liveQualityI;
       }
    }
    public LiveQualityItem getLowestQualityItem(){
       LiveQualityItem obj = PatchProxy.apply(null, this, LiveQualityManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mLiveQualityItemLevelMap.isEmpty()) {
          return this.getCurrentQualityItem();
       }
       int i = Integer.MAX_VALUE;
       Iterator iterator = this.mLiveQualityItemLevelMap.keySet().iterator();
       while (iterator.hasNext()) {
          Integer integer = iterator.next();
          if (integer.intValue() > 0) {
             i = Math.min(integer.intValue(), i);
          }
       }
       obj = this.mLiveQualityItemLevelMap.get(Integer.valueOf(i));
       if (obj == null) {
          obj = this.getCurrentQualityItem();
       }
       return obj;
    }
    public final List getMultiResolutionLiveQualityItemList(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, LiveQualityManager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p0 == null) {
          return obj;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ResolutionPlayUrls resolutionPl = iterator.next();
          LiveQualityItem liveQualityI = new LiveQualityItem(resolutionPl.mType, resolutionPl.mName, resolutionPl.mShortName, resolutionPl.mLevel, resolutionPl.mDefaultSelect);
          if (LiveQualityManager.isLiveQualityItemValid(v8)) {
             obj.add(v8);
          }
       }
       return obj;
    }
    public List getQualityItemList(){
       Object obj = PatchProxy.apply(null, this, LiveQualityManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList(this.mLiveQualityItemLevelMap.values());
    }
    public final void initCurrentQualityItem(boolean p0){
       LiveQualityManager liveQualityM = LiveQualityManager.class;
       if (PatchProxy.isSupport(liveQualityM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveQualityM, "10")) {
          return;
       }
       liveQualityM = this.mLiveQualityItemLevelMap;
       int lastSelected = this.getLastSelectedQuality();
       Iterator iterator = liveQualityM.values().iterator();
       String str = null;
       LiveQualityItem liveQualityI = str;
       LiveQualityItem liveQualityI1 = Integer.MIN_VALUE;
       while (iterator.hasNext()) {
          LiveQualityItem liveQualityI2 = iterator.next();
          if (lastSelected != liveQualityI1 && liveQualityI2.mLevel <= lastSelected) {
             this.mLogger.i("use lastSelectedLiveQuality");
             str = liveQualityI2;
             break ;
          }else if(liveQualityI == null && liveQualityI2.mIsDefault != null){
             liveQualityI = liveQualityI2;
          }
       }
       if (str == null && lastSelected != liveQualityI1) {
          str = this.getLastQualityItem(liveQualityM);
       }
       if (str == null && (p0 && liveQualityM.containsKey(Integer.valueOf(LiveQualityItem.AutoQuality().mLevel)))) {
          str = LiveQualityItem.AutoQuality();
       }
    label_006a :
       if (str != null || liveQualityI == null) {
          liveQualityI = str;
       }
       if (liveQualityI == null && liveQualityM.containsKey(Integer.valueOf(LiveQualityItem.StandardQuality().mLevel))) {
          liveQualityI = LiveQualityItem.StandardQuality();
       }
       if (liveQualityI == null) {
          liveQualityI = this.getLastQualityItem(liveQualityM);
       }
       if (liveQualityI != null) {
          this.setCurrentQualityItemInternal(liveQualityI);
       }
       return;
    }
    public void initialize(LiveAdaptiveManifest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQualityManager.class, "1")) {
          return;
       }
       List adaptiveLive = this.getAdaptiveLiveQualityItemList(p0);
       this.initializeQualityItemLevelMap(adaptiveLive, p0.shouldSelectAutoLiveQuality());
       this.mLogger.i("initialize quality liveAdaptiveManifest", "qualityItemList", adaptiveLive);
       return;
    }
    public void initialize(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQualityManager.class, "2")) {
          return;
       }
       p0 = this.getMultiResolutionLiveQualityItemList(p0);
       this.initializeQualityItemLevelMap(p0, false);
       this.mLogger.i("initialize quality resolutionPlayUrls", "qualityItemList", p0);
       return;
    }
    public final void initializeQualityItemLevelMap(List p0,boolean p1){
       LiveQualityManager liveQualityM = LiveQualityManager.class;
       if (PatchProxy.isSupport(liveQualityM) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liveQualityM, "9")) {
          return;
       }
       if (q.f(p0)) {
          this.setCurrentQualityItemInternal(LiveQualityItem.StandardQuality());
          return;
       }else {
          this.mLiveQualityItemLevelMap.clear();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             LiveQualityItem liveQualityI = iterator.next();
             LiveQualityItem.fixQualityItemByDefaultIfNeeded(liveQualityI);
             this.mLiveQualityItemLevelMap.put(Integer.valueOf(liveQualityI.mLevel), liveQualityI);
          }
          this.mCurrentQualityItem = null;
          this.initCurrentQualityItem(p1);
          return;
       }
    }
    public void reset(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveQualityManager.class, "3")) {
          return;
       }
       this.mLiveQualityItemLevelMap.clear();
       this.mCurrentQualityItem = objArray;
       LiveQualityManager tmLiveQualit = this.mLiveQualityChangeListener;
       if (tmLiveQualit != null) {
          tmLiveQualit.onQualityChange(this.getCurrentQualityItem());
       }
       return;
    }
    public void setCurrentQualityItem(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQualityManager.class, "6")) {
          return;
       }
       LiveQualityManager.sLastSelectedLiveQualityLevel = p0.mLevel;
       this.setCurrentQualityItemInternal(p0);
       return;
    }
    public final void setCurrentQualityItemInternal(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveQualityManager.class, "11")) {
          return;
       }
       if (!LiveQualityManager.isLiveQualityItemValid(p0)) {
          return;
       }
       this.mCurrentQualityItem = p0;
       LiveQualityManager tmLiveQualit = this.mLiveQualityChangeListener;
       if (tmLiveQualit != null) {
          tmLiveQualit.onQualityChange(p0);
       }
       return;
    }
    public void setLiveQualityChangeListener(LiveQualityChangeListener p0){
       this.mLiveQualityChangeListener = p0;
    }
    public void setLogger(Logger p0){
       this.mLogger = p0;
    }
}
