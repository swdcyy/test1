package com.kwai.framework.location.h;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import t96.a;
import java.lang.String;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kwai.framework.location.j;
import o07.o;

public class h implements PopupInterface$h	// class@00162f
{
    public final boolean b;
    public final a c;
    public final String d;
    public final ConcurrentHashMap e;

    public void h(boolean p0,a p1,String p2,ConcurrentHashMap p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       if (this.b != null) {
          p0.b = System.currentTimeMillis();
          j.g(this.d, this.e, this.c);
       }
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
