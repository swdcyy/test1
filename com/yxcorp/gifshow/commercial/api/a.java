package com.yxcorp.gifshow.commercial.api.a;
import com.yxcorp.gifshow.commercial.api.AdSession;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.commercial.api.DetailAd;
import android.content.Context;
import ql9.b;
import msd.p;
import android.content.Intent;

public abstract class a	// class@001123
{
    public final AdSession a;

    public void a(AdSession p0){
       a.p(p0, "session");
       super();
       this.a = p0;
    }
    public abstract void c();
    public abstract DetailAd d();
    public final AdSession e(){
       return this.a;
    }
    public abstract boolean f();
    public abstract void g(int p0);
    public abstract void h();
    public abstract void i();
    public abstract void j(String p0,Object p1);
    public abstract void k(Context p0,b p1);
    public abstract void l(p p0);
    public abstract Intent m(Intent p0,b p1);
}
