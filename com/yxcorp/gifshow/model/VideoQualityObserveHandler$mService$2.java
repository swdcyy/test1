package com.yxcorp.gifshow.model.VideoQualityObserveHandler$mService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import elb.b0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import elb.a0;
import elb.c0;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import kotlin.jvm.internal.a;

public final class VideoQualityObserveHandler$mService$2 extends Lambda implements a	// class@001ea2
{
    public static final VideoQualityObserveHandler$mService$2 INSTANCE;

    static {
       VideoQualityObserveHandler$mService$2.INSTANCE = new VideoQualityObserveHandler$mService$2();
    }
    public void VideoQualityObserveHandler$mService$2(){
       super(0);
    }
    public final b0 invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a0 obj = PatchProxy.apply(objArray, this, VideoQualityObserveHandler$mService$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a0.b;
       _monitor_enter(obj);
       b0 uob0 = PatchProxy.apply(objArray, obj, a0.class, "1");
       if (uob0 != patchProxyRe) {
          _monitor_exit(obj);
       }else if(a0.a == null){
          a0.a = e.b(new c0(RouteType.MEDIA_CLOUD, d.b), b0.class);
       }
       uob0 = a0.a;
       a.m(uob0);
       _monitor_exit(obj);
       return uob0;
    }
    public Object invoke(){
       return this.invoke();
    }
}
