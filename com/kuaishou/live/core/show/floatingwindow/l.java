package com.kuaishou.live.core.show.floatingwindow.l;
import u07.u;
import com.kuaishou.live.core.show.floatingwindow.m;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import android.content.Context;
import lnc.i9;
import s82.t;
import z1.a;

public final class l implements u	// class@000b8a
{
    public final m b;
    public final Activity c;
    public final boolean d;

    public void l(m p0,Activity p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       l tb = this.b;
       Objects.requireNonNull(tb);
       tb.d(new t(tb, this.d, i9.d(this.c)));
    }
}
