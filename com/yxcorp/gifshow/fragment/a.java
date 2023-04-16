package com.yxcorp.gifshow.fragment.a;
import lnc.c3$a;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import java.lang.Object;
import android.app.Dialog;
import java.util.Objects;
import gka.d;
import android.content.DialogInterface$OnKeyListener;

public final class a implements c3$a	// class@001272
{
    public final DialogContainerFragment a;

    public void a(DialogContainerFragment p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       p0.setOnKeyListener(new d(ta));
    }
}
