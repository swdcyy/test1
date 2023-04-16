package com.yxcorp.gifshow.detail.view.c$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.view.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.view.InterestSnackBar$b;

public final class c$a implements View$OnClickListener	// class@001a72
{
    public final c b;
    public final View c;

    public void c$a(c p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$a.class, "1")) {
          return;
       }
       this.b.a.onClick();
       PatchProxy.onMethodExit(c$a.class, "1");
       return;
    }
}
