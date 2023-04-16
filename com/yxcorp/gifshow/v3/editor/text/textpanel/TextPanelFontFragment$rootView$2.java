package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelFontFragment$rootView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelFontFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class TextPanelFontFragment$rootView$2 extends Lambda implements a	// class@0014bf
{
    public final TextPanelFontFragment this$0;

    public void TextPanelFontFragment$rootView$2(TextPanelFontFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       Object obj = PatchProxy.apply(null, this, TextPanelFontFragment$rootView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LayoutInflater.from(this.this$0.getContext()).inflate(0x7f0d15d5, null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
