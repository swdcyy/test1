package com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo$loadPicTemplates$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PicTemplateDataRepo$loadPicTemplates$1 extends ContinuationImpl	// class@00132d
{
    public Object L$0;
    public int label;
    public Object result;
    public final PicTemplateDataRepo this$0;

    public void PicTemplateDataRepo$loadPicTemplates$1(PicTemplateDataRepo p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateDataRepo$loadPicTemplates$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.c(this);
    }
}
