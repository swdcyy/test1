package com.hpplay.sdk.source.api.LelinkPlayerInfo;
import android.os.Parcelable;
import com.hpplay.sdk.source.browse.api.IAPI;
import com.hpplay.sdk.source.api.LelinkPlayerInfo$1;
import java.lang.Object;
import java.util.ArrayList;
import com.hpplay.sdk.source.bean.PlayerInfoBean;
import com.hpplay.sdk.source.bean.AesBean;
import android.os.Parcel;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.lang.ClassLoader;
import java.lang.Class;
import com.hpplay.sdk.source.bean.DanmakuBean;
import java.lang.String;
import com.hpplay.sdk.source.bean.MediaAssetBean;
import android.util.SparseArray;
import android.net.Uri;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;
import android.content.Intent;
import java.lang.Boolean;
import java.util.List;

public class LelinkPlayerInfo implements Parcelable, IAPI	// class@00063c
{
    public int bitRateLevel;
    public DanmakuBean danmukuInfo;
    public String header;
    public Intent intent;
    public boolean isAutoBitrate;
    public boolean isFullScreen;
    public boolean isUseCurrentConnection;
    public boolean isZoom;
    public String localPath;
    public int loopMode;
    public LelinkServiceInfo mLelinkServiceInfo;
    public SparseArray mMonitors;
    public MediaAssetBean mediaAssetBean;
    public boolean mirrorAudioEnable;
    public PlayerInfoBean playerInfoBean;
    public int resolutionLevel;
    public String screenCode;
    public String screenShotPath;
    public int startPosition;
    public int type;
    public Uri uri;
    public String url;
    public ArrayList urls;
    public static final Parcelable$Creator CREATOR;

