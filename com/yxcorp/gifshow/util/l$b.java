package com.yxcorp.gifshow.util.l$b;
import a2.i;
import msd.q;
import lnc.f3;
import java.lang.Object;
import android.view.View;
import a2.l;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class l$b implements i	// class@001f89
{
    public final q a;
    public final f3 b;

    public void l$b(q p0,f3 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final l a(View p0,l p1){
       a.o(p0, "v");
       a.o(p1, "insets");
       this.a.invoke(p0, p1, this.b);
       return p1;
    }
}
