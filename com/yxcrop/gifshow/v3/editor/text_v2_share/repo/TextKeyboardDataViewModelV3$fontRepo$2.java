package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextKeyboardDataViewModelV3$fontRepo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextKeyboardDataViewModelV3$fontRepo$2 extends Lambda implements a	// class@000be1
{
    public static final TextKeyboardDataViewModelV3$fontRepo$2 INSTANCE;

    static {
       TextKeyboardDataViewModelV3$fontRepo$2.INSTANCE = new TextKeyboardDataViewModelV3$fontRepo$2();
    }
    public void TextKeyboardDataViewModelV3$fontRepo$2(){
       super(0);
    }
    public final TextFontRepoV3 invoke(){
       Object obj = PatchProxy.apply(null, this, TextKeyboardDataViewModelV3$fontRepo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TextFontRepoV3();
    }
    public Object invoke(){
       return this.invoke();
    }
}
