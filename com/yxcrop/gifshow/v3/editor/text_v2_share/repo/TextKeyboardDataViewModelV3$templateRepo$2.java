package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3$templateRepo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextKeyboardDataViewModelV3$templateRepo$2 extends Lambda implements a	// class@000be2
{
    public static final TextKeyboardDataViewModelV3$templateRepo$2 INSTANCE;

    static {
       TextKeyboardDataViewModelV3$templateRepo$2.INSTANCE = new TextKeyboardDataViewModelV3$templateRepo$2();
    }
    public void TextKeyboardDataViewModelV3$templateRepo$2(){
       super(0);
    }
    public final TextTemplateRepo invoke(){
       Object obj = PatchProxy.apply(null, this, TextKeyboardDataViewModelV3$templateRepo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TextTemplateRepo();
    }
    public Object invoke(){
       return this.invoke();
    }
}
