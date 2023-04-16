package com.kuaishou.live.jsbridge.rn.LiveKrnDialogData$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Float;
import zsd.s;
import android.app.Activity;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import com.yxcorp.utility.n;
import lnc.a1;
import java.util.Map;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams$a;
import android.net.Uri;

public final class LiveKrnDialogData$a	// class@001d29
{

    public void LiveKrnDialogData$a(){
       super();
    }
    public void LiveKrnDialogData$a(u p0){
       super();
    }
    public final int a(String p0,int p1){
       LiveKrnDialogData$a uoa = LiveKrnDialogData$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = p0.substring(0, (p0.length() - 1));
       a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       Float uFloat = s.J0(p0);
       float f = (uFloat != null)? uFloat.floatValue(): 0x3f800000;
       return (int)((float)p1 * f);
    }
    public final int b(String p0,Activity p1){
       int i;
       int i1;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveKrnDialogData$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (StringsKt__StringsKt.P2(p0, 'w', true)) {
          i = (p1 != null)? n.k(p1): 800;
          i1 = this.a(p0, i);
       }else if(StringsKt__StringsKt.P2(p0, 'h', true)){
          i = (p1 != null)? n.j(p1): 1280;
          i1 = this.a(p0, i);
       }else {
          i1 = a1.e(Float.parseFloat(p0));
       }
       return i1;
    }
    public final LiveKrnDialogData c(String p0,String p1,Map p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveKrnDialogData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "bundleId");
       a.p(p1, "componentName");
       return new LiveKrnDialogData(null, LiveKrnContainerParams.Companion.a(p0, p1, p2), 1, null);
    }
}
