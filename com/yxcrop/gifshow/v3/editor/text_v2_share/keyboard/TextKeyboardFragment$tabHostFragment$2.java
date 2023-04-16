package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment$tabHostFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextPanelTabHostFragmentV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public final class TextKeyboardFragment$tabHostFragment$2 extends Lambda implements a	// class@000b94
{
    public final TextKeyboardFragment this$0;

    public void TextKeyboardFragment$tabHostFragment$2(TextKeyboardFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final TextPanelTabHostFragmentV2 invoke(){
       TextPanelTabHostFragmentV2 obj = PatchProxy.apply(null, this, TextKeyboardFragment$tabHostFragment$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextPanelTabHostFragmentV2();
       obj.setArguments(this.this$0.getArguments());
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
