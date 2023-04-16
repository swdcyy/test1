package com.yxcorp.gifshow.util.h;
import erd.g;
import com.yxcorp.gifshow.util.i;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import lnc.v0;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class h implements g	// class@001f7f
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.b.post(new v0(tb));
       }
       return;
    }
}
