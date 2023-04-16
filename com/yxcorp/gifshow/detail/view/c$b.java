package com.yxcorp.gifshow.detail.view.c$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.view.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.view.InterestSnackBar$b;

public final class c$b implements View$OnClickListener	// class@001a73
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       this.b.a.close();
       return;
    }
}
