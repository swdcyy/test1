package com.yxcorp.gifshow.fragment.DialogContainerFragment$a;
import androidx.fragment.app.c$b;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public class DialogContainerFragment$a extends c$b	// class@001261
{
    public final DialogContainerFragment a;

    public void DialogContainerFragment$a(DialogContainerFragment p0){
       this.a = p0;
       super();
    }
    public void n(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DialogContainerFragment$a.class, "1")) {
          return;
       }
       DialogContainerFragment$a ta = this.a;
       if (p1 == ta) {
          ta.dismissAllowingStateLoss();
       }
       return;
    }
}
