package com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLinePresenter$bizObserver$1$onBizStart$1;
import msd.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLinePresenter$bizObserver$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kuaishou.live.lite.adapter.component.multiline.LiveLiteMultiLinePresenter;
import vb3.m;
import com.kuaishou.live.lite.layoutmanager.StageType;
import vb3.c;

public final class LiveLiteMultiLinePresenter$bizObserver$1$onBizStart$1 extends FunctionReferenceImpl implements a	// class@001e08
{

    public void LiveLiteMultiLinePresenter$bizObserver$1$onBizStart$1(LiveLiteMultiLinePresenter$bizObserver$1 p0){
       super(0, p0, LiveLiteMultiLinePresenter$bizObserver$1.class, "onStartRender", "onStartRender\(\)V", 0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiLinePresenter$bizObserver$1$onBizStart$1.class, str)) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoid(null, treceiver, LiveLiteMultiLinePresenter$bizObserver$1.class, str)) {
          LiveLiteMultiLinePresenter.d9(treceiver.a).d(StageType.MultiLine, null);
       }
       return;
    }
}
