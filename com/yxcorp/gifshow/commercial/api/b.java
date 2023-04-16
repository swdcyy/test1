package com.yxcorp.gifshow.commercial.api.b;
import com.yxcorp.gifshow.commercial.api.AdSession;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.q;
import am9.a;
import android.content.Context;
import ql9.q;
import android.content.Intent;

public abstract class b	// class@001124
{
    public final AdSession a;

    public void b(AdSession p0){
       a.p(p0, "session");
       super();
       this.a = p0;
    }
    public abstract void b(q p0);
    public abstract boolean c();
    public abstract void d();
    public final AdSession e(){
       return this.a;
    }
    public abstract boolean f();
    public abstract boolean g();
    public abstract void h(String p0);
    public abstract void i(a p0);
    public abstract void j(Context p0,q p1);
    public abstract Intent k(Intent p0,q p1);
}
