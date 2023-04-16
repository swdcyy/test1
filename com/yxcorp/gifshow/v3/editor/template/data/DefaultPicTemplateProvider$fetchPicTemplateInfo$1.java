package com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateInfo$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;

public final class DefaultPicTemplateProvider$fetchPicTemplateInfo$1 extends ContinuationImpl	// class@001311
{
    public Object L$0;
    public Object L$1;
    public int label;
    public Object result;
    public final DefaultPicTemplateProvider this$0;

    public void DefaultPicTemplateProvider$fetchPicTemplateInfo$1(DefaultPicTemplateProvider p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DefaultPicTemplateProvider$fetchPicTemplateInfo$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.c(null, this);
    }
}
