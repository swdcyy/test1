package com.yxcorp.gifshow.ad.report.monitor.KCMonitorImpl$mRealRatio$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.report.monitor.KCMonitorImpl;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import p49.d;
import p49.c;
import java.lang.CharSequence;
import java.util.Map;
import com.yxcorp.gifshow.ad.report.ReportSampleRule;
import java.util.HashMap;
import java.lang.Float;
import java.util.Objects;
import java.lang.Boolean;
import android.text.TextUtils;
import o49.l;
import o56.a;
import o49.e;
import java.lang.StringBuilder;
import yx.j0;
import usd.q;

public final class KCMonitorImpl$mRealRatio$2 extends Lambda implements a	// class@0017bb
{
    public final KCMonitorImpl this$0;

    public void KCMonitorImpl$mRealRatio$2(KCMonitorImpl p0){
       this.this$0 = p0;
       super(0);
    }
    public final float invoke(){
       ReportSampleRule reportSample;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       d obj = PatchProxy.apply(null, this, KCMonitorImpl$mRealRatio$2.class, str);
       if (obj != patchProxyRe) {
          return obj.floatValue();
       }
       obj = this.this$0.g.b().a;
       KCMonitorImpl c = this.this$0.c;
       boolean b = false;
       if (c != null) {
          KCMonitorImpl$mRealRatio$2 omRealRatio$ = (c.length() > 0)? 1: null;
          if (omRealRatio$ == 1) {
             reportSample = obj.get(this.this$0.c);
             if (reportSample == null) {
                reportSample = obj.get(this.this$0.g.a());
             }
          }else {
          label_004e :
             reportSample = obj.get(this.this$0.g.a());
          }
       }else {
          goto label_004e ;
       }
       KCMonitorImpl kCMonitorImp = null;
       if (reportSample == null) {
          KCMonitorImpl$mRealRatio$2 tthis$0 = this.this$0;
          kCMonitorImp = tthis$0.b;
          if (kCMonitorImp != null) {
             kCMonitorImp = kCMonitorImp.floatValue();
          }else {
             kCMonitorImp = tthis$0.g.b().b;
          }
       }else {
          KCMonitorImpl$mRealRatio$2 tthis$01 = this.this$0;
          Objects.requireNonNull(tthis$01);
          Boolean uBoolean = PatchProxy.applyOneRefs(reportSample, tthis$01, KCMonitorImpl.class, "12");
          if (uBoolean != patchProxyRe) {
          }else {
             uBoolean = reportSample.getMCanReportByMinAppVersion();
             if (uBoolean == null) {
                if (!TextUtils.isEmpty(reportSample.mMinAppVersion)) {
                   l a = l.a;
                   ReportSampleRule mMinAppVersi = reportSample.mMinAppVersion;
                   Objects.requireNonNull(a);
                   Object[] obj1 = PatchProxy.applyOneRefs(mMinAppVersi, a, l.class, str);
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else if(e.a(e.b(mMinAppVersi), e.b(a.m)) <= 0){
                      b1 = true;
                   }
                   if (!b1) {
                   label_00e0 :
                      reportSample.setMCanReportByMinAppVersion(Boolean.valueOf(b));
                      b1 = b;
                   label_00e8 :
                      if (b1) {
                         kCMonitorImp = q.A(reportSample.sampleRatio, kCMonitorImp, 0x3f800000);
                      }
                   }
                }
                b = true;
                goto label_00e0 ;
             }
          }
          b1 = uBoolean.booleanValue();
          goto label_00e8 ;
       }
       return kCMonitorImp;
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
