package com.kuaishou.growth.pendant.ui.manager.LogSampleRateManagerImpl;
import pf0.g;
import com.kuaishou.growth.pendant.ui.manager.LogSampleRateManagerImpl$a;
import nsd.u;
import java.lang.Object;
import java.util.HashMap;
import java.util.Random;
import com.kuaishou.growth.pendant.ui.manager.LogSampleRateManagerImpl$b;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import com.kuaishou.growth.pendant.ui.manager.LogSampleRateManagerImpl$SampleConfig;
import java.lang.Number;
import java.lang.Integer;

public class LogSampleRateManagerImpl implements g	// class@0006f6
{
    public final Map b;
    public final Random c;
    public final x d;
    public static final LogSampleRateManagerImpl$a e;

    static {
       LogSampleRateManagerImpl.e = new LogSampleRateManagerImpl$a(null);
    }
    public void LogSampleRateManagerImpl(){
       super();
       this.b = new HashMap();
       this.c = new Random();
       x ox = Suppliers.a(LogSampleRateManagerImpl$b.b);
       a.o(ox, "Suppliers.memoize {\n    бн emptyMap\(\)\n        \)\n  }");
       this.d = ox;
    }
    public boolean a(boolean p0,boolean p1,String p2){
       LogSampleRateManagerImpl$SampleConfig obj;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LogSampleRateManagerImpl logSampleRat = LogSampleRateManagerImpl.class;
       if (PatchProxy.isSupport(logSampleRat)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, LogSampleRateManagerImpl.class, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       a.p(p2, "key");
       if (TextUtils.isEmpty(p2)) {
          return p1;
       }else {
          obj = this.d.get().get(p2);
          if (obj != null) {
             Integer obj1 = PatchProxy.applyOneRefs(p2, this, logSampleRat, "3");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else {
                obj1 = this.b.get(p2);
                if (obj1 != null) {
                   i = obj1.intValue();
                }else {
                   i = this.c.nextInt(0x2710);
                   this.b.put(p2, Integer.valueOf(i));
                }
             }
             int mSuccessSamp = (p0)? obj.getMSuccessSample(): obj.getMErrorSample();
             mSuccessSamp = (i < mSuccessSamp)? true: false;
             return mSuccessSamp;
          }else {
             return p1;
          }
       }
    }
    public int b(boolean p0,int p1,String p2){
       if (PatchProxy.isSupport(LogSampleRateManagerImpl.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, LogSampleRateManagerImpl.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p2, "key");
       if (TextUtils.isEmpty(p2)) {
          return p1;
       }else {
          LogSampleRateManagerImpl$SampleConfig sampleConfig = this.d.get().get(p2);
          if (sampleConfig != null) {
             int mSuccessSamp = (p0)? sampleConfig.getMSuccessSample(): sampleConfig.getMErrorSample();
             return mSuccessSamp;
          }else {
             return p1;
          }
       }
    }
}
