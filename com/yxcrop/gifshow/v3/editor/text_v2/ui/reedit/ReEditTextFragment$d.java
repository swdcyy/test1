package com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment$d;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.reedit.ReEditTextFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ReEditTextFragment$d implements g	// class@000b55
{
    public final ReEditTextFragment b;

    public void ReEditTextFragment$d(ReEditTextFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReEditTextFragment$d.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.onError(p0);
       }
       return;
    }
}
