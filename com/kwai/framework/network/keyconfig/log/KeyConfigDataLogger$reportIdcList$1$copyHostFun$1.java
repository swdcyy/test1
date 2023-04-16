package com.kwai.framework.network.keyconfig.log.KeyConfigDataLogger$reportIdcList$1$copyHostFun$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;

public final class KeyConfigDataLogger$reportIdcList$1$copyHostFun$1 extends Lambda implements q	// class@0017f3
{
    public static final KeyConfigDataLogger$reportIdcList$1$copyHostFun$1 INSTANCE;

    static {
       KeyConfigDataLogger$reportIdcList$1$copyHostFun$1.INSTANCE = new KeyConfigDataLogger$reportIdcList$1$copyHostFun$1();
    }
    public void KeyConfigDataLogger$reportIdcList$1$copyHostFun$1(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2);
       return l1.a;
    }
    public final void invoke(String p0,Map p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KeyConfigDataLogger$reportIdcList$1$copyHostFun$1.class, "1")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "rawData");
       a.p(p2, "copyTo");
       List list = p1.get(p0);
       if (list == null) {
          list = CollectionsKt__CollectionsKt.E();
       }
       p2.put(p0, new ArrayList(list));
       return;
    }
}
