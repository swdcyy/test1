package com.yxcorp.gifshow.social.profile.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.social.profile.Material;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.social.profile.d;
import com.yxcorp.gifshow.social.profile.d$a;

public final class b implements View$OnClickListener	// class@001d6f
{
    public final Material b;

    public void b(Material p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       d.a.b(this.b);
       return;
    }
}
