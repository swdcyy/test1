package com.yxcorp.gifshow.webview.yoda.view.e;
import erd.g;
import java.lang.Object;
import rx7.b0;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import java.lang.Long;
import java.lang.String;
import com.kwai.performance.stability.crash.monitor.util.e;
import java.lang.Float;
import java.lang.Integer;

public final class e implements g	// class@0017e9
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       e.v("webviewProfilingTs", Long.valueOf(p0.timestamp));
       e.v("webviewMemoryUsage", Long.valueOf(p0.memoryUsage));
       e.v("webviewMediaCodecCount", Float.valueOf(p0.mediaCodecCount));
       e.v("cpuUsage", Float.valueOf(p0.cpuUsage));
       e.v("webviewFps", Integer.valueOf(p0.fps));
    }
}
