package com.yxcorp.login.loginaction.e;
import brd.x;
import crd.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import brd.t;
import brd.w;
import java.util.concurrent.TimeUnit;
import com.yxcorp.login.loginaction.f;
import erd.g;
import p1d.f;
import erd.a;

public final class e implements x	// class@001aef
{
    public final b[] b;
    public final ProgressFragment[] c;
    public final FragmentActivity d;

    public void e(b[] p0,ProgressFragment[] p1,FragmentActivity p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final w apply(t p0){
       e tb = this.b;
       e tc = this.c;
       return p0.timeout(5, TimeUnit.SECONDS).doOnSubscribe(new f(tb, tc, this.d)).doFinally(new f(tb, tc));
    }
}
