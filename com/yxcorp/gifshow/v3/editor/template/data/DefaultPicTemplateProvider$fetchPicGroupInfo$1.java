package com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicGroupInfo$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DefaultPicTemplateProvider$fetchPicGroupInfo$1 extends ContinuationImpl	// class@001310
{
    public Object L$0;
    public int label;
    public Object result;
    public final DefaultPicTemplateProvider this$0;

    public void DefaultPicTemplateProvider$fetchPicGroupInfo$1(DefaultPicTemplateProvider p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DefaultPicTemplateProvider$fetchPicGroupInfo$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.d(this);
    }
}
