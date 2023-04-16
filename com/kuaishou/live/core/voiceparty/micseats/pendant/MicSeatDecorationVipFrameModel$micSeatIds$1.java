package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameModel$micSeatIds$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameModel;
import java.lang.Object;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import ts2.d;
import java.lang.Integer;
import xs2.l;
import java.util.Objects;
import java.lang.Boolean;
import ts2.j;
import ts2.j$a;
import java.util.Collection;
import trd.u;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class MicSeatDecorationVipFrameModel$micSeatIds$1 extends Lambda implements p	// class@001675
{
    public final boolean $supportedWhenEmpty;
    public final MicSeatDecorationVipFrameModel this$0;

    public void MicSeatDecorationVipFrameModel$micSeatIds$1(MicSeatDecorationVipFrameModel p0,boolean p1){
       this.this$0 = p0;
       this.$supportedWhenEmpty = p1;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final Set invoke(List p0,Map p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, MicSeatDecorationVipFrameModel$micSeatIds$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "stateInterfaceList");
       a.p(p1, "decorationInfo");
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          Object obj2 = obj1;
          MicSeatDecorationVipFrameModel$micSeatIds$1 tthis$0 = this.this$0;
          Object obj3 = p1.get(Integer.valueOf(obj2.getId()));
          MicSeatDecorationVipFrameModel$micSeatIds$1 t$supportedW = this.$supportedWhenEmpty;
          Objects.requireNonNull(tthis$0);
          if (PatchProxy.isSupport(MicSeatDecorationVipFrameModel.class)) {
             Object obj4 = PatchProxy.applyThreeRefs(obj2, obj3, Boolean.valueOf(t$supportedW), tthis$0, MicSeatDecorationVipFrameModel.class, "1");
             if (obj4 != patchProxyRe) {
                b = obj4.booleanValue();
             }else {
             label_0064 :
                b = false;
                if (t$supportedW != null) {
                   if (obj3 != null) {
                      b = obj3.c();
                   }
                }else if(obj2.getState() instanceof j$a){
                   boolean b1 = (obj3 != null)? obj3.c(): false;
                   if (b1) {
                      b = true;
                   }
                }
             }
          }else {
             goto label_0064 ;
          }
          if (b) {
             obj.add(obj1);
          }
       }
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator1 = obj.iterator();
       while (iterator1.hasNext()) {
          uArrayList.add(Integer.valueOf(iterator1.next().getId()));
       }
       return CollectionsKt___CollectionsKt.L5(uArrayList);
    }
}
