package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment$tabHostFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public final class TextPanelDialogFragment$tabHostFragment$2 extends Lambda implements a	// class@0014bc
{
    public final TextPanelDialogFragment this$0;

    public void TextPanelDialogFragment$tabHostFragment$2(TextPanelDialogFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final TextPanelTabHostFragment invoke(){
       TextPanelTabHostFragment obj = PatchProxy.apply(null, this, TextPanelDialogFragment$tabHostFragment$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextPanelTabHostFragment();
       obj.setArguments(this.this$0.getArguments());
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
