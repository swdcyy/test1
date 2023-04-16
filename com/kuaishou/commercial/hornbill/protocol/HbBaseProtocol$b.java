package com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol$b;
import erd.o;
import com.kuaishou.commercial.hornbill.protocol.HbBaseProtocol;
import java.lang.String;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.ArrayList;
import vx.c;
import rx.e;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.StringBuilder;
import yx.j0;
import r35.b;
import t35.b;
import java.lang.Exception;

public final class HbBaseProtocol$b implements o	// class@0014e3
{
    public final HbBaseProtocol b;
    public final String c;

    public void HbBaseProtocol$b(HbBaseProtocol p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HbBaseProtocol$b obj = PatchProxy.applyOneRefs(p0, this, HbBaseProtocol$b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "feed");
          obj = this.b;
          HbBaseProtocol$b tc = this.c;
          Objects.requireNonNull(obj);
          obj = PatchProxy.applyTwoRefs(p0, tc, obj, HbBaseProtocol.class, "10");
          if (obj != patchProxyRe) {
          }else {
             a.p(p0, "baseFeed");
             a.p(tc, "realScene");
             ArrayList uArrayList = new ArrayList();
             c uoc = new c(p0, tc);
             p0 = new e(uArrayList);
             String[] stringArray = new String[]{"hornbill",tc};
             Iterator iterator = CollectionsKt__CollectionsKt.L(stringArray).iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                try{
                   Object[] objArray = new Object[0];
                   j0.a("ad_hornbill", "perform data verify, key = "+str, objArray);
                   b.d().c(uoc, str, p0);
                }catch(java.lang.Exception e6){
                   Object[] objArray1 = new Object[0];
                   j0.c("ad_hornbill", "dataVerify failed in "+str+" by "+e6.getMessage(), objArray1);
                   goto label_005a ;
                }
             }
             obj = uArrayList;
          }
       }
       return obj;
    }
}
