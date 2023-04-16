package com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource$getItemsByType$2;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import wsd.o;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.Integer;
import dsd.a;
import java.util.Map;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;

public final class LiteSideBarConfigDataSource$getItemsByType$2 extends RestrictedSuspendLambda implements p	// class@000b1f
{
    public final int $itemType;
    public Object L$0;
    public int label;
    public o p$;
    public final LiteSideBarConfigDataSource this$0;

    public void LiteSideBarConfigDataSource$getItemsByType$2(LiteSideBarConfigDataSource p0,int p1,c p2){
       this.this$0 = p0;
       this.$itemType = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LiteSideBarConfigDataSource$getItemsByType$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiteSideBarConfigDataSource$getItemsByType$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiteSideBarConfigDataSource$getItemsByType$2(this.this$0, this.$itemType, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiteSideBarConfigDataSource$getItemsByType$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiteSideBarConfigDataSource$getItemsByType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiteSideBarConfigDataSource$getItemsByType$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel == 2) {
                j0.n(p0);
             label_006b :
                return l1.a;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$0;
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          tlabel = this.p$;
          p0 = this.this$0.c.get(a.f(this.$itemType));
          if (p0 == null) {
             p0 = CollectionsKt__CollectionsKt.E();
          }
          this.L$0 = tlabel;
          this.label = 1;
          if (tlabel.d(p0, this) == obj) {
             return obj;
          }
       }
       this.L$0 = tlabel;
       this.label = 2;
       if (tlabel.b(a.f(this.$itemType), this) == obj) {
          return obj;
       }else {
          goto label_006b ;
       }
    }
}
