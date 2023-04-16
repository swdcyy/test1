package com.kuaishou.merchant.home2.dynamic.HomePagePresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.merchant.home2.dynamic.HomePagePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.bowl.core.component.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;

public final class HomePagePresenter$onBind$2 extends FunctionReferenceImpl implements l	// class@0016ff
{

    public void HomePagePresenter$onBind$2(HomePagePresenter p0){
       super(1, p0, HomePagePresenter.class, "onDynamicDefaultHomePage", "onDynamicDefaultHomePage\(Lcom/kuaishou/bowl/core/component/Component;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePagePresenter$onBind$2.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, HomePagePresenter.class, "6")) {
          treceiver.a9(p0, true);
       }
       return;
    }
}
