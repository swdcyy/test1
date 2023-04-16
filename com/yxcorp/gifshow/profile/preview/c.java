package com.yxcorp.gifshow.profile.preview.c;
import erd.g;
import com.yxcorp.gifshow.profile.preview.ProfilePreviewFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import e5c.a;
import java.lang.Runnable;
import ekd.k1;

public final class c implements g	// class@001598
{
    public final ProfilePreviewFragment b;

    public void c(ProfilePreviewFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue()) {
          k1.r(new a(tb), 100);
       }
       return;
    }
}