    static {
       LelinkPlayerInfo.CREATOR = new LelinkPlayerInfo$1();
    }
    public void LelinkPlayerInfo(){
       super();
       this.resolutionLevel = -1;
       this.bitRateLevel = -1;
       this.mirrorAudioEnable = false;
       this.isZoom = true;
       this.loopMode = -1;
       this.urls = new ArrayList();
       this.isUseCurrentConnection = false;
       this.isAutoBitrate = false;
       PlayerInfoBean playerInfoBe = new PlayerInfoBean();
       this.playerInfoBean = playerInfoBe;
       playerInfoBe.getAesBean().setMode(true);
    }
    public void LelinkPlayerInfo(Parcel p0){
       super();
       this.resolutionLevel = -1;
       this.bitRateLevel = -1;
       boolean b = false;
       this.mirrorAudioEnable = b;
       this.isZoom = true;
       this.loopMode = -1;
       this.urls = new ArrayList();
       this.isUseCurrentConnection = b;
       try{
          this.isAutoBitrate = b;
          this.mLelinkServiceInfo = p0.readParcelable(LelinkServiceInfo.class.getClassLoader());
          this.danmukuInfo = p0.readParcelable(DanmakuBean.class.getClassLoader());
          this.url = p0.readString();
          this.localPath = p0.readString();
          this.startPosition = p0.readInt();
          this.type = p0.readInt();
          this.resolutionLevel = p0.readInt();
          this.bitRateLevel = p0.readInt();
          boolean b1 = (p0.readByte())? true: false;
          this.mirrorAudioEnable = b1;
          this.screenCode = p0.readString();
          b1 = (p0.readByte())? true: false;
          this.isZoom = b1;
          this.header = p0.readString();
          this.mediaAssetBean = p0.readParcelable(MediaAssetBean.class.getClassLoader());
          this.loopMode = p0.readInt();
          this.mMonitors = p0.readSparseArray(String.class.getClassLoader());
          this.urls = p0.createStringArrayList();
          this.playerInfoBean = p0.readParcelable(PlayerInfoBean.class.getClassLoader());
          b1 = (p0.readByte())? true: false;
          this.isFullScreen = b1;
          b1 = (p0.readByte())? true: false;
          this.isUseCurrentConnection = b1;
          this.screenShotPath = p0.readString();
          if (p0.readByte()) {
             b = true;
          }
          this.isAutoBitrate = b;
          this.uri = p0.readParcelable(Uri.class.getClassLoader());
       }catch(java.lang.Exception e4){
          a.b("LelinkPlayerInfo", e4);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public int getBitRateLevel(){
       return this.bitRateLevel;
    }
    public DanmakuBean getDanmukuInfo(){
       return this.danmukuInfo;
    }
    public String getHeader(){
       return this.header;
    }
    public Intent getIntent(){
       return this.intent;
    }
    public LelinkServiceInfo getLelinkServiceInfo(){
       return this.mLelinkServiceInfo;
    }
    public Uri getLoaclUri(){
       return this.uri;
    }
    public String getLocalPath(){
       return this.localPath;
    }
    public int getLoopMode(){
       return this.loopMode;
    }
    public MediaAssetBean getMediaAsset(){
       return this.mediaAssetBean;
    }
    public SparseArray getMonitors(){
       return this.mMonitors;
    }
    public Object getOption(int p0,Object[] p1){
       if (0x10006 == p0) {
          return this.screenCode;
       }
       if (0x100010 == p0) {
          return Boolean.valueOf(this.isFullScreen);
       }
       if (0x100018 == p0) {
          return Boolean.valueOf(this.isZoom);
       }
       if (0x100019 == p0) {
          return this.screenShotPath;
       }
       if (0x100022 == p0) {
          return Boolean.valueOf(this.isUseCurrentConnection);
       }
       if (0x100031 == p0) {
          return Boolean.valueOf(this.isAutoBitrate);
       }
       return null;
    }
    public PlayerInfoBean getPlayInfoBean(){
       return this.playerInfoBean;
    }
    public int getResolutionLevel(){
       return this.resolutionLevel;
    }
    public int getStartPosition(){
       return this.startPosition;
    }
    public int getType(){
       return this.type;
    }
    public String getUrl(){
       return this.url;
    }
    public ArrayList getUrlList(){
       return this.urls;
    }
    public boolean isMirrorAudioEnable(){
       return this.mirrorAudioEnable;
    }
    public Object performAction(int p0,Object[] p1){
       return null;
    }
    public void putMonitor(int p0,String p1){
       if (this.mMonitors == null) {
          this.mMonitors = new SparseArray();
       }
       if (p0 != 1 && (p0 != 2 && (p0 != 3 && p0 != 4))) {
          a.f("LelinkPlayerInfo", "putMonitor serviceNumber is invalid");
          return;
       }else {
          this.mMonitors.put(p0, p1);
          return;
       }
    }
    public void setAesIv(String p0){
       this.playerInfoBean.getAesBean().setIv(p0);
    }
    public void setAesKey(String p0){
       this.playerInfoBean.getAesBean().setKey(p0);
    }
    public void setBitRateLevel(int p0){
       this.bitRateLevel = p0;
    }
    public void setDanmukuInfo(DanmakuBean p0){
       this.danmukuInfo = p0;
    }
    public void setHeader(String p0){
       this.header = p0;
    }
    public void setIntent(Intent p0){
       this.intent = p0;
    }
    public void setLelinkServiceInfo(LelinkServiceInfo p0){
       this.mLelinkServiceInfo = p0;
    }
    public void setLoaclUri(Uri p0){
       this.uri = p0;
    }
    public void setLocalPath(String p0){
       this.localPath = p0;
    }
    public void setLoopMode(int p0){
       this.loopMode = p0;
    }
    public void setMediaAsset(MediaAssetBean p0){
       this.mediaAssetBean = p0;
    }
    public void setMirrorAudioEnable(boolean p0){
       this.mirrorAudioEnable = p0;
    }
    public Object setOption(int p0,Object[] p1){
       if (0x10006 == p0 && (p1 != null && (p1[0] != null && p1[0] instanceof String))) {
          this.screenCode = p1[0].toString();
       }else if(0x100010 == p0 && (p1 != null && (p1[0] != null && p1[0] instanceof Boolean))){
          this.isFullScreen = p1[0].booleanValue();
       }else if(0x100018 == p0){
          this.isZoom = p1[0].booleanValue();
       }else if(0x100019 == p0 && (p1 != null && (p1[0] != null && p1[0] instanceof String))){
          this.screenShotPath = p1[0];
       }else if(0x100022 == p0 && (p1 != null && (p1[0] != null && p1[0] instanceof Boolean))){
          this.isUseCurrentConnection = p1[0].booleanValue();
       }else if(0x100031 == p0 && (p1 != null && (p1[0] != null && p1[0] instanceof Boolean))){
          this.isAutoBitrate = p1[0].booleanValue();
       }
       return null;
    }
    public void setResolutionLevel(int p0){
       this.resolutionLevel = p0;
    }
    public void setStartPosition(int p0){
       this.startPosition = p0;
    }
    public void setType(int p0){
       this.type = p0;
    }
    public void setUrl(String p0){
       this.url = p0;
    }
    public void setUrlList(ArrayList p0){
       this.urls = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.mLelinkServiceInfo, p1);
       p0.writeParcelable(this.danmukuInfo, p1);
       p0.writeString(this.url);
       p0.writeString(this.localPath);
       p0.writeInt(this.startPosition);
       p0.writeInt(this.type);
       p0.writeInt(this.resolutionLevel);
       p0.writeInt(this.bitRateLevel);
       p0.writeByte(this.mirrorAudioEnable);
       p0.writeString(this.screenCode);
       p0.writeByte(this.isZoom);
       p0.writeString(this.header);
       p0.writeParcelable(this.mediaAssetBean, p1);
       p0.writeInt(this.loopMode);
       p0.writeSparseArray(this.mMonitors);
       p0.writeStringList(this.urls);
       p0.writeParcelable(this.playerInfoBean, p1);
       p0.writeByte(this.isFullScreen);
       p0.writeByte(this.isUseCurrentConnection);
       p0.writeString(this.screenShotPath);
       p0.writeByte(this.isAutoBitrate);
       p0.writeParcelable(this.uri, p1);
    }
}
