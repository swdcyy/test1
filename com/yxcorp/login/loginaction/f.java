package com.yxcorp.login.loginaction.f;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import p1d.g;

public final class f implements g	// class@001af0
{
    public final b[] b;
    public final ProgressFragment[] c;
    public final FragmentActivity d;

    public void f(b[] p0,ProgressFragment[] p1,FragmentActivity p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       this.b[0] = t.timer(1, TimeUnit.SECONDS).observeOn(d.a).subscribe(new g(this.c, this.d));
    }
}
