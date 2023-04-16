package com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$a;
import fr6.d;
import wq6.l;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import wq6.e;
import wq6.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.kcube.TabIdentifier;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Integer;
import kotlin.collections.CollectionsKt__CollectionsKt;
import on5.a;
import fr6.c;

public final class ReEditAfterDeleteOperator$a implements d	// class@00142c
{
    public final l a;
    public final c b;

    public void ReEditAfterDeleteOperator$a(l p0,c p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(e p0,h p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, ReEditAfterDeleteOperator$a.class, "1")) {
          return;
       }
       a.p(p0, "atomicTab");
       a.p(p1, "belongsToChild");
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("ReEditAfterDeleteOperator", "onTabSelected "+p0.M2().getType()+p1.M2().getType(), objArray);
       ReEditAfterDeleteOperator d = ReEditAfterDeleteOperator.d;
       Objects.requireNonNull(d);
       List list = PatchProxy.apply(null, d, ReEditAfterDeleteOperator.class, "22");
       if (list != PatchProxyResult.class) {
       }else {
          Integer[] integerArray = new Integer[10];
          integerArray[i] = Integer.valueOf(1);
          integerArray[1] = Integer.valueOf(5);
          integerArray[2] = Integer.valueOf(9);
          integerArray[3] = Integer.valueOf(0x101d3);
          integerArray[4] = Integer.valueOf(77);
          integerArray[5] = Integer.valueOf(0x101d1);
          integerArray[6] = Integer.valueOf(0x101d6);
          integerArray[7] = Integer.valueOf(0x101d7);
          integerArray[8] = Integer.valueOf(6);
          integerArray[9] = Integer.valueOf(7);
          list = CollectionsKt__CollectionsKt.L(integerArray);
       }
       if (list.contains(Integer.valueOf(a.a(p0.M2())))) {
          Object[] objArray1 = new Object[i];
          p3.D().w("ReEditAfterDeleteOperator", "onTabSelected, dismiss", objArray1);
          ReEditAfterDeleteOperator$a tb = this.b;
          if (tb != null) {
             tb.o();
          }
          this.a.m(this);
       }
       PatchProxy.onMethodExit(ReEditAfterDeleteOperator$a.class, "1");
       return;
    }
    public void b(e p0,e p1,h p2,h p3,float p4){
       c.b(this, p0, p1, p2, p3, p4);
    }
    public void c(e p0,h p1){
       c.a(this, p0, p1);
    }
}
