package com.yxcorp.gifshow.profile.widget.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.profile.widget.ProfileShareButton;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.yxcorp.gifshow.detail.nonslide.toolbar.follow.c;
import lnc.c3$a;
import lnc.c3;
import b6c.f;

public final class b implements View$OnClickListener	// class@001607
{
    public final ProfileShareButton b;

    public void b(ProfileShareButton p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, ProfileShareButton.class, "1")) {
       }else if(tb.k == null){
          tb.b();
          if (!PatchProxy.applyVoid(objArray, tb, ProfileShareButton.class, "10")) {
             tb.b.setVisibility(0);
             c3.c(tb.g, c.a);
          }
       }
       c3.c(tb.h, new f(p0));
       return;
    }
}
