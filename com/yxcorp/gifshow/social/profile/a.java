package com.yxcorp.gifshow.social.profile.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.social.profile.Banner;
import om6.f$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.social.profile.d;
import com.yxcorp.gifshow.social.profile.d$a;

public final class a implements View$OnClickListener	// class@001d6e
{
    public final Banner b;
    public final f$a c;

    public void a(Banner p0,f$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       d.a.a(this.b.getButtonLinkUrl());
       this.c.b();
       return;
    }
}
