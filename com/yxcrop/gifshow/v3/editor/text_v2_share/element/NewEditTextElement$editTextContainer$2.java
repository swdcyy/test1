package com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement$editTextContainer$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import java.lang.Object;
import muc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData;

public final class NewEditTextElement$editTextContainer$2 extends Lambda implements a	// class@000b8d
{
    public final NewEditTextElement this$0;

    public void NewEditTextElement$editTextContainer$2(NewEditTextElement p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       NewEditTextElement$editTextContainer$2 obj = PatchProxy.apply(null, this, NewEditTextElement$editTextContainer$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       return obj.createTextDrawer(obj.initTextElementData);
    }
}
