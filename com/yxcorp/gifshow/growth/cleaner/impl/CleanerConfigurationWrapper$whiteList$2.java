package com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper$whiteList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerWhiteListItem;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfiguration;
import qrd.p;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import fna.d;
import java.util.Comparator;
import java.util.Iterator;

public final class CleanerConfigurationWrapper$whiteList$2 extends Lambda implements a	// class@001308
{
    public final CleanerConfigurationWrapper this$0;

    public void CleanerConfigurationWrapper$whiteList$2(CleanerConfigurationWrapper p0){
       this.this$0 = p0;
       super(0);
    }
    public final CleanerWhiteListItem invoke(){
       CleanerConfigurationWrapper uCleanerConf = CleanerConfigurationWrapper.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       CleanerConfigurationWrapper$whiteList$2 obj = PatchProxy.apply(objArray, this, CleanerConfigurationWrapper$whiteList$2.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       CleanerConfigurationWrapper$whiteList$2 obj1 = PatchProxy.apply(objArray, obj, uCleanerConf, "2");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.a.getValue();
       }
       if (obj1 != null) {
          CleanerConfiguration whiteList = obj1.whiteList;
          if (whiteList != null) {
             List list = CollectionsKt___CollectionsKt.d2(whiteList);
             if (list != null) {
                list = CollectionsKt___CollectionsKt.J5(list);
                if (list != null) {
                   obj1 = this.this$0;
                   Objects.requireNonNull(obj1);
                   Iterator obj2 = PatchProxy.applyOneRefs(list, obj1, uCleanerConf, str);
                   if (obj2 != patchProxyRe) {
                      objArray = obj2;
                   }else {
                      obj2 = CollectionsKt___CollectionsKt.f5(list, new d()).iterator();
                      while (obj2.hasNext()) {
                         Object obj3 = obj2.next();
                         Objects.requireNonNull(CleanerConfiguration.Companion);
                         Object obj4 = (obj3.version >= CleanerConfiguration.version)? 1: null;
                         if (obj4) {
                            objArray = obj3;
                            break ;
                         }
                      }
                   }
                }
             }
          }
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
