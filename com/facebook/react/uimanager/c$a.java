package com.facebook.react.uimanager.c$a;
import ze.q0;
import com.facebook.react.uimanager.c;
import java.lang.Object;
import ze.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$a implements q0	// class@00133b
{
    public final int a;
    public final c b;

    public void c$a(c p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       p0.x(this.a);
       return;
    }
}
