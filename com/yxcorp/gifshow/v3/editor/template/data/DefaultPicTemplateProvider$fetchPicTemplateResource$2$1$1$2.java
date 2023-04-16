package com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1;
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
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import java.util.List;
import qrd.j0;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateResource$2$1;
import ztc.f;
import trd.t;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider;
import com.yxcorp.gifshow.fragment.ObservableBox$c;
import brd.g;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo$a;
import nsd.u;

public final class DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2 extends SuspendLambda implements p	// class@001313
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public k0 p$;
    public final DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1 this$0;

    public void DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2(DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1 p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2(this.this$0, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2 obj = PatchProxy.applyOneRefs(p0, this, DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       DefaultPicTemplateProvider$fetchPicTemplateResource$2$1$1$2 tlabel = this.label;
       b = true;
       if (tlabel != null) {
          if (tlabel != b) {
             if (tlabel == 2) {
                obj = this.L$2;
                j0.n(p0);
             label_00ab :
                obj.setFilePath(p0);
                ObservableBox$c uoc = new ObservableBox$c(obj);
                uoc.c = 100;
                this.this$0.$emit.onNext(uoc);
                this.this$0.$emit.onComplete();
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
          p0 = this.this$0.this$0;
          this.L$0 = tlabel;
          this.label = b;
          p0 = p0.b.b.c(t.k(p0.c), this);
          if (p0 == obj) {
             return obj;
          }
       }
       if (p0.isEmpty()) {
          ObservableBox$c uoc1 = new ObservableBox$c(null);
          uoc1.c = 100;
          this.this$0.$emit.onNext(uoc1);
          this.this$0.$emit.onComplete();
       }
       PicTemplate picTemplate = new PicTemplate(p0.get(0), PicTemplateGroupInfo.Companion.a(), null, 4, null);
       this.L$0 = tlabel;
       this.L$1 = p0;
       this.L$2 = b;
       this.label = 2;
       p0 = this.this$0.this$0.b.b.a(b, this);
       if (p0 == obj) {
          return obj;
       }else {
          PicTemplate picTemplate1 = b;
          goto label_00ab ;
       }
    }
}
