package com.kwai.video.waynelive.LivePlayUrlInfo;
import java.lang.Object;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import com.kwai.video.waynelive.LivePlayUrlInfo$DataSourceType;
import elb.e;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.waynelive.LivePlayUrlInfo$UrlType;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class LivePlayUrlInfo	// class@000dce
{
    public LiveAdaptiveManifest mAdaptiveManifest;
    public LivePlayUrlInfo$DataSourceType mDataSourceType;
    public e mDnsResolvedUrl;
    public String mHost;
    public String mIP;
    public boolean mIsFreeTraffic;
    public String mUrl;
    public String mUrlType;

    public void LivePlayUrlInfo(){
       super();
       this.mUrl = "";
       this.mHost = "";
       this.mIP = "";
       this.mUrlType = "";
    }
    public LiveAdaptiveManifest getAdaptiveManifest(){
       return this.mAdaptiveManifest;
    }
    public LivePlayUrlInfo$DataSourceType getDataSourceType(){
       return this.mDataSourceType;
    }
    public e getDnsResolvedUrl(){
       return this.mDnsResolvedUrl;
    }
    public String getHost(){
       return this.mHost;
    }
    public String getIP(){
       return this.mIP;
    }
    public String getUrl(){
       return this.mUrl;
    }
    public String getUrlType(){
       return this.mUrlType;
    }
    public boolean isFlvUrl(){
       Object obj = PatchProxy.apply(null, this, LivePlayUrlInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.equals(this.mUrlType, LivePlayUrlInfo$UrlType.FLV.type());
    }
    public boolean isFreeTraffic(){
       return this.mIsFreeTraffic;
    }
    public boolean isHDR(){
       Object obj = PatchProxy.apply(null, this, LivePlayUrlInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.equals(this.mUrlType, LivePlayUrlInfo$UrlType.HDR.type());
    }
    public boolean isHlsUrl(){
       Object obj = PatchProxy.apply(null, this, LivePlayUrlInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.equals(this.mUrlType, LivePlayUrlInfo$UrlType.HLS.type());
    }
    public boolean isManifestFlv(){
       LivePlayUrlInfo obj = PatchProxy.apply(null, this, LivePlayUrlInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mAdaptiveManifest;
       boolean b = (obj != null && obj.isManifestFlv())? true: false;
       return b;
    }
    public boolean isManifestWebRTC(){
       LivePlayUrlInfo obj = PatchProxy.apply(null, this, LivePlayUrlInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mAdaptiveManifest;
       boolean b = (obj != null && obj.isManifestWebRTC())? true: false;
       return b;
    }
    public boolean isPanoramicUrl(){
       Object obj = PatchProxy.apply(null, this, LivePlayUrlInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.equals(this.mUrlType, LivePlayUrlInfo$UrlType.PANORAMIC.type());
    }
    public void setAdaptiveManifest(LiveAdaptiveManifest p0){
       this.mAdaptiveManifest = p0;
    }
    public void setDataSourceType(LivePlayUrlInfo$DataSourceType p0){
       this.mDataSourceType = p0;
    }
    public void setDnsResolvedUrl(e p0){
       this.mDnsResolvedUrl = p0;
    }
    public void setFreeTraffic(boolean p0){
       this.mIsFreeTraffic = p0;
    }
    public void setHost(String p0){
       this.mHost = p0;
    }
    public void setIP(String p0){
       this.mIP = p0;
    }
    public void setUrl(String p0){
       this.mUrl = p0;
    }
    public void setUrlType(String p0){
       this.mUrlType = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePlayUrlInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePlayUrlInfo{mUrl=\'"+this.mUrl+'''+", mHost=\'"+this.mHost+'''+", mIP=\'"+this.mIP+'''+", mDataSourceType="+this.mDataSourceType+", mIsFreeTraffic="+this.mIsFreeTraffic+", mUrlType=\'"+this.mUrlType+'''+'}';
    }
}
