package com.oplus.ocs.roiencode.RoiEncodeUnitClient;
import com.oplus.ocs.base.common.api.OplusApi;
import java.util.ArrayList;
import com.oplus.ocs.base.common.api.Api$ClientKey;
import com.oplus.ocs.roiencode.RoiEncodeClientBuilder;
import com.oplus.ocs.base.common.api.Api;
import java.lang.String;
import com.oplus.ocs.base.common.api.Api$AbstractClientBuilder;
import android.content.Context;
import com.oplus.ocs.base.internal.ClientSettings;
import java.util.List;
import com.oplus.ocs.base.common.api.Api$ApiOptions;
import java.lang.Error;
import java.lang.Exception;
import android.media.MediaFormat;
import android.media.MediaCodec;
import java.lang.Object;
import android.os.Bundle;

public final class RoiEncodeUnitClient extends OplusApi	// class@000b3b
{
    public boolean mSetRoiOn;
    public static final Api API;
    public static final Api$AbstractClientBuilder CLIENT_BUILDER;
    public static final Api$ClientKey CLIENT_KEY;
    public static final List mFeatures;
    public static RoiEncodeUnitClient sRoiEncodeUnitClient;

    static {
       RoiEncodeUnitClient.mFeatures = new ArrayList();
       Api$ClientKey uClientKey = new Api$ClientKey();
       RoiEncodeUnitClient.CLIENT_KEY = uClientKey;
       RoiEncodeClientBuilder roiEncodeCli = new RoiEncodeClientBuilder();
       RoiEncodeUnitClient.CLIENT_BUILDER = roiEncodeCli;
       RoiEncodeUnitClient.API = new Api("RoiEncodeClient.API", roiEncodeCli, uClientKey, false);
       RoiEncodeUnitClient.sRoiEncodeUnitClient = null;
    }
    public void RoiEncodeUnitClient(Context p0){
       super(p0, RoiEncodeUnitClient.API, null, new ClientSettings(p0.getPackageName(), 0x186a6, RoiEncodeUnitClient.mFeatures), false);
       this.mSetRoiOn = false;
    }
    public static void checkRuntimeEnvironment(Context p0){
       try{
          RoiEncodeUnitClient.sRoiEncodeUnitClient = new RoiEncodeUnitClient(p0);
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }catch(java.lang.Error e1){
          e1.printStackTrace();
       }
       return;
    }
    public static synchronized RoiEncodeUnitClient initialize(Context p0){
       _monitor_enter(RoiEncodeUnitClient.class);
       RoiEncodeUnitClient sRoiEncodeUn = RoiEncodeUnitClient.sRoiEncodeUnitClient;
       if (sRoiEncodeUn != null) {
          sRoiEncodeUn.addThis2Cache();
          _monitor_exit(RoiEncodeUnitClient.class);
          return RoiEncodeUnitClient.sRoiEncodeUnitClient;
       }else {
          RoiEncodeUnitClient.checkRuntimeEnvironment(p0);
          _monitor_exit(RoiEncodeUnitClient.class);
          return RoiEncodeUnitClient.sRoiEncodeUnitClient;
       }
    }
    public static void release(){
    }
    public void enableRoiEncode(MediaFormat p0,int p1){
       int i = 1;
       if (!p1 || p1 == i) {
          this.mSetRoiOn = false;
          p0.setInteger("roi-on", p1);
          if (p1 == i) {
             this.mSetRoiOn = i;
             p0.setString("vendor.qti-ext-extradata-enable.types", "roiinfo");
          }
       }
       return;
    }
    public boolean getRoiFlag(MediaCodec p0){
       String str = p0.getOutputFormat().getString("vendor.qti-ext-extradata-enable.types");
       boolean b = true;
       str = (str != null && str.equals("roiinfo"))? 1: 0;
       if (this.mSetRoiOn == null) {
          b = str;
       }
       return b;
    }
    public int getVersion(){
       return 0x186a6;
    }
    public boolean hasFeature(String p0){
       return true;
    }
    public void init(){
    }
    public void setRoiParameters(MediaCodec p0,String p1,long p2){
       Bundle uBundle = new Bundle();
       String name = p0.getName();
       if (name != null && name.length() > 6) {
          if ((name.substring(0, 6)).equals("c2.qti")) {
             uBundle.putLong("vendor.qti-ext-enc-roiinfo.timestamp", p2);
             uBundle.putString("vendor.qti-ext-enc-roiinfo.type", "rect");
             uBundle.putString("vendor.qti-ext-enc-roiinfo.rect-payload", p1);
          }else {
             uBundle.putString("roi-rect", p1);
             uBundle.putLong("roi-timestamp", p2);
          }
       }
       p0.setParameters(uBundle);
       return;
    }
}
