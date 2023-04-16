package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import j4b.e;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;

public final class MagicEditionPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@001bca
{

    public void MagicEditionPresenter$onBind$1(MagicEditionPresenter p0){
       super(1, p0, MagicEditionPresenter.class, "handleMagicEditonBtnChangeEvent", "handleMagicEditonBtnChangeEvent\(Lcom/yxcorp/gifshow/magic/event/MagicEditonBtnChangeEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEditionPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, MagicEditionPresenter.class, "4")) {
          a.p(p0, "event");
          treceiver.R8(p0.a);
       }
       return;
    }
}
