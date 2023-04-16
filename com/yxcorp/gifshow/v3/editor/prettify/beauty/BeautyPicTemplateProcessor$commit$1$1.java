package com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor$commit$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor$commit$1;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.e;
import java.lang.Number;

public final class BeautyPicTemplateProcessor$commit$1$1 extends Lambda implements l	// class@001149
{
    public final BeautyPicTemplateProcessor$commit$1 this$0;

    public void BeautyPicTemplateProcessor$commit$1$1(BeautyPicTemplateProcessor$commit$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public final BeautifyConfig invoke(int p0){
       if (PatchProxy.isSupport(BeautyPicTemplateProcessor$commit$1$1.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, BeautyPicTemplateProcessor$commit$1$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.this$0.b.b.r(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0.intValue());
    }
}
