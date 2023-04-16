package com.kwai.library.dynamic_prefetcher.api.model.PrefetchTaskMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PrefetchTaskMode extends Enum	// class@00081a
{
    public static final PrefetchTaskMode[] $VALUES;
    public static final PrefetchTaskMode HLS_MODE;
    public static final PrefetchTaskMode MANIFEST_MODE;
    public static final PrefetchTaskMode MULTI_SOURCE_MODE;
    public static final PrefetchTaskMode UNKNOWN;

    static {
       PrefetchTaskMode prefetchTask = new PrefetchTaskMode("UNKNOWN", 0);
       PrefetchTaskMode.UNKNOWN = prefetchTask;
       PrefetchTaskMode prefetchTask1 = new PrefetchTaskMode("HLS_MODE", 1);
       PrefetchTaskMode.HLS_MODE = prefetchTask1;
       PrefetchTaskMode prefetchTask2 = new PrefetchTaskMode("MANIFEST_MODE", 2);
       PrefetchTaskMode.MANIFEST_MODE = prefetchTask2;
       PrefetchTaskMode prefetchTask3 = new PrefetchTaskMode("MULTI_SOURCE_MODE", 3);
       PrefetchTaskMode.MULTI_SOURCE_MODE = prefetchTask3;
       PrefetchTaskMode[] prefetchTask4 = new PrefetchTaskMode[]{prefetchTask,prefetchTask1,prefetchTask2,prefetchTask3};
       PrefetchTaskMode.$VALUES = prefetchTask4;
    }
    public void PrefetchTaskMode(String p0,int p1){
       super(p0, p1);
    }
    public static PrefetchTaskMode valueOf(String p0){
       return Enum.valueOf(PrefetchTaskMode.class, p0);
    }
    public static PrefetchTaskMode[] values(){
       return PrefetchTaskMode.$VALUES.clone();
    }
}
