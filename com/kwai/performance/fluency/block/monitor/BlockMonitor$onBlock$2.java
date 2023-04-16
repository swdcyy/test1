package com.kwai.performance.fluency.block.monitor.BlockMonitor$onBlock$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ne7.a;
import java.lang.Object;
import qrd.l1;
import com.google.gson.Gson;
import java.lang.String;
import yf7.i;
import com.kwai.performance.fluency.block.monitor.BlockMonitor;
import yf7.d;
import yf7.d$a;
import kotlin.jvm.internal.a;
import yf7.h;

public final class BlockMonitor$onBlock$2 extends Lambda implements a	// class@001057
{
    public final a $blockEvent;

    public void BlockMonitor$onBlock$2(a p0){
       this.$blockEvent = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       String str = new Gson().q(this.$blockEvent);
       d$a.c(i.a, BlockMonitor.access$getMCustomStatEventKey$p(BlockMonitor.INSTANCE), str, false, 4, null);
       a.h(str, "it");
       h.d("BlockMonitor", str);
    }
}
