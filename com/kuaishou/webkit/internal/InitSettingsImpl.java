package com.kuaishou.webkit.internal.InitSettingsImpl;
import com.kuaishou.webkit.extension.base.KsCoreInitSettingsInterface;
import com.kuaishou.webkit.extension.KsCoreInitSettings;
import android.util.SparseArray;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kuaishou.webkit.internal.ArrayUtils;
import java.lang.Integer;
import com.kuaishou.webkit.extension.KsCoreListener;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.webkit.extension.KwSdk;
import java.lang.Double;
import java.lang.Boolean;

public class InitSettingsImpl extends KsCoreInitSettings implements KsCoreInitSettingsInterface	// class@001316
{
    public final Object mLock;
    public String[] mRuntimeFeatureArray;
    public SparseArray mSettings;
    public static InitSettingsImpl sInitSettings;

    public void InitSettingsImpl(){
       super();
       this.mSettings = new SparseArray();
       String[] stringArray = new String[0];
       this.mRuntimeFeatureArray = stringArray;
       this.mLock = new Object();
    }
    public static InitSettingsImpl getInstance(){
       InitSettingsImpl initSettings = InitSettingsImpl.class;
       _monitor_enter(initSettings);
       if (InitSettingsImpl.sInitSettings == null) {
          InitSettingsImpl.sInitSettings = new InitSettingsImpl();
       }
       _monitor_exit(initSettings);
       return InitSettingsImpl.sInitSettings;
    }
    public void enableRuntimeFeature(String p0,String[] p1){
       InitSettingsImpl tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (p1 != null) {
          int len = p1.length;
          for (int i = 0; i < len; i = i + 1) {
             this.mRuntimeFeatureArray = ArrayUtils.removeElement(String.class, this.mRuntimeFeatureArray, p1[i]);
          }
       }
       if (p0 != null && !ArrayUtils.contains(this.mRuntimeFeatureArray, p0)) {
          ArrayUtils.appendElement(String.class, this.mRuntimeFeatureArray, p0);
          this.mRuntimeFeatureArray = ArrayUtils;
       }
       _monitor_exit(tmLock);
       return;
    }
    public int getAsyncCompositingMode(){
       return this.readSetting(Integer.valueOf(84), 0);
    }
    public boolean getCommonSamplingFlag(){
       return this.readSetting(Integer.valueOf(111), false);
    }
    public double getCommonSamplingRatio(){
       return this.readSetting(Integer.valueOf(110), 0);
    }
    public KsCoreListener getCoreListener(){
       return this.readSetting(Integer.valueOf(10));
    }
    public int getDevMode(){
       return this.readSetting(Integer.valueOf(73), 0);
    }
    public String getGpuCheckerDir(){
       return this.readSetting(Integer.valueOf(26), null);
    }
    public String getInstallDirectory(){
       return this.readSetting(Integer.valueOf(12));
    }
    public String getInstalledKsWebViewPackageName(){
       return this.readSetting(Integer.valueOf(5), "com.kuaishou.webview");
    }
    public String getLastVersionSupported(){
       return this.readSetting(Integer.valueOf(98), "1.5");
    }
    public int getOptimizePolicyBits(){
       Object obj = this.readSetting(Integer.valueOf(95));
       int i = (obj != null && obj instanceof JSONObject)? obj.optInt("policy_bits"): 1;
       return i;
    }
    public Object getSetting(Integer p0){
       InitSettingsImpl tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (p0.intValue() == 6) {
          _monitor_exit(tmLock);
          return TextUtils.join(" , ", this.mRuntimeFeatureArray);
       }else if(p0.intValue() == 10){
          _monitor_exit(tmLock);
          return KwSdk.getKsCoreListener();
       }else {
          _monitor_exit(tmLock);
          return this.mSettings.get(p0.intValue());
       }
    }
    public int getUserAgentPolicy(){
       return this.readSetting(Integer.valueOf(96), 4);
    }
    public int getV8TopMemUsageObjPrintCnt(){
       return this.readSetting(Integer.valueOf(114), 0);
    }
    public boolean isCheckLoadSoFailedMultiTimes(){
       return this.readSetting(Integer.valueOf(19), false);
    }
    public boolean isDisabledHiddenApiUnseal(){
       return this.readSetting(Integer.valueOf(83), false);
    }
    public boolean isForcePreloadAsync(){
       return this.readSetting(Integer.valueOf(17), false);
    }
    public boolean isLogCoreStateEnabled(){
       return this.readSetting(Integer.valueOf(7), false);
    }
    public boolean isMultiProcessEnabled(){
       return this.readSetting(Integer.valueOf(1), false);
    }
    public boolean isOptimizeMultiSetCookie(){
       return this.readSetting(Integer.valueOf(18), false);
    }
    public boolean isUseSameCoreVersion(){
       return this.readSetting(Integer.valueOf(14), false);
    }
    public boolean isUsedSystemWebView(){
       return this.readSetting(Integer.valueOf(2), false);
    }
    public double readSetting(Integer p0,double p1){
       p0 = this.readSetting(p0);
       if (p0 instanceof Double) {
          return (double)p0.intValue();
       }
       return p1;
    }
    public int readSetting(Integer p0,int p1){
       p0 = this.readSetting(p0);
       if (p0 instanceof Integer) {
          return p0.intValue();
       }
       return p1;
    }
    public Object readSetting(Integer p0){
       return this.getSetting(p0);
    }
    public String readSetting(Integer p0,String p1){
       p0 = this.readSetting(p0);
       if (p0 instanceof String) {
          return p0;
       }
       return p1;
    }
    public boolean readSetting(Integer p0,boolean p1){
       p0 = this.readSetting(p0);
       if (p0 instanceof Boolean) {
          return p0.booleanValue();
       }
       return p1;
    }
    public void setCoreListener(KsCoreListener p0){
       this.setSetting(Integer.valueOf(10), p0);
    }
    public void setGpuCheckerDir(String p0){
       this.setSetting(Integer.valueOf(26), p0);
    }
    public void setSetting(Integer p0,Object p1){
       InitSettingsImpl tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mSettings.put(p0.intValue(), p1);
       _monitor_exit(tmLock);
    }
}
