package com.feature.post.bridge.g;
import erd.g;
import android.app.Activity;
import f55.g;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import w26.c;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import mg.o0;
import mg.y0;
import crd.b;

public final class g implements g	// class@00147a
{
    public final Activity b;
    public final g c;

    public void g(Activity p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tc = this.c;
       y6.s(c.class, LoadPolicy.DIALOG).R(new o0(p0, this.b, tc), new y0(tc));
    }
}
