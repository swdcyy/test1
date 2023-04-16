package com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$skipAppList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerWhiteListItem;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;

public final class CleanerConfigurationWrapper$skipAppList$2 extends Lambda implements a	// class@001304
{
    public final CleanerConfigurationWrapper this$0;

    public void CleanerConfigurationWrapper$skipAppList$2(CleanerConfigurationWrapper p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ArrayList invoke(){
       ArrayList obj = PatchProxy.apply(null, this, CleanerConfigurationWrapper$skipAppList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       CleanerWhiteListItem uCleanerWhit = this.this$0.c();
       if (uCleanerWhit != null) {
          uCleanerWhit = uCleanerWhit.skipAppList;
          if (uCleanerWhit != null) {
             List list = CollectionsKt___CollectionsKt.d2(uCleanerWhit);
             if (list != null) {
                obj.addAll(list);
             }
          }
       }
       return obj;
    }
}
