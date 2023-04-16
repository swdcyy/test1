package com.yxcorp.gifshow.log.e$c$a;
import com.google.common.collect.Ordering;
import com.yxcorp.gifshow.log.e$c;
import java.lang.Object;
import com.yxcorp.gifshow.log.e$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowFeed;
import com.google.common.primitives.Longs;

public class e$c$a extends Ordering	// class@001b00
{
    public final e$c b;

    public void e$c$a(e$c p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e$c$a.class, "1");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): Longs.a(p0.b.enterTimestamp, p1.b.enterTimestamp);
       return i;
    }
}
