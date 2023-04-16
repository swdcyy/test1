package com.kuaishou.krn.log.model.KrnPageFunnelLoadTime;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.lang.Long;
import java.lang.Integer;

public final class KrnPageFunnelLoadTime implements Serializable	// class@0008e2
{
    public Long baseBundleEndRunTime;
    public Long baseBundleRunStartToEnd;
    public Long baseBundleStartRunTime;
    public Long bridgeInitTime;
    public Long bridgeInitToLoadJsBundle;
    public Long bundleEndRunTime;
    public Long bundleInfoLoadEndTime;
    public Long bundleInfoLoadStartTime;
    public Long bundleLoadStartToEnd;
    public Long bundleRunStartToEnd;
    public Long bundleStartRunTime;
    public Long businessJsLoadEndTime;
    public Long businessJsLoadStartTime;
    public Long contentAppearedTime;
    public Long engineEndTime;
    public Long engineStartTime;
    public Long enterKdsToBridgeInit;
    public Long enterKdsToFmpLayoutUpdate;
    public Long enterKdsToFmpOnDraw;
    public Long enterKdsToLcpLayoutUpdate;
    public Long enterKdsToLcpOnDraw;
    public Long enterKdsToReactRootViewFirstOnAttach;
    public Long fcpTime;
    public Long fmpLayoutUpdateTime;
    public Long fmpOnDrawTime;
    public Long fmpOverHeadInShadowThread;
    public Long fmpOverHeadInUIThread;
    public Long fmpTime;
    public Long jsDataRequestEndTime;
    public Long jsDataRequestStartTime;
    public Long krnEntryTimestamp;
    public Long lcpLayoutUpdateTime;
    public Long lcpOnDrawTime;
    public Long lcpOverHeadInShadowThread;
    public Long lcpOverHeadInUIThread;
    public Long loadScriptStartToEnd;
    public Integer loadType;
    public Long mJsBundleRunEndToAppeared;
    public Long nativeT1;
    public Long pageExitTime;
    public Long prepareJSRuntimeStartTimestamp;
    public Long prepareJSRuntimeStartToEnd;
    public Long reactRootViewFirstOnAttachTime;
    public Long t1;
    public Long t2;
    public Long t3;
    public Long userClickTime;
    public Long userStartToEnterKds;
    public Long viewContainerEndTime;
    public Long viewContainerStartTime;

