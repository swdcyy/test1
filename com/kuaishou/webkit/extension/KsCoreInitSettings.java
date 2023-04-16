package com.kuaishou.webkit.extension.KsCoreInitSettings;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Double;
import java.lang.Float;
import com.kuaishou.webkit.extension.media.KsMediaPlayerFactory;
import org.json.JSONObject;

public abstract class KsCoreInitSettings	// class@0012d5
{

    public void KsCoreInitSettings(){
       super();
    }
    public void checkSoLoadFailedMultiTimes(){
       this.setSetting(Integer.valueOf(19), Boolean.TRUE);
    }
    public void disableHiddenApiUnseal(){
       this.setSetting(Integer.valueOf(83), Boolean.TRUE);
    }
    public void disableOutOfMemory(boolean p0){
       this.setSetting(Integer.valueOf(4), Boolean.valueOf(p0));
    }
    public void enableMultiProcess(boolean p0){
       this.setSetting(Integer.valueOf(1), Boolean.valueOf(p0));
    }
    public void enableNativeDump(boolean p0){
       this.setSetting(Integer.valueOf(3), Boolean.valueOf(p0));
    }
    public void enableReportInitStack(){
       this.setSetting(Integer.valueOf(97), Boolean.TRUE);
    }
    public abstract void enableRuntimeFeature(String p0,String[] p1);
    public void enableShowChangedRests(){
       this.setSetting(Integer.valueOf(72), Boolean.TRUE);
    }
    public void enableShowFps(){
       this.setSetting(Integer.valueOf(71), Boolean.TRUE);
    }
    public void forcePreloadAsync(){
       this.setSetting(Integer.valueOf(17), Boolean.TRUE);
    }
    public void forceUsePacakage(boolean p0){
    }
    public void ignoreDataDirLockFailure(){
       this.setSetting(Integer.valueOf(81), Boolean.TRUE);
    }
    public void setAsyncCompositingMode(int p0){
       this.setSetting(Integer.valueOf(84), Integer.valueOf(p0));
       boolean b = (p0 > 2)? true: false;
       this.enableMultiProcess(b);
       return;
    }
    public void setCommonSamplingFlag(boolean p0){
       this.setSetting(Integer.valueOf(111), Boolean.valueOf(p0));
    }
    public void setCommonSamplingRatio(double p0){
       this.setSetting(Integer.valueOf(110), Double.valueOf(p0));
    }
    public void setDevMode(int p0){
       this.setSetting(Integer.valueOf(73), Integer.valueOf(p0));
    }
    public void setDeviceMode(int p0){
       this.setSetting(Integer.valueOf(20), Integer.valueOf(p0));
    }
    public void setEvaluateScriptUsingCodeCacheEnabled(boolean p0){
       this.setSetting(Integer.valueOf(24), Boolean.valueOf(p0));
    }
    public void setInstallDirectory(String p0){
       this.setSetting(Integer.valueOf(12), p0);
    }
    public void setJsExceptionReportRatio(float p0){
       this.setSetting(Integer.valueOf(22), Float.valueOf(p0));
    }
    public void setKsMediaPlayerModeAndFactory(int p0,KsMediaPlayerFactory p1,int p2){
       String str;
       String[] stringArray = new String[]{"KsPlayerRender","ForceKsPlayerRender"};
       if (!p0) {
          this.enableRuntimeFeature(null, stringArray);
          str = null;
       }else if(p0 == 1){
          this.enableRuntimeFeature(stringArray[0], stringArray);
       }else if(p0 == 2){
          this.enableRuntimeFeature(stringArray[1], stringArray);
       }
       if (p2 == 1) {
          this.enableRuntimeFeature("KsPlayerV1", null);
       }
       this.setSetting(Integer.valueOf(11), str);
       return;
    }
    public void setLastVersionSupported(String p0){
       this.setSetting(Integer.valueOf(98), p0);
    }
    public void setOptimizePolicy(String p0){
       this.setOptimizePolicyJson(new JSONObject(p0));
    }
    public void setOptimizePolicyJson(JSONObject p0){
       this.setSetting(Integer.valueOf(95), p0);
    }
    public void setRendererProcessUnresponsiveReportRatio(float p0){
       this.setSetting(Integer.valueOf(21), Float.valueOf(p0));
    }
    public void setReportSetCookieFailedEnabled(boolean p0){
       this.setSetting(Integer.valueOf(23), Boolean.valueOf(p0));
    }
    public abstract void setSetting(Integer p0,Object p1);
    public void setUserAgentExtraProduct(String p0){
       this.setSetting(Integer.valueOf(13), p0);
    }
    public void setUserAgentPolicy(int p0){
       this.setSetting(Integer.valueOf(96), Integer.valueOf(p0));
    }
    public void setV8CacheOptions(String p0){
       this.setSetting(Integer.valueOf(15), p0);
    }
    public void setV8ClassicScriptCacheMode(int p0){
       this.setSetting(Integer.valueOf(25), Integer.valueOf(p0));
    }
    public void setV8MinimalCodeLength(int p0){
       this.setSetting(Integer.valueOf(16), Integer.valueOf(p0));
    }
    public void setV8PerformanceMode(int p0){
       this.setSetting(Integer.valueOf(9), Integer.valueOf(p0));
    }
    public void setV8TopMemUsageObjPrintCnt(int p0){
       this.setSetting(Integer.valueOf(114), Integer.valueOf(p0));
    }
    public void useSameCoreVersion(){
       this.setSetting(Integer.valueOf(14), Boolean.TRUE);
    }
    public void useSystemWebView(boolean p0){
       this.setSetting(Integer.valueOf(2), Boolean.valueOf(p0));
    }
}
