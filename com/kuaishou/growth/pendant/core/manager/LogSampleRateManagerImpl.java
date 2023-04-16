package com.kuaishou.growth.pendant.core.manager.LogSampleRateManagerImpl;
import ee0.g;
import java.lang.Object;
import java.util.HashMap;
import java.util.Random;
import ee0.h;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import com.kuaishou.growth.pendant.core.manager.LogSampleRateManagerImpl$SampleConfig;
import java.lang.Number;
import java.lang.Integer;

public class LogSampleRateManagerImpl implements g	// class@000645
{
    public final Map a;
    public final Random b;
    public final x c;

    public void LogSampleRateManagerImpl(){
       super();
       this.a = new HashMap();
       this.b = new Random();
       this.c = Suppliers.a(new h(this));
    }
    public boolean a(boolean p0,boolean p1,String p2){
       LogSampleRateManagerImpl$SampleConfig obj;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LogSampleRateManagerImpl logSampleRat = LogSampleRateManagerImpl.class;
       if (PatchProxy.isSupport(logSampleRat)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, LogSampleRateManagerImpl.class, "2");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (TextUtils.isEmpty(p2)) {
          return p1;
       }else {
          obj = this.c.get().get(p2);
          if (obj == null) {
             return p1;
          }else {
             Integer obj1 = PatchProxy.applyOneRefs(p2, this, logSampleRat, "4");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else {
                obj1 = this.a.get(p2);
                if (obj1 != null) {
                   i = obj1.intValue();
                }else {
                   i = this.b.nextInt(0x2710);
                   this.a.put(p2, Integer.valueOf(i));
                }
             }
             LogSampleRateManagerImpl$SampleConfig mSuccessSamp = (p0)? obj.mSuccessSample: obj.mErrorSample;
             mSuccessSamp = (i < mSuccessSamp)? true: false;
             return mSuccessSamp;
          }
       }
    }
    public int b(boolean p0,int p1,String p2){
       LogSampleRateManagerImpl$SampleConfig mSuccessSamp;
       if (PatchProxy.isSupport(LogSampleRateManagerImpl.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, LogSampleRateManagerImpl.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (TextUtils.isEmpty(p2)) {
          return p1;
       }else {
          LogSampleRateManagerImpl$SampleConfig sampleConfig = this.c.get().get(p2);
          if (sampleConfig == null) {
             return p1;
          }else if(p0){
             mSuccessSamp = sampleConfig.mSuccessSample;
          }else {
             mSuccessSamp = sampleConfig.mErrorSample;
          }
          return mSuccessSamp;
       }
    }
}
