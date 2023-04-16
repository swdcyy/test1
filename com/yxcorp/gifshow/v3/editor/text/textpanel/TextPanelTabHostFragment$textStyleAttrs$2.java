package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment$textStyleAttrs$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTabHostFragment;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.os.Parcelable;

public final class TextPanelTabHostFragment$textStyleAttrs$2 extends Lambda implements a	// class@0014ca
{
    public final TextPanelTabHostFragment this$0;

    public void TextPanelTabHostFragment$textStyleAttrs$2(TextPanelTabHostFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final TextStyleAttrs invoke(){
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, TextPanelTabHostFragment$textStyleAttrs$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.getArguments();
       if (obj != null) {
          objArray = obj.getParcelable("selectedStyleAttr");
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