    public void KrnPageFunnelLoadTime(){
       super();
    }
    public final void calculate(){
       long l1;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KrnPageFunnelLoadTime.class, "1")) {
          return;
       }
       KrnPageFunnelLoadTime tuserClickTi = this.userClickTime;
       if (tuserClickTi != null) {
          long l = tuserClickTi.longValue();
          tuserClickTi = this.krnEntryTimestamp;
          if (tuserClickTi != null) {
             Long longx = Long.valueOf((tuserClickTi.longValue() - l));
          label_0023 :
             this.userStartToEnterKds = longx;
             tuserClickTi = this.krnEntryTimestamp;
             if (tuserClickTi != null) {
                l = tuserClickTi.longValue();
                tuserClickTi = this.bridgeInitTime;
                if (tuserClickTi != null) {
                   longx = Long.valueOf((tuserClickTi.longValue() - l));
                label_003c :
                   this.enterKdsToBridgeInit = longx;
                   tuserClickTi = this.bridgeInitTime;
                   if (tuserClickTi != null) {
                      l = tuserClickTi.longValue();
                      tuserClickTi = this.bundleInfoLoadStartTime;
                      if (tuserClickTi != null) {
                         longx = Long.valueOf((tuserClickTi.longValue() - l));
                      label_0055 :
                         this.bridgeInitToLoadJsBundle = longx;
                         tuserClickTi = this.bundleInfoLoadStartTime;
                         if (tuserClickTi != null) {
                            l = tuserClickTi.longValue();
                            tuserClickTi = this.bundleInfoLoadEndTime;
                            if (tuserClickTi != null) {
                               longx = Long.valueOf((tuserClickTi.longValue() - l));
                            label_006e :
                               this.bundleLoadStartToEnd = longx;
                               tuserClickTi = this.prepareJSRuntimeStartTimestamp;
                               if (tuserClickTi != null) {
                                  l = tuserClickTi.longValue();
                                  tuserClickTi = this.engineEndTime;
                                  if (tuserClickTi != null) {
                                     longx = Long.valueOf((tuserClickTi.longValue() - l));
                                  label_0087 :
                                     this.prepareJSRuntimeStartToEnd = longx;
                                     tuserClickTi = this.baseBundleStartRunTime;
                                     if (tuserClickTi != null) {
                                        l = tuserClickTi.longValue();
                                        tuserClickTi = this.baseBundleEndRunTime;
                                        if (tuserClickTi != null) {
                                           longx = Long.valueOf((tuserClickTi.longValue() - l));
                                        label_00a0 :
                                           this.baseBundleRunStartToEnd = longx;
                                           tuserClickTi = this.businessJsLoadStartTime;
                                           if (tuserClickTi != null) {
                                              l = tuserClickTi.longValue();
                                              tuserClickTi = this.businessJsLoadEndTime;
                                              if (tuserClickTi != null) {
                                                 longx = Long.valueOf((tuserClickTi.longValue() - l));
                                              label_00b9 :
                                                 this.loadScriptStartToEnd = longx;
                                                 tuserClickTi = this.bundleStartRunTime;
                                                 if (tuserClickTi != null) {
                                                    l = tuserClickTi.longValue();
                                                    tuserClickTi = this.bundleEndRunTime;
                                                    if (tuserClickTi != null) {
                                                       longx = Long.valueOf((tuserClickTi.longValue() - l));
                                                    label_00d2 :
                                                       this.bundleRunStartToEnd = longx;
                                                       tuserClickTi = this.contentAppearedTime;
                                                       if (tuserClickTi != null) {
                                                          l1 = 0;
                                                          if (!tuserClickTi.longValue() - l1) {
                                                          label_00e3 :
                                                             longx = Long.valueOf(l1);
                                                          label_00fb :
                                                             this.mJsBundleRunEndToAppeared = longx;
                                                             tuserClickTi = this.krnEntryTimestamp;
                                                             if (tuserClickTi != null) {
                                                                l = tuserClickTi.longValue();
                                                                tuserClickTi = this.reactRootViewFirstOnAttachTime;
                                                                if (tuserClickTi != null) {
                                                                   longx = Long.valueOf((tuserClickTi.longValue() - l));
                                                                label_0114 :
                                                                   this.enterKdsToReactRootViewFirstOnAttach = longx;
                                                                   tuserClickTi = this.krnEntryTimestamp;
                                                                   if (tuserClickTi != null) {
                                                                      l = tuserClickTi.longValue();
                                                                      tuserClickTi = this.lcpLayoutUpdateTime;
                                                                      if (tuserClickTi != null) {
                                                                         longx = Long.valueOf((tuserClickTi.longValue() - l));
                                                                      label_012d :
                                                                         this.enterKdsToLcpLayoutUpdate = longx;
                                                                         tuserClickTi = this.krnEntryTimestamp;
                                                                         if (tuserClickTi != null) {
                                                                            l = tuserClickTi.longValue();
                                                                            tuserClickTi = this.lcpOnDrawTime;
                                                                            if (tuserClickTi != null) {
                                                                               longx = Long.valueOf((tuserClickTi.longValue() - l));
                                                                            label_0146 :
                                                                               this.enterKdsToLcpOnDraw = longx;
                                                                               tuserClickTi = this.krnEntryTimestamp;
                                                                               if (tuserClickTi != null) {
                                                                                  l = tuserClickTi.longValue();
                                                                                  tuserClickTi = this.fmpLayoutUpdateTime;
                                                                                  if (tuserClickTi != null) {
                                                                                     longx = Long.valueOf((tuserClickTi.longValue() - l));
                                                                                  label_015f :
                                                                                     this.enterKdsToFmpLayoutUpdate = longx;
                                                                                     tuserClickTi = this.krnEntryTimestamp;
                                                                                     if (tuserClickTi != null) {
                                                                                        l = tuserClickTi.longValue();
                                                                                        tuserClickTi = this.fmpOnDrawTime;
                                                                                        if (tuserClickTi != null) {
                                                                                           objArray = Long.valueOf((tuserClickTi.longValue() - l));
                                                                                        }
                                                                                     }
                                                                                     this.enterKdsToFmpOnDraw = objArray;
                                                                                     return;
                                                                                  }
                                                                               }
                                                                               objArray1 = objArray;
                                                                               goto label_015f ;
                                                                            }
                                                                         }
                                                                         objArray1 = objArray;
                                                                         goto label_0146 ;
                                                                      }
                                                                   }
                                                                   objArray1 = objArray;
                                                                   goto label_012d ;
                                                                }
                                                             }
                                                             objArray1 = objArray;
                                                             goto label_0114 ;
                                                          }
                                                       }
                                                       tuserClickTi = this.bundleEndRunTime;
                                                       if (tuserClickTi != null) {
                                                          l = tuserClickTi.longValue();
                                                          tuserClickTi = this.contentAppearedTime;
                                                          if (tuserClickTi != null) {
                                                             l1 = tuserClickTi.longValue() - l;
                                                             goto label_00e3 ;
                                                          }
                                                       }
                                                       objArray1 = objArray;
                                                       goto label_00fb ;
                                                    }
                                                 }
                                                 objArray1 = objArray;
                                                 goto label_00d2 ;
                                              }
                                           }
                                           objArray1 = objArray;
                                           goto label_00b9 ;
                                        }
                                     }
                                     objArray1 = objArray;
                                     goto label_00a0 ;
                                  }
                               }
                               objArray1 = objArray;
                               goto label_0087 ;
                            }
                         }
                         objArray1 = objArray;
                         goto label_006e ;
                      }
                   }
                   objArray1 = objArray;
                   goto label_0055 ;
                }
             }
             objArray1 = objArray;
             goto label_003c ;
          }
       }
       objArray1 = objArray;
       goto label_0023 ;
    }
    public final Long getBaseBundleEndRunTime(){
       return this.baseBundleEndRunTime;
    }
    public final Long getBaseBundleRunStartToEnd(){
       return this.baseBundleRunStartToEnd;
    }
    public final Long getBaseBundleStartRunTime(){
       return this.baseBundleStartRunTime;
    }
    public final Long getBridgeInitTime(){
       return this.bridgeInitTime;
    }
    public final Long getBridgeInitToLoadJsBundle(){
       return this.bridgeInitToLoadJsBundle;
    }
    public final Long getBundleEndRunTime(){
       return this.bundleEndRunTime;
    }
    public final Long getBundleInfoLoadEndTime(){
       return this.bundleInfoLoadEndTime;
    }
    public final Long getBundleInfoLoadStartTime(){
       return this.bundleInfoLoadStartTime;
    }
    public final Long getBundleLoadStartToEnd(){
       return this.bundleLoadStartToEnd;
    }
    public final Long getBundleRunStartToEnd(){
       return this.bundleRunStartToEnd;
    }
    public final Long getBundleStartRunTime(){
       return this.bundleStartRunTime;
    }
    public final Long getBusinessJsLoadEndTime(){
       return this.businessJsLoadEndTime;
    }
    public final Long getBusinessJsLoadStartTime(){
       return this.businessJsLoadStartTime;
    }
    public final Long getContentAppearedTime(){
       return this.contentAppearedTime;
    }
    public final Long getEngineEndTime(){
       return this.engineEndTime;
    }
    public final Long getEngineStartTime(){
       return this.engineStartTime;
    }
    public final Long getEnterKdsToBridgeInit(){
       return this.enterKdsToBridgeInit;
    }
    public final Long getEnterKdsToFmpLayoutUpdate(){
       return this.enterKdsToFmpLayoutUpdate;
    }
    public final Long getEnterKdsToFmpOnDraw(){
       return this.enterKdsToFmpOnDraw;
    }
    public final Long getEnterKdsToLcpLayoutUpdate(){
       return this.enterKdsToLcpLayoutUpdate;
    }
    public final Long getEnterKdsToLcpOnDraw(){
       return this.enterKdsToLcpOnDraw;
    }
    public final Long getEnterKdsToReactRootViewFirstOnAttach(){
       return this.enterKdsToReactRootViewFirstOnAttach;
    }
    public final Long getFcpTime(){
       return this.fcpTime;
    }
    public final Long getFmpLayoutUpdateTime(){
       return this.fmpLayoutUpdateTime;
    }
    public final Long getFmpOnDrawTime(){
       return this.fmpOnDrawTime;
    }
    public final Long getFmpOverHeadInShadowThread(){
       return this.fmpOverHeadInShadowThread;
    }
    public final Long getFmpOverHeadInUIThread(){
       return this.fmpOverHeadInUIThread;
    }
    public final Long getFmpTime(){
       return this.fmpTime;
    }
    public final Long getJsDataRequestEndTime(){
       return this.jsDataRequestEndTime;
    }
    public final Long getJsDataRequestStartTime(){
       return this.jsDataRequestStartTime;
    }
    public final Long getKrnEntryTimestamp(){
       return this.krnEntryTimestamp;
    }
    public final Long getLcpLayoutUpdateTime(){
       return this.lcpLayoutUpdateTime;
    }
    public final Long getLcpOnDrawTime(){
       return this.lcpOnDrawTime;
    }
    public final Long getLcpOverHeadInShadowThread(){
       return this.lcpOverHeadInShadowThread;
    }
    public final Long getLcpOverHeadInUIThread(){
       return this.lcpOverHeadInUIThread;
    }
    public final Long getLoadScriptStartToEnd(){
       return this.loadScriptStartToEnd;
    }
    public final Integer getLoadType(){
       return this.loadType;
    }
    public final Long getMJsBundleRunEndToAppeared(){
       return this.mJsBundleRunEndToAppeared;
    }
    public final Long getNativeT1(){
       return this.nativeT1;
    }
    public final Long getPageExitTime(){
       return this.pageExitTime;
    }
    public final Long getPrepareJSRuntimeStartTimestamp(){
       return this.prepareJSRuntimeStartTimestamp;
    }
    public final Long getPrepareJSRuntimeStartToEnd(){
       return this.prepareJSRuntimeStartToEnd;
    }
    public final Long getReactRootViewFirstOnAttachTime(){
       return this.reactRootViewFirstOnAttachTime;
    }
    public final Long getT1(){
       return this.t1;
    }
    public final Long getT2(){
       return this.t2;
    }
    public final Long getT3(){
       return this.t3;
    }
    public final Long getUserClickTime(){
       return this.userClickTime;
    }
    public final Long getUserStartToEnterKds(){
       return this.userStartToEnterKds;
    }
    public final Long getViewContainerEndTime(){
       return this.viewContainerEndTime;
    }
    public final Long getViewContainerStartTime(){
       return this.viewContainerStartTime;
    }
    public final void setBaseBundleEndRunTime(Long p0){
       this.baseBundleEndRunTime = p0;
    }
    public final void setBaseBundleRunStartToEnd(Long p0){
       this.baseBundleRunStartToEnd = p0;
    }
    public final void setBaseBundleStartRunTime(Long p0){
       this.baseBundleStartRunTime = p0;
    }
    public final void setBridgeInitTime(Long p0){
       this.bridgeInitTime = p0;
    }
    public final void setBridgeInitToLoadJsBundle(Long p0){
       this.bridgeInitToLoadJsBundle = p0;
    }
    public final void setBundleEndRunTime(Long p0){
       this.bundleEndRunTime = p0;
    }
    public final void setBundleInfoLoadEndTime(Long p0){
       this.bundleInfoLoadEndTime = p0;
    }
    public final void setBundleInfoLoadStartTime(Long p0){
       this.bundleInfoLoadStartTime = p0;
    }
    public final void setBundleLoadStartToEnd(Long p0){
       this.bundleLoadStartToEnd = p0;
    }
    public final void setBundleRunStartToEnd(Long p0){
       this.bundleRunStartToEnd = p0;
    }
    public final void setBundleStartRunTime(Long p0){
       this.bundleStartRunTime = p0;
    }
    public final void setBusinessJsLoadEndTime(Long p0){
       this.businessJsLoadEndTime = p0;
    }
    public final void setBusinessJsLoadStartTime(Long p0){
       this.businessJsLoadStartTime = p0;
    }
    public final void setContentAppearedTime(Long p0){
       this.contentAppearedTime = p0;
    }
    public final void setEngineEndTime(Long p0){
       this.engineEndTime = p0;
    }
    public final void setEngineStartTime(Long p0){
       this.engineStartTime = p0;
    }
    public final void setEnterKdsToBridgeInit(Long p0){
       this.enterKdsToBridgeInit = p0;
    }
    public final void setEnterKdsToFmpLayoutUpdate(Long p0){
       this.enterKdsToFmpLayoutUpdate = p0;
    }
    public final void setEnterKdsToFmpOnDraw(Long p0){
       this.enterKdsToFmpOnDraw = p0;
    }
    public final void setEnterKdsToLcpLayoutUpdate(Long p0){
       this.enterKdsToLcpLayoutUpdate = p0;
    }
    public final void setEnterKdsToLcpOnDraw(Long p0){
       this.enterKdsToLcpOnDraw = p0;
    }
    public final void setEnterKdsToReactRootViewFirstOnAttach(Long p0){
       this.enterKdsToReactRootViewFirstOnAttach = p0;
    }
    public final void setFcpTime(Long p0){
       this.fcpTime = p0;
    }
    public final void setFmpLayoutUpdateTime(Long p0){
       this.fmpLayoutUpdateTime = p0;
    }
    public final void setFmpOnDrawTime(Long p0){
       this.fmpOnDrawTime = p0;
    }
    public final void setFmpOverHeadInShadowThread(Long p0){
       this.fmpOverHeadInShadowThread = p0;
    }
    public final void setFmpOverHeadInUIThread(Long p0){
       this.fmpOverHeadInUIThread = p0;
    }
    public final void setFmpTime(Long p0){
       this.fmpTime = p0;
    }
    public final void setJsDataRequestEndTime(Long p0){
       this.jsDataRequestEndTime = p0;
    }
    public final void setJsDataRequestStartTime(Long p0){
       this.jsDataRequestStartTime = p0;
    }
    public final void setKrnEntryTimestamp(Long p0){
       this.krnEntryTimestamp = p0;
    }
    public final void setLcpLayoutUpdateTime(Long p0){
       this.lcpLayoutUpdateTime = p0;
    }
    public final void setLcpOnDrawTime(Long p0){
       this.lcpOnDrawTime = p0;
    }
    public final void setLcpOverHeadInShadowThread(Long p0){
       this.lcpOverHeadInShadowThread = p0;
    }
    public final void setLcpOverHeadInUIThread(Long p0){
       this.lcpOverHeadInUIThread = p0;
    }
    public final void setLoadScriptStartToEnd(Long p0){
       this.loadScriptStartToEnd = p0;
    }
    public final void setLoadType(Integer p0){
       this.loadType = p0;
    }
    public final void setMJsBundleRunEndToAppeared(Long p0){
       this.mJsBundleRunEndToAppeared = p0;
    }
    public final void setNativeT1(Long p0){
       this.nativeT1 = p0;
    }
    public final void setPageExitTime(Long p0){
       this.pageExitTime = p0;
    }
    public final void setPrepareJSRuntimeStartTimestamp(Long p0){
       this.prepareJSRuntimeStartTimestamp = p0;
    }
    public final void setPrepareJSRuntimeStartToEnd(Long p0){
       this.prepareJSRuntimeStartToEnd = p0;
    }
    public final void setReactRootViewFirstOnAttachTime(Long p0){
       this.reactRootViewFirstOnAttachTime = p0;
    }
    public final void setT1(Long p0){
       this.t1 = p0;
    }
    public final void setT2(Long p0){
       this.t2 = p0;
    }
    public final void setT3(Long p0){
       this.t3 = p0;
    }
    public final void setUserClickTime(Long p0){
       this.userClickTime = p0;
    }
    public final void setUserStartToEnterKds(Long p0){
       this.userStartToEnterKds = p0;
    }
    public final void setViewContainerEndTime(Long p0){
       this.viewContainerEndTime = p0;
    }
    public final void setViewContainerStartTime(Long p0){
       this.viewContainerStartTime = p0;
    }
}
