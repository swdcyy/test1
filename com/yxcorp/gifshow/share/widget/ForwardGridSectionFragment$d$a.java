package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$d$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;

public final class ForwardGridSectionFragment$d$a implements View$OnClickListener	// class@001cc5
{
    public final ForwardGridSectionFragment$d b;

    public void ForwardGridSectionFragment$d$a(ForwardGridSectionFragment$d p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ForwardGridSectionFragment$d$a.class, "1")) {
          return;
       }
       this.b.c.di();
       PatchProxy.onMethodExit(ForwardGridSectionFragment$d$a.class, "1");
       return;
    }
}
