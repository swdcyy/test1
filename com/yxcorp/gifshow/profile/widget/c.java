package com.yxcorp.gifshow.profile.widget.c;
import lnc.c3$a;
import com.yxcorp.gifshow.profile.widget.ProfileShareButton;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.profile.widget.b;
import android.view.View$OnClickListener;

public final class c implements c3$a	// class@001608
{
    public final ProfileShareButton a;

    public void c(ProfileShareButton p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       p0.setOnClickListener(new b(ta));
    }
}
