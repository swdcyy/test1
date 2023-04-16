package com.kuaishou.godzilla.idc.KwaiIDCSelector;
import com.kuaishou.godzilla.idc.KwaiSpeedTestRequestGenerator;
import com.kuaishou.godzilla.idc.KwaIDCSpeedTestCallback;
import com.kuaishou.godzilla.idc.KwaiIDCStorage;
import java.lang.Object;
import com.kuaishou.godzilla.Godzilla$LibraryLoader;
import com.kuaishou.godzilla.Godzilla;
import java.lang.String;
import com.kuaishou.godzilla.idc.KwaiIDCHost;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class KwaiIDCSelector	// class@000899
{
    public long mPtr;

    public void KwaiIDCSelector(KwaiSpeedTestRequestGenerator p0,KwaIDCSpeedTestCallback p1,KwaiIDCStorage p2){
       super(p0, p1, p2, true);
    }
    public void KwaiIDCSelector(KwaiSpeedTestRequestGenerator p0,KwaIDCSpeedTestCallback p1,KwaiIDCStorage p2,boolean p3){
       super();
       Godzilla.initialize(null);
       this.mPtr = this.nativeInit(p0, p1, p2, p3);
    }
    public KwaiIDCHost getHost(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiIDCSelector.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetHost(this.mPtr, p0);
    }
    public int getHostCount(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiIDCSelector.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetHostCount(this.mPtr, p0);
    }
    public List getHosts(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiIDCSelector.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetHosts(this.mPtr, p0);
    }
    public void launchSpeedTest(){
       if (PatchProxy.applyVoid(null, this, KwaiIDCSelector.class, "11")) {
          return;
       }
       this.nativeLaunchSpeedTest(this.mPtr);
       return;
    }
    public native final void nativeDestroy(long p0);
    public native final KwaiIDCHost nativeGetHost(long p0,String p1);
    public native final int nativeGetHostCount(long p0,String p1);
    public native List nativeGetHosts(long p0,String p1);
    public native final long nativeInit(KwaiSpeedTestRequestGenerator p0,KwaIDCSpeedTestCallback p1,KwaiIDCStorage p2,boolean p3);
    public native final void nativeLaunchSpeedTest(long p0);
    public native final void nativePauseSpeedTest(long p0);
    public native final void nativeResumeSpeedTest(long p0);
    public native final void nativeSetGoodIdcThresholdMs(long p0,long p1);
    public native final void nativeSetHosts(long p0,String p1,List p2,boolean p3);
    public native final void nativeSetSpeedTestTypes(long p0,List p1);
    public native final void nativeSetTimeoutMs(long p0,long p1);
    public native final void nativeSwitchHost(long p0,String p1,KwaiIDCHost p2);
    public native final void nativeSwitchStringHost(long p0,String p1,String p2);
    public void pauseSpeedTest(){
       if (PatchProxy.applyVoid(null, this, KwaiIDCSelector.class, "9")) {
          return;
       }
       this.nativePauseSpeedTest(this.mPtr);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, KwaiIDCSelector.class, "14")) {
          return;
       }
       this.nativeDestroy(this.mPtr);
       this.mPtr = 0;
       return;
    }
    public void resumeSpeedTest(){
       if (PatchProxy.applyVoid(null, this, KwaiIDCSelector.class, "10")) {
          return;
       }
       this.nativeResumeSpeedTest(this.mPtr);
       return;
    }
    public void setGoodIdcThresholdMs(long p0){
       KwaiIDCSelector kwaiIDCSelec = KwaiIDCSelector.class;
       if (PatchProxy.isSupport(kwaiIDCSelec) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, kwaiIDCSelec, "7")) {
          return;
       }
       this.nativeSetGoodIdcThresholdMs(this.mPtr, p0);
       return;
    }
    public void setHosts(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiIDCSelector.class, "1")) {
          return;
       }
       this.setHosts(p0, p1, false);
       return;
    }
    public void setHosts(String p0,List p1,boolean p2){
       if (PatchProxy.isSupport(KwaiIDCSelector.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, KwaiIDCSelector.class, "2")) {
          return;
       }
       this.nativeSetHosts(this.mPtr, p0, p1, p2);
       return;
    }
    public void setSpeedTestTypes(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiIDCSelector.class, "8")) {
          return;
       }
       this.nativeSetSpeedTestTypes(this.mPtr, p0);
       return;
    }
    public void setTimeout(long p0){
       KwaiIDCSelector kwaiIDCSelec = KwaiIDCSelector.class;
       if (PatchProxy.isSupport(kwaiIDCSelec) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, kwaiIDCSelec, "6")) {
          return;
       }
       this.nativeSetTimeoutMs(this.mPtr, p0);
       return;
    }
    public void switchHost(String p0,KwaiIDCHost p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiIDCSelector.class, "4")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && p1 != null) {
          this.nativeSwitchHost(this.mPtr, p0, p1);
       }
       return;
    }
    public void switchHost(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiIDCSelector.class, "5")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && p1 != null) {
          this.nativeSwitchStringHost(this.mPtr, p0, p1);
       }
       return;
    }
}
