package com.yxcorp.gifshow.v3.editor.cover.proportion.GetCoverScoreTask$startTime$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;
import java.lang.Long;

public final class GetCoverScoreTask$startTime$1 extends Lambda implements a	// class@000e8c
{
    public final long $startTime;

    public void GetCoverScoreTask$startTime$1(long p0){
       this.$startTime = p0;
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, GetCoverScoreTask$startTime$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (SystemClock.elapsedRealtime() - this.$startTime);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
