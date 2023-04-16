package com.kuaishou.live.core.show.floatingwindow.k;
import u07.u;
import com.kuaishou.live.core.show.floatingwindow.m;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;
import s82.r;
import z1.a;

public final class k implements u	// class@000b89
{
    public final m b;

    public void k(m p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       k tb = this.b;
       Objects.requireNonNull(tb);
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("merchant_float_window_permission_guide", false);
       g.a(uEditor);
       tb.d(new r(tb));
    }
}
