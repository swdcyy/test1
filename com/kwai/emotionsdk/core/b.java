package com.kwai.emotionsdk.core.b;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import nk5.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import il5.b;
import java.util.List;
import java.util.Collections;

public final class b implements o	// class@000d91
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object apply(Object p0){
       if (PatchProxy.applyVoidThreeRefs("EmotionDataManager", "fetch emotions form db failed£¬reset version ", p0, null, m.class, "13")) {
       }else {
          m.e(16, "EmotionDataManager", "fetch emotions form db failed£¬reset version ", p0);
       }
       b.c("getEmotionCurVersion", -1);
       return Collections.emptyList();
    }
}
