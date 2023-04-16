package com.yxcorp.gifshow.ad.webview.jshandler.dto.AdNeoH5VideoData$adInfo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.AdNeoH5VideoData;
import com.kuaishou.android.model.ads.AdNeoInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AdNeoH5VideoData$adInfo$2 extends Lambda implements a	// class@0018fc
{
    public final AdNeoH5VideoData this$0;

    public void AdNeoH5VideoData$adInfo$2(AdNeoH5VideoData p0){
       this.this$0 = p0;
       super(0);
    }
    public final AdNeoInfo invoke(){
       Object obj = PatchProxy.apply(null, this, AdNeoH5VideoData$adInfo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.decodeNeoParams();
    }
    public Object invoke(){
       return this.invoke();
    }
}
