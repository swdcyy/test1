package com.kwai.performance.fluency.jank.monitor.collector.StackTraceCollector$handleMessage$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$PackedRecord;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Boolean;
import java.lang.Number;

public final class StackTraceCollector$handleMessage$2$1 extends Lambda implements l	// class@00108d
{
    public final LogRecordQueue$PackedRecord $record;

    public void StackTraceCollector$handleMessage$2$1(LogRecordQueue$PackedRecord p0){
       this.$record = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Pair p0){
       boolean b = (p0.getFirst().longValue() - this.$record.getNow() < 0)? true: false;
       return b;
    }
}
