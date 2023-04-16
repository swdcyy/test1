package com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$b;
import erd.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class TextElementViewModel$b implements o	// class@00141c
{
    public static final TextElementViewModel$b b;

    static {
       TextElementViewModel$b.b = new TextElementViewModel$b();
    }
    public void TextElementViewModel$b(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextElementViewModel$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return p0;
    }
}
