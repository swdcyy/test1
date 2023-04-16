package com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment$addTextButton$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;

public final class ReEditTextFragment$addTextButton$2 extends Lambda implements a	// class@000b52
{
    public final ReEditTextFragment this$0;

    public void ReEditTextFragment$addTextButton$2(ReEditTextFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       Object obj = PatchProxy.apply(null, this, ReEditTextFragment$addTextButton$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.q.findViewById(0x7f0a2890);
    }
    public Object invoke(){
       return this.invoke();
    }
}
