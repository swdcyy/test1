package com.kwai.locallife.api.live.bean.LocalLifeWidgetInfo$mRenderUri$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.locallife.api.live.bean.LocalLifeWidgetInfo;
import android.net.Uri;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.locallife.api.live.bean.MaterialMap;
import com.kwai.locallife.api.live.bean.LiveWidgetConfigData;
import c87.a;
import com.kuaishou.locallife.log.biz.LocalLifeLiveLogBiz;
import mr3.b;
import java.util.Map;
import java.lang.Throwable;
import lr3.b;
import java.lang.CharSequence;

public final class LocalLifeWidgetInfo$mRenderUri$2 extends Lambda implements a	// class@000e9a
{
    public final LocalLifeWidgetInfo this$0;

    public void LocalLifeWidgetInfo$mRenderUri$2(LocalLifeWidgetInfo p0){
       this.this$0 = p0;
       super(0);
    }
    public final Uri invoke(){
       LiveWidgetConfigData mRenderUrl;
       String str = "";
       Object[] objArray = null;
       MaterialMap obj = PatchProxy.apply(objArray, this, LocalLifeWidgetInfo$mRenderUri$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.b();
       if (obj != null) {
          obj = obj.mConfigData;
          if (obj != null) {
             mRenderUrl = obj.mRenderUrl;
             if (mRenderUrl != null) {
                str = mRenderUrl;
             }
          }
       }
       mRenderUrl = (!str.length())? 1: 0;
       if (!mRenderUrl) {
          objArray = Uri.parse(str);
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
