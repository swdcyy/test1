package com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$d;
import erd.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class TextElementViewModel$d implements o	// class@00141e
{
    public static final TextElementViewModel$d b;

    static {
       TextElementViewModel$d.b = new TextElementViewModel$d();
    }
    public void TextElementViewModel$d(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextElementViewModel$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return p0;
    }
}
