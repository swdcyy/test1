package com.facebook.react.uimanager.e;
import com.facebook.react.uimanager.f;
import java.lang.Object;
import com.facebook.react.uimanager.e$a;
import gf.i;
import gf.f;
import com.facebook.react.uimanager.f$b;
import java.lang.ref.WeakReference;

public class e	// class@00133f
{
    public final i a;
    public f b;
    public f c;
    public WeakReference d;
    public boolean e;
    public f$b f;

    public void e(f p0){
       super();
       this.e = false;
       this.f = new e$a(this);
       this.a = new i();
       this.b = new f();
       this.c = new f();
       p0.a(this.f);
       this.d = new WeakReference(p0.c);
    }
}
