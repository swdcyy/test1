package com.kuaishou.tuna.plc.plc2.PlcClickHelper;
import com.kuaishou.tuna.plc.plc2.PlcClickHelper$a;
import nsd.u;
import u06.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.plc2.PlcClickHelper$mCoverClickHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna.plc.plc2.PlcClickHelper$mLongVideoClickHelper$2;
import com.kuaishou.tuna.plc.plc2.PlcClickHelper$mLongVideoApkDownloadHelper$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u06.c;
import x06.b;
import sy4.d;
import erd.g;
import sy4.g;
import u06.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper;

public final class PlcClickHelper	// class@001039
{
    public i0 a;
    public final p b;
    public i0 c;
    public final p d;
    public final p e;
    public final a f;
    public static final String g;
    public static final PlcClickHelper$a h;

    static {
       PlcClickHelper.h = new PlcClickHelper$a(null);
       PlcClickHelper.g = "PlcClickHelper";
    }
    public void PlcClickHelper(a p0){
       a.p(p0, "plc");
       super();
       this.f = p0;
       this.b = s.c(new PlcClickHelper$mCoverClickHelper$2(this));
       this.d = s.c(new PlcClickHelper$mLongVideoClickHelper$2(this));
       this.e = s.c(new PlcClickHelper$mLongVideoApkDownloadHelper$2(this));
       if (PatchProxy.applyVoid(null, this, PlcClickHelper.class, "6")) {
       }else {
          String g = PlcClickHelper.g;
          p0.c().b(new b(g, new d(this)));
          p0.c().k(new b(g, new g(this)));
       }
       return;
    }
    public final b a(){
       Object obj = PatchProxy.apply(null, this, PlcClickHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final ApkDownloadHelper b(){
       Object obj = PatchProxy.apply(null, this, PlcClickHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final b c(){
       Object obj = PatchProxy.apply(null, this, PlcClickHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final a d(){
       return this.f;
    }
}
