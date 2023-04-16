package com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate$1;
import com.kwai.video.wayne.player.callback.AwesomeCacheCallbackWrapper;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import com.kwai.video.cache.AcCallBackInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;

public class _2_AbstractPlayerListenerDelegate$1 extends AwesomeCacheCallbackWrapper	// class@000da7
{
    public final _2_AbstractPlayerListenerDelegate this$0;

    public void _2_AbstractPlayerListenerDelegate$1(_2_AbstractPlayerListenerDelegate p0){
       this.this$0 = p0;
       super();
    }
    public void onDownloadFinish(AcCallBackInfo p0){
       String str = "config";
       if (PatchProxy.applyVoidOneRefs(p0, this, _2_AbstractPlayerListenerDelegate$1.class, "1")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject(p0.cdnStatJson);
          JSONObject jSONObject1 = jSONObject.getJSONObject(str);
          jSONObject1.put("biz_ft", this.this$0.mWayneBuildData.mBizFt);
          jSONObject1.put("biz_extra", this.this$0.mWayneBuildData.mBizExtra);
          jSONObject.put(str, jSONObject1);
          jSONObject.put("channel", "wayne");
          p0.cdnStatJson = jSONObject.toString();
          DebugLog.d(_2_AbstractPlayerListenerDelegate.logTag, "onDownloadFinish:"+p0.cdnStatJson);
       }catch(java.lang.Exception e0){
          DebugLog.e(_2_AbstractPlayerListenerDelegate.logTag, "json Exception");
       }
       super.onDownloadFinish(p0);
       return;
    }
}
