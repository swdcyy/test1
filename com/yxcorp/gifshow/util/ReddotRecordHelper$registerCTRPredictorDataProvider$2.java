package com.yxcorp.gifshow.util.ReddotRecordHelper$registerCTRPredictorDataProvider$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.util.ReddotRecordHelper;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collections;

public final class ReddotRecordHelper$registerCTRPredictorDataProvider$2 extends Lambda implements a	// class@001f27
{
    public static final ReddotRecordHelper$registerCTRPredictorDataProvider$2 INSTANCE;

    static {
       ReddotRecordHelper$registerCTRPredictorDataProvider$2.INSTANCE = new ReddotRecordHelper$registerCTRPredictorDataProvider$2();
    }
    public void ReddotRecordHelper$registerCTRPredictorDataProvider$2(){
       super(0);
    }
    public final Object invoke(){
       Objects.requireNonNull(ReddotRecordHelper.e);
       Set set = ReddotRecordHelper.c.keySet();
       a.o(set, "reddotTimestampsMap.keys");
       List list = CollectionsKt___CollectionsKt.G5(set);
       int i = 10;
       if (list.size() <= i) {
       }else {
          list = list.subList((list.size() - i), list.size());
       }
       list = Collections.unmodifiableList(list);
       a.o(list, "Collections.unmodifiableList\(displayTimes\)");
       return list;
    }
}
