package com.kuaishou.cover.container.loader.b$a;
import hu4.f;
import com.kuaishou.cover.container.loader.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import hu4.e;

public class b$a implements f	// class@0016da
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       this.a.m(p0);
       return;
    }
    public void b(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.a.n();
       return;
    }
    public void c(){
       e.a(this);
    }
}
