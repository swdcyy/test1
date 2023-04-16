package com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateResource$2$1;
import brd.v;
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
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$1;
import kotlin.coroutines.CoroutineContext;
import lnc.u7;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import msd.l;
import java.lang.Integer;
import lnc.u7$b;
import java.util.Map;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2;
import kotlinx.coroutines.a;

public final class DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1 extends SuspendLambda implements p	// class@001314
{
    public final v $emit;
    public Object L$0;
    public int label;
    public k0 p$;
    public final DefaultPicTemplateProvider$fetchPicTemplateResource$2$1 this$0;

    public void DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1(DefaultPicTemplateProvider$fetchPicTemplateResource$2$1 p0,v p1,c p2){
       this.this$0 = p0;
       this.$emit = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1(this.this$0, this.$emit, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1 tlabel = this.label;
       DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2 uofetchPicTe = 1;
       if (tlabel != null) {
          if (tlabel != uofetchPicTe) {
             if (tlabel == 2) {
                j0.n(p0);
             label_008f :
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
          p0 = new DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$1(this);
          this.L$0 = tlabel;
          this.label = uofetchPicTe;
          float f = 0x3f800000;
          String str = "progress";
          u7 ou7 = this.getContext().get(u7.h);
          if (ou7 != null) {
             u7 ou71 = new u7(str, ou7, p0);
             a.p(ou71, "progressContext");
             ou7.d.put(Integer.valueOf(ou71.hashCode()), new u7$b(ou7, f, ou71.c));
             p0 = ou71;
          }else {
             p0 = new u7(str, null, p0);
          }
          if (p0 == obj) {
             return obj;
          }
       }
       this.L$0 = tlabel;
       this.label = 2;
       if (a.i(p0, new DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2(this, null), this) == obj) {
          return obj;
       }else {
          goto label_008f ;
       }
    }
}
