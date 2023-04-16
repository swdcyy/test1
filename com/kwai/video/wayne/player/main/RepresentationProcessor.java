package com.kwai.video.wayne.player.main.RepresentationProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.main.RepresentationProcessor$Companion;
import nsd.u;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.video.wayne.player.main.RepresentationProcessor$mOnRepresentationListener$1;
import com.kwai.video.wayne.player.main.RepresentationProcessor$mOnPreparedListener$1;
import com.kwai.video.wayne.player.listeners.OnQualityChangeListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.logreport.KPMidTrace;
import com.kwai.player.KwaiRepresentation;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import zsd.u;
import java.util.List;
import com.kwai.video.player.mid.manifest.RepInterface;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.datasource.IDatasource;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.video.player.mid.manifest.v2.Representation;
import com.kwai.video.player.IKwaiRepresentationListener;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import com.kwai.video.wayne.player.main.RepresentationProcessor$onAttach$1;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$AbsListenerInterceptor;
import com.kwai.video.wayne.player.main.RepresentationProcessor$onAttach$2;
import com.kwai.video.wayne.player.listeners.OnBuildDataChangedListener;
import com.kwai.video.player.mid.manifest.v2.filter.PhotoInfo;
import com.kwai.video.wayne.player.main._1_AbstractMediaPlayerApiDelegate;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import ai7.d;
import com.kwai.video.wayne.player.config.inerface.InjectConfigInterface;
import com.kwai.video.wayne.player.main._0_AbstractPlayerHolder;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.wayne.player.main.RepresentationProcessor$resolutionIsReadyForHlsMaster$$inlined$sortByDescending$1;
import java.util.Comparator;
import trd.x;
import com.kwai.video.wayne.player.main.PlayerState;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import com.kwai.video.wayne.player.builder.ISelectManifestRep;

public final class RepresentationProcessor extends AbsKpMidProcessor	// class@000d94
{
    public boolean mIsSupportChangeRepAtRuntime;
    public boolean mIsSwitching;
    public final RepresentationProcessor$mOnPreparedListener$1 mOnPreparedListener;
    public final Set mOnQualityChangeListeners;
    public RepresentationProcessor$mOnRepresentationListener$1 mOnRepresentationListener;
    public int mRealRepresentationId;
    public List mReps;
    public int mUserRepresentationId;
    public static final RepresentationProcessor$Companion Companion;

