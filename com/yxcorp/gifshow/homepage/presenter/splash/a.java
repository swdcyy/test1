package com.yxcorp.gifshow.homepage.presenter.splash.a;
import tjc.e$a;
import com.yxcorp.gifshow.homepage.presenter.splash.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import tjc.e;
import dua.d;
import java.lang.Runnable;
import ekd.k1;

public final class a implements e$a	// class@0017db
{
    public final c a;

    public void a(c p0){
       this.a = p0;
    }
    public final void a(){
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, c.class, "13")) {
       }else if(!b.a(0x1967ec3b).b() && ta.B != null){
          k1.q(new d(ta));
       }
       return;
    }
}
