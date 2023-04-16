package com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import androidx.collection.ArraySet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CloneNotSupportedException;
import java.util.Set;
import com.kwai.framework.player.gotham.impl.KwaiSessionKeyGenerator;
import java.lang.Integer;
import java.lang.Boolean;
import ekd.j;
import java.util.Collection;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig$a;
import androidx.lifecycle.LifecycleOwner;
import moc.b;

public class DetailPlayConfig implements Serializable, Cloneable	// class@000ea0
{
    public int mContinuePlayStrategy;
    public boolean mContinuePlayWhileExit;
    public boolean mEnableSyncSharedPlayerStatus;
    public Set mInitPauseFlags;
    public KwaiSessionKeyGenerator mKeyGenerator;
    public String mPlayerSessionUuid;
    public int mSavePlayProgressStrategy;
    public boolean mSessionKeyGeneratorSharedIn;
    public int mShareControllerBundleId;
    public boolean mSharePlayer;
    public int[] mShareSupportFeedType;
    public boolean mSupportPlayInBackground;
    public boolean mUseHardDecoder;
    public boolean mUsePlayerKit;
    public boolean mUseSWDecoder;
    public boolean mUseSurfaceView;
    public static final long serialVersionUID = 0x335220eefb9f1514;

    public void DetailPlayConfig(){
       super();
       this.mShareControllerBundleId = -1;
       this.mSavePlayProgressStrategy = 0;
       this.mInitPauseFlags = new ArraySet();
    }
    public DetailPlayConfig clone(){
       DetailPlayConfig obj = PatchProxy.apply(null, this, DetailPlayConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          obj.mInitPauseFlags = new ArraySet();
          return obj;
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public int getContinuePlayStrategy(){
       return this.mContinuePlayStrategy;
    }
    public Set getInitPauseFlags(){
       return this.mInitPauseFlags;
    }
    public String getPlayerSessionUuid(){
       return this.mPlayerSessionUuid;
    }
    public int getSavePlayProgressStrategy(){
       return this.mSavePlayProgressStrategy;
    }
    public int getShareControllerBundleId(){
       return this.mShareControllerBundleId;
    }
    public KwaiSessionKeyGenerator getSharedPlaySessionKeyGenerator(){
       return this.mKeyGenerator;
    }
    public boolean isContinuePlayWhileExit(){
       return this.mContinuePlayWhileExit;
    }
    public boolean isEnableSyncSharedPlayerStatus(){
       return this.mEnableSyncSharedPlayerStatus;
    }
    public boolean isSharePlayer(){
       boolean b = (this.mSharePlayer != null || this.mSessionKeyGeneratorSharedIn != null)? true: false;
       return b;
    }
    public boolean isSharePlayerOld(){
       return this.mSharePlayer;
    }
    public boolean isSupportPlayInBackground(){
       return this.mSupportPlayInBackground;
    }
    public boolean isSupportSharedType(int p0){
       DetailPlayConfig obj;
       if (PatchProxy.isSupport(DetailPlayConfig.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, DetailPlayConfig.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.mShareSupportFeedType;
       if (obj != null) {
          return j.c(obj, p0);
       }else {
          return true;
       }
    }
    public boolean isUseHardDecoder(){
       return this.mUseHardDecoder;
    }
    public boolean isUseSWDecoder(){
       return this.mUseSWDecoder;
    }
    public boolean isUseSurfaceView(){
       return this.mUseSurfaceView;
    }
    public void setContinuePlayStrategy(int p0){
       this.mContinuePlayStrategy = p0;
    }
    public void setContinuePlayWhileExit(boolean p0){
       this.mContinuePlayWhileExit = p0;
    }
    public void setEnableSharePlayerMode(){
       this.mSharePlayer = true;
       this.mContinuePlayWhileExit = true;
    }
    public void setEnableSyncSharedPlayerStatus(boolean p0){
       this.mEnableSyncSharedPlayerStatus = p0;
    }
    public void setInitPauseFlags(Set p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailPlayConfig.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mInitPauseFlags.addAll(p0);
       return;
    }
    public void setPlayInBackground(boolean p0){
       this.mSupportPlayInBackground = p0;
    }
    public void setPlayerSessionUuid(String p0){
       this.mPlayerSessionUuid = p0;
    }
    public void setSavePlayProgressStrategy(int p0){
       this.mSavePlayProgressStrategy = p0;
    }
    public void setShareController(DetailPlayConfig$a p0,LifecycleOwner p1){
       this.mShareControllerBundleId = b.e(p0, p1);
    }
    public void setShareSupportFeedType(int[] p0){
       this.mShareSupportFeedType = p0;
    }
    public void setSharedPlaySessionKeyGenerator(KwaiSessionKeyGenerator p0){
       this.mKeyGenerator = p0;
       this.mSessionKeyGeneratorSharedIn = true;
    }
    public void setSharedPlaySessionKeyGeneratorInternal(KwaiSessionKeyGenerator p0){
       this.mKeyGenerator = p0;
    }
    public void setUseHardDecoder(boolean p0){
       this.mUseHardDecoder = p0;
    }
    public void setUsePlayerKitPlay(boolean p0){
       this.mUsePlayerKit = p0;
    }
    public void setUseSWDecoder(boolean p0){
       this.mUseSWDecoder = p0;
    }
    public void setUseSurfaceView(boolean p0){
       this.mUseSurfaceView = p0;
    }
    public boolean usePlayerKitPlayer(){
       return this.mUsePlayerKit;
    }
}
