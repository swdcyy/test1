package com.kwai.android.common.ext.StringExtKt;
import java.lang.String;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import java.lang.Math;
import usd.q;
import java.lang.StringBuilder;
import usd.k;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Object;

public final class StringExtKt	// class@000994
{

    public static final String toUndercover(String p0){
       if (AzerothCodeAdapter.b.isDebugMode()) {
          return p0;
       }
       if (p0 == null) {
          return null;
       }
       if (p0.length() <= 6) {
          return "*****";
       }
       int i = (int)(float)Math.ceil((double)((float)p0.length() * 0x3f19999a));
       int i1 = (int)q.A(((float)(p0.length() - i) / 2.00f), 0, ((float)p0.length() - 3.00f));
       return StringsKt__StringsKt.y4(p0, new k(i1, q.B((i1 + i), i1, (p0.length() - 2))), "*****").toString()+"_undercoverLength:"+i;
    }
}
