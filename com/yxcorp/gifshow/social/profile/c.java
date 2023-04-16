package com.yxcorp.gifshow.social.profile.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.social.profile.Material;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.social.profile.d;
import com.yxcorp.gifshow.social.profile.d$a;

public final class c implements View$OnClickListener	// class@001d70
{
    public final Material b;

    public void c(Material p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       d.a.b(this.b);
       return;
    }
}
