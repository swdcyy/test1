package com.yxcorp.gifshow.v3.editor.template.data.PicResourceHelper$downloadPicTemplate$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.yxcorp.gifshow.v3.editor.template.data.PicResourceHelper;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import eb7.a;

public final class PicResourceHelper$downloadPicTemplate$1 extends ContinuationImpl	// class@001321
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public Object result;
    public final PicResourceHelper this$0;

    public void PicResourceHelper$downloadPicTemplate$1(PicResourceHelper p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicResourceHelper$downloadPicTemplate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.a(null, null, this);
    }
}
