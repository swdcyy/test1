package com.kwai.video.wayne.player.config.ks_sub.VodAdaptiveRateConfig;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;
import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.JSONException;

public class VodAdaptiveRateConfig extends AbstractBaseConfig	// class@000d05
{
    public int absLowRate4G;
    public int absLowRateWifi;
    public double absLowRes4G;
    public int absLowResLowDevice;
    public double absLowResWifi;
    public int adaptUnder4G;
    public double adaptUnderOtherNet;
    public int adaptUnderWifi;
    public int bitrateInitLevel;
    public double blockAffectedInterval;
    public int bwEstimationType;
    public double defaultWeight;
    public int deviceHightTHR;
    public double deviceWidthTHR;
    public int enableLowResAuto;
    public double fourGAmend;
    public int longKeepInterval;
    public int longKeepIntervalWifi;
    public String mJson;
    public int priorityPolicy;
    public int rateType;
    public double resAmend;
    public int shortKeepInterval;
    public int shortKeepIntervalWifi;
    public double wifiAmend;
    public double wifiAmend1080P;
    public static String DEFAULT_JSON;

    public void VodAdaptiveRateConfig(){
       super();
       this.rateType = 0;
       this.bwEstimationType = 0;
       this.absLowResLowDevice = 2;
       this.adaptUnder4G = 1;
       this.adaptUnderWifi = 0;
       this.adaptUnderOtherNet = 0x3ff0000000000000;
       this.absLowRate4G = 0;
       this.absLowRateWifi = 0;
       this.absLowRes4G = 0;
       this.absLowResWifi = 0;
       this.shortKeepInterval = 0xea60;
       this.longKeepInterval = 0x927c0;
       this.shortKeepIntervalWifi = 0x3a98;
       this.longKeepIntervalWifi = 0xea60;
       this.bitrateInitLevel = 0;
       this.defaultWeight = 0x3ff0000000000000;
       this.blockAffectedInterval = 0x409f400000000000;
       this.wifiAmend = 0x3fe6666666666666;
       this.fourGAmend = 0x3fd6666666666666;
       this.resAmend = 0x3fe3333333333333;
       this.deviceWidthTHR = 720.00f;
       this.deviceHightTHR = 960;
       this.enableLowResAuto = 1;
       this.wifiAmend1080P = 0x3fe999999999999a;
       this.priorityPolicy = 1;
    }
    public static VodAdaptiveRateConfig getConfig(){
       VodAdaptiveRateConfig vodAdaptiveR = VodAdaptiveRateConfig.class;
       Object obj = PatchProxy.apply(null, null, vodAdaptiveR, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KpMidConfigManager.instance().getConfig("VodAdaptiveRateConfig", vodAdaptiveR);
    }
    public static String getDefaultJson(){
       Object obj = PatchProxy.apply(null, null, VodAdaptiveRateConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (VodAdaptiveRateConfig.DEFAULT_JSON == null) {
          VodAdaptiveRateConfig.DEFAULT_JSON = new Gson().q(new VodAdaptiveRateConfig());
       }
       return VodAdaptiveRateConfig.DEFAULT_JSON;
    }
    public String getPrefKey(){
       return "VodAdaptiveRateConfig";
    }
    public String getVodAdaptiveRateJson(){
       Object obj = PatchProxy.apply(null, this, VodAdaptiveRateConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mJson == null) {
          this.mJson = this.toJsonString();
       }
       return this.mJson;
    }
    public String toJsonString(){
       String str1;
       double d;
       JSONObject obj = PatchProxy.apply(null, this, VodAdaptiveRateConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("rate_adapt_type", this.rateType);
          obj.put("bandwidth_estimation_type", this.bwEstimationType);
          obj.put("absolute_low_res_low_device", this.absLowResLowDevice);
          String str = "adapt_under_4G";
          VodAdaptiveRateConfig tadaptUnder4 = this.adaptUnder4G;
          int i = 0;
          int i1 = -1;
          if (tadaptUnder4 == i1) {
             tadaptUnder4 = 0;
          }
          obj.put(str, tadaptUnder4);
          str = "adapt_under_wifi";
          tadaptUnder4 = this.adaptUnderWifi;
          if (tadaptUnder4 != i1) {
             i = tadaptUnder4;
          }
          obj.put(str, i);
          str = "adapt_under_other_net";
          tadaptUnder4 = this.adaptUnderOtherNet;
          if (!tadaptUnder4 - 0xbff0000000000000) {
             d = 0;
          }
          obj.put(str, d);
          obj.put("absolute_low_rate_4G", this.absLowRate4G);
          obj.put("absolute_low_rate_wifi", this.absLowRateWifi);
          obj.put("absolute_low_res_4G", this.absLowRes4G);
          obj.put("absolute_low_res_wifi", this.absLowResWifi);
          obj.put("short_keep_interval", this.shortKeepInterval);
          obj.put("long_keep_interval", this.longKeepInterval);
          obj.put("short_keep_interval_wifi", this.shortKeepIntervalWifi);
          obj.put("long_keep_interval_wifi", this.longKeepIntervalWifi);
          obj.put("bitrate_init_level", this.bitrateInitLevel);
          obj.put("default_weight", this.defaultWeight);
          obj.put("block_affected_interval", this.blockAffectedInterval);
          obj.put("wifi_amend", this.wifiAmend);
          obj.put("fourG_amend", this.fourGAmend);
          obj.put("resolution_amend", this.resAmend);
          obj.put("device_width_threshold", this.deviceWidthTHR);
          obj.put("device_hight_threshold", this.deviceHightTHR);
          obj.put("enable_low_res_auto", this.enableLowResAuto);
          obj.put("wifi_amend_1080p", this.wifiAmend1080P);
          obj.put("priority_policy", this.priorityPolicy);
          str1 = obj.toString();
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
          str1 = "";
       }
       return str1;
    }
}
