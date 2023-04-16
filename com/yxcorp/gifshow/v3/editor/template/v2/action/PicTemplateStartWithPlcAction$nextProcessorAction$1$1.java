package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartWithPlcAction$nextProcessorAction$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import brd.c;
import java.lang.Object;
import duc.d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateProcessErrorAction;
import java.lang.Throwable;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateProcessCompleteAction;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class PicTemplateStartWithPlcAction$nextProcessorAction$1$1 extends Lambda implements l	// class@00137b
{
    public final c $emitter;

    public void PicTemplateStartWithPlcAction$nextProcessorAction$1$1(c p0){
       this.$emitter = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateStartWithPlcAction$nextProcessorAction$1$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (p0 instanceof PicTemplateProcessErrorAction) {
          this.$emitter.onError(p0.getE());
       }else if(p0 instanceof PicTemplateProcessCompleteAction){
          this.$emitter.onComplete();
       }else {
          this.$emitter.onError(new IllegalStateException("unintended response: "+p0));
       }
       return;
    }
}
