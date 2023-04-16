package com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$keyboardListener$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextElementViewModel$keyboardListener$2 extends Lambda implements a	// class@001421
{
    public static final TextElementViewModel$keyboardListener$2 INSTANCE;

    static {
       TextElementViewModel$keyboardListener$2.INSTANCE = new TextElementViewModel$keyboardListener$2();
    }
    public void TextElementViewModel$keyboardListener$2(){
       super(0);
    }
    public final MutableLiveData invoke(){
       Object obj = PatchProxy.apply(null, this, TextElementViewModel$keyboardListener$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MutableLiveData();
    }
    public Object invoke(){
       return this.invoke();
    }
}
