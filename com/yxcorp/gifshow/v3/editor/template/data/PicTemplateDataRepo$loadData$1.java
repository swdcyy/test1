package com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo$loadData$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class PicTemplateDataRepo$loadData$1 extends SuspendLambda implements p	// class@00132c
{
    public Object L$0;
    public int label;
    public k0 p$;
    public final PicTemplateDataRepo this$0;

    public void PicTemplateDataRepo$loadData$1(PicTemplateDataRepo p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       PicTemplateDataRepo$loadData$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateDataRepo$loadData$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new PicTemplateDataRepo$loadData$1(this.this$0, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateDataRepo$loadData$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateDataRepo$loadData$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       PicTemplateDataRepo$loadData$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$;
          this.label = 1;
          if (this.this$0.c(this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
