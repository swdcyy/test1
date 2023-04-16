package com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$downLoadPicTemplate$2$1$1$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$downLoadPicTemplate$2$1$1;
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
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$downLoadPicTemplate$2$1;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$downLoadPicTemplate$2;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import androidx.lifecycle.MutableLiveData;
import ztc.n;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$b;
import java.lang.IllegalStateException;

public final class PicTemplateDataViewModel$downLoadPicTemplate$2$1$1$1 extends SuspendLambda implements p	// class@001330
{
    public int label;
    public k0 p$;
    public final PicTemplateDataViewModel$downLoadPicTemplate$2$1$1 this$0;

    public void PicTemplateDataViewModel$downLoadPicTemplate$2$1$1$1(PicTemplateDataViewModel$downLoadPicTemplate$2$1$1 p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       PicTemplateDataViewModel$downLoadPicTemplate$2$1$1$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateDataViewModel$downLoadPicTemplate$2$1$1$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new PicTemplateDataViewModel$downLoadPicTemplate$2$1$1$1(this.this$0, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateDataViewModel$downLoadPicTemplate$2$1$1$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateDataViewModel$downLoadPicTemplate$2$1$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.this$0.this$0.this$0;
       p0.this$0.o0(p0.$picTemplate).postValue(PicTemplate$b$b.a);
       return l1.a;
    }
}
