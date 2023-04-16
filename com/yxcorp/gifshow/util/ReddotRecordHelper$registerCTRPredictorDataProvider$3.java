package com.yxcorp.gifshow.util.ReddotRecordHelper$registerCTRPredictorDataProvider$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.util.ReddotRecordHelper;
import java.util.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collections;

public final class ReddotRecordHelper$registerCTRPredictorDataProvider$3 extends Lambda implements a	// class@001f28
{
    public static final ReddotRecordHelper$registerCTRPredictorDataProvider$3 INSTANCE;

    static {
       ReddotRecordHelper$registerCTRPredictorDataProvider$3.INSTANCE = new ReddotRecordHelper$registerCTRPredictorDataProvider$3();
    }
    public void ReddotRecordHelper$registerCTRPredictorDataProvider$3(){
       super(0);
    }
    public final Object invoke(){
       Objects.requireNonNull(ReddotRecordHelper.e);
       Collection uCollection = ReddotRecordHelper.c.values();
       a.o(uCollection, "reddotTimestampsMap.values");
       List list = CollectionsKt___CollectionsKt.G5(uCollection);
       int i = 10;
       if (list.size() <= i) {
       }else {
          list = list.subList((list.size() - i), list.size());
       }
       list = Collections.unmodifiableList(list);
       a.o(list, "Collections.unmodifiableList\(clickTimes\)");
       return list;
    }
}
