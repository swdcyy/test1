package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$d$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$d;
import uo7.j0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;

public final class ForwardGridSectionFragment$d$b implements View$OnClickListener	// class@001cc6
{
    public final ForwardGridSectionFragment$d b;
    public final int c;
    public final j0 d;
    public final View e;

    public void ForwardGridSectionFragment$d$b(ForwardGridSectionFragment$d p0,int p1,j0 p2,View p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ForwardGridSectionFragment$d$b.class, "1")) {
          return;
       }
       this.b.c.di();
       PatchProxy.onMethodExit(ForwardGridSectionFragment$d$b.class, "1");
       return;
    }
}
