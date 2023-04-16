package com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder$mFontAdapter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yuc.c;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;

public final class TextFontViewBinder$mFontAdapter$2 extends Lambda implements a	// class@001430
{
    public final TextFontViewBinder this$0;

    public void TextFontViewBinder$mFontAdapter$2(TextFontViewBinder p0){
       this.this$0 = p0;
       super(0);
    }
    public final FontAdapter invoke(){
       Object obj = PatchProxy.apply(null, this, TextFontViewBinder$mFontAdapter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TextFontViewBinder$mFontAdapter$2 tthis$0 = this.this$0;
       return new FontAdapter(tthis$0, tthis$0.h);
    }
    public Object invoke(){
       return this.invoke();
    }
}
