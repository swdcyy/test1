package com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import it2.f1;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import msd.l;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StyleKt$inflater$1;

public final class StyleKt	// class@001749
{

    public static final int a(MicSeatStyle p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StyleKt.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "style");
       int i = f1.e[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   i = 0x7f11045f;
                }else {
                   throw new NoWhenBranchMatchedException();
                }
             }else {
                i = 0x7f110463;
             }
          }else {
             i = 0x7f11045c;
          }
       }else {
          i = 0x7f110461;
       }
       return i;
    }
    public static final int b(MicSeatStyle p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StyleKt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "style");
       int i = f1.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   i = 0x7f11045e;
                }else {
                   throw new NoWhenBranchMatchedException();
                }
             }else {
                i = 0x7f110462;
             }
          }else {
             i = 0x7f11045a;
          }
       }else {
          i = 0x7f110460;
       }
       return i;
    }
    public static final l c(int p0,int p1){
       StyleKt styleKt = StyleKt.class;
       if (PatchProxy.isSupport(styleKt)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, styleKt, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new StyleKt$inflater$1(p1, p0);
    }
}
