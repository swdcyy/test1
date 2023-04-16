package com.kwai.slide.play.detail.danmaku.topguide.SectionInterpolator$mSum$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.Long;

public final class SectionInterpolator$mSum$2 extends Lambda implements a	// class@0017a4
{
    public final long[] $durations;

    public void SectionInterpolator$mSum$2(long[] p0){
       this.$durations = p0;
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, SectionInterpolator$mSum$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return ArraysKt___ArraysKt.Ov(this.$durations);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
