package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$downloadHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$downloadHelper$2$a;
import hqc.i;

public final class TextTemplateRepoV3$downloadHelper$2 extends Lambda implements a	// class@000c24
{
    public final TextTemplateRepoV3 this$0;

    public void TextTemplateRepoV3$downloadHelper$2(TextTemplateRepoV3 p0){
       this.this$0 = p0;
       super(0);
    }
    public final DynamicTextDownloadHelper invoke(){
       Object obj = PatchProxy.apply(null, this, TextTemplateRepoV3$downloadHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DynamicTextDownloadHelper(this.this$0.h, new TextTemplateRepoV3$downloadHelper$2$a());
    }
    public Object invoke(){
       return this.invoke();
    }
}
