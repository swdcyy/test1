package com.kwai.video.cache.AwesomeCache$VodAdaptive;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.hodor.util.NetworkUtils;
import android.util.Pair;
import java.lang.Integer;
import com.kwai.video.cache.PlayerPreferrenceUtil;
import java.lang.CharSequence;
import android.text.TextUtils;

public class AwesomeCache$VodAdaptive	// class@0019ee
{

    public void AwesomeCache$VodAdaptive(){
       super();
    }
    public static native String _vodAdaptiveGetHistoryData();
    public static native void _vodAdaptiveSetHistoryData(String p0);
    public static int getAdaptiveNetType(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AwesomeCache$VodAdaptive.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       if (NetworkUtils.isWifiConnected(p0)) {
          return i;
       }
       int i1 = NetworkUtils.getMobileType(p0).first.intValue();
       if (i1 == i) {
          return 4;
       }
       if (i1 == 2) {
          return 3;
       }
       if (i1 == 3) {
          return 2;
       }
       if (i1 != 4) {
          return 0;
       }
       return 5;
    }
    public static String getHistoryData(){
       Object obj = PatchProxy.apply(null, null, AwesomeCache$VodAdaptive.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AwesomeCache$VodAdaptive._vodAdaptiveGetHistoryData();
    }
    public static void init(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, AwesomeCache$VodAdaptive.class, "2")) {
          return;
       }
       String vodAdaptiveD = PlayerPreferrenceUtil.getInstance().getVodAdaptiveData(p0);
       if (!TextUtils.isEmpty(vodAdaptiveD)) {
          AwesomeCache$VodAdaptive.setHistoryData(vodAdaptiveD);
       }
       return;
    }
    public static void setHistoryData(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, AwesomeCache$VodAdaptive.class, "3")) {
          return;
       }
       AwesomeCache$VodAdaptive._vodAdaptiveSetHistoryData(p0);
       return;
    }
}
