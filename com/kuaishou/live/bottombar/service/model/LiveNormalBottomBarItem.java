package com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import z61.l;
import z61.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bottombar.service.model.g;
import java.lang.StringBuilder;
import z61.b;
import java.util.Arrays;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem$LiveBottomBarResponseItem;
import com.google.gson.JsonElement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;

public class LiveNormalBottomBarItem extends l	// class@000d56
{
    public LiveBottomBarItemBadge mBadge;
    public boolean mDisableShowRedPoint;
    public int mIconRes;
    public CDNUrl[] mIconUrl;

    public void LiveNormalBottomBarItem(){
       super();
       this.mIconUrl = null;
       this.mIconRes = -1;
    }
    public c getViewItemInstanceFactory(){
       Object obj = PatchProxy.apply(null, this, LiveNormalBottomBarItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.a;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveNormalBottomBarItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveDefaultBottomBarItem{mIsVisible="+this.mIsVisible+", mIsSelected="+this.mIsSelected+", mBadge="+this.mBadge+", mIconUrl="+Arrays.toString(this.mIconUrl)+", mSelectedIconUrl="+Arrays.toString(this.mSelectedIconUrl)+", mText=\'"+this.mText+'''+", mKwaiLink=\'"+this.mKwaiLink+'''+", mId=\'"+this.mFeatureId+'''+'}';
    }
    public void update(JsonObject p0){
       CDNUrl[] uCDNUrlArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNormalBottomBarItem.class, "1")) {
          return;
       }
       LiveNormalBottomBarItem$LiveBottomBarResponseItem liveBottomBa = new Gson().c(p0, LiveNormalBottomBarItem$LiveBottomBarResponseItem.class);
       if (liveBottomBa != null) {
          int i = -1;
          if (this.mFeatureId == i) {
             LiveNormalBottomBarItem$LiveBottomBarResponseItem mId = liveBottomBa.mId;
             if (mId != i) {
                this.mFeatureId = mId;
             }
          }
          if (TextUtils.x(this.mText) && !TextUtils.x(liveBottomBa.mName)) {
             this.mText = liveBottomBa.mName;
          }
          if (TextUtils.x(this.mKwaiLink) && !TextUtils.x(liveBottomBa.mKwaiLink)) {
             this.mKwaiLink = liveBottomBa.mKwaiLink;
          }
          i = 0;
          if (this.mIconUrl == null && !q.f(liveBottomBa.mIcons)) {
             uCDNUrlArray = new CDNUrl[i];
             this.mIconUrl = liveBottomBa.mIcons.toArray(uCDNUrlArray);
          }
          if (this.mSelectedIconUrl == null && !q.f(liveBottomBa.mSelectedIcons)) {
             uCDNUrlArray = new CDNUrl[i];
             this.mSelectedIconUrl = liveBottomBa.mSelectedIcons.toArray(uCDNUrlArray);
          }
          if (this.mLottieAnimation == null && !q.f(liveBottomBa.mLottieAnimation)) {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i];
             this.mLottieAnimation = liveBottomBa.mLottieAnimation.toArray(uCDNUrlArray1);
          }
          this.mDisableShowRedPoint = liveBottomBa.mDisableShowRedPoint;
          this.updateChildConfig(liveBottomBa);
       }
       return;
    }
    public void updateChildConfig(LiveNormalBottomBarItem$LiveBottomBarResponseItem p0){
    }
}