    static {
       RepresentationProcessor.Companion = new RepresentationProcessor$Companion(null);
    }
    public void RepresentationProcessor(){
       super();
       this.mUserRepresentationId = -1;
       this.mRealRepresentationId = -1;
       this.mOnQualityChangeListeners = new CopyOnWriteArraySet();
       this.mReps = new CopyOnWriteArrayList();
       this.mOnRepresentationListener = new RepresentationProcessor$mOnRepresentationListener$1(this);
       this.mOnPreparedListener = new RepresentationProcessor$mOnPreparedListener$1(this);
    }
    public final void addOnQualityChangedListener(OnQualityChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RepresentationProcessor.class, "15")) {
          return;
       }
       a.p(p0, "listener");
       this.mOnQualityChangeListeners.add(p0);
       return;
    }
    public final void dispatchRepresentationSwitchEnd(int p0,boolean p1){
       RepresentationProcessor representati = RepresentationProcessor.class;
       if (PatchProxy.isSupport(representati) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, representati, "14")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "dispatchRepresentationSwitchEnd id: "+p0+" isAuto: "+p0);
       this.getMediaPlayer().getMKPMidTrace().addStamp("repSwitchEnd");
       this.mIsSwitching = false;
       int aUTO_ID = (p1)? KwaiRepresentation.AUTO_ID: p0;
       this.mUserRepresentationId = aUTO_ID;
       this.mRealRepresentationId = p0;
       Iterator iterator = this.mOnQualityChangeListeners.iterator();
       while (iterator.hasNext()) {
          OnQualityChangeListener onQualityCha = iterator.next();
          onQualityCha.onUserSwitchEnd(this.mUserRepresentationId);
          onQualityCha.onRealQualityIdSelect(this.mRealRepresentationId, p1);
       }
       return;
    }
    public final String getLogTag(){
       String obj = PatchProxy.apply(null, this, RepresentationProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.isAttach())? this.getMediaPlayer().getLogTag()+"::RepresentationProcessor": "RepresentationProcessor";
       return obj;
    }
    public final int getRealRepresentationId(){
       return this.mRealRepresentationId;
    }
    public final int getRepIdFromQualityType(String p0){
       List obj = PatchProxy.applyOneRefs(p0, this, RepresentationProcessor.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return -1;
       }
       if (u.I1(p0, KwaiRepresentation.AUTO_TYPE, true)) {
          return KwaiRepresentation.AUTO_ID;
       }
       if (this.getMediaPlayer().getQualityList() == null) {
          return -1;
       }
       obj = this.getMediaPlayer().getQualityList();
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             RepInterface repInterface = iterator.next();
             if ((repInterface.getQualityType()).equals(p0)) {
                return repInterface.getId();
             }
          }
       }
       return -1;
    }
    public final int getUserRepresentationId(){
       return this.mUserRepresentationId;
    }
    public final void initQualityList(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RepresentationProcessor.class, "6")) {
          return;
       }
       IDatasource dataSourceMo = this.getMediaPlayer().getBuildData().getDataSourceModule();
       if (dataSourceMo != null) {
          objArray = dataSourceMo.getKwaiManifest();
       }
       if (objArray != null) {
          dataSourceMo = this.getMediaPlayer().getBuildData().getDataSourceModule();
          a.o(dataSourceMo, "mediaPlayer.getBuildData\(\).dataSourceModule");
          KwaiManifest kwaiManifest = dataSourceMo.getKwaiManifest();
          a.o(kwaiManifest, "manifest");
          this.getMediaPlayer().getMKPMidTrace().addVseKV(kwaiManifest.getExtraQosInfo());
          ArrayList uArrayList = new ArrayList();
          if (kwaiManifest.getRepList() != null) {
             uArrayList.addAll(kwaiManifest.getRepList());
             Representation representati = new Representation();
             representati.mId = KwaiRepresentation.AUTO_ID;
             representati.setQualityType("auto");
             uArrayList.add(representati);
          }
          this.getMediaPlayer().setQualityList(uArrayList);
       }
       return;
    }
    public final boolean isHdrChang(int p0,int p1){
       Iterator obj;
       KwaiRepresentation kwaiRepresen;
       KwaiRepresentation kwaiRepresen1;
       RepresentationProcessor representati = RepresentationProcessor.class;
       if (PatchProxy.isSupport(representati)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, representati, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       DebugLog.i(this.getLogTag(), "from "+p0+" to "+p1);
       boolean b = false;
       if (p1 == KwaiRepresentation.AUTO_ID) {
          return b;
       }else {
          representati = this.mReps;
          if (representati != null) {
             obj = representati.iterator();
             kwaiRepresen = null;
             kwaiRepresen1 = null;
             while (obj.hasNext()) {
                KwaiRepresentation kwaiRepresen2 = obj.next();
                KwaiRepresentation id = kwaiRepresen2.id;
                if (id == p0) {
                   kwaiRepresen = kwaiRepresen2.hdrType;
                }else if(id == p1){
                   kwaiRepresen1 = kwaiRepresen2.hdrType;
                }
             }
          }else {
             kwaiRepresen = null;
             kwaiRepresen1 = null;
          }
          if (kwaiRepresen != kwaiRepresen1) {
             b = true;
          }
          return b;
       }
    }
    public final boolean isSupportRepresentation(){
       Object obj = PatchProxy.apply(null, this, RepresentationProcessor.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isAttach()) {
          return false;
       }
       return this.getMediaPlayer().getBuildData().isManifestV2();
    }
    public final boolean isVideoCodecChang(int p0,int p1){
       Iterator obj;
       String str2;
       RepresentationProcessor representati = RepresentationProcessor.class;
       if (PatchProxy.isSupport(representati)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, representati, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       DebugLog.i(this.getLogTag(), "from "+p0+" to "+p1);
       boolean b = false;
       if (p1 == KwaiRepresentation.AUTO_ID) {
          return b;
       }else {
          representati = this.mReps;
          String str = "";
          if (representati != null) {
             obj = representati.iterator();
             String str1 = str;
             str2 = str1;
             while (obj.hasNext()) {
                KwaiRepresentation kwaiRepresen = obj.next();
                KwaiRepresentation id = kwaiRepresen.id;
                if (id == p0) {
                   str1 = kwaiRepresen.videoCodec;
                   if (str1 != null) {
                      continue ;
                   }
                }else if(id == p1){
                   str2 = kwaiRepresen.videoCodec;
                   if (str2 != null) {
                      continue ;
                   }else {
                      str2 = str;
                   }
                }
                str1 = str;
             }
             str = str1;
          }else {
             str2 = str;
          }
          if (a.g(str, str2) ^ 1) {
             Boolean uBoolean = (str != null)? Boolean.valueOf(str.equals(str2)): null;
             if (!uBoolean.booleanValue()) {
                b = true;
             }
          }
          return b;
       }
    }
    public final void notifyRepresentationListReady(){
       if (PatchProxy.applyVoid(null, this, RepresentationProcessor.class, "8")) {
          return;
       }
       List qualityList = this.getMediaPlayer().getQualityList();
       if (qualityList != null && !qualityList.size()) {
          return;
       }
       if (this.getMediaPlayer().isHlsManifestSource()) {
          this.setUserRepresentationId();
       }
       Iterator iterator = this.mOnQualityChangeListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onRepresentationListReady(this.getMediaPlayer().getQualityList());
       }
       return;
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, RepresentationProcessor.class, "4")) {
          return;
       }
       this.getMediaPlayer().setKwaiRepresentationListener(this.mOnRepresentationListener);
       this.getMediaPlayer().addPreparedListenerInterceptor(new RepresentationProcessor$onAttach$1(this, this.mOnPreparedListener));
       this.getMediaPlayer().addOnPlayerVodBuildDataChangedListener(new RepresentationProcessor$onAttach$2(this));
       this.initQualityList();
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, RepresentationProcessor.class, "18")) {
          return;
       }
       this.getMediaPlayer().setKwaiRepresentationListener(null);
       return;
    }
    public void onKernelPlayerCreated(){
       if (PatchProxy.applyVoid(null, this, RepresentationProcessor.class, "5")) {
          return;
       }
       super.onKernelPlayerCreated();
       this.notifyRepresentationListReady();
       IDatasource dataSourceMo = this.getMediaPlayer().getBuildData().getDataSourceModule();
       a.o(dataSourceMo, "mediaPlayer.getBuildData\(\).dataSourceModule");
       KwaiManifest kwaiManifest = dataSourceMo.getKwaiManifest();
       if (kwaiManifest != null) {
          int i = 2;
          if (kwaiManifest.getPhotoInfo() != null && kwaiManifest.getPhotoInfo().getShouldUseVip()) {
             this.getMediaPlayer().updateAdaptiveMode(i);
          }
          if (WaynePlayerConfigImpl.getConfigGet().getSwitchProvider().getBoolean("enableBufferOptForFeedAd", false) && (kwaiManifest.getPhotoInfo() != null && (kwaiManifest.getPhotoInfo().getAdType() != 1 && (kwaiManifest.getPhotoInfo().getAdType() != i && (kwaiManifest.getPhotoInfo().getAdType() == 8 || kwaiManifest.getPhotoInfo().getAdType() == 11))))) {
             this.getMediaPlayer().mKwaiMediaPlayer.setOption(4, "enable-buffer-opt-for-ad", 1);
          }
       }
    label_0093 :
       return;
    }
    public void onKernelPlayerDestroy(){
       if (PatchProxy.applyVoid(null, this, RepresentationProcessor.class, "17")) {
          return;
       }
       super.onKernelPlayerDestroy();
       DebugLog.i(this.getLogTag(), "kernel player destroy, reset all state");
       this.mIsSwitching = false;
       this.mIsSupportChangeRepAtRuntime = false;
       this.mUserRepresentationId = -1;
       this.mRealRepresentationId = -1;
       return;
    }
    public final void removeOnQualityChangedListener(OnQualityChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RepresentationProcessor.class, "16")) {
          return;
       }
       a.p(p0, "listener");
       this.mOnQualityChangeListeners.remove(p0);
       return;
    }
    public final void resolutionIsReadyForHlsMaster(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RepresentationProcessor.class, "7")) {
          return;
       }
       if (p0 != null && p0.size() > 1) {
          x.p0(p0, new RepresentationProcessor$resolutionIsReadyForHlsMaster$$inlined$sortByDescending$1());
       }
       ArrayList uArrayList = new ArrayList();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(new Representation(iterator.next()));
          }
       }
       this.getMediaPlayer().setQualityList(uArrayList);
       this.notifyRepresentationListReady();
       return;
    }
    public final void setRepresentation(int p0){
       RepresentationProcessor representati = RepresentationProcessor.class;
       if (PatchProxy.isSupport(representati) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, representati, "11")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "setRepresentation: "+p0);
       if (!this.isAttach()) {
          DebugLog.e(this.getLogTag(), "processor do not attached, do nothing!!!");
          return;
       }else if(!this.isSupportRepresentation()){
          DebugLog.e(this.getLogTag(), "setRepresentation only support manifestV2");
          return;
       }else {
          PlayerState innerState = this.getMediaPlayer().getInnerState();
          if (innerState != PlayerState.Paused && innerState != PlayerState.Playing) {
             DebugLog.e(this.getLogTag(), "player id at illegal state: "+innerState);
             return;
          }else {
             int b = this.isHdrChang(this.getRealRepresentationId(), p0);
             boolean b1 = this.isVideoCodecChang(this.getRealRepresentationId(), p0);
             DebugLog.i(this.getLogTag(), "isHdrChange: "+b+" isVideoCodecChange:"+b1);
             if (this.mIsSupportChangeRepAtRuntime != null && (!b && !b1)) {
                DebugLog.i(this.getLogTag(), "support setRepresentationAtRuntime");
                this.setRepresentationAtRuntime(p0);
                return;
             }else {
                DebugLog.i(this.getLogTag(), "setRepresentation by recreate player");
                IDatasource dataSourceMo = this.getMediaPlayer().getBuildData().getDataSourceModule();
                a.o(dataSourceMo, "mediaPlayer.getBuildData\(\).dataSourceModule");
                b = dataSourceMo.getSelectedRepId();
                Iterator iterator = this.mOnQualityChangeListeners.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onUserSwitchQualityStart(b, p0);
                }
                WayneBuildData buildData = this.getMediaPlayer().getBuildData();
                buildData.setStartPosition(this.getMediaPlayer().getCurrentPosition());
                if (innerState == PlayerState.Playing) {
                   buildData.setStartPlayType(2);
                }else {
                   buildData.setStartPlayType(0);
                }
                if (buildData.getDataSourceModule().setSelectedRepId(p0)) {
                   this.getMediaPlayer().resetPlayer(3);
                   buildData.setSelectManifestRepId(p0);
                   this.mUserRepresentationId = p0;
                   this.getMediaPlayer().createPlayer(5);
                   this.getMediaPlayer().prepareAsync();
                   this.mIsSwitching = true;
                   return;
                }else {
                   DebugLog.e(this.getLogTag(), "have no this repId:"+p0);
                   return;
                }
             }
          }
       }
    }
    public final void setRepresentation(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RepresentationProcessor.class, "9")) {
          return;
       }
       a.p(p0, "qualityType");
       this.setRepresentation(this.getRepIdFromQualityType(p0));
       return;
    }
    public final void setRepresentationAtRuntime(int p0){
       RepresentationProcessor representati = RepresentationProcessor.class;
       if (PatchProxy.isSupport(representati) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, representati, "13")) {
          return;
       }
       DebugLog.i(this.getLogTag(), "setRepresentationAtRuntime "+p0);
       this.getMediaPlayer().getBuildData().setSelectManifestRepId(p0);
       Iterator iterator = this.mOnQualityChangeListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onUserSwitchQualityStart(this.mUserRepresentationId, p0);
       }
       this.mIsSwitching = true;
       IKwaiMediaPlayer kernelPlayer = this.getMediaPlayer().getKernelPlayer();
       if (kernelPlayer != null) {
          kernelPlayer.setRepresentation(p0);
       }
       return;
    }
    public final void setUserRepresentationId(){
       if (PatchProxy.applyVoid(null, this, RepresentationProcessor.class, "19")) {
          return;
       }
       ISelectManifestRep selectManife = this.getMediaPlayer().getBuildData().getSelectManifestRepIdListener();
       if (selectManife != null && this.getMediaPlayer().getQualityList() != null) {
          List qualityList = this.getMediaPlayer().getQualityList();
          a.m(qualityList);
          this.mUserRepresentationId = selectManife.selectRepId(qualityList);
          this.getMediaPlayer().getBuildData().setSelectManifestRepId(this.mUserRepresentationId);
       }else {
          this.mUserRepresentationId = this.getMediaPlayer().getBuildData().getSelectManifestRepId();
       }
       List qualityList1 = this.getMediaPlayer().getQualityList();
       if (qualityList1 != null) {
          Iterator iterator = qualityList1.iterator();
          while (iterator.hasNext()) {
             RepInterface repInterface = iterator.next();
             DebugLog.i(this.getLogTag(), "setUserRepresentationId id "+repInterface.getId()+" qualitytype "+repInterface.getQualityType());
          }
       }
       DebugLog.i(this.getLogTag(), "setUserRepresentationId: "+this.mUserRepresentationId);
       return;
    }
}
