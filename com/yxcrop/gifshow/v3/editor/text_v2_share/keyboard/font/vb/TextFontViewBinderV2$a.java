package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$a;
import pn9.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextFontViewBinderV2$a extends b	// class@000b9e
{
    public final TextFontViewBinderV2 c;

    public void TextFontViewBinderV2$a(TextFontViewBinderV2 p0,View p1){
       this.c = p0;
       super(p1);
    }
    public RecyclerView D(){
       Object obj = PatchProxy.apply(null, this, TextFontViewBinderV2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.D();
    }
}
