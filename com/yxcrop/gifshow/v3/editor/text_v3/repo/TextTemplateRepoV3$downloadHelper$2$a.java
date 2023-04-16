package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$downloadHelper$2$a;
import hqc.i;
import java.lang.Object;
import nuc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v3.utils.TextTemplateEnvV3;

public final class TextTemplateRepoV3$downloadHelper$2$a implements i	// class@000c23
{

    public void TextTemplateRepoV3$downloadHelper$2$a(){
       super();
    }
    public Object get(Object p0){
       File uFile = PatchProxy.applyOneRefs(p0, this, TextTemplateRepoV3$downloadHelper$2$a.class, "1");
       if (uFile != PatchProxyResult.class) {
       }else {
          a.p(p0, "i");
          String str = p0.b();
          a.o(str, "i.textId");
          p0 = p0.e();
          a.o(p0, "i.resMd5");
          uFile = TextTemplateEnvV3.a(str, p0);
       }
       return uFile;
    }
}
