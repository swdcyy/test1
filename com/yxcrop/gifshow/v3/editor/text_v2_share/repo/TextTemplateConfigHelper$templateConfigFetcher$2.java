package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateConfigHelper$templateConfigFetcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextTemplateConfigHelper$templateConfigFetcher$2 extends Lambda implements a	// class@000be8
{
    public static final TextTemplateConfigHelper$templateConfigFetcher$2 INSTANCE;

    static {
       TextTemplateConfigHelper$templateConfigFetcher$2.INSTANCE = new TextTemplateConfigHelper$templateConfigFetcher$2();
    }
    public void TextTemplateConfigHelper$templateConfigFetcher$2(){
       super(0);
    }
    public final DynamicTextRepo invoke(){
       Object obj = PatchProxy.apply(null, this, TextTemplateConfigHelper$templateConfigFetcher$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DynamicTextRepo();
    }
    public Object invoke(){
       return this.invoke();
    }
}
