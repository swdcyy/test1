package com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$downLoadPicTemplate$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ztc.n;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
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
import java.util.Objects;
import lnc.u7;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$progressContext$1;
import msd.l;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$downLoadPicTemplate$2$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import ftd.z1;
import kotlinx.coroutines.a;
import java.lang.IllegalStateException;

public final class PicTemplateDataViewModel$downLoadPicTemplate$2 extends SuspendLambda implements p	// class@001333
{
    public final PicTemplate $picTemplate;
    public int label;
    public k0 p$;
    public final n this$0;

    public void PicTemplateDataViewModel$downLoadPicTemplate$2(n p0,PicTemplate p1,c p2){
       this.this$0 = p0;
       this.$picTemplate = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       PicTemplateDataViewModel$downLoadPicTemplate$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateDataViewModel$downLoadPicTemplate$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new PicTemplateDataViewModel$downLoadPicTemplate$2(this.this$0, this.$picTemplate, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateDataViewModel$downLoadPicTemplate$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PicTemplateDataViewModel$downLoadPicTemplate$2 obj = PatchProxy.applyOneRefs(p0, this, PicTemplateDataViewModel$downLoadPicTemplate$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       PicTemplateDataViewModel$downLoadPicTemplate$2 tp$ = this.p$;
       p0 = this.this$0;
       obj = this.$picTemplate;
       Objects.requireNonNull(p0);
       u7 ou7 = PatchProxy.applyOneRefs(obj, p0, n.class, "5");
       c uoc = null;
       if (ou7 != patchProxyRe) {
       }else {
          ou7 = new u7("progress", uoc, new PicTemplateDataViewModel$progressContext$1(p0, obj));
       }
       a.f(tp$, ou7, null, new PicTemplateDataViewModel$downLoadPicTemplate$2$1(this, uoc), 2, null);
       return l1.a;
    }
}
