package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerSuccessPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerSuccessPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import fna.j;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import fna.j$a;
import fna.j$b;
import ena.j;

public final class GrowthCleanerSuccessPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@001340
{

    public void GrowthCleanerSuccessPresenter$onBind$1(GrowthCleanerSuccessPresenter p0){
       super(1, p0, GrowthCleanerSuccessPresenter.class, "handleEvent", "handleEvent\(Lcom/yxcorp/gifshow/growth/cleaner/impl/GrowthCleanerEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerSuccessPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, GrowthCleanerSuccessPresenter.class, "4")) {
          GrowthCleanerSuccessPresenter q = treceiver.q;
          if (q != null) {
             if (p0 instanceof j$a || p0 instanceof j$b) {
                if (!PatchProxy.applyVoid(null, q, j.class, "3")) {
                   q.a(false);
                }
             }else {
                q.b();
             }
          }
       }
       return;
    }
}
