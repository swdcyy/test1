package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$i;
import mp7.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;

public final class ForwardGridSectionFragment$i implements a	// class@001cce
{
    public final ForwardGridSectionFragment a;

    public void ForwardGridSectionFragment$i(ForwardGridSectionFragment p0){
       this.a = p0;
       super();
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionFragment$i.class, "1")) {
          return;
       }
       if (this.a.isAdded()) {
          this.a.dismissAllowingStateLoss();
       }
       return;
    }
}
