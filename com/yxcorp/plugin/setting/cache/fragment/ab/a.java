package com.yxcorp.plugin.setting.cache.fragment.ab.a;
import erd.g;
import bgd.c;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nsd.r0;
import java.lang.Double;
import java.util.Arrays;
import kotlin.jvm.internal.a;

public final class a implements g	// class@000838
{
    public final c b;

    public void a(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          double d = (double)1024;
          double d1 = (((double)p0.longValue() * 0x3ff0000000000000) / d) / d;
          if (d1 - d > 0) {
             Object[] objArray = new Object[]{Double.valueOf((d1 / d))};
             str = String.format("%.2f GB", Arrays.copyOf(objArray, 1));
             a.o(str, "java.lang.String.format\(format, *args\)");
             this.b.e(str);
          }else {
             Object[] objArray1 = new Object[]{Double.valueOf(d1)};
             str = String.format("%.2f MB", Arrays.copyOf(objArray1, 1));
             a.o(str, "java.lang.String.format\(format, *args\)");
             this.b.e(str);
          }
       }
       return;
    }
}
