package com.kwai.performance.fluency.block.monitor.BlockMonitorConfig$Builder$Companion$DEFAULT_BLOCK_TIME_THRESHOLD$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.fluency.block.monitor.BlockMonitorConfig$Builder;
import com.kwai.performance.fluency.block.monitor.BlockMonitorConfig$Builder$a;
import java.lang.Object;
import java.lang.Long;

public final class BlockMonitorConfig$Builder$Companion$DEFAULT_BLOCK_TIME_THRESHOLD$2 extends Lambda implements a	// class@001059
{
    public static final BlockMonitorConfig$Builder$Companion$DEFAULT_BLOCK_TIME_THRESHOLD$2 INSTANCE;

    static {
       BlockMonitorConfig$Builder$Companion$DEFAULT_BLOCK_TIME_THRESHOLD$2.INSTANCE = new BlockMonitorConfig$Builder$Companion$DEFAULT_BLOCK_TIME_THRESHOLD$2();
    }
    public void BlockMonitorConfig$Builder$Companion$DEFAULT_BLOCK_TIME_THRESHOLD$2(){
       super(0);
    }
    public final long invoke(){
       long l;
       BlockMonitorConfig$Builder$a h = BlockMonitorConfig$Builder.h;
       if ((double)h.a() - 0x41ec000000000000 > 0) {
          l = 1000;
       }else if((double)h.a() - 0x41d8000000000000 > 0){
          l = 2000;
       }else {
          l = 3000;
       }
       return l;
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
