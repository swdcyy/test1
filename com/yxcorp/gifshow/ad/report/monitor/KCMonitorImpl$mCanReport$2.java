package com.yxcorp.gifshow.ad.report.monitor.KCMonitorImpl$mCanReport$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.report.monitor.KCMonitorImpl;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.yxcorp.gifshow.log.utils.DeviceSampleEnum;
import f3b.s;

public final class KCMonitorImpl$mCanReport$2 extends Lambda implements a	// class@0017ba
{
    public final KCMonitorImpl this$0;

    public void KCMonitorImpl$mCanReport$2(KCMonitorImpl p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       DeviceSampleEnum dEVICE_SAMPL;
       boolean b;
       KCMonitorImpl$mCanReport$2 obj = PatchProxy.apply(null, this, KCMonitorImpl$mCanReport$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.this$0.j();
       obj = this.this$0;
       if (obj.d == 2) {
          float f = obj.j();
          Objects.requireNonNull(obj);
          if (!f - 0x3f800000) {
             dEVICE_SAMPL = DeviceSampleEnum.DEVICE_SAMPLE_NONE;
          }else if(!f - 0x3f000000){
             dEVICE_SAMPL = DeviceSampleEnum.DEVICE_SAMPLE_HALF;
          }else if(!f - 0x3dcccccd){
             dEVICE_SAMPL = DeviceSampleEnum.DEVICE_SAMPLE_TENTH;
          }else if(!f - 0x3c23d70a){
             dEVICE_SAMPL = DeviceSampleEnum.DEVICE_SAMPLE_HUNDREDTH;
          }else if(!f - 0x3a83126f){
             dEVICE_SAMPL = DeviceSampleEnum.DEVICE_SAMPLE_THOUSANDTH;
          }else if(!f - 0x38d1b717){
             dEVICE_SAMPL = DeviceSampleEnum.DEVICE_SAMPLE_TEN_THOUSANDTH;
          }else {
             dEVICE_SAMPL = DeviceSampleEnum.DEVICE_SAMPLE_NONE;
          }
          b = s.b(dEVICE_SAMPL);
       }else {
          b = s.c(obj.j());
       }
       return b;
    }
}
