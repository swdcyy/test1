package com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$downLoadPicTemplate$2$1$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$downLoadPicTemplate$2$1;
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
import java.util.concurrent.CancellationException;
import qrd.j0;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$downLoadPicTemplate$2;
import ztc.n;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$a;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b;
import ytc.h;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$b;
import e17.i;
import ftd.l2;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$downLoadPicTemplate$2$1$1$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

public final class PicTemplateDataViewModel$downLoadPicTemplate$2$1$1 extends SuspendLambda implements p	// class@001331
{
    public Object L$0;
    public Object L$1;
    public int label;
    public k0 p$;
    public final PicTemplateDataViewModel$downLoadPicTemplate$2$1 this$0;

    public void PicTemplateDataViewModel$downLoadPicTemplate$2$1$1(PicTemplateDataViewModel$downLoadPicTemplate$2$1 p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       PicTemplateDataViewModel$downLoadPicTemplate$2$1$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateDataViewModel$downLoadPicTemplate$2$1$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new PicTemplateDataViewModel$downLoadPicTemplate$2$1$1(this.this$0, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateDataViewModel$downLoadPicTemplate$2$1$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       PicTemplate$b$a a;
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateDataViewModel$downLoadPicTemplate$2$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = b.h();
          PicTemplateDataViewModel$downLoadPicTemplate$2$1$1 tlabel = this.label;
          PicTemplateDataViewModel$downLoadPicTemplate$2$1$1 uodownLoadPi = 1;
          if (tlabel != null) {
             if (tlabel != uodownLoadPi) {
                if (tlabel == 2) {
                   j0.n(p0);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                tlabel = this.L$1;
                j0.n(p0);
                try{
                label_0066 :
                   tlabel.setFilePath(p0);
                   p0 = this.this$0.this$0;
                   a = PicTemplate$b$a.a;
                   p0.this$0.o0(p0.$picTemplate).postValue(a);
                   this.this$0.this$0.$picTemplate.setResourceState(a);
                }catch( e0){
                }
             }
          }else {
             j0.n(p0);
             p0 = this.p$;
             PicTemplateDataViewModel$downLoadPicTemplate$2$1 this$0 = this.this$0.this$0;
             PicTemplateDataViewModel$downLoadPicTemplate$2 $picTemplate = this$0.$picTemplate;
             this.L$0 = p0;
             this.L$1 = $picTemplate;
             this.label = uodownLoadPi;
             PicTemplateDataViewModel$downLoadPicTemplate$2 obj1 = this$0.this$0.d.a($picTemplate, this);
             if (obj1 == obj) {
                return obj;
             }else {
                p0 = obj1;
                obj1 = $picTemplate;
                goto label_0066 ;
             }
          }
       }catch(java.util.concurrent.CancellationException e9){
       }catch(java.io.FileNotFoundException e0){
          h.a.a(this.this$0.this$0.$picTemplate.getPicTemplateInfo().getId());
          p0 = this.this$0.this$0;
          p0.this$0.o0(p0.$picTemplate).postValue(PicTemplate$b$b.a);
          a.o(i.a(R.style.arg_RES_7f11066a, 0x7f1038e5), "KSToast.applyStyle\(R.sty¡­tring.network_failed_tip\)");
       }catch(java.util.concurrent.CancellationException e1){
          Object obj2 = p0;
          p0 = e1;
       }
       this.L$0 = this.L$0;
       this.L$1 = e9;
       this.label = 2;
       if (a.i(l2.b, new PicTemplateDataViewModel$downLoadPicTemplate$2$1$1$1(this, null), this) == obj) {
          return obj;
       }
    }
}
