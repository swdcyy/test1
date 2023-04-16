package com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter$hostWidth$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.FontAdapter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import yuc.c;
import java.lang.Integer;

public final class FontAdapter$hostWidth$2 extends Lambda implements a	// class@001436
{
    public final FontAdapter this$0;

    public void FontAdapter$hostWidth$2(FontAdapter p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, FontAdapter$hostWidth$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.this$0.i.D1();
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
