package com.yxcorp.gifshow.v3.editor.enhancefilter.d;
import erd.o;
import com.yxcorp.gifshow.v3.editor.enhancefilter.EnhanceFilterViewModel$f;
import com.yxcorp.gifshow.v3.editor.enhancefilter.g;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import tqc.d;
import sqc.y;
import java.util.ArrayList;
import oa0.a;
import sqc.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import z1.e;
import java.util.Collection;
import brd.t;

public final class d implements o	// class@000f88
{
    public final EnhanceFilterViewModel$f b;
    public final g c;

    public void d(EnhanceFilterViewModel$f p0,g p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       e a;
       t ot = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = y.a(p0);
          ArrayList uArrayList = new ArrayList();
          String str = null;
          int i = 0;
          if (p0 == null) {
             a.R0(i);
             f.c("old lut calculating no alog config");
          }else if(!TextUtils.isEmpty(p0.a())){
             p0 = y.b(p0.a());
             a.o(p0, "RxEnhanceApi.get3DLutMod¡­hs\(config.modelSavedPath\)");
             if (p0.a == null || p0.b == null) {
                a.R0(i);
             }else {
                a.R0(1);
             }
             f.c("new lut calculating");
             a = p0.a;
             if (a != null) {
                uArrayList.addAll(a);
             }
             a = p0.b;
          }
          ot = this.c.b(this.b.c, uArrayList, str);
       }
       return ot;
    }
}
