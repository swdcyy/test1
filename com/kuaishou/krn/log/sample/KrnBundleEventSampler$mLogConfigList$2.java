package com.kuaishou.krn.log.sample.KrnBundleEventSampler$mLogConfigList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import com.kuaishou.krn.log.sample.KrnBundleEventSampler$mLogConfigList$2$a;
import java.lang.reflect.Type;
import el.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.krn.log.sample.KrnBundleEventSampler$a;
import java.util.Objects;
import java.lang.Boolean;
import java.util.Collection;

public final class KrnBundleEventSampler$mLogConfigList$2 extends Lambda implements a	// class@0008f3
{
    public static final KrnBundleEventSampler$mLogConfigList$2 INSTANCE;

    static {
       KrnBundleEventSampler$mLogConfigList$2.INSTANCE = new KrnBundleEventSampler$mLogConfigList$2();
    }
    public void KrnBundleEventSampler$mLogConfigList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       List value;
       boolean b;
       d obj = PatchProxy.apply(null, this, KrnBundleEventSampler$mLogConfigList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KrnInternalManager.c.a().c();
       if (obj != null) {
          value = obj.getValue("krn_log_event_sample", new KrnBundleEventSampler$mLogConfigList$2$a().getType(), CollectionsKt__CollectionsKt.E());
          if (value != null) {
          label_0038 :
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = value.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                Object obj2 = obj1;
                Objects.requireNonNull(obj2);
                KrnBundleEventSampler$a obj3 = PatchProxy.apply(null, obj2, KrnBundleEventSampler$a.class, "1");
                if (obj3 != PatchProxyResult.class) {
                   b = obj3.booleanValue();
                }else {
                   obj3 = obj2.bundleIds;
                   obj3 = (obj3 == null || obj3.isEmpty())? 1: null;
                   if (!obj3) {
                      obj3 = obj2.customEventKeys;
                      obj3 = (obj3 == null || obj3.isEmpty())? 1: null;
                      if (!obj3 && obj2.sampleRatio != null) {
                         b = true;
                      }
                   }
                label_0088 :
                   b = false;
                }
                if (b) {
                   uArrayList.add(obj1);
                }
             }
             return uArrayList;
          }
       }
       value = CollectionsKt__CollectionsKt.E();
       goto label_0038 ;
    }
}
